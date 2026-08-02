package xsna;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: EpisodeVisualizerBars.kt */
@b6l(c = "com.vk.libvideo.bottomsheet.episode.compose.EpisodeVisualizerBarsKt$EpisodeVisualizerBars$1$1", f = "EpisodeVisualizerBars.kt", l = {64, 65, 67}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class jtp extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ List<if2<Float, sq2>> $barAnimations;
    final /* synthetic */ boolean $isAnimating;
    final /* synthetic */ boolean $isSystemAnimationsEnabled;
    final /* synthetic */ Random $random;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtp(boolean z, List<if2<Float, sq2>> list, Random random, boolean z2, spj<? super jtp> spjVar) {
        super(2, spjVar);
        this.$isAnimating = z;
        this.$barAnimations = list;
        this.$random = random;
        this.$isSystemAnimationsEnabled = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jtp(this.$isAnimating, this.$barAnimations, this.$random, this.$isSystemAnimationsEnabled, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jtp) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005c, code lost:
    
        if (r13 == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Random random;
        int i;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlin.a.a(obj);
                return s3q0.a;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                while (this.$isAnimating) {
                    List<if2<Float, sq2>> list = this.$barAnimations;
                    Random random2 = this.$random;
                    com.vk.movika.tools.controls.seekbar.o oVar = new com.vk.movika.tools.controls.seekbar.o(6);
                    this.label = 3;
                    Object d = zvj.d(new ktp(list, random2, 150, oVar, null), this);
                    if (d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        d = s3q0.a;
                    }
                    if (d == obj2) {
                        return obj2;
                    }
                }
                return s3q0.a;
            }
            i = this.I$0;
            it = (Iterator) this.L$2;
            random = (Random) this.L$1;
            kotlin.a.a(obj);
            while (it.hasNext()) {
                if2 if2Var = (if2) it.next();
                Float f = new Float(((float) Math.cbrt(random.nextInt(1000000))) / 100.0f);
                this.L$0 = null;
                this.L$1 = random;
                this.L$2 = it;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = i;
                this.I$1 = 0;
                this.label = 2;
                if (if2Var.e(f, this) == obj2) {
                    return obj2;
                }
            }
            return s3q0.a;
        }
        kotlin.a.a(obj);
        if (this.$isAnimating) {
            if (!this.$isSystemAnimationsEnabled) {
                List<if2<Float, sq2>> list2 = this.$barAnimations;
                Random random3 = this.$random;
                it = list2.iterator();
                random = random3;
                i = 0;
                while (it.hasNext()) {
                }
                return s3q0.a;
            }
            while (this.$isAnimating) {
            }
            return s3q0.a;
        }
        List<if2<Float, sq2>> list3 = this.$barAnimations;
        Random random4 = this.$random;
        this.label = 1;
        Object d2 = zvj.d(new ktp(list3, random4, 300, new xdi(1), null), this);
        if (d2 != obj2) {
            d2 = s3q0.a;
        }
    }
}
