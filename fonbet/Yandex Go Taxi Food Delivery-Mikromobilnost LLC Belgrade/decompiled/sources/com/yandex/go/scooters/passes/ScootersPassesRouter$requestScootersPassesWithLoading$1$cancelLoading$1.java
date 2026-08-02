package com.yandex.go.scooters.passes;

import defpackage.epb;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.ScootersPassesRouter$requestScootersPassesWithLoading$1$cancelLoading$1", f = "ScootersPassesRouter.kt", l = {145}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassesRouter$requestScootersPassesWithLoading$1$cancelLoading$1 extends SuspendLambda implements tls {
    final /* synthetic */ l8x $loadingJob;
    final /* synthetic */ Ref$LongRef $loadingStartMs;
    final /* synthetic */ ru.yandex.taxi.scooters.presentation.loading.b $scootersLoadingRouter;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassesRouter$requestScootersPassesWithLoading$1$cancelLoading$1(l8x l8xVar, Ref$LongRef ref$LongRef, h hVar, ru.yandex.taxi.scooters.presentation.loading.b bVar, Continuation continuation) {
        super(1, continuation);
        this.$loadingJob = l8xVar;
        this.$loadingStartMs = ref$LongRef;
        this.this$0 = hVar;
        this.$scootersLoadingRouter = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersPassesRouter$requestScootersPassesWithLoading$1$cancelLoading$1(this.$loadingJob, this.$loadingStartMs, this.this$0, this.$scootersLoadingRouter, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersPassesRouter$requestScootersPassesWithLoading$1$cancelLoading$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.$loadingJob.a(null);
            if (this.$loadingStartMs.element != -1) {
                long currentTimeMillis = 200 - (System.currentTimeMillis() - this.$loadingStartMs.element);
                this.label = 1;
                if (kotlinx.coroutines.a.i(currentTimeMillis, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.j(new epb(this.$scootersLoadingRouter));
        return zy11.a;
    }
}
