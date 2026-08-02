package com.yandex.messaging.domain;

import defpackage.jse;
import defpackage.tje;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public abstract class k {
    public final jse a;

    public k(jse jseVar) {
        this.a = jseVar;
    }

    public final Object a(Object obj, Continuation continuation) {
        return tje.k0(this.a, new SimpleUseCase$execute$2(this, obj, null), continuation);
    }

    public abstract Object b(Object obj, Continuation continuation);
}
