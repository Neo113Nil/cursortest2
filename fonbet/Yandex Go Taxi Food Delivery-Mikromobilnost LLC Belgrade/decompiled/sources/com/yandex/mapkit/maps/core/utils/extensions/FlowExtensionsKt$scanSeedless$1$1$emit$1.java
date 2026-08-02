package com.yandex.mapkit.maps.core.utils.extensions;

import com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$scanSeedless$1;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$scanSeedless$1$1", f = "FlowExtensions.kt", l = {181, 183}, m = "emit", v = 1)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$scanSeedless$1$1$emit$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowExtensionsKt$scanSeedless$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtensionsKt$scanSeedless$1$1$emit$1(FlowExtensionsKt$scanSeedless$1.AnonymousClass1<? super T> anonymousClass1, Continuation<? super FlowExtensionsKt$scanSeedless$1$1$emit$1> continuation) {
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
