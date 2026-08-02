package defpackage;

import android.content.Context;
import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.rconfig.b;
import com.ybsdk.screens.registration.codeconfirmation.domain.interactors.a;
import com.ybsdk.screens.registration.codeconfirmation.domain.interactors.c;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;

/* loaded from: classes2.dex */
public final class j9c {
    public final tqi0 a;
    public final rm3 b;
    public final fe9 c;

    public j9c(tqi0 tqi0Var, rm3 rm3Var, fe9 fe9Var) {
        this.a = tqi0Var;
        this.b = rm3Var;
        this.c = fe9Var;
    }

    public final i9c a(CodeConfirmationParams codeConfirmationParams) {
        if (codeConfirmationParams instanceof CodeConfirmationParams.Authorization) {
            sm3 sm3Var = ((tm3) this.b).a;
            return new a((CodeConfirmationParams.Authorization) codeConfirmationParams, (mn3) sm3Var.a.get(), (DeviceIdProvider) sm3Var.b.get(), (tfl0) sm3Var.c.get(), (com.ybsdk.feature.pin.internal.a) sm3Var.d.get(), (nvd) sm3Var.e.get(), (b) sm3Var.f.get(), (com.ybsdk.screens.initial.a) sm3Var.g.get());
        }
        if (codeConfirmationParams instanceof CodeConfirmationParams.Registration) {
            uqi0 uqi0Var = ((vqi0) this.a).a;
            return new c((CodeConfirmationParams.Registration) codeConfirmationParams, (com.ybsdk.screens.registration.data.c) uqi0Var.a.get(), (tfl0) uqi0Var.b.get(), (AppAnalyticsReporter) uqi0Var.c.get(), (Context) uqi0Var.d.get(), (com.ybsdk.screens.registration.a) uqi0Var.e.get());
        }
        if (codeConfirmationParams instanceof CodeConfirmationParams.ChangePhone) {
            ge9 ge9Var = ((he9) this.c).a;
            return new com.ybsdk.screens.registration.codeconfirmation.domain.interactors.b((CodeConfirmationParams.ChangePhone) codeConfirmationParams, (com.ybsdk.screens.registration.data.a) ge9Var.a.get(), (tfl0) ge9Var.b.get(), (com.ybsdk.screens.registration.a) ge9Var.c.get(), (AppAnalyticsReporter) ge9Var.d.get(), (Context) ge9Var.e.get(), (b) ge9Var.f.get());
        }
        w511.b();
        return null;
    }
}
