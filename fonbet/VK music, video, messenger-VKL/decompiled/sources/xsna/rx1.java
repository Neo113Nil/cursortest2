package xsna;

import ru.ok.android.webrtc.signaling.transport.SignalingTransport;

/* compiled from: Handler.kt */
/* loaded from: classes16.dex */
public final class rx1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rx1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((px1) this.c).a.d();
                return;
            default:
                Object socketLock = ((SignalingTransport) this.c).getSocketLock();
                SignalingTransport signalingTransport = (SignalingTransport) this.c;
                synchronized (socketLock) {
                    signalingTransport.getSignalingLogger().log("transport.DISCONNECT");
                    signalingTransport.safelyCloseSocketWithCodeAndReason(1001, "dispose");
                }
                return;
        }
    }
}
