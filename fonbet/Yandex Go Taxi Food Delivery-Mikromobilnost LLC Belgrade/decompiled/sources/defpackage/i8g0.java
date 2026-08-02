package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class i8g0 implements k8g0 {
    public final v1a0 a;

    public i8g0(v1a0 v1a0Var) {
        this.a = v1a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8g0) && jl40.l(this.a, ((i8g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Payment(paymentInfo=" + this.a + Extension.C_BRAKE;
    }
}
