package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class ogc {
    public static final ngc Companion = new ngc();
    public final double a;
    public final double b;

    public /* synthetic */ ogc(double d, double d2, int i) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, mgc.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = d2;
    }

    public final double a() {
        return this.a;
    }

    public final double b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogc)) {
            return false;
        }
        ogc ogcVar = (ogc) obj;
        return Double.compare(this.a, ogcVar.a) == 0 && Double.compare(this.b, ogcVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointDto(x=");
        sb.append(this.a);
        sb.append(", y=");
        return unr0.q(sb, this.b, ')');
    }

    public ogc(double d, double d2) {
        this.a = d;
        this.b = d2;
    }
}
