package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class byk0 implements ehr0 {
    public final yre a;
    public final yre b;
    public final yre c;
    public final yre d;

    public byk0(yre yreVar, yre yreVar2, yre yreVar3, yre yreVar4) {
        this.a = yreVar;
        this.b = yreVar2;
        this.c = yreVar3;
        this.d = yreVar4;
    }

    public static byk0 b(byk0 byk0Var, yre yreVar, yre yreVar2, yre yreVar3, yre yreVar4, int i) {
        if ((i & 1) != 0) {
            yreVar = byk0Var.a;
        }
        if ((i & 2) != 0) {
            yreVar2 = byk0Var.b;
        }
        if ((i & 4) != 0) {
            yreVar3 = byk0Var.c;
        }
        if ((i & 8) != 0) {
            yreVar4 = byk0Var.d;
        }
        byk0Var.getClass();
        return new byk0(yreVar, yreVar2, yreVar3, yreVar4);
    }

    @Override // defpackage.ehr0
    public final ix80 a(long j, LayoutDirection layoutDirection, fwi fwiVar) {
        float e = this.a.e(j, fwiVar);
        float e2 = this.b.e(j, fwiVar);
        float e3 = this.c.e(j, fwiVar);
        float e4 = this.d.e(j, fwiVar);
        float c = cjs0.c(j);
        float f = e + e4;
        if (f > c) {
            float f2 = c / f;
            e *= f2;
            e4 *= f2;
        }
        float f3 = e2 + e3;
        if (f3 > c) {
            float f4 = c / f3;
            e2 *= f4;
            e3 *= f4;
        }
        if (e < 0.0f || e2 < 0.0f || e3 < 0.0f || e4 < 0.0f) {
            StringBuilder k = oo31.k("Corner size in Px can't be negative(topStart = ", e, ", topEnd = ", e2, ", bottomEnd = ");
            k.append(e3);
            k.append(", bottomStart = ");
            k.append(e4);
            k.append(")!");
            lxv.a(k.toString());
        }
        if (e + e2 + e3 + e4 == 0.0f) {
            return new gx80(wwg.b(0L, j));
        }
        zii0 b = wwg.b(0L, j);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f5 = layoutDirection == layoutDirection2 ? e : e2;
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f5) << 32);
        if (layoutDirection == layoutDirection2) {
            e = e2;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(e) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(e) << 32);
        float f6 = layoutDirection == layoutDirection2 ? e3 : e4;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        if (layoutDirection != layoutDirection2) {
            e4 = e3;
        }
        return new hx80(ora1.b(b, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(e4) << 32) | (Float.floatToRawIntBits(e4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byk0)) {
            return false;
        }
        byk0 byk0Var = (byk0) obj;
        return jl40.l(this.a, byk0Var.a) && jl40.l(this.b, byk0Var.b) && jl40.l(this.c, byk0Var.c) && jl40.l(this.d, byk0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
