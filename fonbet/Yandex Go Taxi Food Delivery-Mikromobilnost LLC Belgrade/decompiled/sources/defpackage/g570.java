package defpackage;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.kycesia.internal.domain.b;
import com.ybsdk.feature.kycesia.internal.screens.sdk.OpenEsiaSdkParams;

/* loaded from: classes3.dex */
public final class g570 implements d570 {
    public final v920 a;

    public g570(v920 v920Var) {
        this.a = v920Var;
    }

    public final f570 a(OpenEsiaSdkParams openEsiaSdkParams) {
        v920 v920Var = this.a;
        return new f570(openEsiaSdkParams, (Context) ((byf) v920Var.a).get(), (tfl0) ((byf) v920Var.b).get(), (AppAnalyticsReporter) ((byf) v920Var.c).get(), (b) ((qrb) v920Var.w).get(), (jbo) ((byf) v920Var.x).get(), (k570) ((xvf0) v920Var.y).get());
    }
}
