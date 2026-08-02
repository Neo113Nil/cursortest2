package xsna;

/* compiled from: NotificationListSideEffect.kt */
/* loaded from: classes4.dex */
public interface bc70 {

    /* compiled from: NotificationListSideEffect.kt */
    public static final class a implements bc70 {
        public final ha70 a;

        public a(ha70 ha70Var) {
            this.a = ha70Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ListItemEffect(action=" + this.a + ')';
        }
    }

    /* compiled from: NotificationListSideEffect.kt */
    public static final class b implements bc70 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 739738808;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: NotificationListSideEffect.kt */
    public static final class c implements bc70 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1351353165;
        }

        public final String toString() {
            return "OpenSettings";
        }
    }
}
