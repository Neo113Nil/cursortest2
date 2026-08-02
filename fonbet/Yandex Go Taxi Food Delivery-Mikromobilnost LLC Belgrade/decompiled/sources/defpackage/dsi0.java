package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dsi0 {
    public final String a;
    public final String b;
    public final fxy0 c;

    public dsi0(String str, String str2, fxy0 fxy0Var) {
        this.a = str;
        this.b = str2;
        this.c = fxy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsi0)) {
            return false;
        }
        dsi0 dsi0Var = (dsi0) obj;
        return jl40.l(this.a, dsi0Var.a) && jl40.l(this.b, dsi0Var.b) && jl40.l(this.c, dsi0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("RegularAutotopupErrorEntity(text=", this.a, ", action=", this.b, ", rightImage=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
