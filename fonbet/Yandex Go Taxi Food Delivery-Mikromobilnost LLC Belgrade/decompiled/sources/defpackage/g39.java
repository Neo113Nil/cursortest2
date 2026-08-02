package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.cashback.impl.screens.dashboard.CashbackDashboardScreenParams;
import com.ybsdk.feature.cashback.impl.screens.dashboard.a;

/* loaded from: classes3.dex */
public final class g39 implements f39 {
    public final bc a;

    public g39(bc bcVar) {
        this.a = bcVar;
    }

    public final a a(CashbackDashboardScreenParams cashbackDashboardScreenParams) {
        bc bcVar = this.a;
        return new a(cashbackDashboardScreenParams, (com.ybsdk.feature.cashback.impl.domain.a) ((ig7) bcVar.a).get(), (tfl0) ((owf) bcVar.b).get(), (ucp0) ((xvf0) bcVar.c).get(), (g5) ((owf) bcVar.w).get(), (AppAnalyticsReporter) ((owf) bcVar.x).get());
    }
}
