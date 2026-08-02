package xsna;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: EpisodeVisualizerBars.kt */
@b6l(c = "com.vk.libvideo.bottomsheet.episode.compose.EpisodeVisualizerBarsKt$animateBars$3", f = "EpisodeVisualizerBars.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ktp extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $durationMs;
    final /* synthetic */ wzs<Float, Float, huo> $easing;
    final /* synthetic */ Random $random;
    final /* synthetic */ List<if2<Float, sq2>> $this_animateBars;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: EpisodeVisualizerBars.kt */
    @b6l(c = "com.vk.libvideo.bottomsheet.episode.compose.EpisodeVisualizerBarsKt$animateBars$3$1$1", f = "EpisodeVisualizerBars.kt", l = {47}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ if2<Float, sq2> $bar;
        final /* synthetic */ int $durationMs;
        final /* synthetic */ wzs<Float, Float, huo> $easing;
        final /* synthetic */ Random $random;
        float F$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Random random, if2<Float, sq2> if2Var, int i, wzs<? super Float, ? super Float, ? extends huo> wzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$random = random;
            this.$bar = if2Var;
            this.$durationMs = i;
            this.$easing = wzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$random, this.$bar, this.$durationMs, this.$easing, spjVar);
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
                float cbrt = ((float) Math.cbrt(this.$random.nextInt(1000000))) / 100.0f;
                if2<Float, sq2> if2Var = this.$bar;
                Float f = new Float(cbrt);
                dtp0 d = jq2.d(this.$durationMs, 0, this.$easing.invoke(new Float(cbrt), this.$bar.d()), 2);
                this.F$0 = cbrt;
                this.label = 1;
                if (if2.c(if2Var, f, d, null, this, 12) == coroutineSingletons) {
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
    public ktp(List<if2<Float, sq2>> list, Random random, int i, wzs<? super Float, ? super Float, ? extends huo> wzsVar, spj<? super ktp> spjVar) {
        super(2, spjVar);
        this.$this_animateBars = list;
        this.$random = random;
        this.$durationMs = i;
        this.$easing = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ktp ktpVar = new ktp(this.$this_animateBars, this.$random, this.$durationMs, this.$easing, spjVar);
        ktpVar.L$0 = obj;
        return ktpVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ktp) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        List<if2<Float, sq2>> list = this.$this_animateBars;
        Random random = this.$random;
        int i = this.$durationMs;
        wzs<Float, Float, huo> wzsVar = this.$easing;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            myc0.h(yvjVar, null, null, new a(random, (if2) it.next(), i, wzsVar, null), 3);
        }
        return s3q0.a;
    }
}
