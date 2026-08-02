package com.yandex.messaging.internal;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ThreadChatRequest;
import defpackage.g92;
import defpackage.jqr;
import defpackage.kse;
import defpackage.lqo;
import defpackage.odt;
import defpackage.pb;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tz10;
import defpackage.vds0;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public final class b extends vds0 {
    public final odt b;
    public final lqo c;
    public final LinkedHashMap d;

    public b(odt odtVar, kse kseVar, lqo lqoVar) {
        super(kseVar.b);
        this.b = odtVar;
        this.c = lqoVar;
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        ChatRequest chatRequest = (ChatRequest) obj;
        if (chatRequest instanceof ThreadChatRequest) {
            chatRequest = ((ThreadChatRequest) chatRequest).parent();
        }
        return !this.c.a(tz10.P) ? new g92(2, Boolean.TRUE) : kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.D(new kotlinx.coroutines.flow.h(new tpr[]{new rol0(new AreMessageLinksEnabledUseCase$run$cacheFlow$1(this, chatRequest, null)), new jqr(kotlinx.coroutines.flow.e.t(new pb(this.b.a(chatRequest), 8)), new AreMessageLinksEnabledUseCase$spamSuggestFlow$2(this, chatRequest, null), 3)})));
    }
}
