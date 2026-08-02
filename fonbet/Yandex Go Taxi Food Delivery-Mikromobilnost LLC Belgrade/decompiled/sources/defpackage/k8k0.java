package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class k8k0 implements m8k0 {
    public final String a;
    public final String b;
    public final long c;

    public k8k0(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8k0)) {
            return false;
        }
        k8k0 k8k0Var = (k8k0) obj;
        return jl40.l(this.a, k8k0Var.a) && jl40.l(this.b, k8k0Var.b) && this.c == k8k0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.n(this.c, Extension.C_BRAKE, b64.v("Interval(template=", this.a, ", sourceId=", this.b, ", delayMs="));
    }
}
