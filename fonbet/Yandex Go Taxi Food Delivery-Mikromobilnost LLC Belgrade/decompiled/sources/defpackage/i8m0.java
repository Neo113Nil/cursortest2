package defpackage;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.savings.internal.interactors.d;
import com.ybsdk.feature.savings.internal.screens.account.SavingsAccountScreenParams;
import com.ybsdk.feature.savings.internal.screens.account.a;
import com.ybsdk.widgets.common.shimmer.b;

/* loaded from: classes3.dex */
public final class i8m0 implements x7m0 {
    public final tt a;

    public i8m0(tt ttVar) {
        this.a = ttVar;
    }

    public final a a(SavingsAccountScreenParams savingsAccountScreenParams) {
        tt ttVar = this.a;
        tfl0 tfl0Var = (tfl0) ((g7g) ttVar.a).get();
        Context context = (Context) ((k6g) ttVar.b).get();
        return new a(savingsAccountScreenParams, tfl0Var, context, (AppAnalyticsReporter) ((g7g) ttVar.d).get(), (d) ((xvf0) ttVar.e).get(), (mdm0) ((g7g) ttVar.f).get(), (w2m0) ((xvf0) ttVar.g).get(), (fdm0) ((g7g) ttVar.h).get(), (g5) ((g7g) ttVar.i).get(), (g5) ((g7g) ttVar.j).get(), (edm0) ((g7g) ttVar.k).get(), (b) ((g7g) ttVar.l).get(), (o8m0) ((p8m0) ttVar.m).get(), (ut51) ((g7g) ttVar.n).get());
    }
}
