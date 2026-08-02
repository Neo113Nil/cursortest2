package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.Looper;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.util.Files;
import xsna.bpn0;
import xsna.drm0;
import xsna.e9e0;
import xsna.epx;
import xsna.f540;
import xsna.go9;
import xsna.lhg;
import xsna.rl3;
import xsna.s3q0;
import xsna.t9b;
import xsna.zcl;
import xsna.zr;

/* compiled from: MultiFileUploader.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class MultiFileUploader extends AbstractUploader {

    @Deprecated
    public static final String CHUNK_FILE_NAME_PREFIX = "chunk";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_TAG = "CallAnalyticsUploaderV2";
    private final int fileCountLimit;
    private final int fileIndexStringLength;
    private final e9e0<Looper> looperProvider;
    private final Lazy multiUploadHelper$delegate;
    private volatile int scaleUpNextUploadTimeout;
    private final Long timeBeforeNextUploadMs;

    /* compiled from: MultiFileUploader.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: MultiFileUploader.kt */
    public static final class StorageInfo {
        private final List<File> allFiles;
        private final File oldestFile;

        /* JADX WARN: Multi-variable type inference failed */
        public StorageInfo(File file, List<? extends File> list) {
            this.oldestFile = file;
            this.allFiles = list;
        }

        public final List<File> getAllFiles() {
            return this.allFiles;
        }

        public final File getOldestFile() {
            return this.oldestFile;
        }
    }

    /* compiled from: MultiFileUploader.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractUploader.UploadResult.values().length];
            try {
                iArr[AbstractUploader.UploadResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractUploader.UploadResult.RECOVERABLE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractUploader.UploadResult.SKIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractUploader.UploadResult.BAD_CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractUploader.UploadResult.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ MultiFileUploader(e9e0 e9e0Var, e9e0 e9e0Var2, Lock lock, EventChannel eventChannel, boolean z, boolean z2, int i, Long l, int i2, zcl zclVar) {
        this(e9e0Var, e9e0Var2, lock, eventChannel, z, z2, (i2 & 64) != 0 ? 10 : i, l);
    }

    private final String calcBestNameForNewFile(List<? extends File> list) {
        Object obj;
        int i = this.fileCountLimit;
        for (int i2 = 0; i2 < i; i2++) {
            String fileNameForIndex = getFileNameForIndex(i2);
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(fileNameForIndex, ((File) obj).getName())) {
                    break;
                }
            }
            if (obj == null) {
                if (!new File(getStorage().get(), fileNameForIndex).exists()) {
                    getLogger().d(LOG_TAG, "Name: " + fileNameForIndex + " not found, provide it");
                    return fileNameForIndex;
                }
                getLogger().d(LOG_TAG, "Name: " + fileNameForIndex + " not listed but file exists");
            }
        }
        String fileNameForIndex2 = getFileNameForIndex(0);
        getLogger().d(LOG_TAG, "Nothing found, default to " + fileNameForIndex2);
        return fileNameForIndex2;
    }

    private final File createNewFile() {
        List<File> allFiles;
        Lock lock = getLock();
        lock.lock();
        try {
            File file = getStorage().get();
            StorageInfo storageInfo = getStorageInfo();
            if (storageInfo.getAllFiles().size() >= this.fileCountLimit) {
                File oldestFile = storageInfo.getOldestFile();
                if (oldestFile != null) {
                    dropOldestFile(oldestFile);
                    allFiles = getAllFiles();
                    if (allFiles == null) {
                    }
                }
                allFiles = storageInfo.getAllFiles();
            } else {
                allFiles = storageInfo.getAllFiles();
            }
            String calcBestNameForNewFile = calcBestNameForNewFile(allFiles);
            getLogger().d(LOG_TAG, "Propose new file for upload cache: " + calcBestNameForNewFile + ", total files size: " + Files.length(allFiles));
            File file2 = new File(file, calcBestNameForNewFile);
            lock.unlock();
            return file2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    private final void dropOldestFile(File file) {
        try {
            Files.delete(file);
            getLogger().d(LOG_TAG, "Oldest file " + file.getPath() + " dropped");
        } catch (IOException e) {
            getLogger().e(LOG_TAG, zr.a("Oldest file ", file.getPath(), " drop request failed"), e);
        }
    }

    private final List<File> getAllFiles() {
        File[] listFiles = getStorage().get().listFiles();
        return listFiles != null ? rl3.I(listFiles) : EmptyList.b;
    }

    private final String getFileNameForIndex(int i) {
        return this.fileIndexStringLength > 1 ? go9.b("chunk_", drm0.R(String.valueOf(i), this.fileIndexStringLength, '_')) : lhg.a(i, "chunk_");
    }

    private final MultiUploadHelper getMultiUploadHelper() {
        return (MultiUploadHelper) this.multiUploadHelper$delegate.getValue();
    }

    private final StorageInfo getStorageInfo() {
        List<File> allFiles = getAllFiles();
        File file = null;
        long j = 0;
        for (File file2 : allFiles) {
            if (file2.exists() && (file == null || file2.lastModified() < j)) {
                j = file2.lastModified();
                file = file2;
            }
        }
        return new StorageInfo(file, allFiles);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiUploadHelper multiUploadHelper_delegate$lambda$0(MultiFileUploader multiFileUploader, EventChannel eventChannel) {
        return new MultiUploadHelper(multiFileUploader.looperProvider, eventChannel, multiFileUploader.timeBeforeNextUploadMs, LOG_TAG, new f540(multiFileUploader, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean multiUploadHelper_delegate$lambda$0$0(MultiFileUploader multiFileUploader) {
        return !multiFileUploader.getStorageInfo().getAllFiles().isEmpty();
    }

    private final void scheduleNextUpload(boolean z) {
        getMultiUploadHelper().scheduleNextUpload(z, this.scaleUpNextUploadTimeout);
    }

    public static /* synthetic */ void scheduleNextUpload$default(MultiFileUploader multiFileUploader, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        multiFileUploader.scheduleNextUpload(z);
    }

    private final boolean uploadFileWithResultCheck(File file) {
        int i = WhenMappings.$EnumSwitchMapping$0[uploadFile(file).ordinal()];
        if (i == 1 || i == 2) {
            this.scaleUpNextUploadTimeout = 1;
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.scaleUpNextUploadTimeout < 6) {
            this.scaleUpNextUploadTimeout *= 2;
        }
        return false;
    }

    private final boolean uploadImpl() {
        StorageInfo storageInfo = getStorageInfo();
        File oldestFile = storageInfo.getOldestFile();
        getLogger().d(LOG_TAG, "Try to upload oldest file first");
        if (oldestFile != null && uploadFileWithResultCheck(oldestFile)) {
            getLogger().d(LOG_TAG, "Oldest file upload completed: " + oldestFile.getPath());
            return true;
        }
        getLogger().d(LOG_TAG, "Try to upload first from the list");
        for (File file : storageInfo.getAllFiles()) {
            if (uploadFileWithResultCheck(file)) {
                getLogger().d(LOG_TAG, "File upload completed: " + file.getPath());
                return true;
            }
        }
        getLogger().d(LOG_TAG, "No files were uploaded");
        return false;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public File getSink() {
        Lock lock = getLock();
        lock.lock();
        try {
            ensureStorageIsOfCorrectType(true);
            return createNewFile();
        } finally {
            lock.unlock();
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader, ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void setIdleStateProvider(Uploader.IdleStateProvider idleStateProvider) {
        Uploader.IdleStateProvider idleState = getIdleState();
        Boolean valueOf = idleState != null ? Boolean.valueOf(idleState.isIdle()) : null;
        super.setIdleStateProvider(idleStateProvider);
        getMultiUploadHelper().setIdleStateProvider(valueOf, idleStateProvider);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        throw r1;
     */
    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void upload() {
        Uploader.IdleStateProvider idleState = getIdleState();
        if (idleState != null && !idleState.isIdle()) {
            getLogger().d(LOG_TAG, "call is not idle, postpone upload");
            return;
        }
        getLock().lock();
        try {
            uploadImpl();
        } finally {
            scheduleNextUpload$default(this, false, 1, null);
            s3q0 s3q0Var = s3q0.a;
        }
        scheduleNextUpload$default(this, false, 1, null);
        s3q0 s3q0Var2 = s3q0.a;
    }

    public MultiFileUploader(e9e0<Looper> e9e0Var, e9e0<File> e9e0Var2, Lock lock, EventChannel eventChannel, boolean z, boolean z2, int i, Long l) {
        super(e9e0Var2, lock, eventChannel, z, z2, LOG_TAG);
        this.looperProvider = e9e0Var;
        this.fileCountLimit = i;
        this.timeBeforeNextUploadMs = l;
        int i2 = 10;
        if (i <= 10) {
            i2 = 1;
        } else if (i <= 100) {
            i2 = 2;
        } else if (i <= 1000) {
            i2 = 3;
        }
        this.fileIndexStringLength = i2;
        this.scaleUpNextUploadTimeout = 1;
        this.multiUploadHelper$delegate = new bpn0(new t9b(10, this, eventChannel));
    }
}
