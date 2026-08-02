package yads;

import android.content.Context;
import android.util.AttributeSet;
import xsna.jgp;

/* loaded from: classes10.dex */
public final class ix1 extends ic2 {
    public static final /* synthetic */ int p = 0;
    public final yw1 l;
    public jp3 m;
    public final lx1 n;
    public jk1 o;

    public ix1(Context context, xo3 xo3Var, AttributeSet attributeSet) {
        super(context, xo3Var, attributeSet, 56);
        yw1 yw1Var = new yw1();
        this.l = yw1Var;
        this.m = ip3.a;
        this.n = new lx1(this, yw1Var);
        this.o = new g03();
    }

    public final void a(String str, hx1 hx1Var) {
        if (this.m instanceof ip3) {
            this.m = new hp3(hx1Var);
            lx1 lx1Var = this.n;
            lx1Var.e.getClass();
            boolean find = vw1.a.matcher(str).find();
            lx1Var.f.getClass();
            k11 zw1Var = find ? new zw1() : new go();
            ix1 ix1Var = lx1Var.a;
            pi3 pi3Var = lx1Var.c;
            yw1 yw1Var = lx1Var.b;
            zw1Var.a(ix1Var, lx1Var, pi3Var, yw1Var, yw1Var, yw1Var).a(str);
        }
    }

    @Override // yads.ic2
    public final void e() {
        this.n.d.a(jgp.b);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ik1 a = this.o.a(i, i2);
        super.onMeasure(a.a, a.b);
    }

    public final void setAspectRatio(float f) {
        this.o = new pl2(f);
    }

    public final void setClickListener(ev evVar) {
        this.n.h = evVar;
    }

    public final void setPreloadingState(jp3 jp3Var) {
        this.m = jp3Var;
    }

    @Override // yads.ic2, yads.o11
    public final void a() {
        super.a();
        jp3 jp3Var = this.m;
        hp3 hp3Var = jp3Var instanceof hp3 ? (hp3) jp3Var : null;
        if (hp3Var != null) {
            hx1 hx1Var = hp3Var.a;
            if (hx1Var != null) {
                hx1Var.b();
            }
            this.m = gp3.a;
        }
    }

    @Override // yads.ic2, yads.o11
    public final void a(int i) {
        super.a(i);
        jp3 jp3Var = this.m;
        hp3 hp3Var = jp3Var instanceof hp3 ? (hp3) jp3Var : null;
        if (hp3Var != null) {
            hx1 hx1Var = hp3Var.a;
            if (hx1Var != null) {
                hx1Var.a();
            }
            stopLoading();
            this.m = ip3.a;
        }
    }
}
