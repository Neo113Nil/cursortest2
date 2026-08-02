package com.yandex.go.masstransit.sdk.ble.impl.modal;

import androidx.lifecycle.Lifecycle;
import defpackage.as6;
import defpackage.fl10;
import defpackage.k26;
import defpackage.lx4;
import defpackage.n26;
import defpackage.na1;
import defpackage.pl30;
import defpackage.r26;
import defpackage.s26;
import defpackage.sls;
import defpackage.sy00;
import defpackage.tje;
import defpackage.tse;
import defpackage.u16;
import defpackage.u26;
import defpackage.xl10;
import defpackage.z26;
import defpackage.zy11;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes12.dex */
public final class d {
    public final u16 a;
    public final ru.yandex.taxi.masstransit.geopayment.adapter.a b;
    public final xl10 c;
    public final z26 d;
    public final xl10 e;
    public final Lifecycle f;
    public final com.yandex.go.masstransit.sdk.ble.impl.domain.a g;
    public final fl10 h;
    public final pl30 i;

    public d(u16 u16Var, ru.yandex.taxi.masstransit.geopayment.adapter.a aVar, xl10 xl10Var, z26 z26Var, xl10 xl10Var2, Lifecycle lifecycle, com.yandex.go.masstransit.sdk.ble.impl.domain.a aVar2, fl10 fl10Var, pl30 pl30Var) {
        this.a = u16Var;
        this.b = aVar;
        this.c = xl10Var;
        this.d = z26Var;
        this.e = xl10Var2;
        this.f = lifecycle;
        this.g = aVar2;
        this.h = fl10Var;
        this.i = pl30Var;
    }

    public final void a(n26 n26Var, final tse tseVar) {
        u26 u26Var;
        final int i = 1;
        sls slsVar = new sls() { // from class: com.yandex.go.masstransit.sdk.ble.impl.modal.a
            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                zy11 zy11Var = zy11.a;
                d dVar = this;
                tse tseVar2 = tseVar;
                switch (i2) {
                    case 0:
                        tje.N(tseVar2, null, null, new MtGeoPaymentLifecycleListener$subscribeToBluetoothScanPermission$1$1(dVar, null), 3);
                        break;
                    default:
                        tje.N(tseVar2, null, null, new MtGeoPaymentLifecycleListener$subscribeToLocationPermission$1$1(dVar, null), 3);
                        break;
                }
                return zy11Var;
            }
        };
        ru.yandex.taxi.masstransit.geopayment.adapter.a aVar = this.b;
        ((com.yandex.go.permission.b) aVar.a).c(1, new s26(1, slsVar));
        final int i2 = 0;
        ((com.yandex.go.permission.b) aVar.a).c(11, new s26(0, new sls() { // from class: com.yandex.go.masstransit.sdk.ble.impl.modal.a
            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                d dVar = this;
                tse tseVar2 = tseVar;
                switch (i22) {
                    case 0:
                        tje.N(tseVar2, null, null, new MtGeoPaymentLifecycleListener$subscribeToBluetoothScanPermission$1$1(dVar, null), 3);
                        break;
                    default:
                        tje.N(tseVar2, null, null, new MtGeoPaymentLifecycleListener$subscribeToLocationPermission$1$1(dVar, null), 3);
                        break;
                }
                return zy11Var;
            }
        }));
        tje.N(tseVar, null, null, new MtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1(this, null), 3);
        this.f.a(new b(tseVar, this));
        tje.N(tseVar, null, null, new MtGeoPaymentLifecycleListener$collectPermissionsFlow$1(this, n26Var, tseVar, null), 3);
        tje.N(tseVar, null, null, new MtGeoPaymentLifecycleListener$collectConnectivityRestored$1(this, n26Var, tseVar, null), 3);
        sy00 sy00Var = this.a.a;
        lx4 lx4Var = sy00Var.a;
        ((na1) sy00Var.b).getClass();
        ((j) lx4Var).v(as6.G());
        r26 r26Var = n26Var.a;
        k26 k26Var = r26Var != null ? r26Var.b : null;
        if (k26Var == null || (u26Var = k26Var.f) == null || !u26Var.a) {
            return;
        }
        this.g.a.c(u26Var, tseVar);
    }
}
