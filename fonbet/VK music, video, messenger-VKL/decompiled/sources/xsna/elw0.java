package xsna;

/* compiled from: VoipCallsJoinToCallByPasswordParams.kt */
/* loaded from: classes7.dex */
public interface elw0 {

    /* compiled from: VoipCallsJoinToCallByPasswordParams.kt */
    public static final class a implements elw0 {
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
            return ho8.a(new StringBuilder("WithLink(link="), this.a, ')');
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordParams.kt */
    public static final class b implements elw0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -660345011;
        }

        public final String toString() {
            return "WithoutLink";
        }
    }
}
