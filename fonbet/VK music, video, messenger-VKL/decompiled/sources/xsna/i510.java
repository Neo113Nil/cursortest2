package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.w510;

/* compiled from: MarketItemsForReviewComposeContentScreen.kt */
@b6l(c = "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.MarketItemsForReviewComposeContentScreenKt$MarketItemsForReviewComposeContentScreen$1$1", f = "MarketItemsForReviewComposeContentScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class i510 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yvj $coroutineScope;
    final /* synthetic */ f5z $lifecycleOwner;
    final /* synthetic */ Object $othersChannel;
    final /* synthetic */ mc90 $pagerState;
    int label;

    /* compiled from: MarketItemsForReviewComposeContentScreen.kt */
    @b6l(c = "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.MarketItemsForReviewComposeContentScreenKt$MarketItemsForReviewComposeContentScreen$1$1$1$1", f = "MarketItemsForReviewComposeContentScreen.kt", l = {34}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ w510 $event;
        final /* synthetic */ mc90 $pagerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc90 mc90Var, w510 w510Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$pagerState = mc90Var;
            this.$event = w510Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$pagerState, this.$event, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                mc90 mc90Var = this.$pagerState;
                int i2 = ((w510.a) this.$event).a;
                this.label = 1;
                if (mc90.g(mc90Var, i2, null, this, 6) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i510(Object obj, f5z f5zVar, yvj yvjVar, mc90 mc90Var, spj<? super i510> spjVar) {
        super(2, spjVar);
        this.$othersChannel = obj;
        this.$lifecycleOwner = f5zVar;
        this.$coroutineScope = yvjVar;
        this.$pagerState = mc90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new i510(this.$othersChannel, this.$lifecycleOwner, this.$coroutineScope, this.$pagerState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((i510) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        ((wj50) this.$othersChannel).a(new ml1(10, this.$coroutineScope, this.$pagerState), this.$lifecycleOwner);
        return s3q0.a;
    }
}
