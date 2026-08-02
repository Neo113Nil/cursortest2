package com.yandex.go.chargers.feedback.ui;

import defpackage.a0a;
import defpackage.hz9;
import defpackage.rol0;
import defpackage.rxf;
import defpackage.s0a;
import defpackage.yvf0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;

/* loaded from: classes12.dex */
public final class c {
    public final com.yandex.go.chargers.feedback.domain.a a;
    public final yvf0 b;
    public final hz9 c;
    public final a0a d;

    public c(com.yandex.go.chargers.feedback.domain.a aVar, rxf rxfVar, hz9 hz9Var, a0a a0aVar) {
        this.a = aVar;
        this.b = rxfVar;
        this.c = hz9Var;
        this.d = a0aVar;
    }

    public final o a(String str) {
        return new o(com.yandex.go.coroutines.b.d(new m0(new rol0(new ChargersFeedbackUiStateInteractor$getUiStateFlow$1(this, str, null)), this.d.b, new ChargersFeedbackUiStateInteractor$getUiStateFlow$2(this, null)), new ChargersFeedbackUiStateInteractor$getUiStateFlow$$inlined$start$1(s0a.a, null)), new ChargersFeedbackUiStateInteractor$getUiStateFlow$3(this, null));
    }
}
