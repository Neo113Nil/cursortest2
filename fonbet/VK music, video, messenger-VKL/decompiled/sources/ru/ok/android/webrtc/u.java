package ru.ok.android.webrtc;

import org.webrtc.PeerConnection;
import ru.ok.android.webrtc.utils.Consumer;

/* loaded from: classes9.dex */
public final class u extends v {
    public final Consumer b;

    public u(PeerConnectionClient peerConnectionClient, Consumer consumer) {
        super(peerConnectionClient);
        this.b = consumer;
    }

    @Override // ru.ok.android.webrtc.v
    public final void a(PeerConnection peerConnection) {
        this.b.accept(peerConnection);
    }
}
