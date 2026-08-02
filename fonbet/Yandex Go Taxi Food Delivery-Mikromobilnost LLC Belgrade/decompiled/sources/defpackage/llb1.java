package defpackage;

import android.util.Log;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes11.dex */
public abstract class llb1 {
    public static au2 a;

    public static final float a(float f, oay0 oay0Var) {
        return Float.isNaN(f) ? ((Number) oay0Var.invoke()).floatValue() : f;
    }

    public static final au2 b() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("ChevronRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        a6t0 a6t0Var = new a6t0(zp2.d);
        a6t0 a6t0Var2 = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.k(10.0f, 7.5f);
        uq90Var.i(4.5f, 4.5f);
        uq90Var.i(-4.5f, 4.5f);
        lgvVar.b(1.0f, 1.0f, 1.75f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 2, 0, a6t0Var, a6t0Var2, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static final moy0 c(moy0 moy0Var, moy0 moy0Var2, float f) {
        boolean z = moy0Var instanceof ol6;
        loy0 loy0Var = loy0.a;
        if (!z && !(moy0Var2 instanceof ol6)) {
            long L = rzo.L(moy0Var.b(), f, moy0Var2.b());
            return L != 16 ? new ghc(L) : loy0Var;
        }
        if (!z || !(moy0Var2 instanceof ol6)) {
            return (moy0) cmt0.b(f, moy0Var, moy0Var2);
        }
        ol6 ol6Var = (ol6) moy0Var;
        ol6 ol6Var2 = (ol6) moy0Var2;
        ml6 ml6Var = (ml6) cmt0.b(f, ol6Var.a, ol6Var2.a);
        float d = cjb1.d(ol6Var.b, ol6Var2.b, f);
        if (ml6Var == null) {
            return loy0Var;
        }
        if (ml6Var instanceof a6t0) {
            long d2 = d(d, ((a6t0) ml6Var).a);
            return d2 != 16 ? new ghc(d2) : loy0Var;
        }
        if (ml6Var instanceof zfr0) {
            return new ol6((zfr0) ml6Var, d);
        }
        w511.b();
        return null;
    }

    public static final long d(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : ldc.b(j, ldc.d(j) * f, 0.0f, 0.0f, 0.0f, 14);
    }

    public static void e(lb20 lb20Var, String str) {
        mb20 mb20Var = (mb20) lb20Var;
        mb20Var.getClass();
        String stackTraceString = Log.getStackTraceString(null);
        ((j) mb20Var.b).q(str, stackTraceString);
    }
}
