package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.main.api.SbpAccountInfoScreenParams;
import com.ybsdk.feature.main.internal.data.network.c;
import com.ybsdk.feature.main.internal.screens.sbpAccount.a;

/* loaded from: classes3.dex */
public final class kem0 implements gem0 {
    public final kdd0 a;

    public kem0(kdd0 kdd0Var) {
        this.a = kdd0Var;
    }

    public final a a(SbpAccountInfoScreenParams sbpAccountInfoScreenParams) {
        kdd0 kdd0Var = this.a;
        return new a(sbpAccountInfoScreenParams, (c) ((jzi0) kdd0Var.a).get(), (b3z) ((u2g) kdd0Var.b).get(), (tfl0) ((u2g) kdd0Var.c).get(), (AppAnalyticsReporter) ((u2g) kdd0Var.d).get());
    }
}
