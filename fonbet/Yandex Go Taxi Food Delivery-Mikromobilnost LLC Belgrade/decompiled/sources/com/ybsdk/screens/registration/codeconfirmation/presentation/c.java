package com.ybsdk.screens.registration.codeconfirmation.presentation;

import android.content.IntentFilter;
import com.ybsdk.api.YBSdkVisualParams;
import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.webview.api.WebViewCloseCallback;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import com.ybsdk.screens.registration.codeconfirmation.domain.interactors.ChangePhoneSupportScreenCloseCallback;
import com.ybsdk.screens.registration.codeconfirmation.domain.interactors.CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult;
import com.ybsdk.screens.registration.codeconfirmation.domain.interactors.SupportScreenCloseCallback;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import defpackage.c9c;
import defpackage.ds31;
import defpackage.e48;
import defpackage.h791;
import defpackage.hez0;
import defpackage.i9c;
import defpackage.j3h;
import defpackage.l7b;
import defpackage.np41;
import defpackage.o9c;
import defpackage.p9c;
import defpackage.ppp0;
import defpackage.pz40;
import defpackage.q9c;
import defpackage.qke;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.w511;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Result;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class c extends uc5 {
    public final com.ybsdk.rconfig.b B;
    public final i9c C;
    public final np41 D;
    public final com.ybsdk.utils.smsretriever.a E;
    public final ppp0 F;
    public final f G;
    public final tfl0 H;
    public final j3h I;
    public final com.ybsdk.screens.registration.domain.interactors.a J;
    public final c9c K;

    public c(YBSdkVisualParams yBSdkVisualParams, AppAnalyticsReporter appAnalyticsReporter, com.ybsdk.rconfig.b bVar, i9c i9cVar, hez0 hez0Var, np41 np41Var, com.ybsdk.utils.smsretriever.a aVar, ppp0 ppp0Var, f fVar, tfl0 tfl0Var, j3h j3hVar, com.ybsdk.screens.registration.domain.interactors.a aVar2) {
        super(new l7b(20, i9cVar), new e48(hez0Var, i9cVar));
        this.B = bVar;
        this.C = i9cVar;
        this.D = np41Var;
        this.E = aVar;
        this.F = ppp0Var;
        this.G = fVar;
        this.H = tfl0Var;
        this.I = j3hVar;
        this.J = aVar2;
        this.K = i9cVar.g(appAnalyticsReporter);
        appAnalyticsReporter.b0.a.a("registration.phone.confirmation_code.loaded", null);
        if (i9cVar.h()) {
            tje.N(ds31.a(this), null, null, new CodeConfirmationViewModel$3(this, null), 3);
        }
        if (i9cVar.getParams().getSignOutEnabled() && yBSdkVisualParams.getShowLogOut()) {
            tje.N(ds31.a(this), null, null, new CodeConfirmationViewModel$4(this, null), 3);
        }
        if (aVar.d != null) {
            qke.z(aVar.a, aVar.e, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), 2);
        }
        if (i9cVar.e() == null) {
            h0();
        } else {
            aVar.b();
        }
        tje.N(ds31.a(this), null, null, new CodeConfirmationViewModel$startUpdateTimer$1(this, null), 3);
        com.ybsdk.screens.registration.codeconfirmation.domain.interactors.b bVar2 = i9cVar instanceof com.ybsdk.screens.registration.codeconfirmation.domain.interactors.b ? (com.ybsdk.screens.registration.codeconfirmation.domain.interactors.b) i9cVar : null;
        if (bVar2 != null) {
            tje.N(ds31.a(this), null, null, new CodeConfirmationViewModel$5$1(this, bVar2, null), 3);
        }
    }

    public static final void b0(c cVar, CodeConfirmationViewState$CodeState codeConfirmationViewState$CodeState) {
        cVar.getClass();
        cVar.Z(new o9c(codeConfirmationViewState$CodeState));
        tje.N(ds31.a(cVar), null, null, new CodeConfirmationViewModel$clearInput$1(cVar, null), 3);
    }

    @Override // defpackage.yr31
    public final void V() {
        Object failure;
        com.ybsdk.utils.smsretriever.a aVar = this.E;
        if (aVar.d != null) {
            try {
                aVar.a.unregisterReceiver(aVar.e);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                x4c.g("Exception while unregister() in SmsRetrieverHelper", a, null, null, 12);
            }
        }
    }

    public final boolean c0() {
        u8j0 u8j0Var = ((a) X()).h;
        if (u8j0Var != null && (u8j0Var instanceof t8j0)) {
            return true;
        }
        this.K.o(CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult.CANCEL);
        Z(new p9c(this.C.d()));
        if (((a) X()).l) {
            Z(q9c.a);
            return true;
        }
        this.H.e();
        return true;
    }

    public final void d0() {
        tje.N(ds31.a(this), null, null, new CodeConfirmationViewModel$startUpdateTimer$1(this, null), 3);
    }

    public final void e0() {
        h0();
    }

    public final void f0(String str) {
        this.K.k();
        WebViewScreenParams.Auth auth = WebViewScreenParams.Auth.NONE;
        CodeConfirmationParams params = this.C.getParams();
        h791.f(this.I, str, com.ybsdk.feature.webview.api.a.a(this.D, str, params instanceof CodeConfirmationParams.Registration ? new SupportScreenCloseCallback() : params instanceof CodeConfirmationParams.ChangePhone ? new ChangePhoneSupportScreenCloseCallback() : WebViewCloseCallback.EmptyCallback.INSTANCE, auth));
    }

    public final void g0(String str) {
        CodeConfirmationParams params = this.C.getParams();
        if (params instanceof CodeConfirmationParams.Authorization) {
            f0(str);
            return;
        }
        if (params instanceof CodeConfirmationParams.Registration) {
            c0();
        } else if (params instanceof CodeConfirmationParams.ChangePhone) {
            f0(str);
        } else {
            w511.b();
        }
    }

    public final void h0() {
        r0 r0Var;
        Object value;
        a aVar;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            aVar = (a) value;
        } while (!r0Var.k(value, a.a(aVar, aVar.d.c(), 0L, 0L, 0, null, null, null, false, null, 16247)));
        tje.N(ds31.a(this), null, null, new CodeConfirmationViewModel$requestOtp$2(this, null), 3);
    }
}
