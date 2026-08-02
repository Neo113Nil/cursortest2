package xsna;

/* compiled from: BookingPreloaderViewState.kt */
/* loaded from: classes18.dex */
public interface et7 extends lm50 {

    /* compiled from: BookingPreloaderViewState.kt */
    public static final class a implements et7 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 396634345;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: BookingPreloaderViewState.kt */
    public static final class b implements et7 {
        public final com.vk.ecomm.onlinebooking.impl.common.a b;
        public final gs7 c;

        public b(com.vk.ecomm.onlinebooking.impl.common.a aVar, gs7 gs7Var) {
            this.b = aVar;
            this.c = gs7Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Error(model=" + this.b + ", action=" + this.c + ')';
        }
    }

    /* compiled from: BookingPreloaderViewState.kt */
    public static final class c implements et7 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 873991640;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
