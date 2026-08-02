package xsna;

import java.util.ArrayList;
import xsna.pq00;

/* compiled from: MarketAdsItemViewState.kt */
/* loaded from: classes17.dex */
public final class dr00 implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: MarketAdsItemViewState.kt */
    public static final class a implements fm50<pq00.a> {
        public final yzt0<b> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("ContentRender(contentViewState="), this.a, ')');
        }
    }

    /* compiled from: MarketAdsItemViewState.kt */
    public static final class b {
        public final String a;
        public final ArrayList b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public b(String str, ArrayList arrayList, int i, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = str;
            this.b = arrayList;
            this.c = i;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b.equals(bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g;
        }

        public final int hashCode() {
            String str = this.a;
            return Boolean.hashCode(this.g) + qoy.b(qoy.b(qoy.b(shy.a(this.c, qr.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContentViewState(backgroundUrl=");
            sb.append(this.a);
            sb.append(", cards=");
            sb.append(this.b);
            sb.append(", topEdge=");
            sb.append(this.c);
            sb.append(", cardsClickable=");
            sb.append(this.d);
            sb.append(", itemVisible=");
            sb.append(this.e);
            sb.append(", hasDisclaimer=");
            sb.append(this.f);
            sb.append(", actionButtonVisible=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: MarketAdsItemViewState.kt */
    public static final class c implements fm50<pq00.a> {
        public final yzt0<mq00> a;

        public c(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("OverlayRender(overlayState="), this.a, ')');
        }
    }

    /* compiled from: MarketAdsItemViewState.kt */
    public static final class d implements mq00 {
        public final r390 a;
        public final uf00 b;

        public d(r390 r390Var, uf00 uf00Var) {
            this.a = r390Var;
            this.b = uf00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OverlayViewState(overlayVisibilityState=" + this.a + ", mainOverlayState=" + this.b + ')';
        }
    }

    public dr00(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
