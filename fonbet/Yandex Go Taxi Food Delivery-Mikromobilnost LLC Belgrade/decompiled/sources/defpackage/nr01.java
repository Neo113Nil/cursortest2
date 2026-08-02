package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferByDetailsEnterResultAccountType;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferByDetailsEnterResultResult;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class nr01 {
    public final AppAnalyticsReporter a;
    public final String b;

    public nr01(AppAnalyticsReporter appAnalyticsReporter, String str) {
        this.a = appAnalyticsReporter;
        this.b = str;
    }

    public final void a(TransferEvents$TransferByDetailsEnterResultResult transferEvents$TransferByDetailsEnterResultResult, tq01 tq01Var) {
        TransferEvents$TransferByDetailsEnterResultAccountType transferEvents$TransferByDetailsEnterResultAccountType;
        em3 em3Var = this.a.q0;
        if (tq01Var instanceof qq01) {
            transferEvents$TransferByDetailsEnterResultAccountType = TransferEvents$TransferByDetailsEnterResultAccountType.BUSINESS;
        } else if (tq01Var instanceof sq01) {
            transferEvents$TransferByDetailsEnterResultAccountType = TransferEvents$TransferByDetailsEnterResultAccountType.PERSONAL;
        } else {
            if (!(tq01Var instanceof oq01)) {
                w511.b();
                return;
            }
            transferEvents$TransferByDetailsEnterResultAccountType = TransferEvents$TransferByDetailsEnterResultAccountType.HCS;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, transferEvents$TransferByDetailsEnterResultResult.getOriginalValue());
        linkedHashMap.put("account_type", transferEvents$TransferByDetailsEnterResultAccountType.getOriginalValue());
        linkedHashMap.put("transfer_session_id", this.b);
        em3Var.a.a("transfer.by_details.enter.result", linkedHashMap);
    }
}
