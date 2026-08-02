package xsna;

/* compiled from: VoipCallViewEvent.kt */
/* loaded from: classes7.dex */
public interface fkw0 {

    /* compiled from: VoipCallViewEvent.kt */
    public static final class a implements fkw0 {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("FeedbackButtonsVisibilityChanged(areVisible="), this.a, ')');
        }
    }
}
