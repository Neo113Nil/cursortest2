package xsna;

import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.common.models.DeliveryPointId;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import java.util.List;
import java.util.Map;

/* compiled from: DeliveryPointsMapPatch.kt */
/* loaded from: classes18.dex */
public interface qxl extends xl50 {

    /* compiled from: DeliveryPointsMapPatch.kt */
    public static final class a implements qxl {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 345845968;
        }

        public final String toString() {
            return "ClearVisiblePoints";
        }
    }

    /* compiled from: DeliveryPointsMapPatch.kt */
    public static final class b implements qxl {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1257052266;
        }

        public final String toString() {
            return "CloseDeliveryPointDetails";
        }
    }

    /* compiled from: DeliveryPointsMapPatch.kt */
    public static final class c implements qxl {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "LocationStatusUpdated(isAvailable=false)";
        }
    }

    /* compiled from: DeliveryPointsMapPatch.kt */
    public static final class d implements qxl {
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
            return "LocationUpdated(location=" + this.b + ')';
        }
    }

    /* compiled from: DeliveryPointsMapPatch.kt */
    public interface e extends qxl {

        /* compiled from: DeliveryPointsMapPatch.kt */
        public static final class a implements e {
            public final gk9 b;
            public final boolean c;

            public a(gk9 gk9Var, boolean z) {
                this.b = gk9Var;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && this.c == aVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MoveRequest(target=");
                sb.append(this.b);
                sb.append(", isUserLocation=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: DeliveryPointsMapPatch.kt */
        public static final class b implements e {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1920717173;
            }

            public final String toString() {
                return "MoveStarted";
            }
        }

        /* compiled from: DeliveryPointsMapPatch.kt */
        public static final class c implements e {
            public final gk9 b;
            public final v0w0 c;

            public c(gk9 gk9Var, v0w0 v0w0Var) {
                this.b = gk9Var;
                this.c = v0w0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "Moved(position=" + this.b + ", visibleRegion=" + this.c + ')';
            }
        }
    }

    /* compiled from: DeliveryPointsMapPatch.kt */
    public interface f extends qxl {

        /* compiled from: DeliveryPointsMapPatch.kt */
        public static final class a implements f {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 2041808446;
            }

            public final String toString() {
                return "Created";
            }
        }

        /* compiled from: DeliveryPointsMapPatch.kt */
        public static final class b implements f {
            public final Throwable b;

            public b(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                Throwable th = this.b;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Failed(error="), this.b, ')');
            }
        }

        /* compiled from: DeliveryPointsMapPatch.kt */
        public static final class c implements f {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -100595842;
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* compiled from: DeliveryPointsMapPatch.kt */
        public static final class d implements f {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -99243720;
            }

            public final String toString() {
                return "Start";
            }
        }
    }

    /* compiled from: DeliveryPointsMapPatch.kt */
    public static abstract class g implements qxl {

        /* compiled from: DeliveryPointsMapPatch.kt */
        public static final class a extends g {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
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
                return oq.c(new StringBuilder("Failed(error="), this.b, ')');
            }
        }

        /* compiled from: DeliveryPointsMapPatch.kt */
        public static final class b extends g {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1870556668;
            }

            public final String toString() {
                return "Started";
            }
        }

        /* compiled from: DeliveryPointsMapPatch.kt */
        public static final class c extends g {
            public final Map<DeliveryPointId, DeliveryPoint> b;
            public final List<dcr> c;

            public c(List list, Map map) {
                this.b = map;
                this.c = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(points=");
                sb.append(this.b);
                sb.append(", filters=");
                return ms9.a(')', sb, this.c);
            }
        }
    }

    /* compiled from: DeliveryPointsMapPatch.kt */
    public static final class h implements qxl {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 919849940;
        }

        public final String toString() {
            return "ResetFilters";
        }
    }

    /* compiled from: DeliveryPointsMapPatch.kt */
    public interface i extends qxl {

        /* compiled from: DeliveryPointsMapPatch.kt */
        public static final class a implements i {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -182487037;
            }

            public final String toString() {
                return "PermissionDenied";
            }
        }

        /* compiled from: DeliveryPointsMapPatch.kt */
        public static final class b implements i {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1144092597;
            }

            public final String toString() {
                return "PermissionProvided";
            }
        }

        /* compiled from: DeliveryPointsMapPatch.kt */
        public static final class c implements i {
            public final boolean b;

            public c() {
                this(false);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.b == ((c) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Started(shouldAttachToLocation="), this.b, ')');
            }

            public c(boolean z) {
                this.b = z;
            }
        }
    }

    /* compiled from: DeliveryPointsMapPatch.kt */
    public static final class j implements qxl {
        public final DeliveryPointId b;

        public j(DeliveryPointId deliveryPointId) {
            this.b = deliveryPointId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ShowPointDetails(pointId=" + this.b + ')';
        }
    }

    /* compiled from: DeliveryPointsMapPatch.kt */
    public static final class k implements qxl {
        public final List<dcr> b;

        /* JADX WARN: Multi-variable type inference failed */
        public k(List<? extends dcr> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("UpdateFilters(filters="), this.b);
        }
    }
}
