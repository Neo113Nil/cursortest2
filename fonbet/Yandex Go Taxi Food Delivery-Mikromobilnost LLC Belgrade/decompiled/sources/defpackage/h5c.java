package defpackage;

import android.view.ContextThemeWrapper;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.ybsdk.api.e;
import com.ybsdk.api.entities.YBSdkEvent$Result$CreditLimitPaymentMethod$Status;
import com.ybsdk.common.entities.CreditLimitPaymentMethodEntity;
import com.ybsdk.common.entities.a;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class h5c {
    public final e a;
    public final com.ybsdk.common.e b;
    public final ContextThemeWrapper c;
    public final JsonAdapter d = new Moshi.Builder().build().adapter(CreditLimitPaymentMethodEntity.class);

    public h5c(e eVar, com.ybsdk.common.e eVar2, ContextThemeWrapper contextThemeWrapper) {
        this.a = eVar;
        this.b = eVar2;
        this.c = contextThemeWrapper;
    }

    public final bh51 a(DeeplinkAction.CloseSdkWithResult closeSdkWithResult, CreditLimitPaymentMethodEntity creditLimitPaymentMethodEntity) {
        Map<String, String> params = closeSdkWithResult.getParams();
        int i = a.a[creditLimitPaymentMethodEntity.getStatus().ordinal()];
        if (i == 1) {
            YBSdkEvent$Result$CreditLimitPaymentMethod$Status yBSdkEvent$Result$CreditLimitPaymentMethod$Status = YBSdkEvent$Result$CreditLimitPaymentMethod$Status.SUCCESS;
        } else if (i == 2) {
            YBSdkEvent$Result$CreditLimitPaymentMethod$Status yBSdkEvent$Result$CreditLimitPaymentMethod$Status2 = YBSdkEvent$Result$CreditLimitPaymentMethod$Status.SUCCESS;
        } else if (i == 3) {
            YBSdkEvent$Result$CreditLimitPaymentMethod$Status yBSdkEvent$Result$CreditLimitPaymentMethod$Status3 = YBSdkEvent$Result$CreditLimitPaymentMethod$Status.SUCCESS;
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            YBSdkEvent$Result$CreditLimitPaymentMethod$Status yBSdkEvent$Result$CreditLimitPaymentMethod$Status4 = YBSdkEvent$Result$CreditLimitPaymentMethod$Status.SUCCESS;
        }
        List list = rcv.a;
        if (rcv.a(creditLimitPaymentMethodEntity.getPaymentMethod().getLogo(), rev.f, this.c) == null) {
            creditLimitPaymentMethodEntity.getPaymentMethod().getLogo();
        }
        creditLimitPaymentMethodEntity.getPaymentMethod().getPaymentMethodType();
        creditLimitPaymentMethodEntity.getPaymentMethod().getTitle();
        return new bh51("credit_limit_payment_method", params);
    }
}
