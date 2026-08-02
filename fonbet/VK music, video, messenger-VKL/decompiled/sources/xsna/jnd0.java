package xsna;

import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.kjf0;

/* compiled from: ProductCardViewStatesMerger.kt */
@b6l(c = "com.vk.ecomm.market.good.good2.presentation.ProductCardViewStatesMerger$onLegacyStateReady$1", f = "ProductCardViewStatesMerger.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class jnd0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ d210 $pageData;
    final /* synthetic */ List<kjf0.a> $state;
    int label;
    final /* synthetic */ mnd0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jnd0(mnd0 mnd0Var, List<? extends kjf0.a> list, d210 d210Var, spj<? super jnd0> spjVar) {
        super(2, spjVar);
        this.this$0 = mnd0Var;
        this.$state = list;
        this.$pageData = d210Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jnd0(this.this$0, this.$state, this.$pageData, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jnd0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            caj0 caj0Var = this.this$0.c;
            Pair pair = new Pair(this.$state, this.$pageData);
            this.label = 1;
            if (caj0Var.emit(pair, this) == coroutineSingletons) {
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
