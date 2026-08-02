package xsna;

import android.util.Size;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import xsna.ikv0;

/* compiled from: InteractiveOpinionStickerDelegate.kt */
/* loaded from: classes6.dex */
public final class mbx {
    public final uov a;
    public final FrameLayout b;
    public final w2l0 c;
    public final xrj d;
    public boolean e;
    public final nhs f = new nhs(new jwx(5, 5));
    public final bpn0 g = new bpn0(new g4g(this, 25));
    public final bpn0 h = new bpn0(new z0h(this, 22));
    public final bpn0 i = new bpn0(new drg(this, 22));

    public mbx(uov uovVar, FrameLayout frameLayout, w2l0 w2l0Var, xrj xrjVar) {
        this.a = uovVar;
        this.b = frameLayout;
        this.c = w2l0Var;
        this.d = xrjVar;
    }

    public final kbx a() {
        return (kbx) this.i.getValue();
    }

    public final void b() {
        this.e = false;
        ((FrameLayout) this.g.getValue()).setVisibility(4);
        uov uovVar = this.a;
        uovVar.play();
        uovVar.v0(true, (r3 & 2) != 0, false);
        mhy.d(a().h);
        this.d.invoke();
    }

    public final void c(int i, int i2, int i3, int i4, ViewGroup viewGroup) {
        uov uovVar = this.a;
        ikv0.a aVar = new ikv0.a(bwt0.u(uovVar.getCtx()));
        aVar.t = new ikv0.c.C3058c(i2, Integer.valueOf(i), (Size) null, 12);
        aVar.u = new ikv0.d(uovVar.getCtx().getString(i3), (String) null, (ikv0.d.a) null, 6);
        aVar.o = Integer.valueOf(i4);
        aVar.e = 1000L;
        aVar.l = 80;
        aVar.o(viewGroup);
    }
}
