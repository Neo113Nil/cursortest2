package com.yandex.go.inapp_calls.dynamic;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.inapp_calls.dynamic.InAppCallsDynamicApiImpl", f = "InAppCallsDynamicApiImpl.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "startOutgoingCall-gIAlu-s", v = 2)
/* loaded from: classes12.dex */
final class InAppCallsDynamicApiImpl$startOutgoingCall$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppCallsDynamicApiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallsDynamicApiImpl$startOutgoingCall$1(InAppCallsDynamicApiImpl inAppCallsDynamicApiImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = inAppCallsDynamicApiImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
