package defpackage;

import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.payment.sdk.ui.bind.AdditionalVerifyCardActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class eo0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ AdditionalVerifyCardActivity b;

    public /* synthetic */ eo0(AdditionalVerifyCardActivity additionalVerifyCardActivity, int i) {
        this.a = i;
        this.b = additionalVerifyCardActivity;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        io0 activityViewModel_delegate$lambda$0;
        int i = this.a;
        AdditionalVerifyCardActivity additionalVerifyCardActivity = this.b;
        switch (i) {
            case 0:
                activityViewModel_delegate$lambda$0 = AdditionalVerifyCardActivity.activityViewModel_delegate$lambda$0(additionalVerifyCardActivity);
                return activityViewModel_delegate$lambda$0;
            case 1:
                wy4 baseComponent$paymentsdk_release = additionalVerifyCardActivity.getBaseComponent$paymentsdk_release();
                return new qwf(((pwf) baseComponent$paymentsdk_release).a, new oy80(6, new PaymentToken("intent_xxx"), null));
            case 2:
                return additionalVerifyCardActivity.getBinding().i;
            default:
                return additionalVerifyCardActivity.getBinding().b;
        }
    }
}
