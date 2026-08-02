package com.yandex.passport.common.analytics;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.common.analytics.AnalyticsHelper", f = "AnalyticsHelper.kt", l = {67}, m = "getUuid-iY7QQdA$suspendImpl")
/* loaded from: classes15.dex */
final class AnalyticsHelper$getUuid$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsHelper$getUuid$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object f = f.f(this.this$0, this);
        if (f == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return f;
        }
        String str = (String) f;
        if (str != null) {
            return new com.yandex.passport.common.value.b(str);
        }
        return null;
    }
}
