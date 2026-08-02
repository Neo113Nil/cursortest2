package com.yandex.mapkit.maps.core.utils.extensions;

import com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$zipWithNext$2;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$zipWithNext$2$1", f = "FlowExtensions.kt", l = {HProv.PP_FAST_CODE}, m = "emit", v = 1)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$zipWithNext$2$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowExtensionsKt$zipWithNext$2.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtensionsKt$zipWithNext$2$1$emit$1(FlowExtensionsKt$zipWithNext$2.AnonymousClass1<? super T> anonymousClass1, Continuation<? super FlowExtensionsKt$zipWithNext$2$1$emit$1> continuation) {
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
