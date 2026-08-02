package xsna;

import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;

/* compiled from: DeliveryPointsOneTimeEvent.kt */
/* loaded from: classes18.dex */
public interface lyl {

    /* compiled from: DeliveryPointsOneTimeEvent.kt */
    public static final class a implements lyl {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -943685938;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    /* compiled from: DeliveryPointsOneTimeEvent.kt */
    public static final class b implements lyl {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 344331701;
        }

        public final String toString() {
            return "InitialSubscribeToLocation";
        }
    }

    /* compiled from: DeliveryPointsOneTimeEvent.kt */
    public static final class c implements lyl {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -471369735;
        }

        public final String toString() {
            return "InitialValidateServices";
        }
    }

    /* compiled from: DeliveryPointsOneTimeEvent.kt */
    public static final class d implements lyl {
        public final hgr a;

        public d(hgr hgrVar) {
            this.a = hgrVar;
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
            return "OpenFilters(filtersState=" + this.a + ')';
        }
    }

    /* compiled from: DeliveryPointsOneTimeEvent.kt */
    public static final class e implements lyl {
        public final Coordinates a;

        public e(Coordinates coordinates) {
            this.a = coordinates;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            Coordinates coordinates = this.a;
            if (coordinates == null) {
                return 0;
            }
            return coordinates.hashCode();
        }

        public final String toString() {
            return "OpenSearchAddress(coordinates=" + this.a + ')';
        }
    }

    /* compiled from: DeliveryPointsOneTimeEvent.kt */
    public static final class f implements lyl {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -2100100677;
        }

        public final String toString() {
            return "SubscribeToLocation";
        }
    }

    /* compiled from: DeliveryPointsOneTimeEvent.kt */
    public static final class g implements lyl {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -447861537;
        }

        public final String toString() {
            return "ValidateLocationAvailable";
        }
    }
}
