package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class dg51 implements eg51 {
    public final ig51 a;
    public final String b;

    public dg51(ig51 ig51Var, String str) {
        this.a = ig51Var;
        this.b = str;
    }

    public final ig51 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg51)) {
            return false;
        }
        dg51 dg51Var = (dg51) obj;
        return this.a.equals(dg51Var.a) && this.b.equals(dg51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(json=" + this.a + ", traceId=" + this.b + Extension.C_BRAKE;
    }
}
