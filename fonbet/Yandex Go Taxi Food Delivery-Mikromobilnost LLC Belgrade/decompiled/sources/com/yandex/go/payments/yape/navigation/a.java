package com.yandex.go.payments.yape.navigation;

import defpackage.kk0;

/* loaded from: classes13.dex */
public final class a implements kk0 {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.kk0
    public final void a(String str) {
        c cVar = this.a;
        com.yandex.go.coroutines.b.g(cVar.o(), null, null, new AddYapeTokenBaseRouter$openAgreementUrl$1(str, cVar, null), 3);
    }
}
