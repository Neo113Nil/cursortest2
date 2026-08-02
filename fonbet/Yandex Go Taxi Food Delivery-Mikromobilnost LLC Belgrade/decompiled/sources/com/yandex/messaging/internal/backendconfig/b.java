package com.yandex.messaging.internal.backendconfig;

import com.yandex.messaging.ChatRequest;
import defpackage.kse;
import defpackage.tpr;
import defpackage.vds0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes15.dex */
public final class b extends vds0 {
    public final a b;
    public final com.yandex.messaging.internal.authorized.chat.b c;

    public b(a aVar, com.yandex.messaging.internal.authorized.chat.b bVar, kse kseVar) {
        super(kseVar.e);
        this.b = aVar;
        this.c = bVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.t(new m0(this.c.b((ChatRequest) obj), e.d(this.b.b), new GetChatBackendConfigUseCase$run$1(3, null)));
    }
}
