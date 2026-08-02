package defpackage;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationParams;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.a;

/* loaded from: classes2.dex */
public final class neb0 implements leb0 {
    public final st0 a;

    public neb0(st0 st0Var) {
        this.a = st0Var;
    }

    public final a a(PhoneConfirmationParams phoneConfirmationParams) {
        st0 st0Var = this.a;
        return new a(phoneConfirmationParams, (com.ybsdk.screens.registration.phoneconfirmation.domain.interactors.a) ((g680) st0Var.x).get(), (com.ybsdk.screens.registration.domain.interactors.a) ((xvf0) st0Var.a).get(), (cgb0) ((xvf0) st0Var.b).get(), (AppAnalyticsReporter) ((k6g) st0Var.y).get(), (hri0) ((xvf0) st0Var.c).get(), (Context) ((k6g) st0Var.z).get(), (tfl0) ((k6g) st0Var.A).get(), (j3h) ((k6g) st0Var.B).get(), (np41) ((k6g) st0Var.C).get(), (ieb0) ((xvf0) st0Var.w).get(), (ab1) ((c6g) st0Var.D).get());
    }
}
