package com.yandex.go.scooters.ignition.controlling.disabling_confirmation;

import defpackage.brn0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yt11;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class b implements yt11 {
    public final c a;
    public final brn0 b;
    public final tpr c;

    public b(tt2 tt2Var, c cVar, brn0 brn0Var) {
        this.a = cVar;
        this.b = brn0Var;
        rol0 rol0Var = new rol0(new ScootersIgnitionControllingDisablingConfirmationUiStateInteractor$uiStateFlow$1(this, null));
        tt2Var.getClass();
        this.c = e.F(rol0Var, uyj.a);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.c;
    }
}
