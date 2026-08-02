package ru.ok.android.webrtc;

import org.webrtc.PeerConnection;
import ru.ok.android.webrtc.utils.Consumer;

/* loaded from: classes9.dex */
public final class q extends v {
    public final /* synthetic */ Consumer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(PeerConnectionClient peerConnectionClient, Consumer consumer) {
        super(peerConnectionClient);
        this.b = consumer;
    }

    @Override // ru.ok.android.webrtc.v
    public final void a(PeerConnection peerConnection) {
        this.b.accept(peerConnection);
    }
}
