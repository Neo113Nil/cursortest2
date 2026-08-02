package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunitiesClick;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeVideoProfileSwipeClickItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.epe;
import xsna.foe;

/* compiled from: ClipsOwnerSwipeFeature.kt */
/* loaded from: classes17.dex */
public final class goe extends wk50<fpe, voe, foe, epe> {
    public final soe f;
    public final urf g;
    public final String h;

    public goe(soe soeVar, urf urfVar, String str, ape apeVar, foe foeVar) {
        super(foeVar, apeVar);
        this.f = soeVar;
        this.g = urfVar;
        this.h = str;
    }

    @Override // xsna.wk50
    public final void N(voe voeVar, foe foeVar) {
        UserId userId;
        Integer num;
        voe voeVar2 = voeVar;
        foe foeVar2 = foeVar;
        boolean z = foeVar2 instanceof foe.c;
        soe soeVar = this.f;
        String str = this.h;
        if (z) {
            this.e.e();
            a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.y(soeVar.c(str), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).U(new ux0(new y90(13), 17)), null, new td5(1, this, goe.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 7), null, null, 13);
            T(epe.b.b);
            return;
        }
        boolean z2 = foeVar2 instanceof foe.e;
        urf urfVar = this.g;
        if (z2) {
            urfVar.j(((foe.e) foeVar2).b, str);
            return;
        }
        if (foeVar2 instanceof foe.a) {
            urfVar.m(str, new a7j<>(((foe.a) foeVar2).b));
            return;
        }
        if (!(foeVar2 instanceof foe.d)) {
            if (foeVar2 instanceof foe.f) {
                urfVar.r(str);
                return;
            } else {
                if (!(foeVar2 instanceof foe.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                soeVar.a(str);
                return;
            }
        }
        int i = ((foe.d) foeVar2).b;
        if (voeVar2.g && i == 1 && (userId = voeVar2.d) != null && (num = voeVar2.h) != null) {
            long j = userId.b;
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(j), null, null, null, 58, null), CommonCommunitiesStat$TypeCommunitiesClick.a.a(j, CommonCommunitiesStat$TypeCommunitiesClick.Source.COMMUNITY_HEADER_BLOCK, new CommonCommunitiesStat$TypeVideoProfileSwipeClickItem(CommonCommunitiesStat$TypeVideoProfileSwipeClickItem.Event.OPEN_COMMUNITY, num.intValue(), CommonCommunitiesStat$TypeVideoProfileSwipeClickItem.EventData.BY_SWIPE)), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
        }
        soeVar.d(str, i == 1);
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.f.a(this.h);
    }
}
