package xsna;

/* compiled from: ClipsOverlayViewState.kt */
/* loaded from: classes17.dex */
public interface tne {

    /* compiled from: ClipsOverlayViewState.kt */
    public static final class a implements tne {
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

    /* compiled from: ClipsOverlayViewState.kt */
    public static final class b implements tne {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1283210508;
        }

        public final String toString() {
            return "None";
        }
    }
}
