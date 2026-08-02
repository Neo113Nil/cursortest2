package com.yandex.passport.internal.flags.presentation;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.social.esia.EsiaBindActivity;
import com.yandex.passport.internal.ui.account_upgrade.AccountUpgraderActivity;
import com.yandex.passport.internal.ui.challenge.delete.DeleteAccountActivity;
import com.yandex.passport.internal.ui.sloth.StandaloneSlothComposeActivity;
import com.yandex.passport.internal.ui.sloth.authsdk.AuthSdkSlothComposeActivity;
import com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesActivity;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardComposeActivity;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.internal.ui.webview.webcases.WebCaseType;
import defpackage.agc;
import defpackage.bts;
import defpackage.c530;
import defpackage.cyk0;
import defpackage.dgc;
import defpackage.did;
import defpackage.fid;
import defpackage.lfb1;
import defpackage.ljs0;
import defpackage.o430;
import defpackage.rfb1;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class f1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PassportProcessGlobalComponent passportProcessGlobalComponent;
        com.yandex.passport.internal.ui.sloth.ebs.d dVar;
        int i = this.a;
        int i2 = 6;
        o430 o430Var = did.a;
        final int i3 = 0;
        final int i4 = 1;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        int i5 = 3;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                rfb1.a(ljs0.c(c530.a, 1.0f), cyk0.c(16.0f), lfb1.a(((agc) ((bts) fidVar).m(dgc.a)).F, 0L, 0L, fidVar, 14), null, wwg.S(-486485580, true, new e1((sls) obj3, (tls) obj4), fidVar), fidVar, 196614, 24);
                break;
            case 1:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.e.a(com.yandex.passport.common.ui.compose.d.c((AppTheme) obj3, fidVar2), false, wwg.S(-1144470166, true, new com.yandex.passport.internal.social.esia.f((EsiaBindActivity) obj4), fidVar2), fidVar2, 384, 2);
                break;
            case 2:
                fid fidVar3 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar3;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                boolean c = com.yandex.passport.common.ui.compose.d.c((AppTheme) obj3, fidVar3);
                passportProcessGlobalComponent = ((AccountUpgraderActivity) obj4).component;
                boolean z = passportProcessGlobalComponent.getProperties().w;
                com.yandex.passport.internal.ui.account_upgrade.i.a.getClass();
                com.yandex.passport.common.ui.compose.theme.e.a(c, z, com.yandex.passport.internal.ui.account_upgrade.i.b, fidVar3, 384, 0);
                break;
            case 3:
                fid fidVar4 = (fid) obj;
                DeleteAccountActivity deleteAccountActivity = (DeleteAccountActivity) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar4 = (bts) fidVar4;
                    if (btsVar4.E()) {
                        btsVar4.Y();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.e.a(com.yandex.passport.common.ui.compose.d.c((AppTheme) obj3, fidVar4), deleteAccountActivity.getComponent$passport_release().isWhiteLabel(), wwg.S(333741817, true, new t(i5, deleteAccountActivity), fidVar4), fidVar4, 384, 0);
                break;
            case 4:
                fid fidVar5 = (fid) obj;
                StandaloneSlothComposeActivity standaloneSlothComposeActivity = (StandaloneSlothComposeActivity) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar5 = (bts) fidVar5;
                    if (btsVar5.E()) {
                        btsVar5.Y();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.e.a(com.yandex.passport.common.ui.compose.d.c((AppTheme) obj3, fidVar5), standaloneSlothComposeActivity.getComponent$passport_release().isWhiteLabel(), wwg.S(1539540465, true, new t(5, standaloneSlothComposeActivity), fidVar5), fidVar5, 384, 0);
                break;
            case 5:
                fid fidVar6 = (fid) obj;
                AuthSdkSlothComposeActivity authSdkSlothComposeActivity = (AuthSdkSlothComposeActivity) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar6 = (bts) fidVar6;
                    if (btsVar6.E()) {
                        btsVar6.Y();
                        break;
                    }
                }
                com.yandex.passport.internal.ui.sloth.authsdk.k kVar = (com.yandex.passport.internal.ui.sloth.authsdk.k) obj3;
                bts btsVar7 = (bts) fidVar6;
                btsVar7.e0(1403129560);
                boolean k = btsVar7.k(authSdkSlothComposeActivity);
                Object Q = btsVar7.Q();
                if (k || Q == o430Var) {
                    Q = new com.yandex.passport.internal.analytics.a0(20, authSdkSlothComposeActivity);
                    btsVar7.o0(Q);
                }
                btsVar7.t(false);
                com.yandex.passport.internal.ui.sloth.authsdk.o.a(kVar, (tls) Q, btsVar7, 0);
                break;
            case 6:
                fid fidVar7 = (fid) obj;
                BiometricVerificationActivity biometricVerificationActivity = (BiometricVerificationActivity) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar8 = (bts) fidVar7;
                    if (btsVar8.E()) {
                        btsVar8.Y();
                        break;
                    }
                }
                boolean c2 = com.yandex.passport.common.ui.compose.d.c((AppTheme) obj3, fidVar7);
                dVar = biometricVerificationActivity.component;
                if (dVar == null) {
                    dVar = null;
                }
                com.yandex.passport.common.ui.compose.theme.e.a(c2, dVar.isWhiteLabel(), wwg.S(-1997001185, true, new t(i2, biometricVerificationActivity), fidVar7), fidVar7, 384, 0);
                break;
            case 7:
                fid fidVar8 = (fid) obj;
                ManagingPlusDevicesActivity managingPlusDevicesActivity = (ManagingPlusDevicesActivity) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar9 = (bts) fidVar8;
                    if (btsVar9.E()) {
                        btsVar9.Y();
                        break;
                    }
                }
                com.yandex.passport.internal.ui.sloth.plusdevices.b bVar = (com.yandex.passport.internal.ui.sloth.plusdevices.b) obj3;
                bts btsVar10 = (bts) fidVar8;
                btsVar10.e0(1382678247);
                boolean k2 = btsVar10.k(managingPlusDevicesActivity);
                Object Q2 = btsVar10.Q();
                if (k2 || Q2 == o430Var) {
                    Q2 = new com.yandex.passport.internal.flags.experiments.h(28, managingPlusDevicesActivity);
                    btsVar10.o0(Q2);
                }
                sls slsVar = (sls) Q2;
                btsVar10.t(false);
                btsVar10.e0(1382679919);
                boolean k3 = btsVar10.k(managingPlusDevicesActivity);
                Object Q3 = btsVar10.Q();
                if (k3 || Q3 == o430Var) {
                    Q3 = new com.yandex.passport.internal.analytics.a0(21, managingPlusDevicesActivity);
                    btsVar10.o0(Q3);
                }
                btsVar10.t(false);
                com.yandex.passport.internal.ui.sloth.plusdevices.r.a(bVar, slsVar, (tls) Q3, btsVar10, 0);
                break;
            case 8:
                fid fidVar9 = (fid) obj;
                RegisterWebAuthNActivity registerWebAuthNActivity = (RegisterWebAuthNActivity) obj4;
                if ((3 & ((Number) obj2).intValue()) == 2) {
                    bts btsVar11 = (bts) fidVar9;
                    if (btsVar11.E()) {
                        btsVar11.Y();
                        break;
                    }
                }
                com.yandex.passport.internal.ui.sloth.webauthn.c cVar = (com.yandex.passport.internal.ui.sloth.webauthn.c) obj3;
                bts btsVar12 = (bts) fidVar9;
                btsVar12.e0(583286572);
                boolean k4 = btsVar12.k(registerWebAuthNActivity);
                Object Q4 = btsVar12.Q();
                if (k4 || Q4 == o430Var) {
                    Q4 = new com.yandex.passport.internal.ui.sloth.plusdevices.w(1, registerWebAuthNActivity);
                    btsVar12.o0(Q4);
                }
                sls slsVar2 = (sls) Q4;
                btsVar12.t(false);
                btsVar12.e0(583288260);
                boolean k5 = btsVar12.k(registerWebAuthNActivity);
                Object Q5 = btsVar12.Q();
                if (k5 || Q5 == o430Var) {
                    Q5 = new com.yandex.passport.internal.ui.bouncer.error.n(6, registerWebAuthNActivity);
                    btsVar12.o0(Q5);
                }
                btsVar12.t(false);
                com.yandex.passport.internal.ui.sloth.webauthn.h.a(cVar, slsVar2, (wls) Q5, btsVar12, 0);
                break;
            default:
                fid fidVar10 = (fid) obj;
                final WebCardComposeActivity webCardComposeActivity = (WebCardComposeActivity) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar13 = (bts) fidVar10;
                    if (btsVar13.E()) {
                        btsVar13.Y();
                        break;
                    }
                }
                com.yandex.passport.internal.ui.sloth.webcard.e eVar = (com.yandex.passport.internal.ui.sloth.webcard.e) obj3;
                bts btsVar14 = (bts) fidVar10;
                btsVar14.e0(2061486675);
                boolean k6 = btsVar14.k(webCardComposeActivity);
                Object Q6 = btsVar14.Q();
                if (k6 || Q6 == o430Var) {
                    Q6 = new com.yandex.passport.internal.ui.sloth.plusdevices.w(3, webCardComposeActivity);
                    btsVar14.o0(Q6);
                }
                sls slsVar3 = (sls) Q6;
                btsVar14.t(false);
                btsVar14.e0(2061488358);
                boolean k7 = btsVar14.k(webCardComposeActivity);
                Object Q7 = btsVar14.Q();
                if (k7 || Q7 == o430Var) {
                    Q7 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.webcard.c
                        @Override // defpackage.tls
                        public final Object invoke(Object obj5) {
                            int i6 = i3;
                            zy11 zy11Var2 = zy11.a;
                            switch (i6) {
                                case 0:
                                    q0 q0Var = (q0) obj5;
                                    WebCardComposeActivity webCardComposeActivity2 = webCardComposeActivity;
                                    if (webCardComposeActivity2.getCallingActivity() == null) {
                                        webCardComposeActivity2.finishAndRemoveTask();
                                        break;
                                    } else {
                                        com.yandex.passport.internal.ui.c.k(webCardComposeActivity2, com.yandex.passport.internal.ui.sloth.e.p(q0Var));
                                        break;
                                    }
                                default:
                                    com.yandex.passport.internal.ui.f fVar = (com.yandex.passport.internal.ui.f) obj5;
                                    com.yandex.passport.internal.ui.webview.b bVar2 = WebViewActivity.Companion;
                                    PassportEnvironmentImpl y = com.yandex.passport.internal.util.p.y(fVar.c);
                                    PassportTheme passportTheme = PassportTheme.LIGHT;
                                    WebCaseType webCaseType = WebCaseType.CHANGE_PASSWORD;
                                    String str = fVar.a;
                                    Uri uri = fVar.b;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("url", str);
                                    bundle.putParcelable("return_url", uri);
                                    WebCardComposeActivity webCardComposeActivity3 = webCardComposeActivity;
                                    webCardComposeActivity3.startActivity(com.yandex.passport.internal.ui.webview.b.b(bVar2, y, webCardComposeActivity3, passportTheme, webCaseType, bundle));
                                    webCardComposeActivity3.finish();
                                    break;
                            }
                            return zy11Var2;
                        }
                    };
                    btsVar14.o0(Q7);
                }
                tls tlsVar = (tls) Q7;
                btsVar14.t(false);
                btsVar14.e0(2061498187);
                boolean k8 = btsVar14.k(webCardComposeActivity);
                Object Q8 = btsVar14.Q();
                if (k8 || Q8 == o430Var) {
                    Q8 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.webcard.c
                        @Override // defpackage.tls
                        public final Object invoke(Object obj5) {
                            int i6 = i4;
                            zy11 zy11Var2 = zy11.a;
                            switch (i6) {
                                case 0:
                                    q0 q0Var = (q0) obj5;
                                    WebCardComposeActivity webCardComposeActivity2 = webCardComposeActivity;
                                    if (webCardComposeActivity2.getCallingActivity() == null) {
                                        webCardComposeActivity2.finishAndRemoveTask();
                                        break;
                                    } else {
                                        com.yandex.passport.internal.ui.c.k(webCardComposeActivity2, com.yandex.passport.internal.ui.sloth.e.p(q0Var));
                                        break;
                                    }
                                default:
                                    com.yandex.passport.internal.ui.f fVar = (com.yandex.passport.internal.ui.f) obj5;
                                    com.yandex.passport.internal.ui.webview.b bVar2 = WebViewActivity.Companion;
                                    PassportEnvironmentImpl y = com.yandex.passport.internal.util.p.y(fVar.c);
                                    PassportTheme passportTheme = PassportTheme.LIGHT;
                                    WebCaseType webCaseType = WebCaseType.CHANGE_PASSWORD;
                                    String str = fVar.a;
                                    Uri uri = fVar.b;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("url", str);
                                    bundle.putParcelable("return_url", uri);
                                    WebCardComposeActivity webCardComposeActivity3 = webCardComposeActivity;
                                    webCardComposeActivity3.startActivity(com.yandex.passport.internal.ui.webview.b.b(bVar2, y, webCardComposeActivity3, passportTheme, webCaseType, bundle));
                                    webCardComposeActivity3.finish();
                                    break;
                            }
                            return zy11Var2;
                        }
                    };
                    btsVar14.o0(Q8);
                }
                btsVar14.t(false);
                com.yandex.passport.internal.ui.sloth.webcard.k.b(eVar, slsVar3, tlsVar, (tls) Q8, btsVar14, 0);
                break;
        }
        return zy11Var;
    }
}
