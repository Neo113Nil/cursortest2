package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class js50 extends ps50 {
    public final String a;
    public final Throwable b;
    public final String c;

    public js50(String str, Throwable th) {
        this.a = str;
        this.b = th;
        this.c = "No internet connection";
    }

    @Override // defpackage.ps50
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js50)) {
            return false;
        }
        js50 js50Var = (js50) obj;
        return jl40.l(this.a, js50Var.a) && jl40.l(this.b, js50Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Throwable th = this.b;
        return hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "Connection(message=" + this.a + ", cause=" + this.b + Extension.C_BRAKE;
    }

    public js50() {
        this(null, null);
    }
}
