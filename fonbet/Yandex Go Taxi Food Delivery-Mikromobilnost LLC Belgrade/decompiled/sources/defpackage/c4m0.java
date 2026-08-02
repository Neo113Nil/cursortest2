package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.savings.internal.screens.close.SavingsAccountCloseParams;

/* loaded from: classes3.dex */
public final class c4m0 implements a4m0 {
    public final fcj0 a;

    public c4m0(fcj0 fcj0Var) {
        this.a = fcj0Var;
    }

    public final b4m0 a(SavingsAccountCloseParams savingsAccountCloseParams) {
        fcj0 fcj0Var = this.a;
        return new b4m0(savingsAccountCloseParams, (tfl0) ((g7g) fcj0Var.a).get(), (AppAnalyticsReporter) ((g7g) fcj0Var.b).get(), (w2m0) ((xvf0) fcj0Var.c).get(), (fdm0) ((g7g) fcj0Var.d).get(), (f4m0) ((g4m0) fcj0Var.e).get());
    }
}
