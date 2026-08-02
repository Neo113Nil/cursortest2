package xsna;

import ru.ok.android.webrtc.signaling.transport.SignalingTransport;

/* loaded from: classes8.dex */
public final class diz0 {
    public final long a;
    public volatile int b;
    public final /* synthetic */ SignalingTransport c;

    public diz0(SignalingTransport signalingTransport) {
        long msSinceBoot;
        this.c = signalingTransport;
        msSinceBoot = signalingTransport.l.getMsSinceBoot();
        this.a = msSinceBoot;
    }
}
