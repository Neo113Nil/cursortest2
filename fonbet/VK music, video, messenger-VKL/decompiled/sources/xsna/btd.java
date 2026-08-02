package xsna;

/* compiled from: ClipsDraftLocation.kt */
/* loaded from: classes17.dex */
public final class btd {
    public final double a;
    public final double b;

    public btd(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btd)) {
            return false;
        }
        btd btdVar = (btd) obj;
        return Double.compare(this.a, btdVar.a) == 0 && Double.compare(this.b, btdVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDraftLocation(latitude=");
        sb.append(this.a);
        sb.append(", longitude=");
        return ojp0.a(sb, this.b, ')');
    }
}
