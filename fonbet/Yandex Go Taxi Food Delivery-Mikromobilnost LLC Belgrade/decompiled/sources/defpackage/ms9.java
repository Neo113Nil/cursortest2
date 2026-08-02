package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ms9 implements os9 {
    public final cy9 a;
    public final String b;

    public ms9(cy9 cy9Var, String str) {
        this.a = cy9Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms9)) {
            return false;
        }
        ms9 ms9Var = (ms9) obj;
        return jl40.l(this.a, ms9Var.a) && this.b.equals(ms9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(errorDetails=" + this.a + ", traceId=" + this.b + Extension.C_BRAKE;
    }
}
