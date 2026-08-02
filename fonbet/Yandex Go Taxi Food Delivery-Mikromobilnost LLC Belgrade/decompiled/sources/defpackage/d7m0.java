package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.savings.internal.screens.lock.SavingsAccountLockParams;

/* loaded from: classes3.dex */
public final class d7m0 implements b7m0 {
    public final kdd0 a;

    public d7m0(kdd0 kdd0Var) {
        this.a = kdd0Var;
    }

    public final c7m0 a(SavingsAccountLockParams savingsAccountLockParams) {
        kdd0 kdd0Var = this.a;
        return new c7m0(savingsAccountLockParams, (tfl0) ((g7g) kdd0Var.a).get(), (AppAnalyticsReporter) ((g7g) kdd0Var.b).get(), (w2m0) ((xvf0) kdd0Var.c).get(), (g7m0) ((g4m0) kdd0Var.d).get());
    }
}
