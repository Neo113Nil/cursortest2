package defpackage;

import com.yandex.payment.divkit.sbp.a;
import com.yandex.payment.sdk.core.data.BoundSbpToken;
import com.yandex.payment.sdk.core.data.PaymentKitError;

/* loaded from: classes2.dex */
public final class muf implements ryj0 {
    public final /* synthetic */ a a;

    public muf(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.ryj0
    public final void i(Object obj) {
        PaymentKitError paymentKitError = (PaymentKitError) obj;
        a aVar = this.a;
        hrj0 hrj0Var = aVar.A;
        if (aVar.C.a) {
            hrj0Var.getClass();
            int i = ryh0.paymentsdk_sbp_something_went_wrong;
            hrj0Var.getClass();
            aVar.b0(new euf(paymentKitError, i, ryh0.paymentsdk_sbp_something_went_wrong_description, false));
        }
    }

    @Override // defpackage.ryj0
    public final void onSuccess(Object obj) {
        BoundSbpToken boundSbpToken = (BoundSbpToken) obj;
        a aVar = this.a;
        if (aVar.C.a) {
            zry0 zry0Var = aVar.K;
            if (zry0Var == null) {
                zry0Var = null;
            }
            aVar.b0(new cuf(zry0Var.c, boundSbpToken));
        }
    }
}
