package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class bfl0 {
    public final ju2 a;
    public final ju2 b;
    public final ju2 c;

    public bfl0(ju2 ju2Var, ju2 ju2Var2, ju2 ju2Var3) {
        this.a = ju2Var;
        this.b = ju2Var2;
        this.c = ju2Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfl0)) {
            return false;
        }
        bfl0 bfl0Var = (bfl0) obj;
        return this.a.equals(bfl0Var.a) && this.b.equals(bfl0Var.b) && this.c.equals(bfl0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RouteIcons(firstAddressIcon=" + this.a + ", middleAddressIcon=" + this.b + ", lastAddressIcon=" + this.c + Extension.C_BRAKE;
    }
}
