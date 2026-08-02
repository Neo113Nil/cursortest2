package xsna;

/* compiled from: SubscribeButtonViewState.kt */
/* loaded from: classes17.dex */
public interface jvm0 {

    /* compiled from: SubscribeButtonViewState.kt */
    public static final class a implements jvm0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1108272873;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: SubscribeButtonViewState.kt */
    public static final class b implements jvm0 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("NotSubscribed(highlighted="), this.a, ')');
        }
    }

    /* compiled from: SubscribeButtonViewState.kt */
    public static final class c implements jvm0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2014890311;
        }

        public final String toString() {
            return "Subscribed";
        }
    }
}
