package defpackage;

/* loaded from: classes9.dex */
public class b6w implements Iterable, xfx {
    public final int a;
    public final int b;
    public final int c;

    public b6w(int i, int i2, int i3) {
        if (i3 == 0) {
            ny61.g("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            ny61.g("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.a = i;
        this.b = jx81.v(i, i2, i3);
        this.c = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b6w)) {
            return false;
        }
        if (isEmpty() && ((b6w) obj).isEmpty()) {
            return true;
        }
        b6w b6wVar = (b6w) obj;
        return this.a == b6wVar.a && this.b == b6wVar.b && this.c == b6wVar.c;
    }

    @Override // java.lang.Iterable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final c6w iterator() {
        return new c6w(this.a, this.b, this.c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public boolean isEmpty() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    public String toString() {
        StringBuilder sb;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
