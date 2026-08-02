package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class p8w0 {
    public final String a;
    public final String b;

    public /* synthetic */ p8w0(int i) {
        this((i & 1) != 0 ? null : "chargers", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8w0)) {
            return false;
        }
        p8w0 p8w0Var = (p8w0) obj;
        return jl40.l(this.a, p8w0Var.a) && jl40.l(this.b, p8w0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("SuperProfilePayload(serviceName=", this.a, ", extraLayout=", this.b, Extension.C_BRAKE);
    }

    public p8w0() {
        this(3);
    }

    public p8w0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
