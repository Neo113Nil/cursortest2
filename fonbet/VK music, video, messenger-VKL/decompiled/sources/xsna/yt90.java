package xsna;

/* compiled from: PeerMoreAction.kt */
/* loaded from: classes18.dex */
public interface yt90 {

    /* compiled from: PeerMoreAction.kt */
    public static final class a implements yt90 {
        public final wt90 a;

        public a(wt90 wt90Var) {
            this.a = wt90Var;
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
            return "DeleteAction(item=" + this.a + ')';
        }
    }
}
