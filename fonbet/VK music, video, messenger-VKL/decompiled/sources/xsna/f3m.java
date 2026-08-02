package xsna;

/* compiled from: DesignControlBounds.kt */
/* loaded from: classes7.dex */
public interface f3m {

    /* compiled from: DesignControlBounds.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Bounds(topOffset=");
            sb.append(this.a);
            sb.append(", bottomOffset=");
            sb.append(this.b);
            sb.append(", leftOffset=");
            sb.append(this.c);
            sb.append(", rightOffset=");
            return vu5.b(sb, this.d, ')');
        }
    }

    io.reactivex.rxjava3.internal.operators.observable.z0 a();
}
