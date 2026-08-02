package defpackage;

import com.yandex.go.analytics.OrderFeedbackAnalytics$RateCloseReason;
import com.yandex.go.taxi.order.cancel.reasons.analytics.CancelReasonsAnalytics$CloseReason;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes14.dex */
public final class bx7 {
    public final co40 a;
    public final o2y0 b;

    public bx7(co40 co40Var, o2y0 o2y0Var) {
        this.a = co40Var;
        this.b = o2y0Var;
    }

    public final void a(CancelReasonsAnalytics$CloseReason cancelReasonsAnalytics$CloseReason, List list) {
        OrderFeedbackAnalytics$RateCloseReason orderFeedbackAnalytics$RateCloseReason;
        String str = this.b.b().a;
        int i = ax7.a[cancelReasonsAnalytics$CloseReason.ordinal()];
        if (i == 1) {
            orderFeedbackAnalytics$RateCloseReason = OrderFeedbackAnalytics$RateCloseReason.RollOff;
        } else if (i == 2) {
            orderFeedbackAnalytics$RateCloseReason = OrderFeedbackAnalytics$RateCloseReason.Done;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            orderFeedbackAnalytics$RateCloseReason = OrderFeedbackAnalytics$RateCloseReason.Other;
        }
        co40 co40Var = this.a;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        hashMap.put("reason_list", list);
        hashMap.put("close_reason", orderFeedbackAnalytics$RateCloseReason.getEventValue());
        co40Var.a.a("OrderFeedback.Rate.Closed", hashMap, 1, new HashMap());
    }
}
