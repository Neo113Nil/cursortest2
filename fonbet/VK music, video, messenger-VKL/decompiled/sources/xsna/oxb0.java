package xsna;

/* compiled from: PopupSettingsPatch.kt */
/* loaded from: classes6.dex */
public abstract class oxb0 implements xl50 {

    /* compiled from: PopupSettingsPatch.kt */
    public static final class a extends oxb0 {
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
            return "ShowContent(popupSettingsModel=" + this.b + ')';
        }
    }

    /* compiled from: PopupSettingsPatch.kt */
    public static final class b extends oxb0 {
        public static final b b = new b();
    }
}
