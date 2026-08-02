package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ou9 {
    public final CharSequence a;
    public final kdc b;

    public ou9(CharSequence charSequence, kdc kdcVar) {
        this.a = charSequence;
        this.b = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou9)) {
            return false;
        }
        ou9 ou9Var = (ou9) obj;
        return jl40.l(this.a, ou9Var.a) && jl40.l(this.b, ou9Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kdc kdcVar = this.b;
        return hashCode + (kdcVar == null ? 0 : kdcVar.hashCode());
    }

    public final String toString() {
        return "ChargersProgressAttention(text=" + ((Object) this.a) + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
