package xsna;

/* compiled from: SelectChannelViewEvent.kt */
/* loaded from: classes16.dex */
public abstract class y6i0 implements yn50 {

    /* compiled from: SelectChannelViewEvent.kt */
    public static final class a extends y6i0 {
        public static final a a = new a();
    }

    /* compiled from: SelectChannelViewEvent.kt */
    public static final class b extends y6i0 {
        public final v6i0 a;

        public b(v6i0 v6i0Var) {
            this.a = v6i0Var;
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
            return "ShowPopup(popupType=" + this.a + ')';
        }
    }
}
