package org.chromium.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.MediaStore;
import android.system.Os;
import android.text.TextUtils;
import internal.org.jni_zero.CalledByNative;
import java.io.File;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.task.AsyncTask;
import xsna.yq90;

/* loaded from: classes8.dex */
public abstract class PathUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int CACHE_DIRECTORY = 2;
    private static final int DATA_DIRECTORY = 0;
    private static final int NUM_DIRECTORIES = 3;
    private static final String TAG = "PathUtils";
    private static final int THUMBNAIL_DIRECTORY = 1;
    private static final String THUMBNAIL_DIRECTORY_NAME = "textures";
    private static String sCacheDirectoryBasePath;
    private static String sCacheSubDirectory;
    private static String sDataDirectoryBasePath;
    private static String sDataDirectorySuffix;
    private static FutureTask<String[]> sDirPathFetchTask;
    private static final AtomicBoolean sInitializationStarted = new AtomicBoolean();

    private PathUtils() {
    }

    private static void chmod(String str, int i) {
        try {
            Os.chmod(str, i);
        } catch (Exception unused) {
            Log.e(TAG, "Failed to set permissions for path \"" + str + "\"");
        }
    }

    @CalledByNative
    public static String[] getAllPrivateDownloadsDirectories() {
        List arrayList = new ArrayList();
        StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
        try {
            File[] externalFilesDirs = ContextUtils.getApplicationContext().getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDirs != null) {
                arrayList = Arrays.asList(externalFilesDirs);
            }
            if (allowDiskWrites != null) {
                allowDiskWrites.close();
            }
            return toAbsolutePathStrings(arrayList);
        } catch (Throwable th) {
            if (allowDiskWrites != null) {
                try {
                    allowDiskWrites.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CalledByNative
    public static String getCacheDirectory() {
        return getDirectoryPath(2);
    }

    @CalledByNative
    public static long getCacheQuotaBytes() {
        try {
            StorageManager storageManager = (StorageManager) ContextUtils.getApplicationContext().getSystemService(StorageManager.class);
            return storageManager.getCacheQuotaBytes(storageManager.getUuidForPath(new File(getCacheDirectory())));
        } catch (Exception unused) {
            return -1L;
        }
    }

    @CalledByNative
    public static String getDataDirectory() {
        return getDirectoryPath(0);
    }

    private static String getDirectoryPath(int i) {
        return getOrComputeDirectoryPaths()[i];
    }

    @CalledByNative
    public static String getDownloadsDirectory() {
        StrictModeContext allowDiskReads = StrictModeContext.allowDiskReads();
        try {
            if (Build.VERSION.SDK_INT < 29) {
                String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                return path;
            }
            String[] allPrivateDownloadsDirectories = getAllPrivateDownloadsDirectories();
            String str = allPrivateDownloadsDirectories.length == 0 ? "" : allPrivateDownloadsDirectories[0];
            if (allowDiskReads != null) {
                allowDiskReads.close();
            }
            return str;
        } catch (Throwable th) {
            if (allowDiskReads != null) {
                try {
                    allowDiskReads.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CalledByNative
    public static String[] getExternalDownloadVolumesNames() {
        Set<String> externalVolumeNames;
        StorageVolume storageVolume;
        File directory;
        ArrayList arrayList = new ArrayList();
        externalVolumeNames = MediaStore.getExternalVolumeNames(ContextUtils.getApplicationContext());
        for (String str : externalVolumeNames) {
            if (!TextUtils.isEmpty(str) && !str.contains("external_primary")) {
                StorageManager storageManager = (StorageManager) ContextUtils.getApplicationContext().getSystemService(StorageManager.class);
                Uri contentUri = MediaStore.Files.getContentUri(str);
                try {
                    storageVolume = storageManager.getStorageVolume(contentUri);
                    directory = storageVolume.getDirectory();
                    File file = new File(directory, Environment.DIRECTORY_DOWNLOADS);
                    if (!file.isDirectory()) {
                        Log.w(TAG, "Download dir missing: %s, parent dir:%s, isDirectory:%s", file.getAbsolutePath(), directory.getAbsolutePath(), Boolean.valueOf(directory.isDirectory()));
                    }
                    arrayList.add(file);
                } catch (Exception e) {
                    Log.e(TAG, "Failed to get storage volume for uri: ".concat(String.valueOf(contentUri)), (Throwable) e);
                }
            }
        }
        return toAbsolutePathStrings(arrayList);
    }

    @CalledByNative
    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    @CalledByNative
    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = ContextUtils.getApplicationContext().getApplicationInfo();
        int i = applicationInfo.flags;
        return ((i & 128) != 0 || (i & 1) == 0) ? applicationInfo.nativeLibraryDir : "/system/lib/";
    }

    private static String[] getOrComputeDirectoryPaths() {
        if (!sDirPathFetchTask.isDone()) {
            StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
            try {
                sDirPathFetchTask.run();
                if (allowDiskWrites != null) {
                    allowDiskWrites.close();
                }
            } catch (Throwable th) {
                if (allowDiskWrites != null) {
                    try {
                        allowDiskWrites.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        try {
            return sDirPathFetchTask.get();
        } catch (Exception e) {
            throw JavaUtils.throwUnchecked(e);
        }
    }

    @CalledByNative
    public static String getThumbnailCacheDirectory() {
        return getDirectoryPath(1);
    }

    public static boolean isPathUnderAppDir(String str, Context context) {
        File file = new File(str);
        File dataDir = context.getDataDir();
        File externalFilesDir = ContextUtils.getApplicationContext().getExternalFilesDir(null);
        try {
            Path realPath = file.toPath().toRealPath(new LinkOption[0]);
            if (realPath.startsWith(dataDir.toPath().toRealPath(new LinkOption[0]))) {
                return true;
            }
            if (externalFilesDir != null) {
                if (realPath.startsWith(externalFilesDir.toPath().toRealPath(new LinkOption[0]))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void resetForTesting() {
        sInitializationStarted.set(false);
        sDirPathFetchTask = null;
        sDataDirectorySuffix = null;
        sCacheSubDirectory = null;
        sDataDirectoryBasePath = null;
        sCacheDirectoryBasePath = null;
    }

    public static void setPrivateDataDirectorySuffix(String str, String str2) {
        setPrivateDirectoryPath(null, null, str, str2);
    }

    public static void setPrivateDirectoryPath(String str, String str2, String str3, String str4) {
        if (sInitializationStarted.getAndSet(true)) {
            return;
        }
        sDataDirectoryBasePath = str;
        sCacheDirectoryBasePath = str2;
        sDataDirectorySuffix = str3;
        sCacheSubDirectory = str4;
        sDirPathFetchTask = new FutureTask<>(new yq90());
        AsyncTask.THREAD_POOL_EXECUTOR.execute(sDirPathFetchTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] setPrivateDirectoryPathInternal() {
        File file;
        File file2;
        String[] strArr = new String[3];
        Context applicationContext = ContextUtils.getApplicationContext();
        if (sDataDirectoryBasePath == null) {
            file = applicationContext.getDir(sDataDirectorySuffix, 0);
            file2 = applicationContext.getDir(THUMBNAIL_DIRECTORY_NAME, 0);
        } else {
            file = new File(sDataDirectoryBasePath, sDataDirectorySuffix);
            file.mkdirs();
            File file3 = new File(sDataDirectoryBasePath, THUMBNAIL_DIRECTORY_NAME);
            file3.mkdirs();
            file2 = file3;
        }
        File file4 = sCacheDirectoryBasePath != null ? new File(sCacheDirectoryBasePath) : applicationContext.getCacheDir();
        if (file4 != null) {
            if (sCacheSubDirectory != null) {
                file4 = new File(file4, sCacheSubDirectory);
            }
            if (sCacheDirectoryBasePath != null || sCacheSubDirectory != null) {
                file4.mkdirs();
                chmod(file4.getPath(), 1472);
            }
            strArr[2] = file4.getPath();
        }
        String path = file.getPath();
        strArr[0] = path;
        chmod(path, 448);
        strArr[1] = file2.getPath();
        return strArr;
    }

    private static String[] toAbsolutePathStrings(List<File> list) {
        ArrayList arrayList = new ArrayList();
        for (File file : list) {
            if (file != null && !TextUtils.isEmpty(file.getAbsolutePath())) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void setPrivateDataDirectorySuffix(String str) {
        setPrivateDataDirectorySuffix(str, null);
    }
}
