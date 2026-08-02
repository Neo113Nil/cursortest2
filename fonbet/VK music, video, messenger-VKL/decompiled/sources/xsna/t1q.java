package xsna;

/* compiled from: ExcerptType.kt */
/* loaded from: classes18.dex */
public abstract class t1q {

    /* compiled from: ExcerptType.kt */
    public static final class a extends t1q {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2001655101;
        }

        public final String toString() {
            return "Full";
        }
    }

    /* compiled from: ExcerptType.kt */
    public static final class b extends t1q {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Line(maxExcerptLines=");
            sb.append(this.a);
            sb.append(", minTrimmedLines=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: ExcerptType.kt */
    public static final class c extends t1q {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Square(minTrimmedLines="), this.a, ')');
        }
    }
}
