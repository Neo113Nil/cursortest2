package xsna;

import xsna.i3x0;

/* compiled from: VoipVideoEffectsDelegateEffectUseCaseImpl.kt */
/* loaded from: classes7.dex */
public final class l3x0 implements i3x0.e {
    public final com.vk.voip.ui.c a;

    public l3x0(com.vk.voip.ui.c cVar) {
        this.a = cVar;
    }

    @Override // xsna.i3x0.e
    public final boolean a() {
        xdw0 xdw0Var;
        zqk0 g0 = this.a.g0();
        return (g0 == null || (xdw0Var = g0.k) == null || !xdw0Var.h) ? false : true;
    }
}
