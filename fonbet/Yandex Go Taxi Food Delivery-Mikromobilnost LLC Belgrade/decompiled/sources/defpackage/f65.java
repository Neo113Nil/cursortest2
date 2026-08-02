package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class f65 extends h65 {
    public final k7v a;
    public final String b;
    public final k7v c;
    public final fr d;

    public f65(k7v k7vVar, String str, k7v k7vVar2, fr frVar) {
        this.a = k7vVar;
        this.b = str;
        this.c = k7vVar2;
        this.d = frVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f65)) {
            return false;
        }
        f65 f65Var = (f65) obj;
        return jl40.l(this.a, f65Var.a) && jl40.l(this.b, f65Var.b) && jl40.l(this.c, f65Var.c) && jl40.l(this.d, f65Var.d);
    }

    public final int hashCode() {
        k7v k7vVar = this.a;
        int hashCode = (this.c.hashCode() + unr0.b((k7vVar == null ? 0 : k7vVar.hashCode()) * 31, 31, this.b)) * 31;
        fr frVar = this.d;
        return hashCode + (frVar != null ? frVar.hashCode() : 0);
    }

    public final String toString() {
        return "OrganizationPreviewImage(icon=" + this.a + ", id=" + this.b + ", image=" + this.c + ", action=" + this.d + Extension.C_BRAKE;
    }
}
