package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GamesCatalogDetailFeature.kt */
@b6l(c = "com.vk.games.presentation.detail.mvi.GamesCatalogDetailFeature$observeExternalEvents$1", f = "GamesCatalogDetailFeature.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class sat extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ tat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sat(tat tatVar, spj<? super sat> spjVar) {
        super(2, spjVar);
        this.this$0 = tatVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new sat(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((sat) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        tat tatVar = this.this$0;
        tatVar.i.b(new vam(tatVar, 13));
        return s3q0.a;
    }
}
