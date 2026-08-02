package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GamesCatalogFeature.kt */
@b6l(c = "com.vk.games.presentation.catalog.mvi.GamesCatalogFeature$observeExternalEvents$1", f = "GamesCatalogFeature.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class vbt extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ xbt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbt(xbt xbtVar, spj<? super vbt> spjVar) {
        super(2, spjVar);
        this.this$0 = xbtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new vbt(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((vbt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        xbt xbtVar = this.this$0;
        xbtVar.g.b(new pcg(xbtVar, 25));
        return s3q0.a;
    }
}
