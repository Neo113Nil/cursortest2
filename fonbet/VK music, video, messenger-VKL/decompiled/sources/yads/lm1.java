package yads;

import xsna.cgn;
import xsna.epx;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class lm1 {
    public final String a;
    public final String b;
    public final km1 c;
    public final String d;
    public final String e;
    public final Float f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final boolean k;

    public lm1(String str, String str2, km1 km1Var, String str3, String str4, Float f, int i, int i2, int i3, String str5) {
        this.a = str;
        this.b = str2;
        this.c = km1Var;
        this.d = str3;
        this.e = str4;
        this.f = f;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = str5;
        this.k = epx.f(str5, "VPAID");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm1)) {
            return false;
        }
        lm1 lm1Var = (lm1) obj;
        return epx.f(this.a, lm1Var.a) && epx.f(this.b, lm1Var.b) && this.c == lm1Var.c && epx.f(this.d, lm1Var.d) && epx.f(this.e, lm1Var.e) && epx.f(this.f, lm1Var.f) && this.g == lm1Var.g && this.h == lm1Var.h && this.i == lm1Var.i && epx.f(this.j, lm1Var.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        km1 km1Var = this.c;
        int hashCode3 = (hashCode2 + (km1Var == null ? 0 : km1Var.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.f;
        int a = re3.a(this.i, re3.a(this.h, re3.a(this.g, (hashCode5 + (f == null ? 0 : f.hashCode())) * 31, 31), 31), 31);
        String str4 = this.j;
        return a + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        km1 km1Var = this.c;
        String str3 = this.d;
        String str4 = this.e;
        Float f = this.f;
        int i = this.g;
        int i2 = this.h;
        int i3 = this.i;
        String str5 = this.j;
        StringBuilder a = xe9.a("MediaFile(uri=", str, ", id=", str2, ", deliveryMethod=");
        a.append(km1Var);
        a.append(", mimeType=");
        a.append(str3);
        a.append(", codec=");
        a.append(str4);
        a.append(", vmafMetric=");
        a.append(f);
        a.append(", height=");
        cgn.a(i, i2, ", width=", ", bitrate=", a);
        a.append(i3);
        a.append(", apiFramework=");
        a.append(str5);
        a.append(")");
        return a.toString();
    }
}
