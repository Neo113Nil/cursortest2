package defpackage;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;

/* loaded from: classes2.dex */
public final class grf implements ryj0 {
    public final /* synthetic */ raq0 a;

    public grf(raq0 raq0Var) {
        this.a = raq0Var;
    }

    @Override // defpackage.ryj0
    public final void i(Object obj) {
        ((zbq0) this.a).q((PaymentKitError) obj);
    }

    @Override // defpackage.ryj0
    public final void onSuccess(Object obj) {
        wga0 wga0Var = (wga0) ((uv90) obj);
        wga0Var.f(PaymentMethod.NewCard.INSTANCE, null, new zgf(1, this.a));
    }
}
