package com.yandex.go.platform.sdk.models;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@mvg(c = "com.yandex.go.platform.sdk.models.GoPlatformJsApiExtensions$addVoidMethod$serializedConsumer$1", f = "GoPlatformJsApiExtensions.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class GoPlatformJsApiExtensions$addVoidMethod$serializedConsumer$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $consumer;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoPlatformJsApiExtensions$addVoidMethod$serializedConsumer$1(wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$consumer = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GoPlatformJsApiExtensions$addVoidMethod$serializedConsumer$1 goPlatformJsApiExtensions$addVoidMethod$serializedConsumer$1 = new GoPlatformJsApiExtensions$addVoidMethod$serializedConsumer$1(this.$consumer, continuation);
        goPlatformJsApiExtensions$addVoidMethod$serializedConsumer$1.L$0 = obj;
        return goPlatformJsApiExtensions$addVoidMethod$serializedConsumer$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GoPlatformJsApiExtensions$addVoidMethod$serializedConsumer$1) create((String[]) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return null;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        String[] strArr = (String[]) this.L$0;
        wls wlsVar = this.$consumer;
        this.label = 1;
        if (wlsVar.invoke(strArr, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return null;
    }
}
