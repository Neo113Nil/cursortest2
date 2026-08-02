package ru.ok.media;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.media.OkmpStreamPublisher;
import ru.ok.proto.ErrorCodes;
import ru.ok.proto.NetPublisher;
import xsna.epx;
import xsna.f0m;
import xsna.ne7;
import xsna.s3q0;
import xsna.vt30;

/* compiled from: OkmpStreamPublisher.kt */
/* loaded from: classes9.dex */
public final class OkmpStreamPublisher$createPublisherCallback$1 implements NetPublisher.Callback {
    private final int m_id;
    final /* synthetic */ OkmpStreamPublisher this$0;

    public OkmpStreamPublisher$createPublisherCallback$1(OkmpStreamPublisher okmpStreamPublisher) {
        AtomicInteger atomicInteger;
        this.this$0 = okmpStreamPublisher;
        atomicInteger = OkmpStreamPublisher.s_nextId;
        this.m_id = atomicInteger.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 handleError$lambda$1(OkmpStreamPublisher okmpStreamPublisher, int i) {
        boolean z;
        OkmpStreamPublisher.Delegate delegate;
        z = okmpStreamPublisher._stopping;
        if (!z) {
            okmpStreamPublisher.stopPublishing();
            if (i == 17 && (delegate = okmpStreamPublisher.delegate) != null) {
                delegate.onNoNetwork(okmpStreamPublisher.connectionId);
            }
            okmpStreamPublisher.setState(ErrorCodes.isRecoverableErrorCode(i) ? OkmpStreamPublisher.State.failed : OkmpStreamPublisher.State.unrecoverableFailure);
        }
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 handleHandshakeComplete$lambda$2(OkmpStreamPublisher okmpStreamPublisher) {
        ConnectionBenchmark connectionBenchmark;
        OkmpStreamPublisher.State state = okmpStreamPublisher.getState();
        if (state == OkmpStreamPublisher.State.preparing) {
            connectionBenchmark = okmpStreamPublisher._connectionBenchmark;
            if (connectionBenchmark != null) {
                connectionBenchmark.start();
            } else {
                okmpStreamPublisher.startPublishing();
            }
        } else if (state == OkmpStreamPublisher.State.starting) {
            okmpStreamPublisher.startPublishing();
        } else {
            ne7.J("Publisher", "handleHandshakeComplete() - won't do anything in state " + state);
        }
        return s3q0.a;
    }

    @Override // ru.ok.proto.NetPublisher.Callback
    public int getId() {
        return this.m_id;
    }

    @Override // ru.ok.proto.NetPublisher.Callback
    public void handleError(int i, int i2) {
        HandlerThread handlerThread;
        int i3;
        String errorCodeName = ErrorCodes.getErrorCodeName(i2);
        ne7.m("Publisher", "handleError(" + errorCodeName + ")");
        Looper myLooper = Looper.myLooper();
        handlerThread = this.this$0.workerThread;
        epx.f(myLooper, handlerThread.getLooper());
        if (isActive(i, "handleStopped()")) {
            OkmpStreamPublisher okmpStreamPublisher = this.this$0;
            synchronized (this) {
                try {
                    i3 = okmpStreamPublisher._firstPublisherError;
                    if (i3 < 0) {
                        okmpStreamPublisher._firstPublisherError = i2;
                        okmpStreamPublisher.setDisconnectReasonString("publisher error " + i2 + ": " + errorCodeName);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.this$0._queueJob.invoke(1011, new f0m(this.this$0, i2, 1));
        }
    }

    @Override // ru.ok.proto.NetPublisher.Callback
    public void handleHandshakeComplete(int i) {
        HandlerThread handlerThread;
        ne7.m("Publisher", "handleHandshakeComplete() in state " + this.this$0.getState());
        Looper myLooper = Looper.myLooper();
        handlerThread = this.this$0.workerThread;
        epx.f(myLooper, handlerThread.getLooper());
        if (isActive(i, "handleHandshakeComplete()")) {
            this.this$0._handshakeComplete = true;
            OkmpStreamPublisher.Delegate delegate = this.this$0.delegate;
            if (delegate != null) {
                delegate.onHandshaked(this.this$0.connectionId);
            }
            this.this$0._queueJob.invoke(1012, new vt30(this.this$0, 8));
        }
    }

    @Override // ru.ok.proto.NetPublisher.Callback
    public void handlePublishingRestart(int i) {
        HandlerThread handlerThread;
        boolean z;
        long j;
        ne7.m("Publisher", "handlePublishingRestart()");
        Looper myLooper = Looper.myLooper();
        handlerThread = this.this$0.workerThread;
        epx.f(myLooper, handlerThread.getLooper());
        if (isActive(i, "handlePublishingRestart()")) {
            z = this.this$0._stopping;
            if (z) {
                ne7.m("Publisher", "handlePublishingRestart() - stopping");
                return;
            }
            this.this$0.setState(OkmpStreamPublisher.State.started);
            OkmpStreamPublisher okmpStreamPublisher = this.this$0;
            j = okmpStreamPublisher._initialBitrate;
            okmpStreamPublisher.switchByRate(j);
        }
    }

    @Override // ru.ok.proto.NetPublisher.Callback
    public void handlePublishingStart(int i) {
        HandlerThread handlerThread;
        boolean z;
        long j;
        ne7.m("Publisher", "handlePublishingStart()");
        Looper myLooper = Looper.myLooper();
        handlerThread = this.this$0.workerThread;
        epx.f(myLooper, handlerThread.getLooper());
        if (isActive(i, "handlePublishingStart()")) {
            z = this.this$0._stopping;
            if (z) {
                ne7.m("Publisher", "handlePublishingStart() - stopping");
                return;
            }
            this.this$0.setState(OkmpStreamPublisher.State.started);
            OkmpStreamPublisher okmpStreamPublisher = this.this$0;
            j = okmpStreamPublisher._initialBitrate;
            okmpStreamPublisher.switchByRate(j);
            this.this$0.startVideoEncoding();
            this.this$0.startAudioEncoding();
            this.this$0.startNetworkMonitor();
        }
    }

    @Override // ru.ok.proto.NetPublisher.Callback
    public void handleRestarted(int i) {
        HandlerThread handlerThread;
        ne7.m("Publisher", "handleRestarted()");
        Looper myLooper = Looper.myLooper();
        handlerThread = this.this$0.workerThread;
        epx.f(myLooper, handlerThread.getLooper());
        isActive(i, "handleRestarted()");
    }

    @Override // ru.ok.proto.NetPublisher.Callback
    public void handleRetrying(int i) {
        HandlerThread handlerThread;
        ne7.m("Publisher", "handleRetrying()");
        Looper myLooper = Looper.myLooper();
        handlerThread = this.this$0.workerThread;
        epx.f(myLooper, handlerThread.getLooper());
        if (isActive(i, "handleRetrying()")) {
            this.this$0.setState(OkmpStreamPublisher.State.starting);
        }
    }

    @Override // ru.ok.proto.NetPublisher.Callback
    public void handleStopped(int i) {
        HandlerThread handlerThread;
        ne7.m("Publisher", "handleStopped()");
        Looper myLooper = Looper.myLooper();
        handlerThread = this.this$0.workerThread;
        epx.f(myLooper, handlerThread.getLooper());
        if (isActive(i, "handleStopped()")) {
            this.this$0.setState(OkmpStreamPublisher.State.stopped);
        }
    }

    public final boolean isActive(int i, String str) {
        NetPublisher.Callback callback;
        callback = this.this$0._publisherCallback;
        if (callback == null) {
            ne7.t("Publisher", str + " - ignored from stale callback " + i);
            return false;
        }
        if (callback == this) {
            return true;
        }
        ne7.t("Publisher", str + " - ignored from callback " + i + ", current _publisherCallback id= " + callback.getId());
        return false;
    }
}
