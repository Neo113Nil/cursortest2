package com.ybsdk.api;

import com.ybsdk.network.dto.skeletons.SkeletonsResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/ybsdk/network/dto/skeletons/SkeletonsResponse;", "dto"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.api.SkeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$2$1", f = "SkeletonsManagerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SkeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$2$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SkeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$2$1 skeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$2$1 = new SkeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$2$1(2, continuation);
        skeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$2$1.L$0 = obj;
        return skeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SkeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$2$1) create((SkeletonsResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return (SkeletonsResponse) this.L$0;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
