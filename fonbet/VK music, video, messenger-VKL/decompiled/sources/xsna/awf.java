package xsna;

/* compiled from: Ranges.kt */
/* loaded from: classes8.dex */
public final class awf implements bwf<Float> {
    public final float b;
    public final float c;

    public awf(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // xsna.bwf
    public final boolean a(Float f, Float f2) {
        return f.floatValue() <= f2.floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ewf
    public final boolean b(Comparable comparable) {
        float floatValue = ((Number) comparable).floatValue();
        return floatValue >= this.b && floatValue <= this.c;
    }

    @Override // xsna.ewf
    public final Comparable c() {
        return Float.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof awf)) {
            return false;
        }
        if (isEmpty() && ((awf) obj).isEmpty()) {
            return true;
        }
        awf awfVar = (awf) obj;
        return this.b == awfVar.b && this.c == awfVar.c;
    }

    @Override // xsna.ewf
    public final Comparable getStart() {
        return Float.valueOf(this.b);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    @Override // xsna.ewf
    public final boolean isEmpty() {
        return this.b > this.c;
    }

    public final String toString() {
        return this.b + ".." + this.c;
    }
}
