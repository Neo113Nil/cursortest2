package com.yandex.messaging.internal.textsuggest;

import com.yandex.messaging.ChatRequest;
import defpackage.tje;
import defpackage.upq0;
import defpackage.xdf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class d {
    public final ChatRequest a;
    public final com.yandex.messaging.internal.authorized.chat.b b;
    public final xdf0 c;

    public d(ChatRequest chatRequest, com.yandex.messaging.internal.authorized.chat.b bVar, xdf0 xdf0Var) {
        this.a = chatRequest;
        this.b = bVar;
        this.c = xdf0Var;
    }

    public final Object a(upq0 upq0Var, Continuation continuation) {
        Object k0 = tje.k0(this.c.b, new SendTextSuggestUseCase$execute$2(this, upq0Var, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
