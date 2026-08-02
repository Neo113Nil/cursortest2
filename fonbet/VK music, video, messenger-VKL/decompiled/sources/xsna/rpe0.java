package xsna;

/* compiled from: InternalNpsState.kt */
/* loaded from: classes16.dex */
public interface rpe0 {

    /* compiled from: InternalNpsState.kt */
    public static final class a implements rpe0 {
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
            return Integer.hashCode(250) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return h5s.c(this.a, ", textLimit=250)", new StringBuilder("TextQuestionPayload(textLength="));
        }
    }
}
