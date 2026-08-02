package com.yandex.go.payments.sbp.navigation;

import defpackage.m950;
import defpackage.sy60;
import defpackage.tje;

/* loaded from: classes13.dex */
public final class b implements sy60 {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.sy60
    public final void a() {
    }

    public final void n1(String str) {
        c cVar = this.a;
        cVar.z((m950) cVar.N.get(), sy60.Q2);
        tje.N(cVar.o(), null, null, new SbpTokenBindingRouterImpl$startBinding$1(cVar, str, null), 3);
    }
}
