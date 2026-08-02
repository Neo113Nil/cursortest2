package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class b6a0 implements c6a0 {
    public final f731 a;

    public b6a0(f731 f731Var) {
        this.a = f731Var;
    }

    public final f731 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6a0) && jl40.l(this.a, ((b6a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerifyPayment(paymentModel=" + this.a + Extension.C_BRAKE;
    }
}
