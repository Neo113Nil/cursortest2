package ru.ok.android.webrtc;

import org.webrtc.PeerConnection;

/* loaded from: classes9.dex */
public final class s extends v {
    public final /* synthetic */ PeerConnectionClient b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(PeerConnectionClient peerConnectionClient) {
        super(peerConnectionClient);
        this.b = peerConnectionClient;
    }

    @Override // ru.ok.android.webrtc.v
    public final void a(PeerConnection peerConnection) {
        this.b.l();
    }
}
