package xsna;

/* compiled from: ClipCoauthorDecisionEvent.kt */
/* loaded from: classes16.dex */
public interface pnc extends pk50 {

    /* compiled from: ClipCoauthorDecisionEvent.kt */
    public static final class a implements pnc {
        public static final a a = new a();
    }

    /* compiled from: ClipCoauthorDecisionEvent.kt */
    public static final class b implements pnc {
        public final hnd a;

        public b(hnd hndVar) {
            this.a = hndVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowSnackbar(config=" + this.a + ')';
        }
    }
}
