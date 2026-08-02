package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Lambda;

/* compiled from: Painter.kt */
/* loaded from: classes11.dex */
public abstract class lg90 {
    public va2 b;
    public boolean c;
    public d6g d;
    public float e = 1.0f;
    public LayoutDirection f = LayoutDirection.Ltr;

    /* compiled from: Painter.kt */
    public static final class a extends Lambda implements izs<oio, s3q0> {
        public a() {
            super(1);
        }

        @Override // xsna.izs
        public final s3q0 invoke(oio oioVar) {
            lg90.this.j(oioVar);
            return s3q0.a;
        }
    }

    public lg90() {
        new a();
    }

    public static /* synthetic */ void h(lg90 lg90Var, oio oioVar, long j, oe7 oe7Var, int i) {
        if ((i & 4) != 0) {
            oe7Var = null;
        }
        lg90Var.g(oioVar, j, 1.0f, oe7Var);
    }

    public boolean a(float f) {
        return false;
    }

    public boolean b(d6g d6gVar) {
        return false;
    }

    public final void g(oio oioVar, long j, float f, d6g d6gVar) {
        if (this.e != f) {
            if (!a(f)) {
                if (f == 1.0f) {
                    va2 va2Var = this.b;
                    if (va2Var != null) {
                        va2Var.b(f);
                    }
                    this.c = false;
                } else {
                    va2 va2Var2 = this.b;
                    if (va2Var2 == null) {
                        va2Var2 = new va2();
                        this.b = va2Var2;
                    }
                    va2Var2.b(f);
                    this.c = true;
                }
            }
            this.e = f;
        }
        if (!epx.f(this.d, d6gVar)) {
            if (!b(d6gVar)) {
                if (d6gVar == null) {
                    va2 va2Var3 = this.b;
                    if (va2Var3 != null) {
                        va2Var3.j(null);
                    }
                    this.c = false;
                } else {
                    va2 va2Var4 = this.b;
                    if (va2Var4 == null) {
                        va2Var4 = new va2();
                        this.b = va2Var4;
                    }
                    va2Var4.j(d6gVar);
                    this.c = true;
                }
            }
            this.d = d6gVar;
        }
        LayoutDirection layoutDirection = oioVar.getLayoutDirection();
        if (this.f != layoutDirection) {
            c(layoutDirection);
            this.f = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) - Float.intBitsToFloat(i2);
        oioVar.a0().a.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat, intBitsToFloat2);
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            try {
                if (Float.intBitsToFloat(i) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Float.intBitsToFloat(i2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (this.c) {
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        float intBitsToFloat4 = Float.intBitsToFloat(i2);
                        zhf0 e = p490.e(0L, (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
                        yq9 a2 = oioVar.a0().a();
                        va2 va2Var5 = this.b;
                        if (va2Var5 == null) {
                            va2Var5 = new va2();
                            this.b = va2Var5;
                        }
                        try {
                            a2.r(e, va2Var5);
                            j(oioVar);
                            a2.a();
                        } catch (Throwable th) {
                            a2.a();
                            throw th;
                        }
                    } else {
                        j(oioVar);
                    }
                }
            } catch (Throwable th2) {
                oioVar.a0().a.d(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
                throw th2;
            }
        }
        oioVar.a0().a.d(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
    }

    public abstract long i();

    public abstract void j(oio oioVar);

    public void c(LayoutDirection layoutDirection) {
    }
}
