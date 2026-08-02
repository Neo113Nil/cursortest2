package defpackage;

import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.yandex.xplat.payment.sdk.NetworkServiceError;

/* loaded from: classes3.dex */
public final /* synthetic */ class g060 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e100 b;

    public /* synthetic */ g060(e100 e100Var, int i) {
        this.a = i;
        this.b = e100Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        e100 e100Var = this.b;
        YSError ySError = (YSError) obj;
        switch (i) {
            case 0:
                if (tia1.d(ySError)) {
                    return zmx.c(ySError);
                }
                return zmx.c(((h060) e100Var.w).i(new NetworkServiceError(ExternalErrorKind.network, ExternalErrorTrigger.internal_sdk, (Integer) null, g8e.o("Transport failure: ", ySError.getMessage()), (String) null, true)));
            default:
                return zmx.c(((h060) e100Var.w).i(new NetworkServiceError(ExternalErrorKind.network, ExternalErrorTrigger.internal_sdk, (Integer) null, g8e.o("Transport failure: ", ySError.getMessage()), (String) null, true)));
        }
    }
}
