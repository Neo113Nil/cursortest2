package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import kotlin.Lazy;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;
import xsna.bpn0;
import xsna.e9e0;
import xsna.epx;
import xsna.g0;
import xsna.gzs;
import xsna.qlb0;
import xsna.xis;
import xsna.zcl;

/* compiled from: MultiUploadHelper.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class MultiUploadHelper {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MSG_TRY_UPLOAD_NEXT = 1001;

    @Deprecated
    public static final long UPLOAD_NEXT_INTERVAL = 5000;
    private final EventChannel channel;
    private final Lazy handler$delegate;
    private final gzs<Boolean> hasMoreItems;
    private final String logTag;
    private final CallAnalyticsLogger logger;
    private final e9e0<Looper> looperProvider;
    private final long timeBeforeNextUploadMs;

    /* compiled from: MultiUploadHelper.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: MultiUploadHelper.kt */
    public final class LooperCallback implements Handler.Callback {
        public LooperCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1001) {
                return false;
            }
            MultiUploadHelper.this.requestContinueUpload();
            return true;
        }
    }

    public MultiUploadHelper(e9e0<Looper> e9e0Var, EventChannel eventChannel, Long l, String str, gzs<Boolean> gzsVar) {
        this.looperProvider = e9e0Var;
        this.channel = eventChannel;
        this.logTag = str;
        this.hasMoreItems = gzsVar;
        this.timeBeforeNextUploadMs = l != null ? l.longValue() : 5000L;
        this.handler$delegate = new bpn0(new xis(this, 21));
        this.logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();
    }

    private final Handler getHandler() {
        return (Handler) this.handler$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler handler_delegate$lambda$0(MultiUploadHelper multiUploadHelper) {
        return new Handler(multiUploadHelper.looperProvider.get(), multiUploadHelper.new LooperCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestContinueUpload() {
        try {
            UploadStarter.INSTANCE.resumeUpload(this.channel);
        } catch (Throwable th) {
            this.logger.e(this.logTag, "Resume upload failed", th);
        }
    }

    public static /* synthetic */ void scheduleNextUpload$default(MultiUploadHelper multiUploadHelper, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        multiUploadHelper.scheduleNextUpload(z, i);
    }

    private final void scheduleNextUploadUnsafe(boolean z, int i) {
        if (!this.hasMoreItems.invoke().booleanValue()) {
            this.logger.d(this.logTag, "storage size is not enough to schedule new upload");
            return;
        }
        if (getHandler().hasMessages(1001)) {
            return;
        }
        if (z) {
            this.logger.d(this.logTag, "schedule next upload pass now");
            getHandler().removeMessages(1001);
            getHandler().sendMessage(getHandler().obtainMessage(1001));
        } else {
            long j = this.timeBeforeNextUploadMs * i;
            this.logger.d(this.logTag, qlb0.a(j, "schedule next upload pass in ", " ms"));
            getHandler().sendMessageDelayed(getHandler().obtainMessage(1001), j);
        }
    }

    public static /* synthetic */ void scheduleNextUploadUnsafe$default(MultiUploadHelper multiUploadHelper, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        multiUploadHelper.scheduleNextUploadUnsafe(z, i);
    }

    public final long currentTime() {
        return SystemClock.elapsedRealtime();
    }

    public final boolean isNowGoodTimeToUploadNext(long j) {
        return currentTime() - j > this.timeBeforeNextUploadMs;
    }

    public final void scheduleNextUpload(boolean z, int i) {
        try {
            scheduleNextUploadUnsafe(z, i);
        } catch (Throwable th) {
            this.logger.e(this.logTag, "Error during upload schedule update", th);
        }
    }

    public final void setIdleStateProvider(Boolean bool, Uploader.IdleStateProvider idleStateProvider) {
        try {
            if (epx.f(bool, Boolean.TRUE) || idleStateProvider == null || !idleStateProvider.isIdle()) {
                return;
            }
            getHandler().post(new g0(this, 16));
        } catch (Throwable th) {
            this.logger.e(this.logTag, "Can't schedule next upload", th);
        }
    }
}
