package com.ybsdk.adapters.passportsdk.impl;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.adapters.passportsdk.impl.PassportAdapterImpl", f = "PassportAdapterImpl.kt", l = {HProv.PP_SAME_MEDIA}, m = "injectCookie-0E7RQCE")
/* loaded from: classes2.dex */
final class PassportAdapterImpl$injectCookie$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportAdapterImpl$injectCookie$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object h = this.this$0.h(0L, null, this);
        return h == CoroutineSingletons.COROUTINE_SUSPENDED ? h : new Result(h);
    }
}
