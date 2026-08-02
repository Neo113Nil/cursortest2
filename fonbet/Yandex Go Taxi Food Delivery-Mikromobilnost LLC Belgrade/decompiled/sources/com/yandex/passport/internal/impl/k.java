package com.yandex.passport.internal.impl;

import com.yandex.passport.api.b2;
import com.yandex.passport.api.h0;
import com.yandex.passport.api.j3;
import com.yandex.passport.api.o1;
import com.yandex.passport.api.r0;
import com.yandex.passport.api.w;
import com.yandex.passport.api.x0;
import defpackage.qf91;
import defpackage.tje;
import defpackage.u40;

/* loaded from: classes8.dex */
public final /* synthetic */ class k implements u40 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.u40
    public final void a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                o oVar = (o) obj2;
                tje.N(oVar.a, null, null, new KPassportUiApiImpl$selectAvailableAccountLauncher$lambda$3$$inlined$emitOn$1(oVar.d, null, (w) obj), 3);
                break;
            case 1:
                o oVar2 = (o) obj2;
                tje.N(oVar2.a, null, null, new KPassportUiApiImpl$deleteAccountForeverWithPropertiesLauncher$lambda$20$$inlined$emitOn$1(oVar2.i, null, (r0) obj), 3);
                break;
            case 2:
                o oVar3 = (o) obj2;
                tje.N(oVar3.a, null, null, new KPassportUiApiImpl$requestCredentialManagerLauncher$lambda$22$$inlined$emitOn$1(oVar3.k, null, (com.yandex.passport.internal.sloth.credentialmanager.a) obj), 3);
                break;
            case 3:
                o oVar4 = (o) obj2;
                tje.N(oVar4.a, null, null, new KPassportUiApiImpl$upgradePhonishLauncher$lambda$24$$inlined$emitOn$1(oVar4.j, null, (w) obj), 3);
                break;
            case 4:
                o oVar5 = (o) obj2;
                tje.N(oVar5.a, null, null, new KPassportUiApiImpl$managingPlusDevicesLauncher$lambda$26$$inlined$emitOn$1(oVar5.l, null, (o1) obj), 3);
                break;
            case 5:
                o oVar6 = (o) obj2;
                tje.N(oVar6.a, null, null, new KPassportUiApiImpl$managingPlusDevicesComposeLauncher$lambda$28$$inlined$emitOn$1(oVar6.l, null, (o1) obj), 3);
                break;
            case 6:
                o oVar7 = (o) obj2;
                tje.N(oVar7.a, null, null, new KPassportUiApiImpl$biometricVerificationLauncher$lambda$30$$inlined$emitOn$1(oVar7.m, null, (h0) obj), 3);
                break;
            case 7:
                o oVar8 = (o) obj2;
                tje.N(oVar8.a, null, null, new KPassportUiApiImpl$registerWebAuthNLauncher$lambda$34$$inlined$emitOn$1(oVar8.n, null, (b2) obj), 3);
                break;
            case 8:
                o oVar9 = (o) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                tje.N(oVar9.a, null, null, new KPassportUiApiImpl$socialApplicationBindLauncher$lambda$5$$inlined$emitOn$1(oVar9.e, null, booleanValue), 3);
                break;
            case 9:
                o oVar10 = (o) obj2;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                tje.N(oVar10.a, null, null, new KPassportUiApiImpl$socialBindLauncher$lambda$7$$inlined$emitOn$1(oVar10.f, null, booleanValue2), 3);
                break;
            case 10:
                o oVar11 = (o) obj2;
                tje.N(oVar11.a, null, null, new KPassportUiApiImpl$esiaBindLauncher$lambda$9$$inlined$emitOn$1(oVar11.g, null, (x0) obj), 3);
                break;
            case 11:
                o oVar12 = (o) obj2;
                tje.N(oVar12.a, null, null, new KPassportUiApiImpl$showUserMenuLauncher$lambda$16$$inlined$emitOn$1(oVar12.h, null, (j3) obj), 3);
                break;
            case 12:
                o oVar13 = (o) obj2;
                tje.N(oVar13.a, null, null, new KPassportUiApiImpl$deleteAccountForeverLauncher$lambda$18$$inlined$emitOn$1(oVar13.i, null, (r0) obj), 3);
                break;
            default:
                qf91 qf91Var = ((com.yandex.plus.core.activity.result.internal.d) obj2).w;
                if (qf91Var != null) {
                    qf91Var.a(obj);
                    break;
                }
                break;
        }
    }
}
