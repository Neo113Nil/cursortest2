package xsna;

import androidx.compose.runtime.a;

/* compiled from: OnboardingHighlighterScreenContent.kt */
/* loaded from: classes18.dex */
public final class qd80 implements znj {
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public qd80(String str, wh50 wh50Var, Object obj, wh50 wh50Var2) {
        this.b = str;
        this.c = wh50Var;
        this.e = obj;
        this.d = wh50Var2;
    }

    @Override // xsna.znj
    public void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
        lg90 o;
        wh50 wh50Var = (wh50) this.c;
        androidx.compose.runtime.a M = aVar.M(-438872230);
        int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-438872230, i2, -1, "com.vk.design.demo.presentation.screens.BuildButtonWithContextMenu.<anonymous>.<anonymous>.<no name provided>.Content (OnboardingHighlighterScreenContent.kt:256)");
            }
            lzo0 d = nzo.d(3072, 6, M, (String) this.b, false);
            T value = wh50Var.getValue();
            Object obj = this.e;
            if (epx.f(value, obj)) {
                M.K(-561769388);
                qzu0.a.getClass();
                o = qzu0.p(M);
                M.j();
            } else {
                M.K(-561680077);
                qzu0.a.getClass();
                o = qzu0.o(M);
                M.j();
            }
            lqv B = znk0.B(o, 0L, 0L, M, 196616, 30);
            boolean J = M.J(wh50Var) | M.y(obj);
            wh50 wh50Var2 = (wh50) this.d;
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new q210(wh50Var, obj, wh50Var2, 1);
                M.R(x);
            }
            aou0.d(znjVar, (gzs) x, null, null, false, B, d, null, M, i2 & 14, 78);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o1k(this, znjVar, i, 4);
        }
    }

    public qd80(yd10 yd10Var, f0p0 f0p0Var) {
        this.b = yd10Var;
        this.c = f0p0Var;
        this.d = new bpn0(new Cnew(this, 20));
        this.e = new bpn0(new jb(28));
    }
}
