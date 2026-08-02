package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class bg51 {
    public final String a;
    public final Throwable b;

    public bg51(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public final Throwable a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg51)) {
            return false;
        }
        bg51 bg51Var = (bg51) obj;
        return jl40.l(this.a, bg51Var.a) && this.b.equals(bg51Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Attempt(traceId=" + this.a + ", exception=" + this.b + Extension.C_BRAKE;
    }
}
