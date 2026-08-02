package xsna;

import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import java.util.ArrayList;
import java.util.List;
import xsna.wfq0;

/* compiled from: StorefrontInteractorImpl.kt */
/* loaded from: classes18.dex */
public final class lml0 {
    public final UserId a;
    public final qml0 b;
    public final ull0 c;
    public final bpn0 d = new bpn0(new tbe0(this, 13));
    public final bpn0 e = new bpn0(new gc(29));

    public lml0(UserId userId, qml0 qml0Var, ull0 ull0Var) {
        this.a = userId;
        this.b = qml0Var;
        this.c = ull0Var;
    }

    public final void a(ArrayList arrayList, HintId hintId, boolean z, boolean z2) {
        Hint b;
        if (z2 && (b = ((wvw) this.c.h.getValue()).b().b(hintId.getId())) != null) {
            arrayList.add(new w4p0(hintId, b.c, b.d, z));
        }
    }

    public final b5u b(MarketMarketItemDto marketMarketItemDto) {
        Good c = b210.c(marketMarketItemDto);
        c530 b = e530.b(c, null);
        ull0 ull0Var = this.c;
        ModerationRestriction a = ((q530) ull0Var.d.getValue()).a(b);
        kc10 a2 = ull0Var.a();
        ec10 ec10Var = new ec10(c);
        boolean h = a.h();
        wfq0.e eVar = wfq0.e.a;
        a2.getClass();
        return new b5u(c, b, kc10.a(ec10Var, h, eVar), a);
    }

    public final ArrayList c(List list, boolean z, MarketFavable marketFavable) {
        List<b5u> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (b5u b5uVar : list2) {
            long j = marketFavable.b;
            Good good = b5uVar.a;
            if (j == good.b) {
                good.J = z;
                kc10 a = this.c.a();
                ec10 ec10Var = new ec10(b5uVar.a);
                boolean z2 = b5uVar.c.h;
                wfq0.e eVar = wfq0.e.a;
                a.getClass();
                b5uVar = b5u.a(b5uVar, good, kc10.a(ec10Var, z2, eVar), null, 10);
            }
            arrayList.add(b5uVar);
        }
        return arrayList;
    }
}
