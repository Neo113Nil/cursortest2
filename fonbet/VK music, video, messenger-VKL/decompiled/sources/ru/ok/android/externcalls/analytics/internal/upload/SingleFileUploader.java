package ru.ok.android.externcalls.analytics.internal.upload;

import java.io.File;
import java.util.concurrent.locks.Lock;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import xsna.e9e0;
import xsna.zcl;

/* compiled from: SingleFileUploader.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class SingleFileUploader extends AbstractUploader {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "CallAnalyticsUploader";
    private final boolean disableUploadWhenCallIsActive;

    /* compiled from: SingleFileUploader.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SingleFileUploader(e9e0 e9e0Var, Lock lock, EventChannel eventChannel, boolean z, boolean z2, boolean z3, int i, zcl zclVar) {
        this(e9e0Var, lock, eventChannel, (i & 8) != 0 ? false : z, z2, z3);
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public File getSink() {
        Lock lock = getLock();
        lock.lock();
        try {
            return ensureStorageIsOfCorrectType(false);
        } finally {
            lock.unlock();
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void upload() {
        Uploader.IdleStateProvider idleState;
        if (this.disableUploadWhenCallIsActive && (idleState = getIdleState()) != null && !idleState.isIdle()) {
            getLogger().d(LOG_TAG, "call is not idle, postpone upload");
            return;
        }
        try {
            uploadFile(getStorage().get());
        } catch (Throwable th) {
            getLogger().report(LOG_TAG, "Upload failed", new StatDeliveryException(getChannel().getApiMethod(), th));
        }
    }

    public SingleFileUploader(e9e0<File> e9e0Var, Lock lock, EventChannel eventChannel, boolean z, boolean z2, boolean z3) {
        super(e9e0Var, lock, eventChannel, z2, z3, LOG_TAG);
        this.disableUploadWhenCallIsActive = z;
    }
}
