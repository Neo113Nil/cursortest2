package com.yandex.messaging.internal.storage.stickers;

import defpackage.bdp;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.odu0;
import defpackage.qdt;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.storage.stickers.GetStickersUseCase$stickerUpdateFlow$1", f = "GetStickersUseCase.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetStickersUseCase$stickerUpdateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ odu0 $this_stickerUpdateFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStickersUseCase$stickerUpdateFlow$1(odu0 odu0Var, Continuation continuation) {
        super(2, continuation);
        this.$this_stickerUpdateFlow = odu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetStickersUseCase$stickerUpdateFlow$1 getStickersUseCase$stickerUpdateFlow$1 = new GetStickersUseCase$stickerUpdateFlow$1(this.$this_stickerUpdateFlow, continuation);
        getStickersUseCase$stickerUpdateFlow$1.L$0 = obj;
        return getStickersUseCase$stickerUpdateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetStickersUseCase$stickerUpdateFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            qdt qdtVar = new qdt(y6f0Var);
            this.$this_stickerUpdateFlow.e.b(qdtVar);
            bdp bdpVar = new bdp(18, this.$this_stickerUpdateFlow, qdtVar);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, bdpVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
