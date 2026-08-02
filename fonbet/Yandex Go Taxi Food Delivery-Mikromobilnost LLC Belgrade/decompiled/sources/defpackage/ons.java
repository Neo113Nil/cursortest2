package defpackage;

import android.content.Context;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.savings.internal.screens.fund.creation.FundCreationParams;
import com.ybsdk.feature.savings.internal.screens.fund.creation.a;

/* loaded from: classes3.dex */
public final class ons implements jns {
    public final m a;

    public ons(m mVar) {
        this.a = mVar;
    }

    public final a a(FundCreationParams fundCreationParams) {
        m mVar = this.a;
        return new a(fundCreationParams, (AppAnalyticsReporter) ((g7g) mVar.a).get(), (g5) ((g7g) mVar.b).get(), (fdm0) ((g7g) mVar.c).get(), (tfl0) ((g7g) mVar.d).get(), (g5) ((g7g) mVar.e).get(), (Context) ((k6g) mVar.f).get(), (w530) ((g7g) mVar.g).get(), (com.ybsdk.feature.savings.internal.interactors.a) ((z9n) mVar.h).get(), (udm0) ((g7g) mVar.i).get(), (vns) ((wns) mVar.j).get());
    }
}
