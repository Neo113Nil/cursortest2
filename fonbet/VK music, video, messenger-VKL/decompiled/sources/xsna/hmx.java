package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InternalSlider.kt */
@b6l(c = "com.vk.core.compose.component.internal.InternalSliderKt$InternalSlider$3$gestureEndAction$1$1$1", f = "InternalSlider.kt", l = {157}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class hmx extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ float $current;
    final /* synthetic */ s0k0 $draggableState;
    final /* synthetic */ gzs<s3q0> $onValueChangeFinished;
    final /* synthetic */ float $target;
    int label;

    /* compiled from: InternalSlider.kt */
    @b6l(c = "com.vk.core.compose.component.internal.InternalSliderKt$InternalSlider$3$gestureEndAction$1$1$1$1", f = "InternalSlider.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<pgo, spj<? super s3q0>, Object> {
        final /* synthetic */ float $current;
        final /* synthetic */ float $target;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, float f2, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$target = f;
            this.$current = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$target, this.$current, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(pgo pgoVar, spj<? super s3q0> spjVar) {
            return ((a) create(pgoVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            ((pgo) this.L$0).a(this.$target - this.$current);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmx(s0k0 s0k0Var, gzs<s3q0> gzsVar, float f, float f2, spj<? super hmx> spjVar) {
        super(2, spjVar);
        this.$draggableState = s0k0Var;
        this.$onValueChangeFinished = gzsVar;
        this.$target = f;
        this.$current = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new hmx(this.$draggableState, this.$onValueChangeFinished, this.$target, this.$current, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((hmx) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            s0k0 s0k0Var = this.$draggableState;
            a aVar = new a(this.$target, this.$current, null);
            this.label = 1;
            if (s0k0Var.a(MutatePriority.Default, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        gzs<s3q0> gzsVar = this.$onValueChangeFinished;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        return s3q0.a;
    }
}
