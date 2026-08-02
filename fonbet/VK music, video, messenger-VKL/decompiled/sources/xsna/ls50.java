package xsna;

/* compiled from: MyTargetNonVideoItemImmediateState.kt */
/* loaded from: classes17.dex */
public interface ls50 {

    /* compiled from: MyTargetNonVideoItemImmediateState.kt */
    public static final class a implements ls50 {
        public final String a;
        public final wp50 b;

        public a(String str, wp50 wp50Var) {
            this.a = str;
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
            StringBuilder sb = new StringBuilder("Bound(uniqueKey=");
            sb.append(this.a);
            sb.append(", myTargetFacade=");
            return iq.c(sb, this.b, ')');
        }
    }

    /* compiled from: MyTargetNonVideoItemImmediateState.kt */
    public static final class b implements ls50 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -530941114;
        }

        public final String toString() {
            return "NotBound";
        }
    }
}
