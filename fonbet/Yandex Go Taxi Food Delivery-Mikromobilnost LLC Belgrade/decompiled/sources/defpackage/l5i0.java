package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class l5i0 extends zfr0 {
    public final List c;
    public final List d;
    public final long e;
    public final float f;
    public final int g;

    public l5i0(List list, ArrayList arrayList, long j, float f, int i) {
        this.c = list;
        this.d = arrayList;
        this.e = j;
        this.f = f;
        this.g = i;
    }

    @Override // defpackage.zfr0
    public final Shader b(long j) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j2 = this.e;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long Q = cma1.Q(j);
            intBitsToFloat = Float.intBitsToFloat((int) (Q >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (Q & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            }
            intBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        float f = this.f;
        if (f == Float.POSITIVE_INFINITY) {
            f = cjs0.c(j) / 2.0f;
        }
        float f2 = f;
        List list = this.c;
        List list2 = this.d;
        qva1.e(list, list2);
        return new RadialGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), f2, qva1.b(list), qva1.c(list2, list), bwa1.f(this.g));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5i0)) {
            return false;
        }
        l5i0 l5i0Var = (l5i0) obj;
        return jl40.l(this.c, l5i0Var.c) && jl40.l(this.d, l5i0Var.d) && wu60.c(this.e, l5i0Var.e) && this.f == l5i0Var.f && this.g == l5i0Var.g;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        List list = this.d;
        return Integer.hashCode(this.g) + g8e.c(this.f, qv10.c((hashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.e), 31);
    }

    public final String toString() {
        String str;
        long j = this.e;
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) wu60.h(j)) + Extension.FIX_SPACE;
        } else {
            str = "";
        }
        float f = this.f;
        String f2 = (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040 ? x4e.f("radius=", Extension.FIX_SPACE, f) : "";
        StringBuilder sb = new StringBuilder("RadialGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        oyr.D(Extension.FIX_SPACE, str, f2, sb, this.d);
        sb.append("tileMode=");
        sb.append((Object) kpb1.c(this.g));
        sb.append(')');
        return sb.toString();
    }
}
