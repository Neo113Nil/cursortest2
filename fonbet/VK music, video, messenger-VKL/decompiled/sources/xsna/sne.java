package xsna;

/* compiled from: ClipsOverlayState.kt */
/* loaded from: classes17.dex */
public interface sne {

    /* compiled from: ClipsOverlayState.kt */
    public static final class a implements sne {
        public final Long a;

        public a(Long l) {
            this.a = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            Long l = this.a;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final String toString() {
            return iq.b(new StringBuilder("DatePickerVisible(date="), this.a, ')');
        }
    }

    /* compiled from: ClipsOverlayState.kt */
    public static final class b implements sne {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -705000835;
        }

        public final String toString() {
            return "None";
        }
    }
}
