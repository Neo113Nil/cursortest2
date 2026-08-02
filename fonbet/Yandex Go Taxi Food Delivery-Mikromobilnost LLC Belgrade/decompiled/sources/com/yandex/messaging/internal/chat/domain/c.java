package com.yandex.messaging.internal.chat.domain;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.MessengerEnvironment;
import defpackage.kse;
import defpackage.n1f;
import defpackage.p220;
import defpackage.r1s;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vds0;

/* loaded from: classes15.dex */
public final class c extends vds0 {
    public final com.yandex.messaging.internal.authorized.chat.b b;
    public final kse c;
    public final MessengerEnvironment d;
    public final p220 e;
    public final r1s f;

    public c(com.yandex.messaging.internal.authorized.chat.b bVar, kse kseVar, MessengerEnvironment messengerEnvironment, p220 p220Var, r1s r1sVar) {
        super(kseVar.b);
        this.b = bVar;
        this.c = kseVar;
        this.d = messengerEnvironment;
        this.e = p220Var;
        this.f = r1sVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return new n1f(13, new rol0(new GetChatLinkUseCase$run$1(this, (ChatRequest) obj, null)), this);
    }
}
