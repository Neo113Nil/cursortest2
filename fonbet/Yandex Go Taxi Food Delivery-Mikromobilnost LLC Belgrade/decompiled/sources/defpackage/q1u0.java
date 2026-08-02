package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class q1u0 implements ig5 {
    public static final p1u0 Companion = new p1u0();
    public final String a;
    public final String b;

    public /* synthetic */ q1u0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, o1u0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1u0)) {
            return false;
        }
        q1u0 q1u0Var = (q1u0) obj;
        return jl40.l(this.a, q1u0Var.a) && jl40.l(this.b, q1u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("StartOrderStatusPollingAction(paymentUrl=", this.a, ", transactionId=", this.b, Extension.C_BRAKE);
    }
}
