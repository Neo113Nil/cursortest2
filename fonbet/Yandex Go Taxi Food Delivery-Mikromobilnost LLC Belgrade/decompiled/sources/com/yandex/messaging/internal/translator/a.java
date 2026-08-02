package com.yandex.messaging.internal.translator;

import com.yandex.messaging.ChatRequest;
import defpackage.kse;
import defpackage.mdb;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a {
    public final com.yandex.messaging.internal.authorized.chat.b a;
    public final mdb b;
    public final kse c;

    public a(com.yandex.messaging.internal.authorized.chat.b bVar, mdb mdbVar, kse kseVar) {
        this.a = bVar;
        this.b = mdbVar;
        this.c = kseVar;
    }

    public final Object a(ChatRequest chatRequest, String str, Continuation continuation) {
        Object k0 = tje.k0(this.c.e, new ChatTranslationSubscribeUseCase$execute$2(this, chatRequest, str, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
