package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class el30 implements ml30 {
    public final ll30 a;
    public final fd30 b;

    public el30(ll30 ll30Var, fd30 fd30Var) {
        this.a = ll30Var;
        this.b = fd30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof el30) {
            el30 el30Var = (el30) obj;
            return this.a.equals(el30Var.a) && this.b == el30Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnBleInfoTapped(screenAnalyticsState=" + this.a + ", bleItem=" + this.b + Extension.C_BRAKE;
    }
}
