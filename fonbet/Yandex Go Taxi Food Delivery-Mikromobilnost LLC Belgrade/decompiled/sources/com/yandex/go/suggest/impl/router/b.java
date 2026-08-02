package com.yandex.go.suggest.impl.router;

import defpackage.m9t0;
import defpackage.rdb;
import defpackage.rfw0;
import defpackage.tje;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class b implements m9t0 {
    public final /* synthetic */ c a;
    public final /* synthetic */ d b;

    public b(c cVar, d dVar) {
        this.a = cVar;
        this.b = dVar;
    }

    @Override // defpackage.m9t0
    public final void S(rdb rdbVar) {
        d dVar = this.a.a;
        tje.N(dVar.o(), null, CoroutineStart.UNDISPATCHED, new SuperappSuggestFlexModalViewRouter$InnerNavigator$openAiAssistant$2(dVar, rdbVar, null), 1);
    }

    @Override // defpackage.sy60
    public final void a() {
        r0 r0Var;
        rfw0 rfw0Var = this.b.e0;
        if (rfw0Var == null || (r0Var = (r0) rfw0Var.a) == null) {
            return;
        }
        r0Var.m(null, Boolean.FALSE);
    }
}
