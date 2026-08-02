package xsna;

/* compiled from: CommunitySubscriptionState.kt */
/* loaded from: classes5.dex */
public interface a3i {

    /* compiled from: CommunitySubscriptionState.kt */
    public static final class a implements a3i {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1765085705;
        }

        public final String toString() {
            return "JustJoined";
        }
    }

    /* compiled from: CommunitySubscriptionState.kt */
    public static final class b implements a3i {
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
            return defpackage.q0.a(new StringBuilder("Loading(isJoining="), this.a, ')');
        }
    }

    /* compiled from: CommunitySubscriptionState.kt */
    public static final class c implements a3i {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1070318280;
        }

        public final String toString() {
            return "NotJoined";
        }
    }
}
