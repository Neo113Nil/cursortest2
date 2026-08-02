package xsna;

/* compiled from: MarketAdsItemState.kt */
/* loaded from: classes17.dex */
public interface pq00 extends km50 {

    /* compiled from: MarketAdsItemState.kt */
    public static final class a implements pq00 {
        public final hr00 b;
        public final boolean c;
        public final cv d;
        public final ixp0 e;
        public final boolean f;
        public final wp50 g;

        public a(hr00 hr00Var, boolean z, cv cvVar, ixp0 ixp0Var, boolean z2, wp50 wp50Var) {
            this.b = hr00Var;
            this.c = z;
            this.d = cvVar;
            this.e = ixp0Var;
            this.f = z2;
            this.g = wp50Var;
        }

        public static a a(a aVar, hr00 hr00Var, boolean z, cv cvVar, ixp0 ixp0Var, boolean z2, int i) {
            if ((i & 1) != 0) {
                hr00Var = aVar.b;
            }
            hr00 hr00Var2 = hr00Var;
            if ((i & 2) != 0) {
                z = aVar.c;
            }
            boolean z3 = z;
            if ((i & 4) != 0) {
                cvVar = aVar.d;
            }
            cv cvVar2 = cvVar;
            if ((i & 8) != 0) {
                ixp0Var = aVar.e;
            }
            ixp0 ixp0Var2 = ixp0Var;
            if ((i & 16) != 0) {
                z2 = aVar.f;
            }
            boolean z4 = z2;
            return (hr00Var2.equals(aVar.b) && z3 == aVar.c && cvVar2.equals(aVar.d) && ixp0Var2.equals(aVar.e) && z4 == aVar.f) ? aVar : new a(hr00Var2, z3, cvVar2, ixp0Var2, z4, aVar.g);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            int b = qoy.b((this.e.hashCode() + ((this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c)) * 31)) * 31, 31, this.f);
            wp50 wp50Var = this.g;
            return b + (wp50Var == null ? 0 : wp50Var.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Bound(marketAdsState=");
            sb.append(this.b);
            sb.append(", descriptionExpanded=");
            sb.append(this.c);
            sb.append(", actionButtonState=");
            sb.append(this.d);
            sb.append(", uiVisibilityConfig=");
            sb.append(this.e);
            sb.append(", isMarketAdFocused=");
            sb.append(this.f);
            sb.append(", myTargetFacade=");
            return iq.c(sb, this.g, ')');
        }
    }

    /* compiled from: MarketAdsItemState.kt */
    public static final class b implements pq00 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -767412562;
        }

        public final String toString() {
            return "NotBound";
        }
    }
}
