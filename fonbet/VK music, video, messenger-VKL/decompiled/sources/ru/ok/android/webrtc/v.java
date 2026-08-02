package ru.ok.android.webrtc;

import org.webrtc.PeerConnection;

/* loaded from: classes9.dex */
public abstract class v implements Runnable {
    public final /* synthetic */ PeerConnectionClient a;

    public v(PeerConnectionClient peerConnectionClient) {
        this.a = peerConnectionClient;
    }

    public abstract void a(PeerConnection peerConnection);

    @Override // java.lang.Runnable
    public final void run() {
        PeerConnection p = this.a.p();
        if (p != null) {
            a(p);
        }
    }
}
