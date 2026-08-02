package defpackage;

import com.yandex.go.taxi.order.api.titles.OrderTitles$Alignment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.rate.c;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class h7i0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ h7i0(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        OrderStatusInfo.CashbackDetails cashbackDetails;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                ((g7i0) cVar.Dg()).renderCompleteButton((c5j) obj);
                break;
            case 1:
                xim ximVar = (xim) obj;
                ((g7i0) cVar.Dg()).renderDriverPhoneButton(ximVar);
                ((g7i0) cVar.Dg()).setFeedbackSectionBottomPadding(ximVar instanceof wim);
                break;
            case 2:
                ((g7i0) cVar.Dg()).setTitlesAlignment((OrderTitles$Alignment) obj);
                break;
            case 3:
                ((g7i0) cVar.Dg()).renderDriverSection((f6j) obj);
                break;
            case 4:
                ((g7i0) cVar.Dg()).renderSectionDetail((t0q0) obj);
                break;
            case 5:
                ((g7i0) cVar.Dg()).renderButtonsState((x4j) obj);
                break;
            case 6:
                ((g7i0) cVar.Dg()).renderInfoState((t6j) obj);
                break;
            case 7:
                ((g7i0) cVar.Dg()).renderPaymentState((v6j) obj);
                break;
            case 8:
                ((g7i0) cVar.Dg()).renderPromoPlaquesTopSection((List) obj, cVar.x);
                break;
            case 9:
                ((g7i0) cVar.Dg()).renderPromoPlaquesBottomSection((List) obj, cVar.x);
                break;
            case 10:
                ((g7i0) cVar.Dg()).renderRideSupportState((oqk0) obj);
                break;
            case 11:
                ((g7i0) cVar.Dg()).showSupportChatButton((xkw0) obj);
                break;
            case 12:
                ((g7i0) cVar.Dg()).renderUpsell((d8j) obj);
                break;
            case 13:
                ((g7i0) cVar.Dg()).setCostCenterState((n470) obj);
                break;
            default:
                g7i0 g7i0Var = (g7i0) cVar.Dg();
                OrderStatusInfo.CostMessageDetails costMessageDetails = ((TaxiOrder) obj).V().T;
                boolean z = false;
                if (costMessageDetails != null && (cashbackDetails = costMessageDetails.c) != null) {
                    OrderStatusInfo.CashbackDetails.Action action = cashbackDetails.a;
                    if ((action != null ? action.a : null) == OrderStatusInfo.CashbackDetails.ActionType.BUY_PLUS) {
                        z = true;
                    }
                }
                g7i0Var.setSubtitleIsClickable(z);
                break;
        }
        return zy11Var;
    }
}
