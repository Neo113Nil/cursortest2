package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nr9 implements uj9 {
    public final ir9 a;

    public nr9(ir9 ir9Var) {
        this.a = ir9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nr9) && jl40.l(this.a, ((nr9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectPaymentMethodForDiscount(discount=" + this.a + Extension.C_BRAKE;
    }
}
