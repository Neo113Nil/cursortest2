package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class pel0 {
    public final int a;
    public final int b;
    public final nel0 c;
    public final mel0 d;

    public pel0(int i, int i2, nel0 nel0Var, mel0 mel0Var) {
        this.a = i;
        this.b = i2;
        this.c = nel0Var;
        this.d = mel0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pel0)) {
            return false;
        }
        pel0 pel0Var = (pel0) obj;
        return this.a == pel0Var.a && this.b == pel0Var.b && this.c.equals(pel0Var.c) && this.d.equals(pel0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "RouteTravelerCarTeleportedEvent(distanceDifference=", ", timeDifference=", ", startLocationCoordinate=");
        s.append(this.c);
        s.append(", endLocationCoordinate=");
        s.append(this.d);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
