package com.yandex.go.location.provider;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.location.provider.CompassProviderImpl$adaptiveSmooth$$inlined$transform$1$1", f = "CompassProviderImpl.kt", l = {43, 58, 109}, m = "emit", v = 2)
/* loaded from: classes12.dex */
public final class CompassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1 extends ContinuationImpl {
    double D$0;
    double D$1;
    double D$2;
    double D$3;
    double D$4;
    double D$5;
    double D$6;
    float F$0;
    float F$1;
    float F$2;
    float F$3;
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    long J$4;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1(b bVar, Continuation continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
