package defpackage;

import com.yandex.go.taxi.order.ActionButtonsClickListener$SourceScreen;
import com.yandex.go.taxi.order.state.checkin.a;
import ru.yandex.taxi.order.state.checkin.CheckInStateView;
import ru.yandex.taxi.superapp.orders.models.ActionType;

/* loaded from: classes14.dex */
public final class cgb implements xt {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cgb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xt
    public final void j(String str, ActionType actionType) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a checkInStateViewPresenter = ((CheckInStateView) obj).getCheckInStateViewPresenter();
                checkInStateViewPresenter.T.c(actionType.getAnalyticAlias());
                checkInStateViewPresenter.U.a(str, actionType, ActionButtonsClickListener$SourceScreen.ORDER_DETAILS);
                break;
            default:
                ((tls) obj).invoke(actionType);
                break;
        }
    }
}
