package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.ajr;
import defpackage.hay0;
import defpackage.mr0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes.dex */
public final class f {
    public final i a;
    public final mr0 b;
    public final hay0 c;
    public final com.yandex.go.superapp.order.multi.old.provider.g d;
    public final ajr e;

    public f(i iVar, mr0 mr0Var, hay0 hay0Var, com.yandex.go.superapp.order.multi.old.provider.g gVar, ajr ajrVar) {
        this.a = iVar;
        this.b = mr0Var;
        this.c = hay0Var;
        this.d = gVar;
        this.e = ajrVar;
    }

    public final m0 a() {
        i iVar = this.a;
        return new m0(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(new c(new com.yandex.go.flex.common.api.b(this.e.b)), new ClarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$flatMapLatest$1(this, null))), kotlinx.coroutines.flow.e.Y(new m0(this.b.c, new h(iVar.c.a, iVar), ClarifyAddressInteractor$clarifyAddressReasonFlow$clarifyAddressReasonForSupportedAddressFlow$1.a), new ClarifyAddressInteractor$clarifyAddressReasonFlow$clarifyAddressReasonForSupportedAddressFlow$2(this, null)), new ClarifyAddressInteractor$clarifyAddressReasonFlow$1(3, null));
    }
}
