package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.yandex.payment.sdk.core.data.BoundSbpToken;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.plus.core.data.pay.PlusPaymentMethod;

/* loaded from: classes2.dex */
public final class gv5 extends x40 {
    public final ksi0 a;
    public final String b;

    public gv5(ksi0 ksi0Var, String str) {
        this.a = ksi0Var;
        this.b = str;
    }

    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        return this.a.b(this.b);
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        PaymentKitError paymentKitError;
        BoundSbpToken boundSbpToken;
        y6a0 y6a0Var = null;
        z6a0 z6a0Var = (intent == null || (boundSbpToken = (BoundSbpToken) ((Parcelable) ffx.P(intent, "DATA", BoundSbpToken.class))) == null) ? null : new z6a0(new PlusPaymentMethod.SbpToken(boundSbpToken.getTokenId(), null));
        if (z6a0Var != null) {
            return z6a0Var;
        }
        if (intent != null && (paymentKitError = (PaymentKitError) ((Parcelable) ffx.P(intent, "ERROR", PaymentKitError.class))) != null) {
            y6a0Var = new y6a0(paymentKitError.getMessage(), paymentKitError.getCode(), paymentKitError.getStatus(), paymentKitError.getKind().name(), paymentKitError.getTrigger().name());
        }
        return y6a0Var != null ? y6a0Var : x6a0.a;
    }
}
