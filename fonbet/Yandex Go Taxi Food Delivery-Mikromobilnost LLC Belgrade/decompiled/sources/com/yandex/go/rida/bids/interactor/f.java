package com.yandex.go.rida.bids.interactor;

import defpackage.bvf0;
import defpackage.f721;
import defpackage.xq5;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class f {
    public final s a;
    public final f721 b;

    public f(s sVar, f721 f721Var) {
        this.a = sVar;
        this.b = f721Var;
    }

    public final Object a(xq5 xq5Var, Continuation continuation) {
        Object n = bvf0.n(new BidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2(this, xq5Var, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
