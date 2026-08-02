package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.e510;

/* compiled from: MarketItemsForReviewComposeContentScreen.kt */
@b6l(c = "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.MarketItemsForReviewComposeContentScreenKt$MarketItemsForReviewComposeContentScreen$2$1", f = "MarketItemsForReviewComposeContentScreen.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class j510 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<e510, s3q0> $onAction;
    final /* synthetic */ mc90 $pagerState;
    int label;

    /* compiled from: MarketItemsForReviewComposeContentScreen.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ izs<e510, s3q0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super e510, s3q0> izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            this.b.invoke(new e510.f(((Number) obj).intValue()));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j510(mc90 mc90Var, izs<? super e510, s3q0> izsVar, spj<? super j510> spjVar) {
        super(2, spjVar);
        this.$pagerState = mc90Var;
        this.$onAction = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new j510(this.$pagerState, this.$onAction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((j510) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ksr l = rsr.l(nr2.M(new x4u(this.$pagerState, 5)));
            a aVar = new a(this.$onAction);
            this.label = 1;
            if (l.collect(aVar, this) == coroutineSingletons) {
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
