package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnimatedIcon.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.AnimatedIconKt$AnimatedIcon$1$1", f = "AnimatedIcon.kt", l = {333, 335, 341}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ik2 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<s3q0> $actionAtTheEnd;
    final /* synthetic */ float $actualSpeed;
    final /* synthetic */ s600 $animatable;
    final /* synthetic */ s700 $composition$delegate;
    final /* synthetic */ long $delayMillis;
    final /* synthetic */ boolean $isNeedToPlay;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik2(long j, boolean z, s600 s600Var, float f, gzs<s3q0> gzsVar, s700 s700Var, spj<? super ik2> spjVar) {
        super(2, spjVar);
        this.$delayMillis = j;
        this.$isNeedToPlay = z;
        this.$animatable = s600Var;
        this.$actualSpeed = f;
        this.$actionAtTheEnd = gzsVar;
        this.$composition$delegate = s700Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ik2(this.$delayMillis, this.$isNeedToPlay, this.$animatable, this.$actualSpeed, this.$actionAtTheEnd, this.$composition$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ik2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (xsna.s600.a.a(r0, r1, 0, false, r4, null, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, r12, 2030) == r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (xsna.y600.b(r0, r12) == r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        if (xsna.qsl.b(r4, r12) == r11) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            long j = this.$delayMillis;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.a.a(obj);
                    this.$actionAtTheEnd.invoke();
                    return s3q0.a;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        if (this.$isNeedToPlay) {
            s600 s600Var = this.$animatable;
            i700 value = this.$composition$delegate.getValue();
            float f = this.$actualSpeed;
            this.label = 2;
        } else {
            s600 s600Var2 = this.$animatable;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
