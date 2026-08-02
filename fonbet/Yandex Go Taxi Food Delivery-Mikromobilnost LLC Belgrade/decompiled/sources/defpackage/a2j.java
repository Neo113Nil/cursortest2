package defpackage;

import com.yandex.go.taxi.order.cancel.popup.analytics.event.AfterCancelDetailedModalCardAnalytics$ActionType;
import com.yandex.go.taxi.order.models.api.cancel.AfterCancelPopupButton;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class a2j {
    public final b1 a;

    public a2j(b1 b1Var) {
        this.a = b1Var;
    }

    public static AfterCancelDetailedModalCardAnalytics$ActionType b(AfterCancelPopupButton.ActionType actionType) {
        int i = z1j.a[actionType.ordinal()];
        if (i == 1) {
            return AfterCancelDetailedModalCardAnalytics$ActionType.ToSummary;
        }
        if (i == 2) {
            return AfterCancelDetailedModalCardAnalytics$ActionType.Deeplink;
        }
        if (i == 3) {
            return null;
        }
        w511.b();
        return null;
    }

    public final void a(AfterCancelPopupButton.ActionType actionType) {
        AfterCancelDetailedModalCardAnalytics$ActionType b = b(actionType);
        b1 b1Var = this.a;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        if (b != null) {
            hashMap.put("button", b.getEventValue());
        }
        b1Var.a.a("AfterCancelDetailedModalCard.Tapped", hashMap, 1, new HashMap());
    }
}
