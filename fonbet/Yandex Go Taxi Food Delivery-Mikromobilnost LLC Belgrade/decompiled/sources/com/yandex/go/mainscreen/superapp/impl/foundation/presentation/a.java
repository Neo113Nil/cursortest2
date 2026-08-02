package com.yandex.go.mainscreen.superapp.impl.foundation.presentation;

import defpackage.tje;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer {
    public final /* synthetic */ e a;

    public /* synthetic */ a(e eVar) {
        this.a = eVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        e eVar = this.a;
        tje.N(eVar.Kg(), null, null, new SuperAppMainScreenPresenter$showPromotionIfNeeded$1(eVar, null), 3);
    }
}
