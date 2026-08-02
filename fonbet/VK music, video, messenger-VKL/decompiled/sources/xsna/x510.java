package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.market.dto.MarketGetItemsForReviewViewTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.marketitem.itemsforreview.domain.model.ItemsForReviewViewTypeModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.b610;
import xsna.c610;
import xsna.e510;

/* compiled from: MarketItemsForReviewFeature.kt */
/* loaded from: classes18.dex */
public final class x510 extends wk50<n610, g610, e510, c610> {
    public final UserId f;
    public final ItemsForReviewViewTypeModel g;
    public final Integer h;
    public final Long i;
    public final int j;
    public final u310 k;
    public final e610 l;
    public final z510 m;
    public final f4z n;
    public final io.reactivex.rxjava3.disposables.g o;
    public final f4z p;

    public x510() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x510(d610 d610Var, UserId userId, ItemsForReviewViewTypeModel itemsForReviewViewTypeModel, Integer num, Long l, int i, u310 u310Var, e610 e610Var) {
        super(e510.b.b, d610Var);
        z510 z510Var = new z510(e610Var, new t510());
        this.f = userId;
        this.g = itemsForReviewViewTypeModel;
        this.h = num;
        this.i = l;
        this.j = i;
        this.k = u310Var;
        this.l = e610Var;
        this.m = z510Var;
        this.n = new f4z();
        this.o = new io.reactivex.rxjava3.disposables.g();
        this.p = new f4z();
    }

    @Override // xsna.wk50
    public final void N(g610 g610Var, e510 e510Var) {
        g610 g610Var2 = g610Var;
        e510 e510Var2 = e510Var;
        if (e510Var2 instanceof e510.b) {
            T(new c610.b());
            ItemsForReviewViewTypeModel itemsForReviewViewTypeModel = ItemsForReviewViewTypeModel.ORDER;
            ItemsForReviewViewTypeModel itemsForReviewViewTypeModel2 = this.g;
            a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(this.m.a.a(MarketGetItemsForReviewViewTypeDto.valueOf(itemsForReviewViewTypeModel2.h().toUpperCase(Locale.ROOT)), this.f, this.h, this.i, itemsForReviewViewTypeModel2 == itemsForReviewViewTypeModel).l(new rj4(new y510(0), 20)), io.reactivex.rxjava3.core.x.t(1L, TimeUnit.SECONDS), new sj4(new wni(6), 19)).l(new nz(new d410(this, 1), 25)), new bgy(this, 5), new lxz(this, 4), 1);
            this.k.e(this.j);
            return;
        }
        boolean z = e510Var2 instanceof e510.a;
        io.reactivex.rxjava3.disposables.g gVar = this.o;
        if (z) {
            e510.a aVar = (e510.a) e510Var2;
            if (aVar.d) {
                gVar.b(io.reactivex.rxjava3.core.q.B0(1L, TimeUnit.SECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new qz(new td0(23, g610Var2, this), 28)));
            }
            List<a610> list = g610Var2.d;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (a610 a610Var : list) {
                if (a610Var.c == aVar.b && !a610Var.g) {
                    boolean z2 = aVar.d;
                    a610Var = a610.a(a610Var, z2, z2 ? aVar.c : 0.0f, 63);
                }
                arrayList.add(a610Var);
            }
            T(new c610.d(arrayList));
            return;
        }
        if (e510Var2 instanceof e510.d) {
            U(g610Var2, ((e510.d) e510Var2).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (e510Var2 instanceof e510.e) {
            e510.e eVar = (e510.e) e510Var2;
            U(g610Var2, eVar.b, eVar.c);
        } else if (!(e510Var2 instanceof e510.f)) {
            if (!(e510Var2 instanceof e510.c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.n.b(b610.a.a);
        } else {
            int i = ((e510.f) e510Var2).b;
            if (i == g610Var2.c) {
                return;
            }
            gVar.b(null);
            T(new c610.e(i));
        }
    }

    public final void U(g610 g610Var, long j, float f) {
        List<a610> list = g610Var.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        UserId userId = null;
        for (a610 a610Var : list) {
            if (a610Var.c == j) {
                UserId userId2 = a610Var.a;
                a610Var = a610.a(a610Var, false, f, 127);
                userId = userId2;
            }
            arrayList.add(a610Var);
        }
        if (userId != null) {
            this.n.b(new b610.b(j, userId, Float.valueOf(f), Integer.valueOf(this.j), this.h, Integer.valueOf(g610Var.d.size()), Integer.valueOf(g610Var.c + 1)));
        }
        T(new c610.d(arrayList));
    }
}
