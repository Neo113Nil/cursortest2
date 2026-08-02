package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ib40 {
    public static final ib40 c = new ib40(0);
    public final m1a0 a;
    public final lv90 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ib40(int i) {
        this(r2, lv90.g);
        m1a0 m1a0Var = m1a0.h;
        lv90.Companion.getClass();
    }

    public final boolean a() {
        return !(jl40.l(this.a, m1a0.h) || this.b.equals(lv90.g));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib40)) {
            return false;
        }
        ib40 ib40Var = (ib40) obj;
        return jl40.l(this.a, ib40Var.a) && jl40.l(this.b, ib40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MtTrainCheckoutPaymentMethod(paymentInfo=" + this.a + ", paymentDto=" + this.b + Extension.C_BRAKE;
    }

    public ib40(m1a0 m1a0Var, lv90 lv90Var) {
        this.a = m1a0Var;
        this.b = lv90Var;
    }

    public ib40() {
        this(0);
    }
}
