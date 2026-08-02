package com.yandex.go.scooters.qr.unavailable_scooter.domain;

import com.yandex.go.scooters.qr.unavailable_scooter.data.model.ScootersQrUnavailableScooterExperiment;
import com.yandex.go.scooters.qr.unavailable_scooter.ui.d;
import defpackage.n7p0;
import defpackage.pwy0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class a {
    public final tt2 a;
    public final pwy0 b;
    public final d c;
    public final com.yandex.go.scooters.qr.unavailable_scooter.data.a d;

    public a(tt2 tt2Var, pwy0 pwy0Var, d dVar, com.yandex.go.scooters.qr.unavailable_scooter.data.a aVar) {
        this.a = tt2Var;
        this.b = pwy0Var;
        this.c = dVar;
        this.d = aVar;
    }

    public final tpr a(n7p0 n7p0Var) {
        ScootersQrUnavailableScooterExperiment.Companion.getClass();
        tpr t = e.t(new m0(com.yandex.go.scooters.utils.a.a(this.d, ScootersQrUnavailableScooterExperiment.h), this.b.a(), new ScootersQrUnavailableScooterUiStateInteractor$uiStateFlow$1(n7p0Var, this, null)));
        this.a.getClass();
        return e.F(t, uyj.a);
    }
}
