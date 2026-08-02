package xsna;

import com.vk.libvideo.design.view.live.LiveView;
import xsna.mg0;

/* compiled from: LiveView.java */
/* loaded from: classes2.dex */
public final class wnz implements mg0.c {
    public final /* synthetic */ LiveView a;

    public wnz(LiveView liveView) {
        this.a = liveView;
    }

    @Override // xsna.mg0.c
    public final void a(mg0.b bVar) {
        mg0 mg0Var;
        LiveView liveView = this.a;
        if (!liveView.n0.a(liveView.getContext(), bVar.a) || (mg0Var = liveView.c0) == null) {
            return;
        }
        dw20 dw20Var = mg0Var.e;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        mg0Var.e = null;
    }

    @Override // xsna.mg0.c
    public final void onDismiss() {
        this.a.c0 = null;
    }
}
