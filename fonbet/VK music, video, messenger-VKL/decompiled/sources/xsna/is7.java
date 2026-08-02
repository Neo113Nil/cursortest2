package xsna;

/* compiled from: BookingPreloaderEvent.kt */
/* loaded from: classes18.dex */
public interface is7 extends pk50 {

    /* compiled from: BookingPreloaderEvent.kt */
    public static final class a implements is7 {
        public final as7 a;

        public a(as7 as7Var) {
            this.a = as7Var;
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
            return "Navigate(navigationEffect=" + this.a + ')';
        }
    }

    /* compiled from: BookingPreloaderEvent.kt */
    public static final class b implements is7 {
        public final Exception a;

        public b(Exception exc) {
            this.a = exc;
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
            return "ShowError(exception=" + this.a + ')';
        }
    }
}
