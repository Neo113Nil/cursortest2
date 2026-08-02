package com.yandex.go.inapp_calls.repository.defaultoutgoingcall;

import com.yandex.go.inapp_calls.api.defaultoutgoingcall.DefaultOutgoingCallType;
import com.yandex.go.inapp_calls.experiment.q;
import defpackage.lgh;

/* loaded from: classes12.dex */
public final class g {
    public final lgh a;
    public final q b;

    public g(lgh lghVar, q qVar) {
        this.a = lghVar;
        this.b = qVar;
    }

    public final void a(DefaultOutgoingCallType defaultOutgoingCallType) {
        lgh lghVar = this.a;
        lghVar.c.l(defaultOutgoingCallType);
        com.yandex.go.coroutines.b.g(lghVar.a.a, null, null, new DefaultOutgoingCallTypeRepository$saveDefaultOutgoingCallType$1(lghVar, defaultOutgoingCallType, null), 3);
    }
}
