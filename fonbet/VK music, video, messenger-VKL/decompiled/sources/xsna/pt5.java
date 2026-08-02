package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonEcommStat$TypeAvitoIntegrationClickItem;
import com.vk.stat.scheme.CommonEcommStat$TypeAvitoIntegrationInfoClickItem;
import com.vk.stat.scheme.CommonEcommStat$TypeAvitoIntegrationInfoViewItem;
import com.vk.stat.scheme.CommonEcommStat$TypeAvitoIntegrationViewItem;
import com.vk.stat.scheme.CommonEcommStat$TypeEcommClickItem;
import com.vk.stat.scheme.CommonEcommStat$TypeEcommViewItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.hzp0;
import xsna.nt5;
import xsna.wt5;

/* compiled from: AvitoFeature.kt */
/* loaded from: classes18.dex */
public final class pt5 extends wk50<au5, zt5, nt5, wt5> {
    public final UserId f;
    public final Integer g;
    public final vt5 h;
    public final f4z i;

    public pt5(xt5 xt5Var, UserId userId, Integer num, vt5 vt5Var) {
        super(nt5.c.b, xt5Var);
        this.f = userId;
        this.g = num;
        this.h = vt5Var;
        this.i = new f4z();
    }

    @Override // xsna.wk50
    public final void N(zt5 zt5Var, nt5 nt5Var) {
        nt5 nt5Var2 = nt5Var;
        if (nt5Var2 instanceof nt5.c) {
            U();
            return;
        }
        if (nt5Var2 instanceof nt5.b) {
            this.i.b(((nt5.b) nt5Var2).b);
            return;
        }
        if (nt5Var2 instanceof nt5.d) {
            U();
            return;
        }
        if (!(nt5Var2 instanceof nt5.a)) {
            throw new NoWhenBranchMatchedException();
        }
        nt5.a aVar = (nt5.a) nt5Var2;
        boolean f = epx.f(aVar, nt5.a.C3413a.b);
        Integer num = this.g;
        UserId userId = this.f;
        if (!f) {
            if (!epx.f(aVar, nt5.a.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            new hzp0.q(new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, null, null, null, null, 62, null), new CommonEcommStat$TypeEcommViewItem(CommonEcommStat$TypeEcommViewItem.Type.TYPE_AVITO_INTEGRATION_VIEW, new CommonEcommStat$TypeAvitoIntegrationViewItem(CommonEcommStat$TypeAvitoIntegrationViewItem.Type.TYPE_AVITO_INTEGRATION_INFO_VIEW, userId != null ? fkq0.a(userId).b : UserId.d.b, null, new CommonEcommStat$TypeAvitoIntegrationInfoViewItem((num != null && num.intValue() == 0) ? CommonEcommStat$TypeAvitoIntegrationInfoViewItem.EventType.ACTIVE : (num != null && num.intValue() == 1) ? CommonEcommStat$TypeAvitoIntegrationInfoViewItem.EventType.BROKEN : (num != null && num.intValue() == 2) ? CommonEcommStat$TypeAvitoIntegrationInfoViewItem.EventType.PENDING : CommonEcommStat$TypeAvitoIntegrationInfoViewItem.EventType.BROKEN, null, null), 4, null), null, 4, null)).a();
        } else {
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new CommonEcommStat$TypeEcommClickItem(CommonEcommStat$TypeEcommClickItem.Type.TYPE_AVITO_INTEGRATION_CLICK, CommonEcommStat$TypeAvitoIntegrationClickItem.a.a(userId != null ? fkq0.a(userId).b : UserId.d.b, new CommonEcommStat$TypeAvitoIntegrationInfoClickItem((num != null && num.intValue() == 0) ? CommonEcommStat$TypeAvitoIntegrationInfoClickItem.EventType.ACTIVE : (num != null && num.intValue() == 1) ? CommonEcommStat$TypeAvitoIntegrationInfoClickItem.EventType.BROKEN : (num != null && num.intValue() == 2) ? CommonEcommStat$TypeAvitoIntegrationInfoClickItem.EventType.PENDING : CommonEcommStat$TypeAvitoIntegrationInfoClickItem.EventType.BROKEN, null, null)), null, null, 12, null), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
        }
    }

    public final void U() {
        T(wt5.c.b);
        UserId userId = this.f;
        if (userId == null) {
            return;
        }
        yt5 yt5Var = (yt5) this.h.b;
        this.e.b(rsg0.w0(yfb.x(yt5Var.a.r(fkq0.a(userId)))).l(new bl(new tm0(yt5Var, 10), 5)).subscribe(new l50(new vs(this, 8), 3), new tp0(new zx0(this, 8), 2)));
    }
}
