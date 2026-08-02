package defpackage;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class nxw0 extends zfr0 {
    public final long c;
    public final List d;
    public final List e;

    public nxw0(long j, List list, ArrayList arrayList) {
        this.c = j;
        this.d = list;
        this.e = arrayList;
    }

    @Override // defpackage.zfr0
    public final Shader b(long j) {
        long floatToRawIntBits;
        long j2 = this.c;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            floatToRawIntBits = cma1.Q(j);
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            float intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            float intBitsToFloat2 = Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) : Float.intBitsToFloat(i2);
            floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        }
        List list = this.d;
        List list2 = this.e;
        qva1.e(list, list2);
        return new SweepGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), qva1.b(list), qva1.c(list2, list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxw0)) {
            return false;
        }
        nxw0 nxw0Var = (nxw0) obj;
        return wu60.c(this.c, nxw0Var.c) && jl40.l(this.d, nxw0Var.d) && jl40.l(this.e, nxw0Var.e);
    }

    public final int hashCode() {
        int c = unr0.c(Long.hashCode(this.c) * 31, 31, this.d);
        List list = this.e;
        return c + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str;
        long j = this.c;
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) wu60.h(j)) + Extension.FIX_SPACE;
        } else {
            str = "";
        }
        StringBuilder x = unr0.x("SweepGradient(", str, "colors=");
        x.append(this.d);
        x.append(", stops=");
        return unr0.t(x, this.e, ')');
    }
}
