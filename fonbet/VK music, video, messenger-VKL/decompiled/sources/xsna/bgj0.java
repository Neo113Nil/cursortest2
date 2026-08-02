package xsna;

/* compiled from: ShortVideoItemImmediateState.kt */
/* loaded from: classes17.dex */
public interface bgj0 {

    /* compiled from: ShortVideoItemImmediateState.kt */
    public static final class a implements bgj0 {
        public final kih0 a;
        public final wp50 b;

        public a(kih0 kih0Var, wp50 wp50Var) {
            this.a = kih0Var;
            this.b = wp50Var;
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
            int hashCode = this.a.hashCode() * 31;
            wp50 wp50Var = this.b;
            return hashCode + (wp50Var == null ? 0 : wp50Var.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Bound(autoPlay=");
            sb.append(this.a);
            sb.append(", myTargetFacade=");
            return iq.c(sb, this.b, ')');
        }
    }

    /* compiled from: ShortVideoItemImmediateState.kt */
    public static final class b implements bgj0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1785309065;
        }

        public final String toString() {
            return "NotBound";
        }
    }
}
