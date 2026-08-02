package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class q1a0 {
    public final m1a0 a;
    public final z0a0 b;
    public final String c;

    public q1a0(m1a0 m1a0Var, z0a0 z0a0Var, String str) {
        this.a = m1a0Var;
        this.b = z0a0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1a0)) {
            return false;
        }
        q1a0 q1a0Var = (q1a0) obj;
        if (!jl40.l(this.a, q1a0Var.a) || !jl40.l(this.b, q1a0Var.b)) {
            return false;
        }
        m0s m0sVar = m0s.a;
        return m0sVar.equals(m0sVar) && this.c.equals(q1a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) - 729648716) * 31);
    }

    public final String toString() {
        return "PaymentInfoButtonUiState(paymentInfo=" + this.a + ", paymentIconLoader=" + this.b + ", action=" + m0s.a + ", contentDescription=" + this.c + Extension.C_BRAKE;
    }
}
