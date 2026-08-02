package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.savings.internal.interactors.b;
import com.ybsdk.feature.savings.internal.screens.fund.operation.FundOperationParams;
import com.ybsdk.feature.savings.internal.screens.fund.operation.a;

/* loaded from: classes3.dex */
public final class kps implements jps {
    public final bu0 a;

    public kps(bu0 bu0Var) {
        this.a = bu0Var;
    }

    public final a a(FundOperationParams fundOperationParams) {
        bu0 bu0Var = this.a;
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) ((g7g) bu0Var.a).get();
        g5 g5Var = (g5) ((g7g) bu0Var.b).get();
        fdm0 fdm0Var = (fdm0) ((g7g) bu0Var.c).get();
        tfl0 tfl0Var = (tfl0) ((g7g) bu0Var.d).get();
        ((g7g) bu0Var.e).get();
        return new a(fundOperationParams, appAnalyticsReporter, g5Var, fdm0Var, tfl0Var, (b) ((xos) bu0Var.f).get(), (udm0) ((g7g) bu0Var.g).get(), (edm0) ((g7g) bu0Var.h).get(), (rps) ((xvf0) bu0Var.i).get());
    }
}
