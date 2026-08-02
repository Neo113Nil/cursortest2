package xsna;

/* compiled from: PrimitiveRanges.kt */
/* loaded from: classes11.dex */
public final class k9x extends i9x implements ewf<Integer> {
    public static final k9x e = new k9x(1, 0, 1);

    @Override // xsna.ewf
    public final /* bridge */ /* synthetic */ boolean b(Integer num) {
        return e(num.intValue());
    }

    @Override // xsna.ewf
    public final Integer c() {
        return Integer.valueOf(this.c);
    }

    public final boolean e(int i) {
        return this.b <= i && i <= this.c;
    }

    @Override // xsna.i9x
    public final boolean equals(Object obj) {
        if (!(obj instanceof k9x)) {
            return false;
        }
        if (isEmpty() && ((k9x) obj).isEmpty()) {
            return true;
        }
        k9x k9xVar = (k9x) obj;
        return this.b == k9xVar.b && this.c == k9xVar.c;
    }

    @Override // xsna.ewf
    public final Integer getStart() {
        return Integer.valueOf(this.b);
    }

    @Override // xsna.i9x
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.b * 31) + this.c;
    }

    @Override // xsna.i9x, xsna.ewf
    public final boolean isEmpty() {
        return this.b > this.c;
    }

    @Override // xsna.i9x
    public final String toString() {
        return this.b + ".." + this.c;
    }
}
