package ru.ok.android.webrtc;

import ru.ok.android.webrtc.utils.Consumer;
import ru.ok.android.webrtc.videotracks.RemoteVideoTracks;

/* loaded from: classes9.dex */
public final class r implements RemoteVideoTracks.Executor {
    public final /* synthetic */ PeerConnectionClient a;

    public r(PeerConnectionClient peerConnectionClient) {
        this.a = peerConnectionClient;
    }

    @Override // ru.ok.android.webrtc.videotracks.RemoteVideoTracks.Executor
    public final void execute(String str, Runnable runnable) {
        this.a.a(str, runnable);
    }

    @Override // ru.ok.android.webrtc.videotracks.RemoteVideoTracks.Executor
    public final void executeWithPeerConnection(String str, Consumer consumer) {
        PeerConnectionClient peerConnectionClient = this.a;
        peerConnectionClient.a(str, new q(peerConnectionClient, consumer));
    }
}
