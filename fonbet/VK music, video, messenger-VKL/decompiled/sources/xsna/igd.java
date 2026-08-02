package xsna;

import com.airbnb.lottie.LottieAnimationView;
import xsna.hgd;

/* compiled from: ClipsAnimatedIconButtonLottieImpl.kt */
/* loaded from: classes16.dex */
public final class igd implements s800 {
    public final /* synthetic */ hgd a;
    public final /* synthetic */ hgd.a.InterfaceC2993a b;
    public final /* synthetic */ vf0 c;

    public igd(hgd hgdVar, hgd.a.InterfaceC2993a interfaceC2993a, vf0 vf0Var) {
        this.a = hgdVar;
        this.b = interfaceC2993a;
        this.c = vf0Var;
    }

    @Override // xsna.s800
    public final void a() {
        hgd hgdVar = this.a;
        LottieAnimationView lottieAnimationView = hgdVar.b;
        lottieAnimationView.m.remove(this);
        hgdVar.h = this.b;
        this.c.invoke();
        bpn0 bpn0Var = hgdVar.e;
        lottieAnimationView.f.c.addUpdateListener((hgd.b) bpn0Var.getValue());
        lottieAnimationView.U((hgd.b) bpn0Var.getValue());
    }
}
