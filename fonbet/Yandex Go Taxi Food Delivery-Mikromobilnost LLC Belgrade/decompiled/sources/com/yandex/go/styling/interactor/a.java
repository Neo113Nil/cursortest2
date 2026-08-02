package com.yandex.go.styling.interactor;

import defpackage.h3y;
import defpackage.pay0;
import defpackage.pz40;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.experiments.d;
import ru.yandex.taxi.themes.experiments.e;

/* loaded from: classes13.dex */
public final class a {
    public final e a;
    public final pay0 b;
    public final h3y c;
    public final tt2 d;

    public a(e eVar, pay0 pay0Var, h3y h3yVar, tt2 tt2Var) {
        this.a = eVar;
        this.b = pay0Var;
        this.c = h3yVar;
        this.d = tt2Var;
    }

    public final tpr a() {
        tpr t = kotlinx.coroutines.flow.e.t(new m0(d.b(this.a.a), (pz40) this.b.d.getValue(), new StylingSettingsItemInteractorImpl$elementUiFlow$1(this, null)));
        this.d.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}
