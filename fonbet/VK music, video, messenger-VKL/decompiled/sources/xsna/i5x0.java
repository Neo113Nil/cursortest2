package xsna;

import android.content.Intent;
import com.vk.dto.masks.Mask;

/* compiled from: VoipVirtualBackgroundControllerInteractorImpl.kt */
/* loaded from: classes7.dex */
public final class i5x0 extends tnw0 implements j5x0 {
    public final com.vk.voip.ui.c g;
    public final jan0 h;

    public i5x0(com.vk.voip.ui.c cVar, jan0 jan0Var, vpn0 vpn0Var) {
        super(cVar, vpn0Var);
        this.g = cVar;
        this.h = jan0Var;
    }

    @Override // xsna.snw0
    public final void a(Mask mask) {
        this.g.getClass();
        com.vk.voip.ui.c.h0().c(mask);
    }

    @Override // xsna.snw0
    public final void b(Mask mask, String str) {
        this.g.getClass();
        com.vk.voip.ui.c.h0().c(mask);
    }

    @Override // xsna.j5x0
    public final void c(Intent intent) {
        jan0 jan0Var = this.h;
        if (jan0Var != null) {
            jan0Var.invoke(intent);
        }
    }
}
