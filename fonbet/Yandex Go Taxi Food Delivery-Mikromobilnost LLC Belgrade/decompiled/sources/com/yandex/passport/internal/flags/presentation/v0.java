package com.yandex.passport.internal.flags.presentation;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.Lifecycle;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import com.yandex.passport.internal.report.o4;
import com.yandex.passport.internal.ui.bouncer.model.f2;
import com.yandex.passport.internal.ui.bouncer.model.j2;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import com.yandex.passport.internal.ui.challenge.logout.LogoutBehaviour;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetComposeActivity;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNProperties;
import defpackage.av0;
import defpackage.m3u0;
import defpackage.m6y;
import defpackage.mx60;
import defpackage.oz40;
import defpackage.pey;
import defpackage.tls;
import defpackage.u6y;
import defpackage.yx40;
import defpackage.zy11;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final /* synthetic */ class v0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ v0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onCreate$lambda$1;
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                List list = (List) obj4;
                ((m6y) ((u6y) obj)).f(list.size(), null, av0.C, new androidx.compose.runtime.internal.a(-587185978, new w0(list, (tls) obj3, (yx40) obj2), true));
                return zy11Var;
            case 1:
                String str = (String) obj4;
                WebView webView = (WebView) obj3;
                oz40 oz40Var = (oz40) obj2;
                if (!str.equals((String) oz40Var.getValue())) {
                    webView.loadUrl(str);
                    oz40Var.setValue(str);
                }
                return zy11Var;
            case 2:
                com.yandex.passport.internal.report.reporters.n nVar = (com.yandex.passport.internal.report.reporters.n) obj4;
                w1 w1Var = (w1) obj3;
                com.yandex.passport.internal.ui.bouncer.t tVar = (com.yandex.passport.internal.ui.bouncer.t) obj2;
                ActivityResult activityResult = (ActivityResult) obj;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "activityResult: " + activityResult, 8);
                }
                int resultCode = activityResult.getResultCode();
                nVar.getClass();
                nVar.f(o4.w, new com.yandex.passport.internal.report.a(resultCode, 16));
                if (activityResult.getResultCode() == 0) {
                    tVar.a(w1Var.b ? f2.a : f2.b);
                } else {
                    tVar.a(new j2(activityResult.getResultCode(), activityResult.getData()));
                }
                return zy11Var;
            case 3:
                LogoutBottomSheetComposeActivity logoutBottomSheetComposeActivity = (LogoutBottomSheetComposeActivity) obj3;
                (((Boolean) ((com.yandex.passport.internal.ui.challenge.logout.bottomsheet.s) obj4).getFlagRepository().b(com.yandex.passport.internal.flags.q.U)).booleanValue() ? logoutBottomSheetComposeActivity.composeLogoutLauncher : logoutBottomSheetComposeActivity.logoutLauncher).a(new Pair((PassportLogoutPropertiesImpl) obj2, (LogoutBehaviour) obj));
                return zy11Var;
            case 4:
                pey peyVar = (pey) obj4;
                final com.yandex.passport.internal.ui.sloth.ebs.b1 b1Var = (com.yandex.passport.internal.ui.sloth.ebs.b1) obj3;
                final m3u0 m3u0Var = (m3u0) obj2;
                androidx.lifecycle.q qVar = new androidx.lifecycle.q() { // from class: com.yandex.passport.internal.ui.sloth.ebs.i
                    @Override // androidx.lifecycle.q
                    public final void M1(pey peyVar2, Lifecycle.Event event) {
                        if (k.a[event.ordinal()] == 1) {
                            EbsProcessState ebsProcessState = ((BiometricVerificationViewModel$State) m3u0Var.getValue()).getEbsProcessState();
                            if ((ebsProcessState != null ? ebsProcessState.getEbsState() : null) == EbsState.EBS_SDK_BIO_PHOTO_CHECK_OPEN_SETTINGS) {
                                b1.this.W(y0.a);
                            }
                        }
                    }
                };
                peyVar.getLifecycle().a(qVar);
                return new com.yandex.passport.internal.ui.sloth.ebs.j(peyVar, qVar, i2);
            case 5:
                onCreate$lambda$1 = RegisterWebAuthNActivity.onCreate$lambda$1((com.yandex.passport.internal.ui.sloth.webauthn.c) obj4, (RegisterWebAuthNProperties) obj3, (RegisterWebAuthNActivity) obj2, (mx60) obj);
                return onCreate$lambda$1;
            default:
                pey peyVar2 = (pey) obj4;
                final WebView webView2 = (WebView) obj3;
                final Bundle bundle = (Bundle) obj2;
                androidx.lifecycle.q qVar2 = new androidx.lifecycle.q() { // from class: com.yandex.passport.sloth.ui.d2
                    @Override // androidx.lifecycle.q
                    public final void M1(pey peyVar3, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_STOP) {
                            webView2.saveState(bundle);
                        }
                    }
                };
                peyVar2.getLifecycle().a(qVar2);
                return new com.yandex.passport.internal.ui.sloth.ebs.j(peyVar2, qVar2, i3);
        }
    }
}
