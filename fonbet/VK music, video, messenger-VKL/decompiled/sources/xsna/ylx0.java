package xsna;

import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.flx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ylx0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ylx0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((com.vk.voip.ui.whiteboard.presentation.main.ui.a) this.c).c.invoke(flx0.b.b);
                return s3q0.a;
            default:
                return ru.ok.android.webrtc.signaling.transport.a.a((SignalingTransport) this.c, (String) obj);
        }
    }
}
