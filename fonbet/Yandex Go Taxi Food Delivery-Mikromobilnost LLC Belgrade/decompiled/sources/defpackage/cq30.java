package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class cq30 implements eq30 {
    public final kdc a;
    public final CharSequence b;

    public cq30(CharSequence charSequence, kdc kdcVar) {
        this.a = kdcVar;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq30)) {
            return false;
        }
        cq30 cq30Var = (cq30) obj;
        return jl40.l(this.a, cq30Var.a) && jl40.l(this.b, cq30Var.b);
    }

    public final int hashCode() {
        kdc kdcVar = this.a;
        return this.b.hashCode() + ((kdcVar == null ? 0 : kdcVar.hashCode()) * 31);
    }

    public final String toString() {
        return "NavigationWithText(navColor=" + this.a + ", text=" + ((Object) this.b) + Extension.C_BRAKE;
    }
}
