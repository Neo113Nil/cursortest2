package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ns50 extends ps50 {
    public final String a;
    public final Throwable b;
    public final String c;

    public ns50(String str, Throwable th) {
        this.a = str;
        this.b = th;
        this.c = "Unknown";
    }

    @Override // defpackage.ps50
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns50)) {
            return false;
        }
        ns50 ns50Var = (ns50) obj;
        return jl40.l(this.a, ns50Var.a) && jl40.l(this.b, ns50Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Throwable th = this.b;
        return hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "Unknown(message=" + this.a + ", cause=" + this.b + Extension.C_BRAKE;
    }

    public ns50() {
        this(null, null);
    }
}
