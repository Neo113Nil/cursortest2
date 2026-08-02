package com.yandex.go.rida.unavailable.ui;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.i3y;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vyf0;
import defpackage.wiq0;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a {
    public final e a;
    public final i3y b = kotlin.a.a(new vyf0(26, this));
    public final tpr c;

    public a(tt2 tt2Var, e eVar, wiq0 wiq0Var) {
        this.a = eVar;
        g I = kotlinx.coroutines.flow.e.I(((k) wiq0Var).g(), new RidaTariffUnavailableUiStateInteractor$uiStateFlow$1(this, null));
        tt2Var.getClass();
        this.c = kotlinx.coroutines.flow.e.F(I, uyj.a);
    }
}
