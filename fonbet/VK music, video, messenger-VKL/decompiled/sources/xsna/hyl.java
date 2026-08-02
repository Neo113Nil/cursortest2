package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.common.models.DeliveryPointId;
import com.vk.ecomm.cart.impl.common.models.geo.City;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.points_map.feature.model.DeliveryPointsMode;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: DeliveryPointsMapState.kt */
/* loaded from: classes18.dex */
public final class hyl implements km50 {
    public final a b;
    public final DeliveryPointsMode c;
    public final b d;
    public final c e;
    public final DeliveryPoint f;
    public final boolean g;
    public final hgr h;
    public final boolean i;

    /* compiled from: DeliveryPointsMapState.kt */
    public static final class a {
        public final UserId a;
        public final City b;
        public final Coordinates c;
        public final List<Integer> d;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            UserId userId = this.a;
            int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
            City city = this.b;
            int hashCode2 = (hashCode + (city == null ? 0 : city.hashCode())) * 31;
            Coordinates coordinates = this.c;
            return this.d.hashCode() + ((hashCode2 + (coordinates != null ? coordinates.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Parameters(groupId=");
            sb.append(this.a);
            sb.append(", city=");
            sb.append(this.b);
            sb.append(", cityCoordinates=");
            sb.append(this.c);
            sb.append(", serviceIds=");
            return ms9.a(')', sb, this.d);
        }

        public a(UserId userId, City city, Coordinates coordinates, List<Integer> list) {
            this.a = userId;
            this.b = city;
            this.c = coordinates;
            this.d = list;
        }

        public a(int i) {
            this(null, null, null, EmptyList.b);
        }
    }

    /* compiled from: DeliveryPointsMapState.kt */
    public static final class b {
        public final tj00 a;
        public final Coordinates b;
        public final Map<DeliveryPointId, DeliveryPoint> c;
        public final boolean d;
        public final boolean e;
        public final Throwable f;

        public b() {
            this(null, 63);
        }

        public static b a(b bVar, tj00 tj00Var, Coordinates coordinates, Map map, boolean z, Throwable th, int i) {
            if ((i & 1) != 0) {
                tj00Var = bVar.a;
            }
            tj00 tj00Var2 = tj00Var;
            if ((i & 2) != 0) {
                coordinates = bVar.b;
            }
            Coordinates coordinates2 = coordinates;
            if ((i & 4) != 0) {
                map = bVar.c;
            }
            Map map2 = map;
            boolean z2 = (i & 8) != 0 ? bVar.d : true;
            if ((i & 16) != 0) {
                z = bVar.e;
            }
            boolean z3 = z;
            if ((i & 32) != 0) {
                th = bVar.f;
            }
            bVar.getClass();
            return new b(tj00Var2, coordinates2, map2, z2, z3, th);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && epx.f(this.f, bVar.f);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Coordinates coordinates = this.b;
            int b = qoy.b(qoy.b(v11.a((hashCode + (coordinates == null ? 0 : coordinates.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
            Throwable th = this.f;
            return b + (th != null ? th.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PointsMap(base=");
            sb.append(this.a);
            sb.append(", userLocation=");
            sb.append(this.b);
            sb.append(", points.size=");
            sb.append(this.c.size());
            sb.append(", isMapCreated=");
            sb.append(this.d);
            sb.append(", isLoading=");
            sb.append(this.e);
            sb.append(", error=");
            return oq.c(sb, this.f, ')');
        }

        public b(tj00 tj00Var, Coordinates coordinates, Map<DeliveryPointId, DeliveryPoint> map, boolean z, boolean z2, Throwable th) {
            this.a = tj00Var;
            this.b = coordinates;
            this.c = map;
            this.d = z;
            this.e = z2;
            this.f = th;
        }

        public /* synthetic */ b(Map map, int i) {
            this(new tj00(0), null, (i & 4) != 0 ? jgp.b : map, false, true, null);
        }
    }

    /* compiled from: DeliveryPointsMapState.kt */
    public static final class c {
        public final List<DeliveryPoint> a;
        public final int b;
        public final Throwable c;
        public final boolean d;

        public c() {
            this(0);
        }

        public static c a(c cVar, List list, int i, Throwable th, boolean z, int i2) {
            if ((i2 & 1) != 0) {
                list = cVar.a;
            }
            if ((i2 & 2) != 0) {
                i = cVar.b;
            }
            if ((i2 & 4) != 0) {
                th = cVar.c;
            }
            if ((i2 & 8) != 0) {
                z = cVar.d;
            }
            cVar.getClass();
            return new c(list, i, th, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && epx.f(this.c, cVar.c) && this.d == cVar.d;
        }

        public final int hashCode() {
            int a = shy.a(this.b, this.a.hashCode() * 31, 31);
            Throwable th = this.c;
            return Boolean.hashCode(this.d) + ((a + (th == null ? 0 : th.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VisiblePoints(points.size=");
            sb.append(this.a.size());
            sb.append(", radius=");
            sb.append(this.b);
            sb.append(", error=");
            sb.append(this.c);
            sb.append(", isLoading=");
            return defpackage.q0.a(sb, this.d, ')');
        }

        public c(List<DeliveryPoint> list, int i, Throwable th, boolean z) {
            this.a = list;
            this.b = i;
            this.c = th;
            this.d = z;
        }

        public c(int i) {
            this(EmptyList.b, 0, null, false);
        }
    }

    public hyl() {
        this(null, null, null, null, false, 255);
    }

    public static hyl a(hyl hylVar, b bVar, c cVar, DeliveryPoint deliveryPoint, boolean z, hgr hgrVar, boolean z2, int i) {
        a aVar = hylVar.b;
        DeliveryPointsMode deliveryPointsMode = hylVar.c;
        if ((i & 4) != 0) {
            bVar = hylVar.d;
        }
        b bVar2 = bVar;
        if ((i & 8) != 0) {
            cVar = hylVar.e;
        }
        c cVar2 = cVar;
        if ((i & 16) != 0) {
            deliveryPoint = hylVar.f;
        }
        DeliveryPoint deliveryPoint2 = deliveryPoint;
        if ((i & 32) != 0) {
            z = hylVar.g;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            hgrVar = hylVar.h;
        }
        hgr hgrVar2 = hgrVar;
        boolean z4 = (i & 128) != 0 ? hylVar.i : z2;
        hylVar.getClass();
        return new hyl(aVar, deliveryPointsMode, bVar2, cVar2, deliveryPoint2, z3, hgrVar2, z4);
    }

    public final boolean b() {
        return this.c == DeliveryPointsMode.SELECT_DELIVERY_POINT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyl)) {
            return false;
        }
        hyl hylVar = (hyl) obj;
        return epx.f(this.b, hylVar.b) && this.c == hylVar.c && epx.f(this.d, hylVar.d) && epx.f(this.e, hylVar.e) && epx.f(this.f, hylVar.f) && this.g == hylVar.g && epx.f(this.h, hylVar.h) && this.i == hylVar.i;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31;
        DeliveryPoint deliveryPoint = this.f;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + qoy.b((hashCode + (deliveryPoint == null ? 0 : deliveryPoint.hashCode())) * 31, 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryPointsMapState(params=");
        sb.append(this.b);
        sb.append(", deliveryPointMode=");
        sb.append(this.c);
        sb.append(", map=");
        sb.append(this.d);
        sb.append(", visiblePoints=");
        sb.append(this.e);
        sb.append(", expandedPoint=");
        sb.append(this.f);
        sb.append(", showExpandedPointOnNextMapMoved=");
        sb.append(this.g);
        sb.append(", filters=");
        sb.append(this.h);
        sb.append(", isLocationAvailable=");
        return defpackage.q0.a(sb, this.i, ')');
    }

    public hyl(a aVar, DeliveryPointsMode deliveryPointsMode, b bVar, c cVar, DeliveryPoint deliveryPoint, boolean z, hgr hgrVar, boolean z2) {
        this.b = aVar;
        this.c = deliveryPointsMode;
        this.d = bVar;
        this.e = cVar;
        this.f = deliveryPoint;
        this.g = z;
        this.h = hgrVar;
        this.i = z2;
    }

    public /* synthetic */ hyl(a aVar, DeliveryPointsMode deliveryPointsMode, b bVar, DeliveryPoint deliveryPoint, boolean z, int i) {
        this((i & 1) != 0 ? new a(0) : aVar, (i & 2) != 0 ? DeliveryPointsMode.SELECT_DELIVERY_POINT : deliveryPointsMode, (i & 4) != 0 ? new b(null, 63) : bVar, new c(0), (i & 16) != 0 ? null : deliveryPoint, (i & 32) != 0 ? false : z, new hgr(0), false);
    }
}
