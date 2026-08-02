package xsna;

/* compiled from: VKLatLng.kt */
/* loaded from: classes3.dex */
public final class edr0 {
    public final double a;
    public final double b;

    public edr0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edr0)) {
            return false;
        }
        edr0 edr0Var = (edr0) obj;
        return Double.compare(this.a, edr0Var.a) == 0 && Double.compare(this.b, edr0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKLatLng(latitude=");
        sb.append(this.a);
        sb.append(", longitude=");
        return ojp0.a(sb, this.b, ')');
    }
}
