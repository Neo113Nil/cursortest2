package xsna;

import android.graphics.Bitmap;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointsSheetState;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: DeliveryPointsMapViewState.kt */
/* loaded from: classes18.dex */
public final class kyl implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: DeliveryPointsMapViewState.kt */
    public static final class a {
        public final List<lwl> a;

        public a() {
            this(0);
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
            return ms9.a(')', new StringBuilder("ClusterItems(items="), this.a);
        }

        public a(List<lwl> list) {
            this.a = list;
        }

        public a(int i) {
            this(EmptyList.b);
        }
    }

    /* compiled from: DeliveryPointsMapViewState.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;

        public b() {
            this(false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FilterButtonState(isFilterSelected=");
            sb.append(this.a);
            sb.append(", showFilterButton=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* compiled from: DeliveryPointsMapViewState.kt */
    public static final class c {
        public final gk9 a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final b e;

        public c() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && epx.f(this.e, cVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            return "Map(cameraPosition=" + this.a + ", isLoading=" + this.b + ", isMapCreated=" + this.c + ", isUserLocation=" + this.d + ", filterButton=" + this.e + ')';
        }

        public c(gk9 gk9Var, boolean z, boolean z2, boolean z3, b bVar) {
            this.a = gk9Var;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = bVar;
        }

        public /* synthetic */ c(int i) {
            this(new gk9(0), true, false, false, new b(false, false));
        }
    }

    /* compiled from: DeliveryPointsMapViewState.kt */
    public static final class d {
        public final boolean a;
        public final Bitmap b;
        public final Coordinates c;

        public d() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            Bitmap bitmap = this.b;
            return this.c.hashCode() + ((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31);
        }

        public final String toString() {
            return "SelectedDeliveryPointMarker(isSelected=" + this.a + ", bitmap=" + this.b + ", coordinates=" + this.c + ')';
        }

        public d(int i) {
            this(false, null, Coordinates.d);
        }

        public d(boolean z, Bitmap bitmap, Coordinates coordinates) {
            this.a = z;
            this.b = bitmap;
            this.c = coordinates;
        }
    }

    /* compiled from: DeliveryPointsMapViewState.kt */
    public static abstract class e {
        public final DeliveryPointsSheetState a;
        public final boolean b;

        /* compiled from: DeliveryPointsMapViewState.kt */
        public static final class a extends e {
            public static final a c = new a(DeliveryPointsSheetState.Preview, false);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2004904214;
            }

            public final String toString() {
                return "EmptyPointsList";
            }
        }

        /* compiled from: DeliveryPointsMapViewState.kt */
        public static final class b extends e {
            public final pmb0 c;

            public b(pmb0 pmb0Var) {
                super(DeliveryPointsSheetState.Preview, false);
                this.c = pmb0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.c, ((b) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return "Error(errorModel=" + this.c + ')';
            }
        }

        /* compiled from: DeliveryPointsMapViewState.kt */
        public static final class c extends e {
            public static final c c = new c(DeliveryPointsSheetState.Hidden, false);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 578798734;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: DeliveryPointsMapViewState.kt */
        public static final class d extends e {
            public final boolean c;
            public final DeliveryPoint d;
            public final DeliveryPoint.WeekDay e;

            public d(boolean z, DeliveryPoint deliveryPoint, DeliveryPoint.WeekDay weekDay) {
                super(DeliveryPointsSheetState.Half, true);
                this.c = z;
                this.d = deliveryPoint;
                this.e = weekDay;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.c == dVar.c && epx.f(this.d, dVar.d) && this.e == dVar.e;
            }

            public final int hashCode() {
                return this.e.hashCode() + ((this.d.hashCode() + (Boolean.hashCode(this.c) * 31)) * 31);
            }

            public final String toString() {
                return "PointDetails(isSelectDeliveryPointMode=" + this.c + ", expandedPoint=" + this.d + ", currentWeekDay=" + this.e + ')';
            }
        }

        /* compiled from: DeliveryPointsMapViewState.kt */
        /* renamed from: xsna.kyl$e$e, reason: collision with other inner class name */
        public static final class C3216e extends e {
            public final List<i5u0> c;

            public C3216e(List<i5u0> list) {
                super(DeliveryPointsSheetState.Preview, true);
                this.c = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3216e) && epx.f(this.c, ((C3216e) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("PointList(points="), this.c);
            }
        }

        /* compiled from: DeliveryPointsMapViewState.kt */
        public static final class f extends e {
            public static final f c = new f(DeliveryPointsSheetState.Preview, false);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 707557237;
            }

            public final String toString() {
                return "PointsLoading";
            }
        }

        public e(DeliveryPointsSheetState deliveryPointsSheetState, boolean z) {
            this.a = deliveryPointsSheetState;
            this.b = z;
        }
    }

    /* compiled from: DeliveryPointsMapViewState.kt */
    public static final class f {
        public final Coordinates a;
        public final Bitmap b;

        public f(Coordinates coordinates, Bitmap bitmap) {
            this.a = coordinates;
            this.b = bitmap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UserLocation(coordinates=");
            sb.append(this.a);
            sb.append(", bitmap=");
            return qr.c(sb, this.b, ')');
        }
    }

    public kyl(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyl)) {
            return false;
        }
        kyl kylVar = (kyl) obj;
        return this.a.equals(kylVar.a) && this.b.equals(kylVar.b) && this.c.equals(kylVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryPointsMapViewState(error=");
        sb.append(this.a);
        sb.append(", main=");
        sb.append(this.b);
        sb.append(", toolbar=");
        return j8.b(sb, this.c, ')');
    }
}
