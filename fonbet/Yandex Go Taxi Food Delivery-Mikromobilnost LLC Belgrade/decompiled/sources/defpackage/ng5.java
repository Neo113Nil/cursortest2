package defpackage;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.pay.payment.OrderId;
import com.yandex.pay.payment.YPayResult;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes12.dex */
public final class ng5 extends lg5 {
    public final w13 a;

    public ng5(w13 w13Var) {
        this.a = w13Var;
    }

    @Override // defpackage.lg5
    public final void a(Map map, String str, Map map2) {
        Object obj;
        String str2;
        Object success;
        String str3;
        FinishFlowStatus.Companion.getClass();
        Iterator<E> it = FinishFlowStatus.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (cvu0.t(((FinishFlowStatus) obj).name(), str, true)) {
                    break;
                }
            }
        }
        FinishFlowStatus finishFlowStatus = (FinishFlowStatus) obj;
        if (finishFlowStatus == null) {
            finishFlowStatus = FinishFlowStatus.UNKNOWN;
        }
        int i = mg5.a[finishFlowStatus.ordinal()];
        if (i == 1) {
            if (map == null || (str2 = (String) map.get(FinishFlowStatus.ORDER_ID_FIELD_NAME)) == null) {
                str2 = "";
            }
            success = new YPayResult.Success(null, new OrderId(str2));
        } else if (i == 2) {
            success = YPayResult.Cancelled.INSTANCE;
        } else if (i == 3) {
            if (map == null || (str3 = (String) map.get("error")) == null) {
                str3 = "FinishFlowAction: Unknown error";
            }
            success = new YPayResult.Failure(str3, null);
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            success = new YPayResult.Failure("Try to finish payment flow with unknown status", null);
        }
        w13 w13Var = this.a;
        w13Var.c = map2;
        w13Var.a.g(success);
    }
}
