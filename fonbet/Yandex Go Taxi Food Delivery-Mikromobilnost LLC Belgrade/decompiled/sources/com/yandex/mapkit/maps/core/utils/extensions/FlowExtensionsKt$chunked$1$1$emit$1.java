package com.yandex.mapkit.maps.core.utils.extensions;

import com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$chunked$1;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$chunked$1$1", f = "FlowExtensions.kt", l = {67}, m = "emit", v = 1)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$chunked$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowExtensionsKt$chunked$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtensionsKt$chunked$1$1$emit$1(FlowExtensionsKt$chunked$1.AnonymousClass1<? super T> anonymousClass1, Continuation<? super FlowExtensionsKt$chunked$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
