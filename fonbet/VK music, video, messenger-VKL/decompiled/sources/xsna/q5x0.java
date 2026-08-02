package xsna;

/* compiled from: VoipVmojiControllerEvent.kt */
/* loaded from: classes7.dex */
public interface q5x0 {

    /* compiled from: VoipVmojiControllerEvent.kt */
    public static final class a implements q5x0 {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Error(messageId="), this.a, ')');
        }
    }
}
