package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesScreenParams;
import com.ybsdk.feature.cashback.impl.screens.categories.a;

/* loaded from: classes3.dex */
public final class o29 implements n29 {
    public final sk7 a;

    public o29(sk7 sk7Var) {
        this.a = sk7Var;
    }

    public final a a(CashbackCategoriesScreenParams cashbackCategoriesScreenParams) {
        sk7 sk7Var = this.a;
        return new a(cashbackCategoriesScreenParams, (com.ybsdk.feature.cashback.impl.domain.a) ((ig7) sk7Var.b).get(), (tfl0) ((owf) sk7Var.c).get(), (AppAnalyticsReporter) ((owf) sk7Var.w).get());
    }
}
