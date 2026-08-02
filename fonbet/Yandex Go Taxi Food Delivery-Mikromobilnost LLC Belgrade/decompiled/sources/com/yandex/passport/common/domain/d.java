package com.yandex.passport.common.domain;

import defpackage.jse;
import defpackage.tje;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public abstract class d {
    public final jse a;

    public d(jse jseVar) {
        this.a = jseVar;
    }

    public final Object a(Object obj, Continuation continuation) {
        return tje.k0(this.a, new UseCase$execute$2(this, obj, null), continuation);
    }

    public abstract Object b(Object obj, Continuation continuation);
}
