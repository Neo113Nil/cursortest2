package xsna;

/* compiled from: EduSchedule.kt */
/* loaded from: classes2.dex */
public interface y6p {

    /* compiled from: EduSchedule.kt */
    public static final class a implements y6p {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -780879866;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: EduSchedule.kt */
    public static final class b implements y6p {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return epx.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Loaded(data=" + ((Object) null) + ')';
        }
    }
}
