package xsna;

import com.vk.ecomm.cart.impl.common.models.DeliveryPointId;
import com.vk.ecomm.cart.impl.common.models.exception.MapServicesNotSuppoertedException;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.search_address.model.SearchAddressResult;
import java.util.List;

/* compiled from: DeliveryPointsMapAction.kt */
/* loaded from: classes18.dex */
public abstract class cxl implements kj50 {

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class a extends cxl {
        public final List<dcr> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends dcr> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("ApplySelectedFilters(filters="), this.b);
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class b extends cxl {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2145272897;
        }

        public final String toString() {
            return "ClickBack";
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class c extends cxl {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 358938834;
        }

        public final String toString() {
            return "ClickClosePointDetails";
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class d extends cxl {
        public final Coordinates b;

        public d(Coordinates coordinates) {
            this.b = coordinates;
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
            return "ClickCluster(coordinates=" + this.b + ')';
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class e extends cxl {
        public final DeliveryPointId b;

        public e(DeliveryPointId deliveryPointId) {
            this.b = deliveryPointId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ClickDeliveryPoint(pointId=" + this.b + ')';
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class f extends cxl {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1218748893;
        }

        public final String toString() {
            return "ClickFilters";
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class g extends cxl {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -799266163;
        }

        public final String toString() {
            return "ClickLocation";
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class h extends cxl {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 261613581;
        }

        public final String toString() {
            return "ClickProvideLocationPermission";
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class i extends cxl {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1364237529;
        }

        public final String toString() {
            return "ClickRetryOnPointsLoadingFailed";
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class j extends cxl {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 467388032;
        }

        public final String toString() {
            return "ClickSearch";
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static abstract class k extends cxl {

        /* compiled from: DeliveryPointsMapAction.kt */
        public static final class a extends k {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1558310957;
            }

            public final String toString() {
                return "LocationUnavailable";
            }
        }

        /* compiled from: DeliveryPointsMapAction.kt */
        public static final class b extends k {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -109012262;
            }

            public final String toString() {
                return "MapCreated";
            }
        }

        /* compiled from: DeliveryPointsMapAction.kt */
        public static final class d extends k {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -2106778374;
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* compiled from: DeliveryPointsMapAction.kt */
        public static final class e extends k {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -2105426252;
            }

            public final String toString() {
                return "Start";
            }
        }

        /* compiled from: DeliveryPointsMapAction.kt */
        public static final class c extends k {
            public final Throwable b;

            public c(MapServicesNotSuppoertedException mapServicesNotSuppoertedException) {
                this.b = mapServicesNotSuppoertedException;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                Throwable th = this.b;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("MapCreationFailed(error="), this.b, ')');
            }

            public c() {
                this(null);
            }
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class l extends cxl {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -83461811;
        }

        public final String toString() {
            return "LoadDeliveryPoints";
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class m extends cxl {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -654047406;
        }

        public final String toString() {
            return "LocationBecameUnavailable";
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class n extends cxl {
        public static final n b = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -1063180049;
        }

        public final String toString() {
            return "LocationPermissionDenied";
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class o extends cxl {
        public static final o b = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -1381519817;
        }

        public final String toString() {
            return "LocationPermissionProvided";
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class p extends cxl {
        public final Coordinates b;

        public p(Coordinates coordinates) {
            this.b = coordinates;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && epx.f(this.b, ((p) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "LocationUpdated(location=" + this.b + ')';
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class q extends cxl {
        public static final q b = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 1239099871;
        }

        public final String toString() {
            return "MapCameraMoveStarted";
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class r extends cxl {
        public final gk9 b;
        public final v0w0 c;

        public r(gk9 gk9Var, v0w0 v0w0Var) {
            this.b = gk9Var;
            this.c = v0w0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return epx.f(this.b, rVar.b) && epx.f(this.c, rVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "MapCenterChanged(position=" + this.b + ", visibleRegion=" + this.c + ')';
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class s extends cxl {
        public final SearchAddressResult b;

        public s(SearchAddressResult searchAddressResult) {
            this.b = searchAddressResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.b, ((s) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnSearchAddressResult(result=" + this.b + ')';
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class t extends cxl {
        public static final t b = new t();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 1926563964;
        }

        public final String toString() {
            return "ResetFilters";
        }
    }

    /* compiled from: DeliveryPointsMapAction.kt */
    public static final class u extends cxl {
        public static final u b = new u();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return -1260168304;
        }

        public final String toString() {
            return "SelectDeliveryPoint";
        }
    }
}
