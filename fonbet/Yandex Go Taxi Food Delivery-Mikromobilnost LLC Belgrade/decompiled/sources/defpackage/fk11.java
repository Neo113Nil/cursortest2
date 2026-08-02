package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fk11 {
    public final b730 a;
    public final b730 b;

    public fk11(b730 b730Var, b730 b730Var2) {
        this.a = b730Var;
        this.b = b730Var2;
    }

    public final b730 a() {
        return this.a;
    }

    public final b730 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk11)) {
            return false;
        }
        fk11 fk11Var = (fk11) obj;
        return this.a.equals(fk11Var.a) && this.b.equals(fk11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TwicePerMonthViewItem(monthToMoney1=" + this.a + ", monthToMoney2=" + this.b + Extension.C_BRAKE;
    }
}
