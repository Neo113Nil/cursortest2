package com.yandex.passport.internal.flags.presentation;

import com.yandex.passport.internal.ui.challenge.delete.DeleteAccountActivity;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.router.GlobalRouterBackground;
import com.yandex.passport.internal.ui.sloth.StandaloneSlothComposeActivity;
import com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationActivity;
import defpackage.agc;
import defpackage.bq11;
import defpackage.bts;
import defpackage.dgc;
import defpackage.did;
import defpackage.eq11;
import defpackage.fid;
import defpackage.o430;
import defpackage.oz40;
import defpackage.sls;
import defpackage.tls;
import defpackage.vi91;
import defpackage.vqy0;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class t implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        oz40 oz40Var;
        com.yandex.passport.internal.ui.sloth.ebs.d dVar;
        int i = this.a;
        o430 o430Var = did.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
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
                String str = (String) obj3;
                if (str == null) {
                    str = "";
                }
                bts btsVar2 = (bts) fidVar;
                vqy0.c(str, null, ((agc) btsVar2.m(dgc.a)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar2.m(eq11.a)).k, fidVar, 0, 0, 131066);
                break;
            case 1:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                androidx.compose.material3.a.e((androidx.compose.material3.y) obj3, null, null, fidVar2, 0);
                break;
            case 2:
                fid fidVar3 = (fid) obj;
                sls slsVar = (sls) obj3;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar4 = (bts) fidVar3;
                    if (btsVar4.E()) {
                        btsVar4.Y();
                        break;
                    }
                }
                bts btsVar5 = (bts) fidVar3;
                btsVar5.e0(1704844398);
                boolean k = btsVar5.k(slsVar);
                Object Q = btsVar5.Q();
                if (k || Q == o430Var) {
                    Q = new k(4, slsVar);
                    btsVar5.o0(Q);
                }
                btsVar5.t(false);
                i.a.getClass();
                vi91.a((sls) Q, null, false, null, null, null, i.c, btsVar5, 1572864, 62);
                break;
            case 3:
                fid fidVar4 = (fid) obj;
                DeleteAccountActivity deleteAccountActivity = (DeleteAccountActivity) obj3;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar6 = (bts) fidVar4;
                    if (btsVar6.E()) {
                        btsVar6.Y();
                        break;
                    }
                }
                com.yandex.passport.internal.ui.challenge.delete.b component$passport_release = deleteAccountActivity.getComponent$passport_release();
                bts btsVar7 = (bts) fidVar4;
                btsVar7.e0(1916560061);
                boolean e = btsVar7.e(deleteAccountActivity);
                Object Q2 = btsVar7.Q();
                if (e || Q2 == o430Var) {
                    Q2 = new com.yandex.passport.internal.analytics.a0(14, deleteAccountActivity);
                    btsVar7.o0(Q2);
                }
                btsVar7.t(false);
                com.yandex.passport.internal.ui.challenge.delete.g.a(component$passport_release, (tls) Q2, btsVar7, 0);
                break;
            case 4:
                fid fidVar5 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar8 = (bts) fidVar5;
                    if (btsVar8.E()) {
                        btsVar8.Y();
                        break;
                    }
                }
                oz40Var = ((GlobalRouterActivity) obj3).backgroundState;
                com.yandex.passport.internal.ui.router.f.a((GlobalRouterBackground) oz40Var.getValue(), fidVar5, 0);
                break;
            case 5:
                fid fidVar6 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar9 = (bts) fidVar6;
                    if (btsVar9.E()) {
                        btsVar9.Y();
                        break;
                    }
                }
                com.yandex.passport.sloth.ui.w.b(((StandaloneSlothComposeActivity) obj3).getComponent$passport_release(), null, fidVar6, 0, 2);
                break;
            default:
                fid fidVar7 = (fid) obj;
                BiometricVerificationActivity biometricVerificationActivity = (BiometricVerificationActivity) obj3;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar10 = (bts) fidVar7;
                    if (btsVar10.E()) {
                        btsVar10.Y();
                        break;
                    }
                }
                dVar = biometricVerificationActivity.component;
                com.yandex.passport.internal.ui.sloth.ebs.d dVar2 = dVar != null ? dVar : null;
                bts btsVar11 = (bts) fidVar7;
                btsVar11.e0(899567714);
                boolean e2 = btsVar11.e(biometricVerificationActivity);
                Object Q3 = btsVar11.Q();
                if (e2 || Q3 == o430Var) {
                    Q3 = new com.yandex.passport.internal.ui.sloth.ebs.a(biometricVerificationActivity, 1);
                    btsVar11.o0(Q3);
                }
                sls slsVar2 = (sls) Q3;
                btsVar11.t(false);
                btsVar11.e0(899569543);
                boolean e3 = btsVar11.e(biometricVerificationActivity);
                Object Q4 = btsVar11.Q();
                if (e3 || Q4 == o430Var) {
                    Q4 = new com.yandex.passport.internal.ui.bouncer.error.n(5, biometricVerificationActivity);
                    btsVar11.o0(Q4);
                }
                btsVar11.t(false);
                com.yandex.passport.internal.ui.sloth.ebs.l.a(dVar2, slsVar2, (wls) Q4, btsVar11, 0);
                break;
        }
        return zy11Var;
    }
}
