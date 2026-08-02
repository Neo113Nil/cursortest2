package xsna;

/* compiled from: PositionPointsState.kt */
/* loaded from: classes17.dex */
public final class qzb0 {
    public final a a;
    public final e b;
    public final c c;
    public final b d;
    public final d e;

    /* compiled from: PositionPointsState.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public a(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActionButtonPointsState(showTsReached=");
            sb.append(this.a);
            sb.append(", hideTsReached=");
            sb.append(this.b);
            sb.append(", activationTsReached=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: PositionPointsState.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public b(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BannerCompanionPointState(showBannerReached=");
            sb.append(this.a);
            sb.append(", loadDataReached=");
            sb.append(this.b);
            sb.append(", hasArts=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: PositionPointsState.kt */
    public static final class d {
        public final boolean a;
        public final boolean b;

        public d() {
            this(false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShopsMorePointState(showShopsMoreReached=");
            sb.append(this.a);
            sb.append(", shopsMorePreloadReached=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public d(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    public qzb0(a aVar, e eVar, c cVar, b bVar, d dVar) {
        this.a = aVar;
        this.b = eVar;
        this.c = cVar;
        this.d = bVar;
        this.e = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzb0)) {
            return false;
        }
        qzb0 qzb0Var = (qzb0) obj;
        return epx.f(this.a, qzb0Var.a) && epx.f(this.b, qzb0Var.b) && epx.f(this.c, qzb0Var.c) && epx.f(this.d, qzb0Var.d) && epx.f(this.e, qzb0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.a)) * 31);
    }

    public final String toString() {
        return "PositionPointsState(actionButtonPointsState=" + this.a + ", tooltipPointsState=" + this.b + ", itemsPointState=" + this.c + ", bannerCompanionPointState=" + this.d + ", shopsMorePointState=" + this.e + ')';
    }

    /* compiled from: PositionPointsState.kt */
    public static final class c {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ItemsPointState(showItemsReached="), this.a, ')');
        }

        public c() {
            this(false);
        }
    }

    /* compiled from: PositionPointsState.kt */
    public static final class e {
        public final boolean a;
        public final boolean b;

        public e(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TooltipPointsState(subscribeTipPositionReached=");
            sb.append(this.a);
            sb.append(", doubleTapTipPositionReached=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public e() {
            this(false, false);
        }
    }
}
