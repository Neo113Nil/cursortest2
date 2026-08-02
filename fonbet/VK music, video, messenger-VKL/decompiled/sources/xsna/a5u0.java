package xsna;

/* compiled from: VisibilityStrategy.kt */
/* loaded from: classes3.dex */
public abstract class a5u0 {

    /* compiled from: VisibilityStrategy.kt */
    public static final class a extends a5u0 {
        public final io60 a;
        public final g13 b;

        public a(io60 io60Var, g13 g13Var) {
            this.a = io60Var;
            this.b = g13Var;
        }

        @Override // xsna.a5u0
        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            return Math.min(((Number) this.a.invoke()).intValue() + ((i2 - i4) - i5), ((i + i3) + i5) - ((Number) this.b.invoke()).intValue()) > 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ExtraLayoutSpace(bottomProvider=" + this.a + ", topProvider=" + this.b + ')';
        }
    }

    /* compiled from: VisibilityStrategy.kt */
    public static final class b extends a5u0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1271455293;
        }

        public final String toString() {
            return "Standard";
        }
    }

    public boolean a(int i, int i2, int i3, int i4, int i5) {
        return Math.min(i2 - i4, i + i3) > 0;
    }
}
