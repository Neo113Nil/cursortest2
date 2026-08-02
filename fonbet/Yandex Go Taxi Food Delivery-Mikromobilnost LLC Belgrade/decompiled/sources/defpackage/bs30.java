package defpackage;

import com.yandex.mapkit.geometry.Subpolyline;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class bs30 implements hz30 {
    public final f5q0 a;
    public final int b;
    public final Subpolyline c;
    public final double d;
    public final int e;

    public bs30(f5q0 f5q0Var, int i, Subpolyline subpolyline, double d, int i2) {
        this.a = f5q0Var;
        this.b = i;
        this.c = subpolyline;
        this.d = d;
        this.e = i2;
    }

    @Override // defpackage.hz30
    public final int b() {
        return this.e;
    }

    @Override // defpackage.hz30
    public final Subpolyline c() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs30)) {
            return false;
        }
        bs30 bs30Var = (bs30) obj;
        return jl40.l(this.a, bs30Var.a) && this.b == bs30Var.b && jl40.l(this.c, bs30Var.c) && Double.compare(this.d, bs30Var.d) == 0 && this.e == bs30Var.e;
    }

    @Override // defpackage.hz30
    public final double getDuration() {
        return this.d;
    }

    public final int hashCode() {
        f5q0 f5q0Var = this.a;
        return Integer.hashCode(this.e) + unr0.a((this.c.hashCode() + oyr.b(this.b, (f5q0Var == null ? 0 : f5q0Var.hashCode()) * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtPedestrianSection(weight=");
        sb.append(this.a);
        sb.append(", distanceMeters=");
        sb.append(this.b);
        sb.append(", subpolyline=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        return b64.q(sb, ", sectionId=", this.e, Extension.C_BRAKE);
    }
}
