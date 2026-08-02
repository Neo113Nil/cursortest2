package com.yandex.quark.webchat.feature.dependencies;

import defpackage.bvf0;
import defpackage.rd41;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a implements rd41 {
    public final r0 a;
    public final r0 b;

    public a() {
        Boolean bool = Boolean.FALSE;
        this.a = bvf0.c(bool);
        this.b = bvf0.c(bool);
    }

    public final Object a(Continuation continuation) {
        Object x = e.x(this.b, new WebChatInitializationStateHolder$waitFeatureRegistration$2(2, null), continuation);
        return x == CoroutineSingletons.COROUTINE_SUSPENDED ? x : zy11.a;
    }

    public final Object b(Continuation continuation) {
        Object x = e.x(this.a, new WebChatInitializationStateHolder$waitInitialization$2(2, null), continuation);
        return x == CoroutineSingletons.COROUTINE_SUSPENDED ? x : zy11.a;
    }
}
