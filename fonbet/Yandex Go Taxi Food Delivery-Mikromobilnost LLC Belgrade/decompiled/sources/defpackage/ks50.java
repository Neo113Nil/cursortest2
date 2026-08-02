package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class ks50 extends ps50 {
    public final String a;
    public final Throwable b;
    public final String c;

    public ks50(String str, Throwable th) {
        this.a = str;
        this.b = th;
        this.c = "Deserialization error";
    }

    @Override // defpackage.ps50
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks50)) {
            return false;
        }
        ks50 ks50Var = (ks50) obj;
        return jl40.l(this.a, ks50Var.a) && jl40.l(this.b, ks50Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Throwable th = this.b;
        return hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "Deserialization(message=" + this.a + ", cause=" + this.b + Extension.C_BRAKE;
    }

    public ks50() {
        this(null, null);
    }
}
