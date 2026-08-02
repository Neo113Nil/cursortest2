package xsna;

/* compiled from: ReactedPeersModel.kt */
/* loaded from: classes2.dex */
public interface uze0 {

    /* compiled from: ReactedPeersModel.kt */
    public static final class a implements uze0 {
        public static final a a = new a();
    }

    /* compiled from: ReactedPeersModel.kt */
    public static final class b implements uze0 {
        public static final b a = new b();
    }

    /* compiled from: ReactedPeersModel.kt */
    public static final class c implements uze0 {
        public final eze0 a;

        public c(eze0 eze0Var) {
            this.a = eze0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Peers(reactedPeers=" + this.a + ')';
        }
    }
}
