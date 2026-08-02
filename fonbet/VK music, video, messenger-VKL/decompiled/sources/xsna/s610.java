package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.good.linkedcontent.mvi2.MarketLinkedContentState;
import com.vk.ecomm.market.good.linkedcontent.mvi2.ui.MarketLinkedContentFragment;
import java.util.List;

/* compiled from: MarketLinkedContentBootstrapper.kt */
/* loaded from: classes18.dex */
public final class s610 implements vj50<MarketLinkedContentState, on50, s710, u610> {
    public final k6k a;
    public final gzs<MarketLinkedContentState> b;

    public s610(k6k k6kVar, gzs gzsVar) {
        this.a = k6kVar;
        this.b = gzsVar;
    }

    @Override // xsna.vj50
    public final MarketLinkedContentState a() {
        MarketLinkedContentState invoke = this.b.invoke();
        if (invoke != null) {
            return invoke;
        }
        MarketLinkedContentFragment.LinkedContentArguments linkedContentArguments = (MarketLinkedContentFragment.LinkedContentArguments) this.a.invoke();
        return new MarketLinkedContentState(linkedContentArguments != null ? linkedContentArguments.c : 0L, linkedContentArguments != null ? linkedContentArguments.b : UserId.d, false, false, null, null, null, 0, linkedContentArguments != null && linkedContentArguments.e, linkedContentArguments != null ? linkedContentArguments.d : null, 252, null);
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ u610 b() {
        return null;
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ List<s710> c(MarketLinkedContentState marketLinkedContentState) {
        return null;
    }
}
