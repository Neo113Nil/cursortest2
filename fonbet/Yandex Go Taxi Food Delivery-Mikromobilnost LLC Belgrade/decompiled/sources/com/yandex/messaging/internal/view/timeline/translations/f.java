package com.yandex.messaging.internal.view.timeline.translations;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import com.yandex.messaging.ChatRequest;
import defpackage.c18;
import defpackage.tje;
import defpackage.ww10;
import defpackage.x08;

/* loaded from: classes15.dex */
public final class f implements ww10 {
    public final ChatRequest a;
    public final com.yandex.messaging.internal.authorized.chat.b b;
    public final com.yandex.messaging.internal.translator.b c;
    public final p d;

    public f(Lifecycle lifecycle, ChatRequest chatRequest, com.yandex.messaging.internal.authorized.chat.b bVar, com.yandex.messaging.internal.translator.b bVar2) {
        this.a = chatRequest;
        this.b = bVar;
        this.c = bVar2;
        this.d = r.a(lifecycle);
    }

    @Override // defpackage.ww10
    public final x08 a(long j) {
        return new c18(2, tje.N(this.d, null, null, new MessageTranslationSingleUpdater$requestTranslation$job$1(j, this, null), 3));
    }
}
