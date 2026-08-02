package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class afl0 {
    public final zzs a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;
    public final String h;

    public afl0(zzs zzsVar, String str, boolean z, String str2, String str3, int i, boolean z2, String str4) {
        this.a = zzsVar;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.g = z2;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afl0)) {
            return false;
        }
        afl0 afl0Var = (afl0) obj;
        return jl40.l(this.a, afl0Var.a) && jl40.l(this.b, afl0Var.b) && this.c == afl0Var.c && jl40.l(this.d, afl0Var.d) && jl40.l(this.e, afl0Var.e) && this.f == afl0Var.f && this.g == afl0Var.g && jl40.l(this.h, afl0Var.h);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.h.hashCode() + unr0.e(oyr.b(this.f, (b + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressUiState(geoPoint=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", isRemovable=");
        unr0.A(", label=", this.d, ", eta=", sb, this.c);
        b64.A(this.f, this.e, ", originalIndex=", ", isEditable=", sb);
        return n.m(", id=", this.h, Extension.C_BRAKE, sb, this.g);
    }
}
