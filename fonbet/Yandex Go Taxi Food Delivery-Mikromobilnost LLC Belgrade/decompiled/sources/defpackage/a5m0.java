package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.savings.internal.interactors.c;
import com.ybsdk.feature.savings.internal.screens.create.SavingsAccountCreationParams;
import com.ybsdk.feature.savings.internal.screens.create.a;

/* loaded from: classes3.dex */
public final class a5m0 implements w4m0 {
    public final z4m0 a;

    public a5m0(z4m0 z4m0Var) {
        this.a = z4m0Var;
    }

    public final a a(SavingsAccountCreationParams savingsAccountCreationParams) {
        z4m0 z4m0Var = this.a;
        return new a(savingsAccountCreationParams, (e5m0) ((x3m0) z4m0Var.b).get(), (tfl0) ((g7g) z4m0Var.c).get(), (tcm0) ((eqh) z4m0Var.w).get(), (AppAnalyticsReporter) ((g7g) z4m0Var.x).get(), (c) ((xos) z4m0Var.y).get(), (fdm0) ((g7g) z4m0Var.z).get(), (g5) ((g7g) z4m0Var.A).get());
    }
}
