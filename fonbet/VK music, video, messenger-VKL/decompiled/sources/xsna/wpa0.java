package xsna;

/* compiled from: UiPipetteStateColor.kt */
/* loaded from: classes4.dex */
public interface wpa0 {

    /* compiled from: UiPipetteStateColor.kt */
    public static final class a implements wpa0 {
        public final y8g a;
        public final boolean b;

        public a(y8g y8gVar, boolean z) {
            this.a = y8gVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        @Override // xsna.wpa0
        public final boolean p() {
            return this.b;
        }

        public final String toString() {
            return "Colored(color=" + this.a + ", isSelected=" + this.b + ")";
        }
    }

    /* compiled from: UiPipetteStateColor.kt */
    public static final class b implements wpa0 {
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

        @Override // xsna.wpa0
        public final boolean p() {
            return this.a;
        }

        public final String toString() {
            return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("Inactive(isSelected=", ")", this.a);
        }
    }

    boolean p();
}
