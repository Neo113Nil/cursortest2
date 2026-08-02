package com.yandex.go.coroutines;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.coroutines.BufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1", f = "BufferedWithTimeout.kt", l = {119, 90, 91}, m = "emit", v = 2)
/* loaded from: classes.dex */
final class BufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1(a aVar, Continuation continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
