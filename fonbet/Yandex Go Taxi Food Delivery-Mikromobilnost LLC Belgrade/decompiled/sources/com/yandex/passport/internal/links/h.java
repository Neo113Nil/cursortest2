package com.yandex.passport.internal.links;

import androidx.activity.result.ActivityResult;
import com.yandex.passport.api.w;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.report.o4;
import com.yandex.passport.internal.report.reporters.n;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.bouncer.model.f2;
import com.yandex.passport.internal.ui.bouncer.model.j2;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import com.yandex.passport.internal.ui.bouncer.t;
import com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity;
import com.yandex.passport.internal.ui.domik.common.BasePhoneNumberFragment;
import com.yandex.passport.internal.ui.domik.extaction.ExternalActionFragment;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity;
import com.yandex.passport.internal.ui.tv.AuthInWebViewFragment;
import defpackage.u40;
import defpackage.v40;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements u40 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v40 b;

    public /* synthetic */ h(v40 v40Var, int i) {
        this.a = i;
        this.b = v40Var;
    }

    @Override // defpackage.u40
    public final void a(Object obj) {
        int i = this.a;
        v40 v40Var = this.b;
        switch (i) {
            case 0:
                LinksHandlingActivity.bouncerResultLauncher$lambda$1((LinksHandlingActivity) v40Var, (w) obj);
                break;
            case 1:
                AuthSdkActivity.bouncerResultLauncher$lambda$2((AuthSdkActivity) v40Var, (w) obj);
                break;
            case 2:
                com.yandex.passport.internal.ui.bouncer.fallback.c cVar = (com.yandex.passport.internal.ui.bouncer.fallback.c) v40Var;
                ActivityResult activityResult = (ActivityResult) obj;
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "activityResult: " + activityResult, 8);
                }
                n nVar = cVar.F;
                t tVar = cVar.E;
                int resultCode = activityResult.getResultCode();
                nVar.getClass();
                nVar.f(o4.w, new com.yandex.passport.internal.report.a(resultCode, 16));
                if (activityResult.getResultCode() != 0) {
                    tVar.a(new j2(activityResult.getResultCode(), activityResult.getData()));
                    break;
                } else {
                    w1 w1Var = cVar.G;
                    tVar.a((w1Var == null || w1Var.b) ? f2.a : f2.b);
                    break;
                }
            case 3:
                DeleteForeverActivity.bouncerResultLauncher$lambda$0((DeleteForeverActivity) v40Var, (w) obj);
                break;
            case 4:
                BasePhoneNumberFragment.phoneNumberHintIntentResultLauncher$lambda$10((BasePhoneNumberFragment) v40Var, (ActivityResult) obj);
                break;
            case 5:
                ExternalActionFragment.webViewActivityLauncher$lambda$0((ExternalActionFragment) v40Var, (ActivityResult) obj);
                break;
            case 6:
                ManagingPlusDevicesHelperActivity.managingPlusDevicesLauncher$lambda$1((ManagingPlusDevicesHelperActivity) v40Var, ((Integer) obj).intValue());
                break;
            default:
                AuthInWebViewFragment.webViewActivityLauncher$lambda$6((AuthInWebViewFragment) v40Var, (ActivityResult) obj);
                break;
        }
    }
}
