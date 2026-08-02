package one.video.calls.sdk_private.wss;

import okhttp3.u;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.phx0;
import xsna.uhx0;

/* compiled from: r8-map-id-cc4c1e6558630cf7ba5e355c7bcb3cc9779e4bdb3dccad6bc7dbe1b632974ab0 */
/* loaded from: classes8.dex */
public final class b extends uhx0 {
    public final /* synthetic */ SignalingTransport.SocketListener a;

    public b(SignalingTransport.SocketListener socketListener) {
        this.a = socketListener;
    }

    @Override // xsna.uhx0
    public final void onClosed(phx0 phx0Var, int i, String str) {
        this.a.onClosed(i, str);
    }

    @Override // xsna.uhx0
    public final void onFailure(phx0 phx0Var, Throwable th, u uVar) {
        this.a.onFailure(th);
    }

    @Override // xsna.uhx0
    public final void onMessage(phx0 phx0Var, String str) {
        this.a.onMessage(str);
    }

    @Override // xsna.uhx0
    public final void onOpen(phx0 phx0Var, u uVar) {
        this.a.onOpen();
    }
}
