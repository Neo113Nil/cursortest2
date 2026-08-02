package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.internal.ui.bouncer.model.u1;
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
public final class k implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ u1 c;

    public /* synthetic */ k(l lVar, u1 u1Var, int i) {
        this.a = i;
        this.b = lVar;
        this.c = u1Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 0;
        u1 u1Var = this.c;
        l lVar = this.b;
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
                b build = lVar.E.setMasters(u1Var.b).setCreateMasterEnterPhoneNumberOption(u1Var.a).build();
                bts btsVar2 = (bts) fidVar;
                btsVar2.e0(796112249);
                boolean e = btsVar2.e(lVar);
                Object Q = btsVar2.Q();
                o430 o430Var = did.a;
                if (e || Q == o430Var) {
                    Q = new com.yandex.passport.internal.flags.experiments.h(10, lVar);
                    btsVar2.o0(Q);
                }
                sls slsVar = (sls) Q;
                btsVar2.t(false);
                btsVar2.e0(796114854);
                boolean e2 = btsVar2.e(lVar);
                Object Q2 = btsVar2.Q();
                if (e2 || Q2 == o430Var) {
                    Q2 = new com.yandex.passport.internal.analytics.a0(9, lVar);
                    btsVar2.o0(Q2);
                }
                btsVar2.t(false);
                j.a(build, slsVar, (tls) Q2, null, btsVar2, 0, 8);
                break;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.e.a(false, false, wwg.S(-1602580842, true, new k(lVar, u1Var, i2), fidVar2), fidVar2, 384, 3);
                break;
        }
        return zy11Var;
    }
}
