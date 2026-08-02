package xsna;

import com.vk.api.generated.market.dto.MarketGetCommunityShopConditionsFieldsDto;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$OpenScreenEvent;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.ce10;
import xsna.ge10;
import xsna.je10;

/* compiled from: MarketShopConditionsFeature.kt */
/* loaded from: classes18.dex */
public final class he10 extends wk50<ve10, oe10, ce10, je10> {
    public final UserId f;
    public final Long g;
    public final ie10 h;
    public final le10 i;

    public he10(ke10 ke10Var, UserId userId, Long l, ie10 ie10Var, le10 le10Var) {
        super(ce10.b.b, ke10Var);
        this.f = userId;
        this.g = l;
        this.h = ie10Var;
        this.i = le10Var;
    }

    @Override // xsna.wk50
    public final void N(oe10 oe10Var, ce10 ce10Var) {
        ce10 ce10Var2 = ce10Var;
        boolean z = ce10Var2 instanceof ce10.b;
        ArrayList arrayList = null;
        UserId userId = this.f;
        if (z || (ce10Var2 instanceof ce10.d)) {
            T(je10.c.b);
            le10 le10Var = this.i;
            yd10 yd10Var = le10Var.a;
            UserId a = fkq0.a(userId);
            Long l = this.g;
            Integer valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
            List singletonList = Collections.singletonList(MarketGetCommunityShopConditionsFieldsDto.BUTTONS);
            yd10Var.getClass();
            tfx tfxVar = new tfx("market.getCommunityShopConditions", new fr(22), new mr(23));
            tfx.n(tfxVar, "community_id", a, 1L, 0L, 8);
            if (valueOf != null) {
                tfx.l(tfxVar, "item_id", valueOf.intValue(), 0, 0, 8);
            }
            if (singletonList != null) {
                List list = singletonList;
                arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MarketGetCommunityShopConditionsFieldsDto) it.next()).i());
                }
            }
            if (arrayList != null) {
                tfxVar.i("fields", arrayList);
            }
            int i = 0;
            this.e.b(rsg0.w0(yfb.x(tfxVar)).l(new bl(new es00(le10Var, 2), 27)).subscribe(new np3(new ud8(1, this, he10.class, "onSuccess", "onSuccess(Lcom/vk/ecomm/shop_conditions/impl/ui/dovdialog/data/model/ShopConditionParams;)V", i, 8), 29), new zyu(new wd8(1, this, he10.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", i, 10), 3)));
            return;
        }
        if (ce10Var2 instanceof ce10.a) {
            ce10.a aVar = (ce10.a) ce10Var2;
            if (!epx.f(aVar, ce10.a.b.b)) {
                if (!epx.f(aVar, ce10.a.C2660a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, null, null, null, null, 62, null), MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(userId.b, null, null, new MobileOfficialAppsGroupsStat$OpenScreenEvent(MobileOfficialAppsGroupsStat$OpenScreenEvent.OpenScreenEventType.OPEN_MESSAGES, null, 2, null), 30), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
            return;
        }
        if (!(ce10Var2 instanceof ce10.c)) {
            throw new NoWhenBranchMatchedException();
        }
        ce10.c cVar = (ce10.c) ce10Var2;
        ie10 ie10Var = this.h;
        izs<ge10, s3q0> izsVar = ie10Var.c;
        if (cVar instanceof ce10.c.a) {
            izsVar.invoke(new ge10.b(new kg(16, ie10Var, ((ce10.c.a) cVar).b)));
        } else {
            if (!(cVar instanceof ce10.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            izsVar.invoke(ge10.a.a);
        }
    }
}
