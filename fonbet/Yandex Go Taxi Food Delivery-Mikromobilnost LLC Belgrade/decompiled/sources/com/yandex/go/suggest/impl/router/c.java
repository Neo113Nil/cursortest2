package com.yandex.go.suggest.impl.router;

import defpackage.qoh;
import defpackage.rfw0;
import defpackage.tje;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class c {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    public final void a(String str) {
        r0 r0Var;
        d dVar = this.a;
        rfw0 rfw0Var = dVar.e0;
        if (rfw0Var != null && (r0Var = (r0) rfw0Var.a) != null) {
            r0Var.m(null, Boolean.TRUE);
        }
        qoh qohVar = dVar.h0;
        dVar.h0 = null;
        tje.N(dVar.o(), null, CoroutineStart.UNDISPATCHED, new SuperappSuggestFlexModalViewRouter$InnerNavigator$openAiAssistant$1(qohVar, str, this, dVar, null), 1);
    }
}
