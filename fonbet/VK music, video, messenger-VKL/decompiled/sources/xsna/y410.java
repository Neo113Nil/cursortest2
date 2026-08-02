package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.IntegrationInfo;
import com.vk.dto.market.MarketItemType;
import java.util.List;

/* compiled from: MarketItemReviewsViewState.kt */
/* loaded from: classes18.dex */
public final class y410 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: MarketItemReviewsViewState.kt */
    public static final class a implements fm50<x410> {
        public final yzt0<Boolean> a;
        public final yzt0<k7p0> b;
        public final yzt0<q48> c;
        public final yzt0<List<hfz>> d;
        public final yzt0<Boolean> e;
        public final yzt0<Boolean> f;
        public final yzt0<Boolean> g;
        public final yzt0<f4g0> h;
        public final yzt0<o4g0> i;
        public final yzt0<Boolean> j;
        public final yzt0<Boolean> k;
        public final yzt0<MarketItemType> l;
        public final yzt0<IntegrationInfo> m;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10, h0u0 h0u0Var11, h0u0 h0u0Var12, h0u0 h0u0Var13) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
            this.h = h0u0Var8;
            this.i = h0u0Var9;
            this.j = h0u0Var10;
            this.k = h0u0Var11;
            this.l = h0u0Var12;
            this.m = h0u0Var13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m);
        }

        public final int hashCode() {
            return this.m.hashCode() + sr.a(this.l, sr.a(this.k, sr.a(this.j, sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(isActionButtonVisible=");
            sb.append(this.a);
            sb.append(", topBarData=");
            sb.append(this.b);
            sb.append(", bottomButton=");
            sb.append(this.c);
            sb.append(", items=");
            sb.append(this.d);
            sb.append(", isRefreshing=");
            sb.append(this.e);
            sb.append(", isPaginationError=");
            sb.append(this.f);
            sb.append(", isCommentBarVisible=");
            sb.append(this.g);
            sb.append(", replyBarFrom=");
            sb.append(this.h);
            sb.append(", replyBarToName=");
            sb.append(this.i);
            sb.append(", isReplyBarFromVisible=");
            sb.append(this.j);
            sb.append(", isScreenSpinnerVisible=");
            sb.append(this.k);
            sb.append(", marketItemType=");
            sb.append(this.l);
            sb.append(", integrationInfo=");
            return tr.c(sb, this.m, ')');
        }
    }

    /* compiled from: MarketItemReviewsViewState.kt */
    public static final class b implements fm50<x410> {
        public final yzt0<tlo0> a;
        public final yzt0<Boolean> b;
        public final yzt0<Boolean> c;
        public final yzt0<tlo0> d;
        public final yzt0<Boolean> e;
        public final yzt0<k7p0> f;
        public final yzt0<Image> g;
        public final yzt0<String> h;
        public final yzt0<String> i;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
            this.h = h0u0Var8;
            this.i = h0u0Var9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Empty(title=");
            sb.append(this.a);
            sb.append(", isCreateButtonShow=");
            sb.append(this.b);
            sb.append(", isDescriptionShow=");
            sb.append(this.c);
            sb.append(", description=");
            sb.append(this.d);
            sb.append(", isFaqShow=");
            sb.append(this.e);
            sb.append(", topBarData=");
            sb.append(this.f);
            sb.append(", productImageMain=");
            sb.append(this.g);
            sb.append(", productNameMain=");
            sb.append(this.h);
            sb.append(", productNameGroup=");
            return tr.c(sb, this.i, ')');
        }
    }

    /* compiled from: MarketItemReviewsViewState.kt */
    public static final class c implements fm50<x410> {
        public static final c a = new c();
    }

    /* compiled from: MarketItemReviewsViewState.kt */
    public static final class d implements fm50<x410> {
        public static final d a = new d();
    }

    public y410(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }

    public final n0u0<a> a() {
        return this.a;
    }

    public final n0u0<b> b() {
        return this.c;
    }

    public final n0u0<c> c() {
        return this.d;
    }

    public final n0u0<d> d() {
        return this.b;
    }
}
