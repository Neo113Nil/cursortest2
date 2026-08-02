package xsna;

import com.vk.dto.masks.Mask;

/* compiled from: VoipMaskControllerInteractorImpl.kt */
/* loaded from: classes7.dex */
public final class rrw0 extends tnw0 {
    public final com.vk.voip.ui.c g;

    public rrw0(com.vk.voip.ui.c cVar, vpn0 vpn0Var) {
        super(cVar, vpn0Var);
        this.g = cVar;
    }

    @Override // xsna.snw0
    public final void a(Mask mask) {
        this.g.getClass();
        ((wnw0) com.vk.voip.ui.c.h0().f.getValue()).b(mask);
    }

    @Override // xsna.snw0
    public final void b(Mask mask, String str) {
        this.g.getClass();
        com.vk.voip.ui.c.h0().b(mask, str);
    }
}
