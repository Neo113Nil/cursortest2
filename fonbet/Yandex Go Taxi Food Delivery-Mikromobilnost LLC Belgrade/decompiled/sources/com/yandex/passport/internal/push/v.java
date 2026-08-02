package com.yandex.passport.internal.push;

import com.yandex.passport.api.PushPlatform;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class v extends x {
    public final PushPlatform a;
    public final String b;

    public v(PushPlatform pushPlatform, String str) {
        this.a = pushPlatform;
        this.b = str;
    }

    @Override // com.yandex.passport.internal.push.x
    public final Object a(c cVar, Continuation continuation) {
        Object f = cVar.f(this.a, this.b, (ContinuationImpl) continuation);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : zy11.a;
    }
}
