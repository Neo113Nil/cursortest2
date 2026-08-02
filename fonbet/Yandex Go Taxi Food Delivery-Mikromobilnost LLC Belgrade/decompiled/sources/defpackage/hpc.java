package defpackage;

import com.yandex.go.flex.common.actions.create_order.SendOrderDraftAction;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.intercity.RawOrderdraftInfo;
import com.yandex.go.zone.dto.response.SearchScreen;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class hpc implements dw {
    public final dqe0 a;
    public final kpi0 b;
    public final ra00 c;
    public final yvf0 w;

    public hpc(dqe0 dqe0Var, kpi0 kpi0Var, ra00 ra00Var, yvf0 yvf0Var) {
        this.a = dqe0Var;
        this.b = kpi0Var;
        this.c = ra00Var;
        this.w = yvf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    @Override // defpackage.dw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handle(kr krVar, n6u n6uVar) {
        SearchScreen.DisplaySettings.PreferredOrderDetailsType preferredOrderDetailsType;
        SendOrderDraftAction sendOrderDraftAction = (SendOrderDraftAction) krVar;
        c cVar = sendOrderDraftAction.a;
        String str = sendOrderDraftAction.b;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3138974) {
                if (hashCode != 3165170) {
                    if (hashCode == 1557721666 && str.equals("details")) {
                        preferredOrderDetailsType = SearchScreen.DisplaySettings.PreferredOrderDetailsType.DETAILS;
                    }
                } else if (str.equals("game")) {
                    preferredOrderDetailsType = SearchScreen.DisplaySettings.PreferredOrderDetailsType.GAME;
                }
            } else if (str.equals("feed")) {
                preferredOrderDetailsType = SearchScreen.DisplaySettings.PreferredOrderDetailsType.FEED;
            }
            if (cVar != null) {
                jst.e.q("orderdraft_body is mandatory in SendOrderDraftAction");
                return;
            }
            RawOrderdraftInfo rawOrderdraftInfo = new RawOrderdraftInfo(cVar);
            String str2 = sendOrderDraftAction.c;
            if (str2 == null) {
                str2 = "";
            }
            this.b.b();
            Preorder preorder = this.a.a;
            preorder.I = rawOrderdraftInfo;
            if (preferredOrderDetailsType == SearchScreen.DisplaySettings.PreferredOrderDetailsType.DETAILS) {
                preorder.h0 = true;
            }
            this.c.b((m950) this.w.get(), new b5y0(str2, preorder));
            return;
        }
        preferredOrderDetailsType = null;
        if (cVar != null) {
        }
    }
}
