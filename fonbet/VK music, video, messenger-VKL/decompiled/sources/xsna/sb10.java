package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MarketProductGallery.kt */
@b6l(c = "com.vk.ecomm.design.compose.gallery.MarketProductGalleryKt$ProductGallerySlider$4$1", f = "MarketProductGallery.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class sb10 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<Integer, s3q0> $onPositionChanged;
    final /* synthetic */ mc90 $pagerState;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: MarketProductGallery.kt */
    @b6l(c = "com.vk.ecomm.design.compose.gallery.MarketProductGalleryKt$ProductGallerySlider$4$1$1", f = "MarketProductGallery.kt", l = {174}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<Integer, s3q0> $onPositionChanged;
        final /* synthetic */ mc90 $pagerState;
        int label;

        /* compiled from: MarketProductGallery.kt */
        /* renamed from: xsna.sb10$a$a, reason: collision with other inner class name */
        public static final class C3657a<T> implements lsr {
            public final /* synthetic */ izs<Integer, s3q0> b;

            /* JADX WARN: Multi-variable type inference failed */
            public C3657a(izs<? super Integer, s3q0> izsVar) {
                this.b = izsVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                this.b.invoke(new Integer(((Number) obj).intValue()));
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(mc90 mc90Var, izs<? super Integer, s3q0> izsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$pagerState = mc90Var;
            this.$onPositionChanged = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$pagerState, this.$onPositionChanged, spjVar);
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
                izg0 M = nr2.M(new ko00(this.$pagerState, 2));
                C3657a c3657a = new C3657a(this.$onPositionChanged);
                this.label = 1;
                if (M.collect(c3657a, this) == coroutineSingletons) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public sb10(mc90 mc90Var, izs<? super Integer, s3q0> izsVar, spj<? super sb10> spjVar) {
        super(2, spjVar);
        this.$pagerState = mc90Var;
        this.$onPositionChanged = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        sb10 sb10Var = new sb10(this.$pagerState, this.$onPositionChanged, spjVar);
        sb10Var.L$0 = obj;
        return sb10Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((sb10) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        myc0.h(yvjVar, null, null, new a(this.$pagerState, this.$onPositionChanged, null), 3);
        return s3q0.a;
    }
}
