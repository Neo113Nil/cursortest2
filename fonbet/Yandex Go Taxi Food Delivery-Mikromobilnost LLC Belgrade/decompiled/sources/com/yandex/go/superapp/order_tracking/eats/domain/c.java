package com.yandex.go.superapp.order_tracking.eats.domain;

import com.yandex.go.superapp.tracking.data.e;
import defpackage.u501;
import defpackage.zuj0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class c {
    public final e a;
    public final u501 b;
    public final ru.yandex.taxi.multiorder.e c;
    public final zuj0 d;

    public c(e eVar, u501 u501Var, ru.yandex.taxi.multiorder.e eVar2, zuj0 zuj0Var) {
        this.a = eVar;
        this.b = u501Var;
        this.c = eVar2;
        this.d = zuj0Var;
    }

    public final m0 a(String str) {
        return new m0(kotlinx.coroutines.flow.e.X(new b(this.a.v, str), new EatsOrderDetailsUiStateInteractor$observeUiState$$inlined$flatMapLatest$1(null, this.b)), this.c.b(), new EatsOrderDetailsUiStateInteractor$observeUiState$3(this, null));
    }
}
