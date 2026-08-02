package com.ybsdk.api;

import com.ybsdk.network.Api;
import com.ybsdk.network.dto.skeletons.LocalSkeletonDto;
import com.ybsdk.network.dto.skeletons.SkeletonsRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/network/dto/skeletons/SkeletonsResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.api.SkeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$1", f = "SkeletonsManagerImpl.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SkeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $aliasesHash;
    final /* synthetic */ List<LocalSkeletonDto> $requestLocalSkeleton;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$1(f fVar, List list, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
        this.$requestLocalSkeleton = list;
        this.$aliasesHash = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SkeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$1(this.this$0, this.$requestLocalSkeleton, this.$aliasesHash, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SkeletonsManagerImpl$getSkeletonsResponseFromApi$downloadedSkeletons$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object u;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Api api = this.this$0.c;
            SkeletonsRequest skeletonsRequest = new SkeletonsRequest(this.$requestLocalSkeleton, this.$aliasesHash);
            this.label = 1;
            u = api.u(skeletonsRequest, this);
            if (u == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            u = ((Result) obj).getValue();
        }
        return new Result(u);
    }
}
