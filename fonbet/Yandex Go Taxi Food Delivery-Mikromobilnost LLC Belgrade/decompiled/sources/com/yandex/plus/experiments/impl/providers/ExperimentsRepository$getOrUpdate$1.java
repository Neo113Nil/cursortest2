package com.yandex.plus.experiments.impl.providers;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.experiments.impl.providers.ExperimentsRepository", f = "ExperimentsRepository.kt", l = {HProv.PP_CIPHEROID, HProv.PP_DHOID}, m = "getOrUpdate-IoAF18A")
/* loaded from: classes8.dex */
final class ExperimentsRepository$getOrUpdate$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentsRepository$getOrUpdate$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object g = this.this$0.g(this);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : new Result(g);
    }
}
