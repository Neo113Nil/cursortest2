package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bpk0 {
    public final String a;
    public final boolean b;
    public final ebk0 c;
    public final String d;
    public final String e;
    public final mkz0 f;

    public bpk0(String str, boolean z, ebk0 ebk0Var, String str2, String str3, mkz0 mkz0Var) {
        this.a = str;
        this.b = z;
        this.c = ebk0Var;
        this.d = str2;
        this.e = str3;
        this.f = mkz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpk0)) {
            return false;
        }
        bpk0 bpk0Var = (bpk0) obj;
        return jl40.l(this.a, bpk0Var.a) && this.b == bpk0Var.b && this.c.equals(bpk0Var.c) && jl40.l(this.d, bpk0Var.d) && jl40.l(this.e, bpk0Var.e) && this.f.equals(bpk0Var.f);
    }

    public final int hashCode() {
        int b = unr0.b((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder l = oo31.l("RideCardTipsElementUiState(title=", this.a, ", isSelected=", ", action=", this.b);
        l.append(this.c);
        l.append(", description=");
        l.append(this.d);
        l.append(", rawValue=");
        l.append(this.e);
        l.append(", buttonStyle=");
        l.append(this.f);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
