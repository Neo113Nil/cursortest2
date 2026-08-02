package com.yandex.go.masstransit.sdk.ble.impl.modal;

import defpackage.gci0;
import defpackage.i47;
import defpackage.jse;
import defpackage.n26;
import defpackage.pl30;
import defpackage.t16;
import defpackage.tpr;
import defpackage.xl10;
import defpackage.yt11;

/* loaded from: classes6.dex */
public final class e implements yt11 {
    public final n26 a;
    public final i47 b;
    public final tpr c;

    public e(n26 n26Var, xl10 xl10Var, xl10 xl10Var2, pl30 pl30Var, i47 i47Var, jse jseVar) {
        this.a = n26Var;
        this.b = i47Var;
        gci0 gci0Var = pl30Var.b;
        ru.yandex.taxi.masstransit.geopayment.adapter.a aVar = (ru.yandex.taxi.masstransit.geopayment.adapter.a) xl10Var.a;
        this.c = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.l(gci0Var, kotlinx.coroutines.flow.e.d(aVar.b), kotlinx.coroutines.flow.e.d(aVar.c), ((t16) xl10Var2.a).a.d, pl30Var.d, new MtGeoPaymentModalUiStateInteractor$uiStateFlow$1(this, null))), jseVar);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.c;
    }
}
