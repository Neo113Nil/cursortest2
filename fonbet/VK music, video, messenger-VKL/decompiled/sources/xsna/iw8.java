package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;
import xsna.q630;

/* compiled from: DrawModifier.kt */
/* loaded from: classes11.dex */
public final class iw8 extends q630.c implements hw8, hr70, in8 {
    public final kw8 p;
    public boolean q;
    public dah0 r;
    public izs<? super kw8, jod> s;

    /* compiled from: DrawModifier.kt */
    public static final class a extends Lambda implements gzs<kdu> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final kdu invoke() {
            iw8 iw8Var = iw8.this;
            dah0 dah0Var = iw8Var.r;
            if (dah0Var == null) {
                dah0Var = new dah0();
                iw8Var.r = dah0Var;
            }
            if (dah0Var.b == null) {
                kdu graphicsContext = itl.g(iw8Var).getGraphicsContext();
                dah0Var.c();
                dah0Var.b = graphicsContext;
            }
            return dah0Var;
        }
    }

    public iw8(kw8 kw8Var, izs<? super kw8, jod> izsVar) {
        this.p = kw8Var;
        this.s = izsVar;
        kw8Var.b = this;
        new a();
    }

    @Override // xsna.hw8
    public final void A0() {
        dah0 dah0Var = this.r;
        if (dah0Var != null) {
            dah0Var.c();
        }
        this.q = false;
        this.p.c = null;
        mio.a(this);
    }

    @Override // xsna.hr70
    public final void D1() {
        A0();
    }

    @Override // xsna.q630.c
    public final void b2() {
        dah0 dah0Var = this.r;
        if (dah0Var != null) {
            dah0Var.c();
        }
    }

    @Override // xsna.q630.c
    public final void c2() {
        A0();
    }

    @Override // xsna.in8
    public final long d() {
        return pli.w(itl.d(this, 4).d);
    }

    @Override // xsna.in8
    public final azl getDensity() {
        return itl.f(this).z;
    }

    @Override // xsna.in8
    public final LayoutDirection getLayoutDirection() {
        return itl.f(this).A;
    }

    @Override // xsna.lio
    public final void i1() {
        A0();
    }

    @Override // xsna.htl, xsna.cmb0
    public final void q() {
        A0();
    }

    @Override // xsna.lio
    public final void v(toy toyVar) {
        boolean z = this.q;
        kw8 kw8Var = this.p;
        if (!z) {
            kw8Var.c = null;
            ir70.a(this, new jw8(this, kw8Var));
            if (kw8Var.c == null) {
                throw pm0.f("DrawResult not defined, did you forget to call onDraw?");
            }
            this.q = true;
        }
        ((izs) kw8Var.c.a).invoke(toyVar);
    }

    @Override // xsna.htl
    public final void y1() {
        A0();
    }
}
