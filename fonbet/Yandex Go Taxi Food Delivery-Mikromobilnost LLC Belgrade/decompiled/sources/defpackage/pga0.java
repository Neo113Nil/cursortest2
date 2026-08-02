package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class pga0 implements qga0 {
    public final String a;
    public final CharSequence b;

    public pga0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pga0)) {
            return false;
        }
        pga0 pga0Var = (pga0) obj;
        return jl40.l(this.a, pga0Var.a) && jl40.l(this.b, pga0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Success(historyUrl=" + this.a + ", successMessage=" + ((Object) this.b) + Extension.C_BRAKE;
    }
}
