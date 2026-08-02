package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountOpenType;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.savings.internal.helpers.a;
import com.ybsdk.feature.savings.internal.screens.close.SavingsAccountCloseParams;
import kotlinx.coroutines.flow.e;

/* loaded from: classes3.dex */
public final class b4m0 extends uc5 {
    public final SavingsAccountCloseParams B;
    public final tfl0 C;
    public final AppAnalyticsReporter D;
    public final w2m0 E;
    public final fdm0 F;

    public b4m0(SavingsAccountCloseParams savingsAccountCloseParams, tfl0 tfl0Var, AppAnalyticsReporter appAnalyticsReporter, w2m0 w2m0Var, fdm0 fdm0Var, f4m0 f4m0Var) {
        super(new iik0(28, savingsAccountCloseParams), f4m0Var);
        SavingsEvents$SavingsAccountCloseAccountOpenType savingsEvents$SavingsAccountCloseAccountOpenType;
        this.B = savingsAccountCloseParams;
        this.C = tfl0Var;
        this.D = appAnalyticsReporter;
        this.E = w2m0Var;
        this.F = fdm0Var;
        rt1 rt1Var = appAnalyticsReporter.f0;
        String type = savingsAccountCloseParams.getType();
        if (type != null) {
            if (type.equalsIgnoreCase("SAVER")) {
                savingsEvents$SavingsAccountCloseAccountOpenType = SavingsEvents$SavingsAccountCloseAccountOpenType.SAVER;
            } else if (type.equalsIgnoreCase("DEPOSIT")) {
                savingsEvents$SavingsAccountCloseAccountOpenType = SavingsEvents$SavingsAccountCloseAccountOpenType.DEPOSIT;
            }
            rt1Var.G(savingsEvents$SavingsAccountCloseAccountOpenType, null);
            c.a(e.t(a.f(savingsAccountCloseParams.getAgreementId(), ((a) w2m0Var).h)), ds31.a(this), new cfj0(18, this));
        }
        savingsEvents$SavingsAccountCloseAccountOpenType = null;
        rt1Var.G(savingsEvents$SavingsAccountCloseAccountOpenType, null);
        c.a(e.t(a.f(savingsAccountCloseParams.getAgreementId(), ((a) w2m0Var).h)), ds31.a(this), new cfj0(18, this));
    }
}
