package xsna;

/* compiled from: Ranges.kt */
/* loaded from: classes8.dex */
public final class zvf implements bwf<Double> {
    public final double b;
    public final double c;

    public zvf(double d, double d2) {
        this.b = d;
        this.c = d2;
    }

    @Override // xsna.bwf
    public final boolean a(Double d, Double d2) {
        return d.doubleValue() <= d2.doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ewf
    public final boolean b(Comparable comparable) {
        double doubleValue = ((Number) comparable).doubleValue();
        return doubleValue >= this.b && doubleValue <= this.c;
    }

    @Override // xsna.ewf
    public final Comparable c() {
        return Double.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zvf)) {
            return false;
        }
        if (isEmpty() && ((zvf) obj).isEmpty()) {
            return true;
        }
        zvf zvfVar = (zvf) obj;
        return this.b == zvfVar.b && this.c == zvfVar.c;
    }

    @Override // xsna.ewf
    public final Comparable getStart() {
        return Double.valueOf(this.b);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Double.hashCode(this.c) + (Double.hashCode(this.b) * 31);
    }

    @Override // xsna.ewf
    public final boolean isEmpty() {
        return this.b > this.c;
    }

    public final String toString() {
        return this.b + ".." + this.c;
    }
}
