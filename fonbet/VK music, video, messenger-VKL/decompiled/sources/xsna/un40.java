package xsna;

import android.animation.ValueAnimator;
import com.vk.music.view.vkmix.models.MusicMixMood;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicMixAnimationGLView.kt */
@b6l(c = "com.vk.music.view.vkmix.view.MusicMixAnimationGLView$setup$1", f = "MusicMixAnimationGLView.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class un40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ttk0<MusicMixMood> $moodStateFlow;
    int label;
    final /* synthetic */ yn40 this$0;

    /* compiled from: MusicMixAnimationGLView.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ yn40 b;

        public a(yn40 yn40Var) {
            this.b = yn40Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            MusicMixMood musicMixMood = (MusicMixMood) obj;
            ValueAnimator valueAnimator = this.b.w;
            if (valueAnimator == null || !valueAnimator.isPaused()) {
                yn40.e(this.b, musicMixMood);
            } else {
                yn40 yn40Var = this.b;
                yn40Var.A = new xm6(8, yn40Var, musicMixMood);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public un40(ttk0<? extends MusicMixMood> ttk0Var, yn40 yn40Var, spj<? super un40> spjVar) {
        super(2, spjVar);
        this.$moodStateFlow = ttk0Var;
        this.this$0 = yn40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new un40(this.$moodStateFlow, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((un40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ttk0<MusicMixMood> ttk0Var = this.$moodStateFlow;
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
