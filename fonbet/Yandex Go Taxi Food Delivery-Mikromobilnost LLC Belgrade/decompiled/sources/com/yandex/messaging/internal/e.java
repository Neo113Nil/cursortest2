package com.yandex.messaging.internal;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.chat.ChatScopeBridge$chatInfoFlow$$inlined$flatMapLatest$1;
import defpackage.k020;
import defpackage.kse;
import defpackage.m3b;
import defpackage.mth;
import defpackage.q98;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vds0;

/* loaded from: classes15.dex */
public final class e extends vds0 {
    public final com.yandex.messaging.internal.authorized.chat.b b;
    public final k020 c;
    public final m3b d;
    public final kse e;

    public e(com.yandex.messaging.internal.authorized.chat.b bVar, k020 k020Var, m3b m3bVar, kse kseVar) {
        super(kseVar.b);
        this.b = bVar;
        this.c = k020Var;
        this.d = m3bVar;
        this.e = kseVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        ChatRequest chatRequest = (ChatRequest) obj;
        q98 q98Var = new q98(new mth(new rol0(new GetChatInfoWithErrorUseCase$initialFlow$1(this, chatRequest, null)), 6), 7);
        kse kseVar = this.e;
        return kotlinx.coroutines.flow.e.D(new kotlinx.coroutines.flow.h(new tpr[]{kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.F(q98Var, kseVar.b)), kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.X(com.yandex.messaging.internal.authorized.i.b(this.b.c), new ChatScopeBridge$chatInfoFlow$$inlined$flatMapLatest$1(chatRequest, null)), new GetChatInfoWithErrorUseCase$chatInfoFlow$$inlined$flatMapLatest$1(null, this)), kseVar.e)}));
    }
}
