package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.ecomm.market.attached.TaggedItemsBottomSheet;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.a1o0;
import xsna.a7f0;
import xsna.g1o0;
import xsna.h1o0;
import xsna.hg1;

/* compiled from: TaggedItemsFeature.kt */
/* loaded from: classes18.dex */
public final class f1o0 extends wk50<z0o0, m1o0, a1o0, h1o0> {
    public final TaggedItemsBottomSheet.FragmentArgs f;
    public final fy00 g;
    public final l1o0 h;

    public f1o0(TaggedItemsBottomSheet.FragmentArgs fragmentArgs, fy00 fy00Var) {
        super(null, new j1o0(new m1o0(0)));
        this.f = fragmentArgs;
        this.g = fy00Var;
        this.h = new l1o0(fragmentArgs.b, fragmentArgs.c, fragmentArgs.d);
    }

    @Override // xsna.wk50
    public final void N(m1o0 m1o0Var, a1o0 a1o0Var) {
        m1o0 m1o0Var2 = m1o0Var;
        a1o0 a1o0Var2 = a1o0Var;
        g1o0 g1o0Var = m1o0Var2.e;
        boolean z = a1o0Var2 instanceof a1o0.b;
        l1o0 l1o0Var = this.h;
        if (z) {
            T(h1o0.b.c.b);
            a7f0.a.f(this, l1o0Var.a(0, g1o0Var.b).l(new uxb0(new kul0(2), 11)), new whe(1, this, f1o0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 14), new wug0(this, 17), 1);
            a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.i0(this.g.a(), new hg1.b4()).U(new hg1.a4()).U(new qu50(new w9l0(4), 14)), null, new tw4(1, this, f1o0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 14), null, null, 13);
            return;
        }
        if (a1o0Var2 instanceof a1o0.c) {
            g1o0.a aVar = g1o0Var.c;
            int i = g1o0Var.b;
            int i2 = g1o0Var.a;
            if (epx.f(aVar, g1o0.a.b.a) && i2 < i && epx.f(g1o0Var.d, g1o0.b.a.a)) {
                T(h1o0.c.C2968c.b);
                a7f0.a.f(this, l1o0Var.a(i2, i).l(new ugm0(new mcj0(m1o0Var2, 11), 2)), new uw4(1, this, f1o0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 14), new ksg0(this, 11), 1);
                return;
            }
            return;
        }
        if (!(a1o0Var2 instanceof a1o0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        a1o0.a aVar2 = (a1o0.a) a1o0Var2;
        if (aVar2 instanceof a1o0.a.C2517a) {
            a1o0.a.C2517a c2517a = (a1o0.a.C2517a) aVar2;
            Long valueOf = Long.valueOf(c2517a.b);
            Long valueOf2 = Long.valueOf(c2517a.c.b);
            Integer valueOf3 = Integer.valueOf(c2517a.d);
            TaggedItemsBottomSheet.FragmentArgs fragmentArgs = this.f;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = fragmentArgs.k;
            if (commonMarketStat$TypeRefSource == null) {
                commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.PHOTO;
            }
            mt00.d(valueOf, valueOf2, valueOf3, commonMarketStat$TypeRefSource, null, null, null, null, null, null, null, fragmentArgs.h, fragmentArgs.j, fragmentArgs.i, 4080);
            return;
        }
        if (!(aVar2 instanceof a1o0.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a1o0.a.b bVar = (a1o0.a.b) aVar2;
        long j = bVar.b;
        long j2 = bVar.c.b;
        String str = bVar.e;
        int i3 = bVar.d;
        MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.EntryPoint entryPoint = MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.EntryPoint.MODAL_CARD;
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(j), Long.valueOf(j2), null, str, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick(entryPoint, Integer.valueOf(i3 + 1), null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
