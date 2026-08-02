package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class o9m0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ArrayList h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public o9m0(String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, int i, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = arrayList;
        this.i = i;
        this.j = z;
        this.k = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9m0)) {
            return false;
        }
        o9m0 o9m0Var = (o9m0) obj;
        return jl40.l(this.a, o9m0Var.a) && jl40.l(this.b, o9m0Var.b) && jl40.l(this.c, o9m0Var.c) && jl40.l(this.d, o9m0Var.d) && jl40.l(this.e, o9m0Var.e) && jl40.l(this.f, o9m0Var.f) && jl40.l(this.g, o9m0Var.g) && this.h.equals(o9m0Var.h) && this.i == o9m0Var.i && this.j == o9m0Var.j && this.k == o9m0Var.k;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return Boolean.hashCode(this.k) + unr0.e(oyr.b(this.i, ly3.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.h), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder v = b64.v("Period(rate=", this.a, ", progressEnd=", this.b, ", progressStart=");
        g8e.D(v, this.c, ", startDate=", this.d, ", startYear=");
        g8e.D(v, this.e, ", endDate=", this.f, ", endYear=");
        v.append(this.g);
        v.append(", dates=");
        v.append(this.h);
        v.append(", dateCurrent=");
        tse0.z(v, this.i, ", showLock=", this.j, ", interactive=");
        return x4e.i(v, this.k, Extension.C_BRAKE);
    }
}
