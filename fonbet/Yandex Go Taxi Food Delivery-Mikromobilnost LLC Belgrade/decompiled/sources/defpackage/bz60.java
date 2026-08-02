package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bz60 {
    public final iz60 a;
    public final zy60 b;
    public final gz60 c;

    public bz60(iz60 iz60Var, zy60 zy60Var, gz60 gz60Var) {
        this.a = iz60Var;
        this.b = zy60Var;
        this.c = gz60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz60)) {
            return false;
        }
        bz60 bz60Var = (bz60) obj;
        return this.a.equals(bz60Var.a) && this.b.equals(bz60Var.b) && this.c.equals(bz60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InputParams(timeout=" + this.a + ", jump=" + this.b + ", referenceMatching=" + this.c + Extension.C_BRAKE;
    }
}
