package xsna;

/* compiled from: Progressions.kt */
/* loaded from: classes11.dex */
public class i9x implements Iterable<Integer>, gcy {
    public final int b;
    public final int c;
    public final int d;

    public i9x(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.b = i;
        this.c = tyx.b(i, i2, i3);
        this.d = i3;
    }

    @Override // java.lang.Iterable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final j9x iterator() {
        return new j9x(this.b, this.c, this.d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i9x)) {
            return false;
        }
        if (isEmpty() && ((i9x) obj).isEmpty()) {
            return true;
        }
        i9x i9xVar = (i9x) obj;
        return this.b == i9xVar.b && this.c == i9xVar.c && this.d == i9xVar.d;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    public boolean isEmpty() {
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        return i > 0 ? i3 > i2 : i3 < i2;
    }

    public String toString() {
        StringBuilder sb;
        int i = this.c;
        int i2 = this.b;
        int i3 = this.d;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
