package com.ybsdk.feature.pfm.internal.data;

import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse;", "dataWithStatus", "Lr9b0;", "<anonymous>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse;)Lr9b0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pfm.internal.data.PfmRepository$getPfmFeed$2$2$1", f = "PfmRepository.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PfmRepository$getPfmFeed$2$2$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PfmRepository$getPfmFeed$2$2$1 pfmRepository$getPfmFeed$2$2$1 = new PfmRepository$getPfmFeed$2$2$1(2, continuation);
        pfmRepository$getPfmFeed$2$2$1.L$0 = obj;
        return pfmRepository$getPfmFeed$2$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PfmRepository$getPfmFeed$2$2$1) create((PfmResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        PfmResponse pfmResponse = (PfmResponse) this.L$0;
        this.label = 1;
        Object c = com.ybsdk.feature.pfm.internal.data.mappers.b.c(pfmResponse, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
