package com.yandex.messaging.ui.migration;

import defpackage.bts;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.i9a1;
import defpackage.ljs0;
import defpackage.o430;
import defpackage.olb1;
import defpackage.sls;
import defpackage.tfx;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class a implements wls {
    public final /* synthetic */ MigrationEnvironmentActivity a;

    public a(MigrationEnvironmentActivity migrationEnvironmentActivity) {
        this.a = migrationEnvironmentActivity;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        fid fidVar = (fid) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        f530 g = i9a1.g(ljs0.c);
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(1222156962);
        MigrationEnvironmentActivity migrationEnvironmentActivity = this.a;
        boolean k = btsVar2.k(migrationEnvironmentActivity);
        Object Q = btsVar2.Q();
        o430 o430Var = did.a;
        if (k || Q == o430Var) {
            MigrationEnvironmentActivity$onCreate$1$1$1$1 migrationEnvironmentActivity$onCreate$1$1$1$1 = new MigrationEnvironmentActivity$onCreate$1$1$1$1(0, migrationEnvironmentActivity, MigrationEnvironmentActivity.class, "logoutAndExit", "logoutAndExit()V", 0);
            btsVar2.o0(migrationEnvironmentActivity$onCreate$1$1$1$1);
            Q = migrationEnvironmentActivity$onCreate$1$1$1$1;
        }
        btsVar2.t(false);
        sls slsVar = (sls) ((tfx) Q);
        btsVar2.e0(1222159053);
        boolean k2 = btsVar2.k(migrationEnvironmentActivity);
        Object Q2 = btsVar2.Q();
        if (k2 || Q2 == o430Var) {
            MigrationEnvironmentActivity$onCreate$1$1$2$1 migrationEnvironmentActivity$onCreate$1$1$2$1 = new MigrationEnvironmentActivity$onCreate$1$1$2$1(0, migrationEnvironmentActivity, MigrationEnvironmentActivity.class, "openTelemostInGooglePlay", "openTelemostInGooglePlay()V", 0);
            btsVar2.o0(migrationEnvironmentActivity$onCreate$1$1$2$1);
            Q2 = migrationEnvironmentActivity$onCreate$1$1$2$1;
        }
        btsVar2.t(false);
        olb1.a(0, btsVar2, slsVar, (sls) ((tfx) Q2), g);
        return zy11.a;
    }
}
