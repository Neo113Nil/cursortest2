package xsna;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: MusicMixAnimationGLView.kt */
@b6l(c = "com.vk.music.view.vkmix.view.MusicMixAnimationGLView$setup$3", f = "MusicMixAnimationGLView.kt", l = {143}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class wn40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ yn40 this$0;

    /* compiled from: MusicMixAnimationGLView.kt */
    public static final /* synthetic */ class a implements lsr, g0t {
        public final /* synthetic */ yn40 b;

        public a(yn40 yn40Var) {
            this.b = yn40Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            ((Number) obj).floatValue();
            yn40 yn40Var = this.b;
            yn40Var.f((oo40) yn40Var.r.getValue());
            s3q0 s3q0Var = s3q0.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return s3q0Var;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lsr) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new AdaptedFunctionReference(2, this.b, yn40.class, "handleTransitionProgress", "handleTransitionProgress(F)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn40(yn40 yn40Var, spj<? super wn40> spjVar) {
        super(2, spjVar);
        this.this$0 = yn40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wn40(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((wn40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yn40 yn40Var = this.this$0;
            utk0 utk0Var = yn40Var.p;
            a aVar = new a(yn40Var);
            this.label = 1;
            if (utk0Var.collect(aVar, this) == coroutineSingletons) {
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
