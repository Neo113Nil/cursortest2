package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public abstract class pa90 {
    public eb2 a;
    public boolean b;
    public wec c;
    public float w = 1.0f;
    public LayoutDirection x = LayoutDirection.Ltr;

    public static /* synthetic */ void h(pa90 pa90Var, qam qamVar, long j, wec wecVar, int i) {
        if ((i & 4) != 0) {
            wecVar = null;
        }
        pa90Var.g(qamVar, j, 1.0f, wecVar);
    }

    public boolean a(float f) {
        return false;
    }

    public boolean c(wec wecVar) {
        return false;
    }

    public void f(LayoutDirection layoutDirection) {
    }

    public final void g(qam qamVar, long j, float f, wec wecVar) {
        if (this.w != f) {
            if (!a(f)) {
                eb2 eb2Var = this.a;
                if (f == 1.0f) {
                    if (eb2Var != null) {
                        eb2Var.c(f);
                    }
                    this.b = false;
                } else {
                    if (eb2Var == null) {
                        eb2Var = new eb2();
                        this.a = eb2Var;
                    }
                    eb2Var.c(f);
                    this.b = true;
                }
            }
            this.w = f;
        }
        if (!jl40.l(this.c, wecVar)) {
            if (!c(wecVar)) {
                eb2 eb2Var2 = this.a;
                if (wecVar == null) {
                    if (eb2Var2 != null) {
                        eb2Var2.g(null);
                    }
                    this.b = false;
                } else {
                    if (eb2Var2 == null) {
                        eb2Var2 = new eb2();
                        this.a = eb2Var2;
                    }
                    eb2Var2.g(wecVar);
                    this.b = true;
                }
            }
            this.c = wecVar;
        }
        LayoutDirection layoutDirection = qamVar.getLayoutDirection();
        if (this.x != layoutDirection) {
            f(layoutDirection);
            this.x = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32)) - Float.intBitsToFloat(i);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        float intBitsToFloat3 = intBitsToFloat2 - Float.intBitsToFloat(i2);
        ((cot) qamVar.N().a).h(0.0f, 0.0f, intBitsToFloat, intBitsToFloat3);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.b) {
                        float intBitsToFloat4 = Float.intBitsToFloat(i);
                        float intBitsToFloat5 = Float.intBitsToFloat(i2);
                        zii0 b = wwg.b(0L, (Float.floatToRawIntBits(intBitsToFloat5) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat4) << 32));
                        i28 q = qamVar.N().q();
                        eb2 eb2Var3 = this.a;
                        if (eb2Var3 == null) {
                            eb2Var3 = new eb2();
                            this.a = eb2Var3;
                        }
                        try {
                            q.s(b, eb2Var3);
                            j(qamVar);
                            q.n();
                        } catch (Throwable th) {
                            q.n();
                            throw th;
                        }
                    } else {
                        j(qamVar);
                    }
                }
            } catch (Throwable th2) {
                ((cot) qamVar.N().a).h(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat3);
                throw th2;
            }
        }
        ((cot) qamVar.N().a).h(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat3);
    }

    public abstract long i();

    public abstract void j(qam qamVar);
}
