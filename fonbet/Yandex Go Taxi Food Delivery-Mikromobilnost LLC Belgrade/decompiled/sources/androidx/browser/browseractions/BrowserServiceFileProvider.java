package androidx.browser.browseractions;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.core.content.FileProvider;
import defpackage.euy;
import defpackage.hsj0;
import defpackage.lz;
import defpackage.mrj;
import defpackage.oyr;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Deprecated
/* loaded from: classes10.dex */
public final class BrowserServiceFileProvider extends FileProvider {
    private static final String AUTHORITY_SUFFIX = ".image_provider";
    private static final String CLIP_DATA_LABEL = "image_provider_uris";
    private static final String CONTENT_SCHEME = "content";
    private static final String FILE_EXTENSION = ".png";
    private static final String FILE_SUB_DIR = "image_provider";
    private static final String FILE_SUB_DIR_NAME = "image_provider_images/";
    private static final String LAST_CLEANUP_TIME_KEY = "last_cleanup_time";
    private static final String TAG = "BrowserServiceFP";
    static Object sFileCleanupLock = new Object();

    public static class FileCleanupTask extends AsyncTask<Void, Void, Void> {
        private final Context mAppContext;
        private static final long IMAGE_RETENTION_DURATION = 604800000;
        private static final long CLEANUP_REQUIRED_TIME_SPAN = 604800000;
        private static final long DELETION_FAILED_REATTEMPT_DURATION = 86400000;

        public FileCleanupTask(Context context) {
            this.mAppContext = context.getApplicationContext();
        }

        private static boolean isImageFile(File file) {
            return file.getName().endsWith("..png");
        }

        private static boolean shouldCleanUp(SharedPreferences sharedPreferences) {
            return System.currentTimeMillis() > sharedPreferences.getLong(BrowserServiceFileProvider.LAST_CLEANUP_TIME_KEY, System.currentTimeMillis()) + CLEANUP_REQUIRED_TIME_SPAN;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            SharedPreferences sharedPreferences = this.mAppContext.getSharedPreferences(this.mAppContext.getPackageName() + BrowserServiceFileProvider.AUTHORITY_SUFFIX, 0);
            if (!shouldCleanUp(sharedPreferences)) {
                return null;
            }
            synchronized (BrowserServiceFileProvider.sFileCleanupLock) {
                try {
                    File file = new File(this.mAppContext.getFilesDir(), BrowserServiceFileProvider.FILE_SUB_DIR);
                    if (!file.exists()) {
                        return null;
                    }
                    File[] listFiles = file.listFiles();
                    long currentTimeMillis = System.currentTimeMillis() - IMAGE_RETENTION_DURATION;
                    boolean z = true;
                    for (File file2 : listFiles) {
                        if (isImageFile(file2) && file2.lastModified() < currentTimeMillis && !file2.delete()) {
                            Log.e(BrowserServiceFileProvider.TAG, "Fail to delete image: " + file2.getAbsoluteFile());
                            z = false;
                        }
                    }
                    long currentTimeMillis2 = z ? System.currentTimeMillis() : (System.currentTimeMillis() - CLEANUP_REQUIRED_TIME_SPAN) + DELETION_FAILED_REATTEMPT_DURATION;
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(BrowserServiceFileProvider.LAST_CLEANUP_TIME_KEY, currentTimeMillis2);
                    edit.apply();
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static Uri generateUri(Context context, String str) {
        return new Uri.Builder().scheme(CONTENT_SCHEME).authority(context.getPackageName() + AUTHORITY_SUFFIX).path(oyr.p(FILE_SUB_DIR_NAME, str, FILE_EXTENSION)).build();
    }

    public static void grantReadPermission(Intent intent, List<Uri> list, Context context) {
        if (list == null || list.size() == 0) {
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        intent.addFlags(1);
        ClipData newUri = ClipData.newUri(contentResolver, CLIP_DATA_LABEL, list.get(0));
        for (int i = 1; i < list.size(); i++) {
            newUri.addItem(new ClipData.Item(list.get(i)));
        }
        intent.setClipData(newUri);
    }

    public static euy loadBitmap(ContentResolver contentResolver, Uri uri) {
        hsj0 hsj0Var = new hsj0();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new lz(10, contentResolver, uri, hsj0Var));
        return hsj0Var;
    }

    public static hsj0 saveBitmap(Context context, Bitmap bitmap, String str, int i) {
        StringBuilder v = oyr.v(str, "_");
        v.append(Integer.toString(i));
        String sb = v.toString();
        Uri generateUri = generateUri(context, sb);
        hsj0 hsj0Var = new hsj0();
        new FileSaveTask(context, sb, bitmap, generateUri, hsj0Var).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return hsj0Var;
    }

    public static class FileSaveTask extends AsyncTask<String, Void, Void> {
        private final Context mAppContext;
        private final Bitmap mBitmap;
        private final Uri mFileUri;
        private final String mFilename;
        private final hsj0 mResultFuture;

        public FileSaveTask(Context context, String str, Bitmap bitmap, Uri uri, hsj0 hsj0Var) {
            this.mAppContext = context.getApplicationContext();
            this.mFilename = str;
            this.mBitmap = bitmap;
            this.mFileUri = uri;
            this.mResultFuture = hsj0Var;
        }

        private void saveFileBlocking(File file) {
            FileOutputStream fileOutputStream;
            mrj mrjVar = new mrj(file);
            try {
                fileOutputStream = mrjVar.H();
            } catch (IOException e) {
                e = e;
                fileOutputStream = null;
            }
            try {
                this.mBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                mrjVar.m(fileOutputStream);
                this.mResultFuture.k(this.mFileUri);
            } catch (IOException e2) {
                e = e2;
                mrjVar.l(fileOutputStream);
                this.mResultFuture.l(e);
            }
        }

        private void saveFileIfNeededBlocking() {
            File file = new File(this.mAppContext.getFilesDir(), BrowserServiceFileProvider.FILE_SUB_DIR);
            synchronized (BrowserServiceFileProvider.sFileCleanupLock) {
                try {
                    if (!file.exists() && !file.mkdir()) {
                        this.mResultFuture.l(new IOException("Could not create file directory."));
                        return;
                    }
                    File file2 = new File(file, this.mFilename + BrowserServiceFileProvider.FILE_EXTENSION);
                    if (file2.exists()) {
                        this.mResultFuture.k(this.mFileUri);
                    } else {
                        saveFileBlocking(file2);
                    }
                    file2.setLastModified(System.currentTimeMillis());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r2) {
            new FileCleanupTask(this.mAppContext).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(String... strArr) {
            saveFileIfNeededBlocking();
            return null;
        }
    }
}
