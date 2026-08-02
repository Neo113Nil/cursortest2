package xsna;

import java.util.List;
import xsna.nr7;

/* compiled from: BookingMastersScreenViewState.kt */
/* loaded from: classes18.dex */
public interface ur7 extends lm50 {

    /* compiled from: BookingMastersScreenViewState.kt */
    public static final class a implements ur7 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1117445208;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: BookingMastersScreenViewState.kt */
    public static final class b implements ur7 {
        public final nr7.a b;

        public b(nr7.a aVar) {
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.b + ')';
        }
    }

    /* compiled from: BookingMastersScreenViewState.kt */
    public static final class c implements ur7 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1837454551;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: BookingMastersScreenViewState.kt */
    public static final class d implements ur7 {
        public final List b;

        public d(List list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return jr.a(')', new StringBuilder("Main(masters="), this.b);
        }
    }
}
