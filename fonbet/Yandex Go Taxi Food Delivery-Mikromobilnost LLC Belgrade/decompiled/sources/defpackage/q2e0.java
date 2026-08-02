package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class q2e0 extends s2e0 {
    public final Object a;
    public final boolean b;

    public q2e0(Object obj, boolean z) {
        this.a = obj;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2e0)) {
            return false;
        }
        q2e0 q2e0Var = (q2e0) obj;
        return jl40.l(this.a, q2e0Var.a) && this.b == q2e0Var.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Boolean.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "Success(value=" + this.a + ", isTerminated=" + this.b + Extension.C_BRAKE;
    }
}
