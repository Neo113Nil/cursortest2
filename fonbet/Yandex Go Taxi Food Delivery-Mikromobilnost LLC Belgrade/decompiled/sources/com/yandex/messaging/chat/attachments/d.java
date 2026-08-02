package com.yandex.messaging.chat.attachments;

import com.yandex.messaging.ChatRequest;
import defpackage.h3y;
import defpackage.kse;
import defpackage.tje;
import defpackage.vse;

/* loaded from: classes15.dex */
public final class d {
    public final h3y a;
    public final vse b;
    public final kse c;

    public d(h3y h3yVar, vse vseVar, kse kseVar) {
        this.a = h3yVar;
        this.b = vseVar;
        this.c = kseVar;
    }

    public final void a(ChatRequest chatRequest, String str) {
        tje.N(this.b.b(), null, null, new YaDiskSpaceErrorInteractor$makeMessageHandled$1(this, chatRequest, str, null), 3);
    }
}
