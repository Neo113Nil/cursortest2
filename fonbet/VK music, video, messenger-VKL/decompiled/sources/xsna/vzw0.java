package xsna;

/* compiled from: VoipSelectVideoCommonEvent.kt */
/* loaded from: classes7.dex */
public interface vzw0 {

    /* compiled from: VoipSelectVideoCommonEvent.kt */
    public static final class a implements vzw0 {
        public static final a a = new a();
    }

    /* compiled from: VoipSelectVideoCommonEvent.kt */
    public static final class b implements vzw0 {
        public static final b a = new b();
    }

    /* compiled from: VoipSelectVideoCommonEvent.kt */
    public static final class c implements vzw0 {
        public static final c a = new c();
    }

    /* compiled from: VoipSelectVideoCommonEvent.kt */
    public static final class d implements vzw0 {
        public final p3x0 a;

        public d(p3x0 p3x0Var) {
            this.a = p3x0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SelectVideoEvent(video=" + this.a + ')';
        }
    }
}
