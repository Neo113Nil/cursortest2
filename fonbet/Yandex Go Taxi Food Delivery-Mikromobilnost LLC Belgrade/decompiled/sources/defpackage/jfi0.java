package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.rebind.payment.api.RebindPaymentMethodScreenParams;
import com.ybsdk.feature.rebind.payment.internal.screens.a;

/* loaded from: classes3.dex */
public final class jfi0 implements hfi0 {
    public final xv10 a;

    public jfi0(xv10 xv10Var) {
        this.a = xv10Var;
    }

    public final a a(RebindPaymentMethodScreenParams rebindPaymentMethodScreenParams) {
        xv10 xv10Var = this.a;
        return new a((com.ybsdk.feature.rebind.payment.internal.domain.a) ((jpf0) xv10Var.a).get(), (efi0) ((c6g) xv10Var.b).get(), (tfl0) ((c6g) xv10Var.c).get(), (AppAnalyticsReporter) ((c6g) xv10Var.w).get(), (lfi0) ((xvf0) xv10Var.x).get(), rebindPaymentMethodScreenParams);
    }
}
