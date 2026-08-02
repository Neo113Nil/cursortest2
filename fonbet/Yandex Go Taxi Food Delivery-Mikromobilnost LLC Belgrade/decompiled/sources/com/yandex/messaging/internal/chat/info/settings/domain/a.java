package com.yandex.messaging.internal.chat.info.settings.domain;

import com.yandex.messaging.ChatRequest;
import defpackage.kse;
import defpackage.tpr;
import defpackage.vds0;
import defpackage.y4t;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes15.dex */
public final class a extends vds0 {
    public final y4t b;
    public final com.yandex.messaging.internal.backendconfig.b c;

    public a(y4t y4tVar, com.yandex.messaging.internal.backendconfig.b bVar, kse kseVar) {
        super(kseVar.e);
        this.b = y4tVar;
        this.c = bVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        ChatRequest chatRequest = (ChatRequest) obj;
        return e.t(new m0(this.b.a(chatRequest), this.c.a(chatRequest), new GetCanMarkAsImportantUseCase$run$1(3, null)));
    }
}
