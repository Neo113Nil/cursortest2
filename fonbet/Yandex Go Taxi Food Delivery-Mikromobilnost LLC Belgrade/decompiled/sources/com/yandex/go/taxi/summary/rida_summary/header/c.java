package com.yandex.go.taxi.summary.rida_summary.header;

import com.yandex.go.taxi.summary.rida_summary.repository.i;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.s5k0;
import defpackage.tpr;
import defpackage.wiq0;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class c implements s5k0 {
    public final e a;
    public final m0 b;

    public c(wiq0 wiq0Var, i iVar, e eVar) {
        this.a = eVar;
        this.b = new m0(new b(((k) wiq0Var).j.b()), iVar.e, new SummaryRidaHeaderStateInteractor$uiStateFlow$2(this, null));
    }

    @Override // defpackage.s5k0
    public final tpr a() {
        return this.b;
    }
}
