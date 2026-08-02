package xsna;

/* compiled from: ClipsGridBlockNavigationEvent.kt */
/* loaded from: classes17.dex */
public interface qbe {

    /* compiled from: ClipsGridBlockNavigationEvent.kt */
    public static final class a implements qbe {
        public final kih0 a;
        public final int b;

        public a(int i, kih0 kih0Var) {
            this.a = kih0Var;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnClipSelected(autoPlay=");
            sb.append(this.a);
            sb.append(", index=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsGridBlockNavigationEvent.kt */
    public static final class b implements qbe {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2115392401;
        }

        public final String toString() {
            return "OnShowDefaultError";
        }
    }
}
