package com.yandex.go.dynamic.impl;

import defpackage.b8n;
import defpackage.d8n;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y7n;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh7n;", "T", "Ld8n;", "it", "", "<anonymous>", "(Ld8n;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.dynamic.impl.DynamicFeatureLoaderImpl$startDownload$1$1$terminalState$1", f = "DynamicFeatureLoaderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DynamicFeatureLoaderImpl$startDownload$1$1$terminalState$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DynamicFeatureLoaderImpl$startDownload$1$1$terminalState$1 dynamicFeatureLoaderImpl$startDownload$1$1$terminalState$1 = new DynamicFeatureLoaderImpl$startDownload$1$1$terminalState$1(2, continuation);
        dynamicFeatureLoaderImpl$startDownload$1$1$terminalState$1.L$0 = obj;
        return dynamicFeatureLoaderImpl$startDownload$1$1$terminalState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicFeatureLoaderImpl$startDownload$1$1$terminalState$1) create((d8n) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d8n d8nVar = (d8n) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf((d8nVar instanceof b8n) || (d8nVar instanceof y7n));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
