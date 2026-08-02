package com.yandex.messaging.domain.personal.mentions;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.chat.b;
import defpackage.jqr;
import defpackage.kse;
import defpackage.mth;
import defpackage.rol0;
import defpackage.tpr;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.h;

/* loaded from: classes15.dex */
public final class a {
    public final kse a;
    public final b b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public a(kse kseVar, b bVar) {
        this.a = kseVar;
        this.b = bVar;
    }

    public final tpr a(ChatRequest chatRequest) {
        mth mthVar = new mth(new rol0(new GetPersonalMentionsUseCase$execute$cachedFlow$1(this, chatRequest, null)), 6);
        kse kseVar = this.a;
        return e.t(e.D(new h(new tpr[]{e.F(mthVar, kseVar.b), e.F(new jqr(e.F(e.X(this.b.b(chatRequest), new GetPersonalMentionsUseCase$execute$$inlined$flatMapLatest$1(3, null)), kseVar.e), new GetPersonalMentionsUseCase$execute$stateFlow$2(this, chatRequest, null), 3), kseVar.b)})));
    }
}
