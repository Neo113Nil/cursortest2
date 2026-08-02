package com.yandex.messaging.domain.chat;

import defpackage.kse;
import defpackage.o721;
import defpackage.tje;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes15.dex */
public final class h {
    public final com.yandex.messaging.internal.authorized.chat.b a;
    public final kse b;

    public h(kse kseVar, com.yandex.messaging.internal.authorized.chat.b bVar) {
        this.a = bVar;
        this.b = kseVar;
    }

    public final Object a(o721 o721Var, SuspendLambda suspendLambda) {
        return tje.k0(this.b.e, new UpdateOrganizationUseCase$execute$2(this, o721Var, null), suspendLambda);
    }
}
