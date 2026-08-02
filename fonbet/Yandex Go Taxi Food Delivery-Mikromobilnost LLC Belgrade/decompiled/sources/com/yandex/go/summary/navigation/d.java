package com.yandex.go.summary.navigation;

import defpackage.mx60;
import defpackage.tje;

/* loaded from: classes14.dex */
public final class d extends mx60 {
    public final /* synthetic */ e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(true);
        this.d = eVar;
    }

    @Override // defpackage.mx60
    public final void d() {
        e eVar = this.d;
        if (eVar.h0.c()) {
            tje.N(eVar.o(), null, null, new ComposeSummaryRouter$backPressedCallback$1$handleOnBackPressed$1(eVar, null), 3);
            return;
        }
        h(false);
        eVar.s0.c();
        h(true);
    }
}
