package xsna;

/* compiled from: MainStatEvent.kt */
/* loaded from: classes4.dex */
public interface zf00 extends srk0 {

    /* compiled from: MainStatEvent.kt */
    public static final class a implements zf00 {
        public static final a a = new a();
    }

    /* compiled from: MainStatEvent.kt */
    public static final class b implements zf00 {
        public final haa0 a;

        public b(haa0 haa0Var) {
            this.a = haa0Var;
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
            return "SavePhoto(photoParams=" + this.a + ")";
        }
    }

    /* compiled from: MainStatEvent.kt */
    public static final class c implements zf00 {
        public static final c a = new c();
    }
}
