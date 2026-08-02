package one.video.calls.sdk_private.wts;

import one.video.calls.sdk.net.signaling.wt.nal.NALSocket;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;

/* compiled from: r8-map-id-b60fecdec90728a8a3a0c07eda950c1720c8e7dcb79a20187f93a68f412a0d42 */
/* loaded from: classes8.dex */
public final class c implements NALSocket.Listener {
    public final /* synthetic */ SignalingTransport.SocketListener a;

    public c(SignalingTransport.SocketListener socketListener) {
        this.a = socketListener;
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALSocket.Listener
    public final void onClosed(int i, String str) {
        this.a.onClosed(i, str);
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALSocket.Listener
    public final void onFailure(Throwable th) {
        this.a.onFailure(th);
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALSocket.Listener
    public final void onMessage(String str) {
        this.a.onMessage(str);
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALSocket.Listener
    public final void onOpen() {
        this.a.onOpen();
    }
}
