package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cv1 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final b6l0 d;

    public cv1(String str, boolean z, boolean z2, b6l0 b6l0Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = b6l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv1)) {
            return false;
        }
        cv1 cv1Var = (cv1) obj;
        return jl40.l(this.a, cv1Var.a) && this.b == cv1Var.b && this.c == cv1Var.c && this.d.equals(cv1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder l = oo31.l("AltRouteData(routeId=", this.a, ", isSelected=", ", isGreenRoute=", this.b);
        l.append(this.c);
        l.append(", routeMetricData=");
        l.append(this.d);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
