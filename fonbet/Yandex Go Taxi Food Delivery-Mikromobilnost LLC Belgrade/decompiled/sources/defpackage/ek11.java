package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ek11 {
    public final a730 a;
    public final a730 b;

    public ek11(a730 a730Var, a730 a730Var2) {
        this.a = a730Var;
        this.b = a730Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek11)) {
            return false;
        }
        ek11 ek11Var = (ek11) obj;
        return this.a.equals(ek11Var.a) && this.b.equals(ek11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TwicePerMonthEntity(monthToMoney1=" + this.a + ", monthToMoney2=" + this.b + Extension.C_BRAKE;
    }
}
