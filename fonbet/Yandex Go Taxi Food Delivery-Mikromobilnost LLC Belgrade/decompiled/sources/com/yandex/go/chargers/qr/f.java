package com.yandex.go.chargers.qr;

import defpackage.d3a;
import defpackage.joa;
import defpackage.v7j0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class f {
    public final v7j0 a;
    public final m0 b;

    public f(joa joaVar, v7j0 v7j0Var, d3a d3aVar) {
        this.a = v7j0Var;
        this.b = new m0(kotlinx.coroutines.flow.e.d(joaVar.a), new e(ru.yandex.taxi.experiments.d.b(d3aVar)), new ChargersQrUiStateInteractor$uiState$1(this, null));
    }
}
