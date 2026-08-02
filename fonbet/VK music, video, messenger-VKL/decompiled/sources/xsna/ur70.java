package xsna;

/* compiled from: ObtainVerificationEvent.kt */
/* loaded from: classes18.dex */
public interface ur70 {

    /* compiled from: ObtainVerificationEvent.kt */
    public static final class a implements ur70 {
        public final String a;

        public a(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("ShowError(message="), this.a, ')');
        }
    }
}
