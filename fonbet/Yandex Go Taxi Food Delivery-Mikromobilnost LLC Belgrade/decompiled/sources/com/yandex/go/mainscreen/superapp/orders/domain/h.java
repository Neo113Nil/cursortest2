package com.yandex.go.mainscreen.superapp.orders.domain;

import com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.SuperappTrackingCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1;
import defpackage.g92;
import defpackage.j551;
import defpackage.r551;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.w201;
import defpackage.wn70;
import defpackage.yaf0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.k;

/* loaded from: classes.dex */
public final class h {
    public final tt2 a;
    public final r551 b;
    public final j551 c;
    public final com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.e d;

    public h(tt2 tt2Var, r551 r551Var, j551 j551Var, com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.e eVar) {
        this.a = tt2Var;
        this.b = r551Var;
        this.c = j551Var;
        this.d = eVar;
    }

    public final k a(yaf0 yaf0Var) {
        return new k(new d(this.b.b(yaf0Var), this), new SuperAppMainScreenOrdersUiStateInteractor$observeTrackings$2(this, null));
    }

    public final tpr b(List list, wn70 wn70Var) {
        List<w201> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (w201 w201Var : list2) {
            com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.e eVar = this.d;
            arrayList.add(new g(kotlinx.coroutines.flow.e.X(((ru.yandex.taxi.styling.g) eVar.h).d(), new SuperappTrackingCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(wn70Var, w201Var, eVar, null)), w201Var));
        }
        return !arrayList.isEmpty() ? new e((tpr[]) kotlin.collections.a.J0(arrayList).toArray(new tpr[0])) : new g92(2, EmptyList.a);
    }
}
