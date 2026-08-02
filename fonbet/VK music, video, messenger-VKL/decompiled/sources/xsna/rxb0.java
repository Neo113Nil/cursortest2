package xsna;

/* compiled from: PopupSettingsState.kt */
/* loaded from: classes6.dex */
public abstract class rxb0 implements km50 {

    /* compiled from: PopupSettingsState.kt */
    public static final class a extends rxb0 {
        public final nyb0 b;

        public a(nyb0 nyb0Var) {
            this.b = nyb0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Content(popupSettingsModel=" + this.b + ')';
        }
    }

    /* compiled from: PopupSettingsState.kt */
    public static final class b extends rxb0 {
        public static final b b = new b();
    }
}
