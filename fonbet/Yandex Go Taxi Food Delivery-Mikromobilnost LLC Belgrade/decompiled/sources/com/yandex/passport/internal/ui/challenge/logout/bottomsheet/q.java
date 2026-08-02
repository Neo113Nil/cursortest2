package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.sloth.authsdk.AuthSdkSlothComposeActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesActivity;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardComposeActivity;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.o430;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class q implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ q(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        int i2 = 1;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                PassportLogoutPropertiesImpl passportLogoutPropertiesImpl = (PassportLogoutPropertiesImpl) obj3;
                s sVar = (s) obj5;
                LogoutBottomSheetComposeActivity logoutBottomSheetComposeActivity = (LogoutBottomSheetComposeActivity) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                z = logoutBottomSheetComposeActivity.shouldShowBottomSheet;
                s sVar2 = (s) obj5;
                bts btsVar2 = (bts) fidVar;
                btsVar2.e0(973390361);
                boolean e = btsVar2.e(logoutBottomSheetComposeActivity);
                Object Q = btsVar2.Q();
                int i3 = 0;
                o430 o430Var = did.a;
                if (e || Q == o430Var) {
                    Q = new o(i3, logoutBottomSheetComposeActivity);
                    btsVar2.o0(Q);
                }
                tls tlsVar = (tls) Q;
                btsVar2.t(false);
                btsVar2.e0(973393986);
                boolean e2 = btsVar2.e(sVar) | btsVar2.e(logoutBottomSheetComposeActivity) | btsVar2.e(passportLogoutPropertiesImpl);
                Object Q2 = btsVar2.Q();
                if (e2 || Q2 == o430Var) {
                    Q2 = new com.yandex.passport.internal.flags.presentation.v0(3, sVar, logoutBottomSheetComposeActivity, passportLogoutPropertiesImpl);
                    btsVar2.o0(Q2);
                }
                tls tlsVar2 = (tls) Q2;
                btsVar2.t(false);
                btsVar2.e0(973407160);
                boolean e3 = btsVar2.e(sVar) | btsVar2.e(logoutBottomSheetComposeActivity) | btsVar2.e(passportLogoutPropertiesImpl);
                Object Q3 = btsVar2.Q();
                if (e3 || Q3 == o430Var) {
                    Q3 = new com.yandex.passport.internal.ui.bouncer.chooser.d(i2, sVar, logoutBottomSheetComposeActivity, passportLogoutPropertiesImpl);
                    btsVar2.o0(Q3);
                }
                sls slsVar = (sls) Q3;
                btsVar2.t(false);
                btsVar2.e0(973430288);
                boolean e4 = btsVar2.e(logoutBottomSheetComposeActivity);
                Object Q4 = btsVar2.Q();
                if (e4 || Q4 == o430Var) {
                    Q4 = new p(i3, logoutBottomSheetComposeActivity);
                    btsVar2.o0(Q4);
                }
                btsVar2.t(false);
                b0.a(sVar2, z, tlsVar, tlsVar2, slsVar, (sls) Q4, btsVar2, 0);
                break;
            case 1:
                fid fidVar2 = (fid) obj;
                if ((3 & ((Number) obj2).intValue()) == 2) {
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.e.a(com.yandex.passport.common.ui.compose.d.c((AppTheme) obj4, fidVar2), ((PassportProcessGlobalComponent) obj5).getProperties().w, wwg.S(68152242, true, new com.yandex.passport.internal.flags.presentation.t(4, (GlobalRouterActivity) obj3), fidVar2), fidVar2, 384, 0);
                break;
            case 2:
                fid fidVar3 = (fid) obj;
                com.yandex.passport.internal.ui.sloth.authsdk.k kVar = (com.yandex.passport.internal.ui.sloth.authsdk.k) obj5;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar4 = (bts) fidVar3;
                    if (btsVar4.E()) {
                        btsVar4.Y();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.e.a(com.yandex.passport.common.ui.compose.d.c((AppTheme) obj4, fidVar3), kVar.isWhiteLabel(), wwg.S(-1236312741, true, new com.yandex.passport.internal.flags.presentation.f1(5, kVar, (AuthSdkSlothComposeActivity) obj3), fidVar3), fidVar3, 384, 0);
                break;
            case 3:
                fid fidVar4 = (fid) obj;
                com.yandex.passport.internal.ui.sloth.plusdevices.b bVar = (com.yandex.passport.internal.ui.sloth.plusdevices.b) obj5;
                if ((3 & ((Number) obj2).intValue()) == 2) {
                    bts btsVar5 = (bts) fidVar4;
                    if (btsVar5.E()) {
                        btsVar5.Y();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.e.a(com.yandex.passport.common.ui.compose.d.c((AppTheme) obj4, fidVar4), bVar.isWhiteLabel(), wwg.S(-1024388948, true, new com.yandex.passport.internal.flags.presentation.f1(7, bVar, (ManagingPlusDevicesActivity) obj3), fidVar4), fidVar4, 384, 0);
                break;
            case 4:
                fid fidVar5 = (fid) obj;
                com.yandex.passport.internal.ui.sloth.webauthn.c cVar = (com.yandex.passport.internal.ui.sloth.webauthn.c) obj5;
                if ((3 & ((Number) obj2).intValue()) == 2) {
                    bts btsVar6 = (bts) fidVar5;
                    if (btsVar6.E()) {
                        btsVar6.Y();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.e.a(com.yandex.passport.common.ui.compose.d.c((AppTheme) obj4, fidVar5), cVar.isWhiteLabel(), wwg.S(-1107412191, true, new com.yandex.passport.internal.flags.presentation.f1(8, cVar, (RegisterWebAuthNActivity) obj3), fidVar5), fidVar5, 384, 0);
                break;
            default:
                fid fidVar6 = (fid) obj;
                com.yandex.passport.internal.ui.sloth.webcard.e eVar = (com.yandex.passport.internal.ui.sloth.webcard.e) obj5;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar7 = (bts) fidVar6;
                    if (btsVar7.E()) {
                        btsVar7.Y();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.e.a(com.yandex.passport.common.ui.compose.d.c((AppTheme) obj4, fidVar6), eVar.isWhiteLabel(), wwg.S(-2070297799, true, new com.yandex.passport.internal.flags.presentation.f1(9, eVar, (WebCardComposeActivity) obj3), fidVar6), fidVar6, 384, 0);
                break;
        }
        return zy11Var;
    }
}
