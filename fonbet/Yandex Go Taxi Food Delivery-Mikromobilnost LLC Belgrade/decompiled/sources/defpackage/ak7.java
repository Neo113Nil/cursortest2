package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ak7 {
    public final String a;
    public final k1k0 b;
    public final int c;
    public final long d;

    public ak7(String str, k1k0 k1k0Var, int i, long j) {
        this.a = str;
        this.b = k1k0Var;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak7)) {
            return false;
        }
        ak7 ak7Var = (ak7) obj;
        String str = ak7Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str == null) {
                l = true;
            }
            l = false;
        } else {
            if (str != null) {
                l = jl40.l(str2, str);
            }
            l = false;
        }
        return l && jl40.l(this.b, ak7Var.b) && this.c == ak7Var.c && this.d == ak7Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        k1k0 k1k0Var = this.b;
        return Long.hashCode(this.d) + oyr.b(this.c, (hashCode + (k1k0Var != null ? k1k0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        String str = this.a;
        String p = str == null ? "null" : oyr.p("RetryPolicyId(id=", str, Extension.C_BRAKE);
        String a = tq11.a(this.c);
        StringBuilder sb = new StringBuilder("CallReportInfo(retryPolicyId=");
        sb.append(p);
        sb.append(", retryConfig=");
        sb.append(this.b);
        sb.append(", attempt=");
        ly3.y(this.d, a, ", startElapsedMs=", sb);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public /* synthetic */ ak7(long j) {
        this(null, null, 0, j);
    }
}
