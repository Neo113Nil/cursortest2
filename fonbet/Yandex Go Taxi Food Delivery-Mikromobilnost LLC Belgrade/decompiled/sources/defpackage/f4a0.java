package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class f4a0 {
    public static final f4a0 c = new f4a0(0);
    public final m1a0 a;
    public final lv90 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f4a0(int i) {
        this(r2, lv90.g);
        m1a0 m1a0Var = m1a0.h;
        lv90.Companion.getClass();
    }

    public final boolean a() {
        return jl40.l(this.a, m1a0.h) || this.b.equals(lv90.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4a0)) {
            return false;
        }
        f4a0 f4a0Var = (f4a0) obj;
        return jl40.l(this.a, f4a0Var.a) && jl40.l(this.b, f4a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentMethod(paymentInfo=" + this.a + ", paymentDto=" + this.b + Extension.C_BRAKE;
    }

    public f4a0(m1a0 m1a0Var, lv90 lv90Var) {
        this.a = m1a0Var;
        this.b = lv90Var;
    }

    public f4a0() {
        this(0);
    }
}
