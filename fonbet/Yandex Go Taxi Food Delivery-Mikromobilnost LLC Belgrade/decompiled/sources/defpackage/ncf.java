package defpackage;

import android.os.SystemClock;
import androidx.compose.runtime.f;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes5.dex */
public final class ncf extends pa90 {
    public boolean F;
    public pa90 y;
    public final pa90 z;
    public final boolean A = true;
    public final nhe B = mhe.b;
    public final int C = 300;
    public final oz40 D = f.j(0);
    public long E = -1;
    public final oz40 G = f.j(Float.valueOf(1.0f));
    public final oz40 H = f.j(null);

    public ncf(pa90 pa90Var, a16 a16Var) {
        this.y = pa90Var;
        this.z = a16Var;
    }

    @Override // defpackage.pa90
    public final boolean a(float f) {
        this.G.setValue(Float.valueOf(f));
        return true;
    }

    @Override // defpackage.pa90
    public final boolean c(wec wecVar) {
        this.H.setValue(wecVar);
        return true;
    }

    @Override // defpackage.pa90
    public final long i() {
        pa90 pa90Var = this.y;
        long i = pa90Var != null ? pa90Var.i() : 0L;
        pa90 pa90Var2 = this.z;
        long i2 = pa90Var2 != null ? pa90Var2.i() : 0L;
        boolean z = i != 9205357640488583168L;
        boolean z2 = i2 != 9205357640488583168L;
        if (!z || !z2) {
            return 9205357640488583168L;
        }
        return (Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (i & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), Float.intBitsToFloat((int) (i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (i >> 32)), Float.intBitsToFloat((int) (i2 >> 32)))) << 32);
    }

    @Override // defpackage.pa90
    public final void j(qam qamVar) {
        boolean z = this.F;
        oz40 oz40Var = this.G;
        pa90 pa90Var = this.z;
        if (z) {
            k(qamVar, pa90Var, ((Number) oz40Var.getValue()).floatValue());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.E == -1) {
            this.E = uptimeMillis;
        }
        float f = (uptimeMillis - this.E) / this.C;
        float floatValue = ((Number) oz40Var.getValue()).floatValue() * y6i0.c(f, 0.0f, 1.0f);
        float floatValue2 = this.A ? ((Number) oz40Var.getValue()).floatValue() - floatValue : ((Number) oz40Var.getValue()).floatValue();
        this.F = f >= 1.0f;
        k(qamVar, this.y, floatValue2);
        k(qamVar, pa90Var, floatValue);
        if (this.F) {
            this.y = null;
        } else {
            oz40 oz40Var2 = this.D;
            oz40Var2.setValue(Integer.valueOf(((Number) oz40Var2.getValue()).intValue() + 1));
        }
    }

    public final void k(qam qamVar, pa90 pa90Var, float f) {
        if (pa90Var == null || f <= 0.0f) {
            return;
        }
        long c = qamVar.c();
        long i = pa90Var.i();
        long J = (i == 9205357640488583168L || cjs0.e(i) || c == 9205357640488583168L || cjs0.e(c)) ? c : sb2.J(i, this.B.j(i, c));
        oz40 oz40Var = this.H;
        if (c == 9205357640488583168L || cjs0.e(c)) {
            pa90Var.g(qamVar, J, f, (wec) oz40Var.getValue());
            return;
        }
        float intBitsToFloat = (Float.intBitsToFloat((int) (c >> 32)) - Float.intBitsToFloat((int) (J >> 32))) / 2.0f;
        float intBitsToFloat2 = (Float.intBitsToFloat((int) (c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - Float.intBitsToFloat((int) (J & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) / 2.0f;
        ((cot) qamVar.N().a).h(intBitsToFloat, intBitsToFloat2, intBitsToFloat, intBitsToFloat2);
        try {
            pa90Var.g(qamVar, J, f, (wec) oz40Var.getValue());
        } finally {
            float f2 = -intBitsToFloat;
            float f3 = -intBitsToFloat2;
            ((cot) qamVar.N().a).h(f2, f3, f2, f3);
        }
    }
}
