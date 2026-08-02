package xsna;

import xsna.kyl;

/* compiled from: DeliveryPointsMapRender.kt */
/* loaded from: classes18.dex */
public interface xxl extends fm50<hyl> {

    /* compiled from: DeliveryPointsMapRender.kt */
    public static final class a implements xxl {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1262066680;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: DeliveryPointsMapRender.kt */
    public static final class b implements xxl {
        public final yzt0<mw9> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("Error(error="), this.a, ')');
        }
    }

    /* compiled from: DeliveryPointsMapRender.kt */
    public static final class c implements xxl {
        public final yzt0<kyl.c> a;
        public final yzt0<kyl.e> b;
        public final yzt0<kyl.a> c;
        public final yzt0<kyl.d> d;
        public final yzt0<kyl.f> e;

        public c(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Main(mapViewState=");
            sb.append(this.a);
            sb.append(", sheetViewState=");
            sb.append(this.b);
            sb.append(", clusterItems=");
            sb.append(this.c);
            sb.append(", selectedMarker=");
            sb.append(this.d);
            sb.append(", userLocationMarker=");
            return tr.c(sb, this.e, ')');
        }
    }

    /* compiled from: DeliveryPointsMapRender.kt */
    public static final class d implements xxl {
        public final yzt0<Boolean> a;

        public d(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("Toolbar(isSearchEnabled="), this.a, ')');
        }
    }
}
