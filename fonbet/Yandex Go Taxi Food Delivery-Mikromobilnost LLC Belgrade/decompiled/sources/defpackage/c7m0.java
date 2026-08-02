package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.savings.internal.helpers.a;
import com.ybsdk.feature.savings.internal.screens.lock.SavingsAccountLockParams;

/* loaded from: classes3.dex */
public final class c7m0 extends uc5 {
    public final SavingsAccountLockParams B;
    public final tfl0 C;
    public final AppAnalyticsReporter D;
    public final w2m0 E;

    public c7m0(SavingsAccountLockParams savingsAccountLockParams, tfl0 tfl0Var, AppAnalyticsReporter appAnalyticsReporter, w2m0 w2m0Var, g7m0 g7m0Var) {
        super(new j6m0(1, savingsAccountLockParams), g7m0Var);
        this.B = savingsAccountLockParams;
        this.C = tfl0Var;
        this.D = appAnalyticsReporter;
        this.E = w2m0Var;
        appAnalyticsReporter.f0.a.a("savings.account.lock_money.open", null);
        c.a(a.f(savingsAccountLockParams.getAgreementId(), ((a) w2m0Var).f), ds31.a(this), new cfj0(20, this));
    }
}
