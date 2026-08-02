package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class cc90 {
    public final gb2 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public cc90(gb2 gb2Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = gb2Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final zii0 a(zii0 zii0Var) {
        return zii0Var.j((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = asy0.b;
            if (asy0.b(j, j2)) {
                return j2;
            }
        }
        int i = asy0.c;
        int i2 = this.b;
        return eja1.c(((int) (j >> 32)) + i2, ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + i2);
    }

    public final zii0 c(zii0 zii0Var) {
        float f = -this.f;
        return zii0Var.j((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return y6i0.d(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cc90) {
            cc90 cc90Var = (cc90) obj;
            if (this.a == cc90Var.a && this.b == cc90Var.b && this.c == cc90Var.c && this.d == cc90Var.d && this.e == cc90Var.e && Float.compare(this.f, cc90Var.f) == 0 && Float.compare(this.g, cc90Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + g8e.c(this.f, oyr.b(this.e, oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return n.n(sb, this.g, ')');
    }
}
