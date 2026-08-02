package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.qr.payments.internal.screens.refresh.presentation.QrRefreshArguments;

/* loaded from: classes3.dex */
public final class cdg0 implements adg0 {
    public final q6c0 a;

    public cdg0(q6c0 q6c0Var) {
        this.a = q6c0Var;
    }

    public final bdg0 a(QrRefreshArguments qrRefreshArguments) {
        q6c0 q6c0Var = this.a;
        return new bdg0(qrRefreshArguments, (AppAnalyticsReporter) ((p5g) q6c0Var.b).get(), (j3h) ((c6g) q6c0Var.c).get(), (tfl0) ((c6g) q6c0Var.w).get());
    }
}
