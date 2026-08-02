package com.yandex.go.places.complaint.impl.domain.interactors;

import defpackage.d3a;
import defpackage.k7x0;
import defpackage.pwy0;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.experiments.d;

/* loaded from: classes13.dex */
public final class a {
    public final d3a a;
    public final k7x0 b;
    public final pwy0 c;

    public a(d3a d3aVar, k7x0 k7x0Var, pwy0 pwy0Var) {
        this.a = d3aVar;
        this.b = k7x0Var;
        this.c = pwy0Var;
    }

    public final m0 a() {
        return new m0(d.b(this.a), this.c.a(), new ComplaintUiStateInteractor$uiStateFLow$1(this, null));
    }
}
