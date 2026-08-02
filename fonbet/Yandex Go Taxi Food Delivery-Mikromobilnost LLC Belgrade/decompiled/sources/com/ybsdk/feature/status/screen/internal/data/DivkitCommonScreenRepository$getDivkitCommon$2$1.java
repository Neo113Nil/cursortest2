package com.ybsdk.feature.status.screen.internal.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/status/screen/internal/data/DivCommonResponse;", "it", "Lbsl;", "<anonymous>", "(Lcom/ybsdk/feature/status/screen/internal/data/DivCommonResponse;)Lbsl;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.status.screen.internal.data.DivkitCommonScreenRepository$getDivkitCommon$2$1", f = "DivkitCommonScreenRepository.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DivkitCommonScreenRepository$getDivkitCommon$2$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DivkitCommonScreenRepository$getDivkitCommon$2$1 divkitCommonScreenRepository$getDivkitCommon$2$1 = new DivkitCommonScreenRepository$getDivkitCommon$2$1(2, continuation);
        divkitCommonScreenRepository$getDivkitCommon$2$1.L$0 = obj;
        return divkitCommonScreenRepository$getDivkitCommon$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivkitCommonScreenRepository$getDivkitCommon$2$1) create((DivCommonResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        DivCommonResponse divCommonResponse = (DivCommonResponse) this.L$0;
        this.label = 1;
        Object a = b.a(divCommonResponse, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
