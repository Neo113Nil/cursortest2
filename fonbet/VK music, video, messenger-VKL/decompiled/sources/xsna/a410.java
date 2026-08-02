package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.CreateMarketItemReviewArguments;
import com.vk.ecomm.reviews.api.model.MarketItemReviewsArguments;
import com.vk.ecomm.reviews.model.sort.ReviewsSort;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a7f0;
import xsna.l310;
import xsna.o410;
import xsna.p410;
import xsna.t310;

/* compiled from: MarketItemReviewsFeature.kt */
/* loaded from: classes18.dex */
public final class a410 extends wk50<y410, x410, l310, p410> {
    public final MarketItemReviewsArguments f;
    public final m410 g;
    public final u310 h;
    public final mzp0 i;
    public final b25 j;
    public final f4z k;
    public final f4z l;
    public final bpn0 m;
    public final io.reactivex.rxjava3.disposables.g n;

    /* compiled from: MarketItemReviewsFeature.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<p410, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(p410 p410Var) {
            ((a410) this.receiver).T(p410Var);
            return s3q0.a;
        }
    }

    public a410(MarketItemReviewsArguments marketItemReviewsArguments, m410 m410Var, u310 u310Var, r410 r410Var, mzp0 mzp0Var, b25 b25Var) {
        super(l310.b.b, r410Var);
        this.f = marketItemReviewsArguments;
        this.g = m410Var;
        this.h = u310Var;
        this.i = mzp0Var;
        this.j = b25Var;
        this.k = new f4z();
        this.l = new f4z();
        this.m = new bpn0(new pvh(this, 14));
        this.n = new io.reactivex.rxjava3.disposables.g();
    }

    @Override // xsna.wk50
    public final void N(x410 x410Var, l310 l310Var) {
        List<y2u0> list;
        final x410 x410Var2 = x410Var;
        l310 l310Var2 = l310Var;
        UserId userId = x410Var2.b;
        boolean z = x410Var2.s;
        Map<Integer, n210> map = x410Var2.k;
        boolean z2 = l310Var2 instanceof l310.e;
        p410.c cVar = p410.c.b;
        MarketItemReviewsArguments marketItemReviewsArguments = this.f;
        if (z2) {
            if (marketItemReviewsArguments == null) {
                return;
            }
            UserId userId2 = marketItemReviewsArguments.c;
            T(cVar);
            T(new p410.e(marketItemReviewsArguments.b, userId2));
            X(userId2, marketItemReviewsArguments.b, x410Var2.x, marketItemReviewsArguments.e);
            return;
        }
        boolean z3 = l310Var2 instanceof l310.b;
        m410 m410Var = this.g;
        if (z3) {
            if (marketItemReviewsArguments != null) {
                a7f0.a.e(this, ((gxh) m410Var.c.b).N0(fkq0.a(marketItemReviewsArguments.c)).U(new e05(new f57(26), 27)), null, new c2u(this, 9), new qcw(3), null, 9);
                return;
            }
            return;
        }
        r11 = null;
        ArrayList arrayList = null;
        if (l310Var2 instanceof l310.c) {
            int i = ((l310.c) l310Var2).b;
            n210 n210Var = map.get(Integer.valueOf(i));
            if (n210Var != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put(Integer.valueOf(i), n210.a(n210Var, !n210Var.i, false, null, 130815));
                map = linkedHashMap;
            }
            T(new p410.j(map));
            return;
        }
        if (l310Var2 instanceof l310.o) {
            if (z || x410Var2.r) {
                return;
            }
            this.n.b(null);
            T(p410.g.b);
            X(x410Var2.b, x410Var2.c, x410Var2.x, marketItemReviewsArguments != null ? marketItemReviewsArguments.e : null);
            return;
        }
        if (l310Var2 instanceof l310.p) {
            X(userId, x410Var2.c, x410Var2.x, marketItemReviewsArguments != null ? marketItemReviewsArguments.e : null);
            return;
        }
        if (l310Var2 instanceof l310.s) {
            T(cVar);
            X(x410Var2.b, x410Var2.c, x410Var2.x, marketItemReviewsArguments != null ? marketItemReviewsArguments.e : null);
            return;
        }
        if (l310Var2 instanceof l310.f) {
            if (x410Var2.t || map.size() % 30 != 0) {
                return;
            }
            Integer num = x410Var2.z;
            if ((num == null || num.intValue() > 0) && x410Var2.w == null && !z) {
                T(p410.f.b.b);
                W(x410Var2, x410Var2.y, x410Var2.x, new xpt(5), new k0j(this, 25));
                return;
            }
            return;
        }
        if (l310Var2 instanceof l310.l) {
            T(p410.f.b.b);
            W(x410Var2, x410Var2.y, x410Var2.x, new xpt(5), new k0j(this, 25));
            return;
        }
        boolean z4 = l310Var2 instanceof l310.a;
        u310 u310Var = this.h;
        f4z f4zVar = this.k;
        if (z4) {
            u310Var.j(Integer.valueOf(x410Var2.f), x410Var2.j);
            f4zVar.b(new o410.c(new CreateMarketItemReviewArguments(x410Var2.c, x410Var2.b, null, null, null, null, null, null, 252, null)));
            return;
        }
        if (l310Var2 instanceof l310.g.d) {
            f4zVar.b(new o410.j(((l310.g.d) l310Var2).b));
            return;
        }
        boolean z5 = l310Var2 instanceof l310.i;
        f4z f4zVar2 = this.l;
        if (z5) {
            f4zVar2.b(new t310.a(((l310.i) l310Var2).b));
            f4zVar2.b(new t310.e(tq.h(tlo0.Companion, R.string.text_copied)));
            return;
        }
        if (l310Var2 instanceof l310.g.c) {
            f4zVar.b(new o410.h(((l310.g.c) l310Var2).b));
            return;
        }
        if (l310Var2 instanceof l310.g.b) {
            l310.g.b bVar = (l310.g.b) l310Var2;
            int i2 = bVar.c;
            int i3 = bVar.b;
            n210 n210Var2 = map.get(Integer.valueOf(i2));
            if (n210Var2 != null && (list = n210Var2.j) != null) {
                List<y2u0> list2 = list;
                arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Image(((y2u0) it.next()).b));
                }
            }
            if (arrayList == null || ((Image) j5g.b0(i3, arrayList)) == null) {
                return;
            }
            f4zVar.b(new o410.f(arrayList, i3));
            return;
        }
        if (l310Var2 instanceof l310.h) {
            l310.h hVar = (l310.h) l310Var2;
            f4zVar.b(new o410.e(hVar.b, new UserId(hVar.c)));
            return;
        }
        if (l310Var2 instanceof l310.k) {
            l310.k kVar = (l310.k) l310Var2;
            f4zVar.b(new o410.c(new CreateMarketItemReviewArguments(kVar.c, userId, null, null, null, null, null, Integer.valueOf(kVar.b), Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null)));
            return;
        }
        if (l310Var2 instanceof l310.g.a) {
            f4zVar.b(new o410.b(x410Var2.n));
            return;
        }
        if (l310Var2 instanceof l310.j) {
            l310.j jVar = (l310.j) l310Var2;
            int i4 = jVar.b;
            long j = jVar.c;
            Y(true, x410Var2);
            a7f0.a.f(this, m410Var.a.c(userId, j, i4), new xxa(this, x410Var2, i4, 1), new g86(11, this, x410Var2), 1);
            return;
        }
        if (l310Var2 instanceof l310.m) {
            l310.m mVar = (l310.m) l310Var2;
            final int i5 = mVar.b;
            long j2 = mVar.c;
            Y(true, x410Var2);
            a7f0.a.f(this, m410Var.a.d(userId, j2, i5), new izs() { // from class: xsna.w310
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    Map<Integer, n210> map2 = x410Var2.k;
                    int i6 = i5;
                    n210 n210Var3 = map2.get(Integer.valueOf(i6));
                    if (n210Var3 != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
                        linkedHashMap2.put(Integer.valueOf(i6), n210.a(n210Var3, false, false, null, 126975));
                        map2 = linkedHashMap2;
                    }
                    a410.this.T(new p410.j(map2));
                    return s3q0.a;
                }
            }, new np5(13, this, x410Var2), 1);
            return;
        }
        if (l310Var2 instanceof l310.n) {
            ReviewsSort reviewsSort = ((l310.n) l310Var2).b;
            Y(true, x410Var2);
            T(new p410.k(reviewsSort));
            W(x410Var2, 0, reviewsSort, new oqu(5), new u3u(this, 7));
            return;
        }
        if (!(l310Var2 instanceof l310.d)) {
            if (l310Var2 instanceof l310.q) {
                ((mj50) this.m.getValue()).a(x410Var2, l310Var2);
                return;
            } else {
                if (!(l310Var2 instanceof l310.r)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = ((l310.r) l310Var2).b;
                u310Var.g(str, marketItemReviewsArguments != null ? marketItemReviewsArguments.d : null);
                f4zVar.b(new o410.i(str));
                return;
            }
        }
        ReviewsSort reviewsSort2 = ReviewsSort.NEWEST_SORT;
        ReviewsSort reviewsSort3 = x410Var2.x;
        efk0 efk0Var = new efk0(reviewsSort2, R.string.community_reviews_filter_item_newest, reviewsSort2 == reviewsSort3);
        ReviewsSort reviewsSort4 = ReviewsSort.WITH_PHOTOS_SORT;
        efk0 efk0Var2 = new efk0(reviewsSort4, R.string.community_reviews_filter_item_with_photos, reviewsSort4 == reviewsSort3);
        ReviewsSort reviewsSort5 = ReviewsSort.HIGHEST_MARKS_SORT;
        efk0 efk0Var3 = new efk0(reviewsSort5, R.string.community_reviews_filter_item_highest_mark, reviewsSort5 == reviewsSort3);
        ReviewsSort reviewsSort6 = ReviewsSort.LOWEST_MARKS_SORT;
        f4zVar2.b(new t310.b(e43.l(efk0Var, efk0Var2, efk0Var3, new efk0(reviewsSort6, R.string.community_reviews_filter_item_lowest_mark, reviewsSort6 == reviewsSort3))));
    }

    public final wj50<o410> U() {
        return this.k;
    }

    public final wj50<t310> V() {
        return this.l;
    }

    public final void W(x410 x410Var, int i, ReviewsSort reviewsSort, izs<? super n410, ? extends p410> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        UserId userId = x410Var.b;
        long j = x410Var.c;
        String h = reviewsSort.h();
        MarketItemReviewsArguments marketItemReviewsArguments = this.f;
        this.n.b(a7f0.a.f(this, this.g.a(i, j, userId, h, marketItemReviewsArguments != null ? marketItemReviewsArguments.e : null).l(new x310(new op3(izsVar, 4), 0)), new a(1, this, a410.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), new y310(izsVar2, 0), 1));
    }

    public final void X(UserId userId, long j, ReviewsSort reviewsSort, String str) {
        mzp0 mzp0Var = this.i;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        String h = reviewsSort.h();
        m410 m410Var = this.g;
        a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(m410Var.a(0, j, userId, h, str), m410Var.a.a(userId.b, j), new yzt(new z9g(6), 5)).l(new bl(new es00(this, 1), 26)), new z310(j, this, userId, 0), new b5h(this, 28), 1);
    }

    public final void Y(boolean z, x410 x410Var) {
        if (z && !x410Var.u) {
            T(new p410.i(true));
        } else {
            if (z || !x410Var.u) {
                return;
            }
            T(new p410.i(false));
        }
    }
}
