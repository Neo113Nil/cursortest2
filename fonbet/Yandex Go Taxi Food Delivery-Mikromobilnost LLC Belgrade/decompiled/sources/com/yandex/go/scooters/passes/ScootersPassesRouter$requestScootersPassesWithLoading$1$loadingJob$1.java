package com.yandex.go.scooters.passes;

import defpackage.ago0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.ScootersPassesRouter$requestScootersPassesWithLoading$1$loadingJob$1", f = "ScootersPassesRouter.kt", l = {HProv.PP_VERSION_EX}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassesRouter$requestScootersPassesWithLoading$1$loadingJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$LongRef $loadingStartMs;
    final /* synthetic */ ru.yandex.taxi.scooters.presentation.loading.b $scootersLoadingRouter;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassesRouter$requestScootersPassesWithLoading$1$loadingJob$1(Ref$LongRef ref$LongRef, h hVar, ru.yandex.taxi.scooters.presentation.loading.b bVar, Continuation continuation) {
        super(2, continuation);
        this.$loadingStartMs = ref$LongRef;
        this.this$0 = hVar;
        this.$scootersLoadingRouter = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassesRouter$requestScootersPassesWithLoading$1$loadingJob$1(this.$loadingStartMs, this.this$0, this.$scootersLoadingRouter, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassesRouter$requestScootersPassesWithLoading$1$loadingJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.label = 1;
            if (kotlinx.coroutines.a.i(275L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$loadingStartMs.element = System.currentTimeMillis();
        h hVar = this.this$0;
        hVar.z(this.$scootersLoadingRouter, new ago0(hVar, 2));
        return zy11.a;
    }
}
