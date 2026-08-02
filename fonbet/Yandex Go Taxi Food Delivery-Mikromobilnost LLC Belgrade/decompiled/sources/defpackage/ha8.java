package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.card.internal.interactors.b;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationParams;
import com.ybsdk.feature.card.internal.presentation.cardactivation.a;

/* loaded from: classes3.dex */
public final class ha8 implements fa8 {
    public final bu0 a;

    public ha8(bu0 bu0Var) {
        this.a = bu0Var;
    }

    public final a a(CardActivationParams cardActivationParams) {
        bu0 bu0Var = this.a;
        return new a((tfl0) ((owf) bu0Var.a).get(), cardActivationParams, (AppAnalyticsReporter) ((owf) bu0Var.b).get(), (cf8) ((eqh) bu0Var.c).get(), (mc8) ((xvf0) bu0Var.d).get(), (qn8) ((owf) bu0Var.e).get(), (xk8) ((xvf0) bu0Var.f).get(), (al8) ((owf) bu0Var.g).get(), (lf8) ((owf) bu0Var.h).get(), (b) ((xvf0) bu0Var.i).get());
    }
}
