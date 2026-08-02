package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ms50 extends ps50 {
    public final String a;
    public final Throwable b;
    public final String c;

    public ms50(String str, Throwable th) {
        this.a = str;
        this.b = th;
        this.c = g8e.o("Security error: ", str);
    }

    @Override // defpackage.ps50
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms50)) {
            return false;
        }
        ms50 ms50Var = (ms50) obj;
        return jl40.l(this.a, ms50Var.a) && jl40.l(this.b, ms50Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Throwable th = this.b;
        return hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "Security(message=" + this.a + ", cause=" + this.b + Extension.C_BRAKE;
    }

    public ms50() {
        this(null, null);
    }
}
