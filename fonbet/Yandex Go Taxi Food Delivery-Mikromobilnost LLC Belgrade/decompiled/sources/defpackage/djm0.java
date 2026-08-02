package defpackage;

import com.yandex.payment.sdk.ui.payment.sbp.d;

/* loaded from: classes2.dex */
public final /* synthetic */ class djm0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ djm0(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                dVar.a0(new ijm0(ryh0.paymentsdk_sbp_payment_waiting_title, Integer.valueOf(ryh0.paymentsdk_sbp_waiting_info), true));
                break;
            default:
                dVar.a0(new ijm0(ryh0.paymentsdk_sbp_payment_waiting_title, Integer.valueOf(ryh0.paymentsdk_sbp_waiting_info), true));
                ((eez0) dVar.E.getValue()).c(5L, new djm0(dVar, 0));
                break;
        }
        return zy11Var;
    }
}
