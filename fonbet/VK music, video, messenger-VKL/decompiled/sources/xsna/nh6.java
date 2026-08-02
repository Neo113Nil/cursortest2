package xsna;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BaseMusicMixAnimationGLView.kt */
@b6l(c = "com.vk.music.view.vkmix.view.BaseMusicMixAnimationGLView$setup$2", f = "BaseMusicMixAnimationGLView.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class nh6 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ttk0<Float> $timeDataSource;
    int label;
    final /* synthetic */ lh6 this$0;

    /* compiled from: BaseMusicMixAnimationGLView.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ lh6 b;

        public a(lh6 lh6Var) {
            this.b = lh6Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            ((Number) obj).floatValue();
            this.b.c();
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh6(ttk0<Float> ttk0Var, lh6 lh6Var, spj<? super nh6> spjVar) {
        super(2, spjVar);
        this.$timeDataSource = ttk0Var;
        this.this$0 = lh6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new nh6(this.$timeDataSource, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((nh6) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ttk0<Float> ttk0Var = this.$timeDataSource;
            a aVar = new a(this.this$0);
            this.label = 1;
            if (ttk0Var.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        throw new KotlinNothingValueException();
    }
}
