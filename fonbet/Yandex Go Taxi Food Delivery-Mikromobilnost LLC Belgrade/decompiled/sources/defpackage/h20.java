package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class h20 {
    public final String a;
    public final r1e0 b;

    public h20(String str, r1e0 r1e0Var) {
        this.a = str;
        this.b = r1e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h20) {
            h20 h20Var = (h20) obj;
            return jl40.l(this.a, h20Var.a) && this.b == h20Var.b;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ActiveOrdersNetworkResult(requestId=" + this.a + ", polling=" + this.b + Extension.C_BRAKE;
    }
}
