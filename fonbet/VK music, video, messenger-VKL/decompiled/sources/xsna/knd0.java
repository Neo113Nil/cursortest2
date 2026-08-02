package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ProductCardViewStatesMerger.kt */
@b6l(c = "com.vk.ecomm.market.good.good2.presentation.ProductCardViewStatesMerger$onMviStateReady$1", f = "ProductCardViewStatesMerger.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class knd0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ind0 $state;
    int label;
    final /* synthetic */ mnd0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knd0(mnd0 mnd0Var, ind0 ind0Var, spj<? super knd0> spjVar) {
        super(2, spjVar);
        this.this$0 = mnd0Var;
        this.$state = ind0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new knd0(this.this$0, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((knd0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            caj0 caj0Var = this.this$0.b;
            ind0 ind0Var = this.$state;
            this.label = 1;
            if (caj0Var.emit(ind0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
