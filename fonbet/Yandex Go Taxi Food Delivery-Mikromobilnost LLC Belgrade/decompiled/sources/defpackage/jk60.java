package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class jk60 {
    public final boolean a;
    public final m5g0 b;

    public jk60(m5g0 m5g0Var, boolean z) {
        this.a = z;
        this.b = m5g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk60)) {
            return false;
        }
        jk60 jk60Var = (jk60) obj;
        return this.a == jk60Var.a && jl40.l(this.b, jk60Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        m5g0 m5g0Var = this.b;
        return hashCode + (m5g0Var == null ? 0 : m5g0Var.hashCode());
    }

    public final String toString() {
        return "NotificationUpdateRequest(isInApp=" + this.a + ", xivaData=" + this.b + Extension.C_BRAKE;
    }
}
