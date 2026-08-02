package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ev3 {
    public final dv3 a;
    public final dv3 b;

    public ev3(dv3 dv3Var, dv3 dv3Var2) {
        this.a = dv3Var;
        this.b = dv3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev3)) {
            return false;
        }
        ev3 ev3Var = (ev3) obj;
        return this.a.equals(ev3Var.a) && this.b.equals(ev3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoTopupButtonGroupEntity(primaryButton=" + this.a + ", secondaryButton=" + this.b + Extension.C_BRAKE;
    }
}
