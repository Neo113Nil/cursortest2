package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class g65 extends h65 {
    public final kdc a;
    public final String b;
    public final k7v c;
    public final fr d;

    public g65(kdc kdcVar, String str, k7v k7vVar, fr frVar) {
        this.a = kdcVar;
        this.b = str;
        this.c = k7vVar;
        this.d = frVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g65)) {
            return false;
        }
        g65 g65Var = (g65) obj;
        return jl40.l(this.a, g65Var.a) && jl40.l(this.b, g65Var.b) && jl40.l(this.c, g65Var.c) && jl40.l(this.d, g65Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        fr frVar = this.d;
        return hashCode + (frVar == null ? 0 : frVar.hashCode());
    }

    public final String toString() {
        return "OrganizationPreviewPlaceholder(backgroundColor=" + this.a + ", id=" + this.b + ", image=" + this.c + ", action=" + this.d + Extension.C_BRAKE;
    }
}
