package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnimatedIcon.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.AnimatedIconKt$AnimatedIcon$4$1", f = "AnimatedIcon.kt", l = {390, 391}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class kk2 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ float $actualSpeed;
    final /* synthetic */ s600 $animatable;
    final /* synthetic */ String $animationJson;
    final /* synthetic */ s700 $composition$delegate;
    final /* synthetic */ wh50<String> $currentJson$delegate;
    final /* synthetic */ long $delayMillis;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk2(String str, long j, s600 s600Var, float f, wh50<String> wh50Var, s700 s700Var, spj<? super kk2> spjVar) {
        super(2, spjVar);
        this.$animationJson = str;
        this.$delayMillis = j;
        this.$animatable = s600Var;
        this.$actualSpeed = f;
        this.$currentJson$delegate = wh50Var;
        this.$composition$delegate = s700Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new kk2(this.$animationJson, this.$delayMillis, this.$animatable, this.$actualSpeed, this.$currentJson$delegate, this.$composition$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((kk2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (xsna.s600.a.a(r3, r4, 0, false, r7, null, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, r12, 2030) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kk2 kk2Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (epx.f(this.$currentJson$delegate.getValue(), this.$animationJson)) {
                return s3q0.a;
            }
            long j = this.$delayMillis;
            this.label = 1;
            if (qsl.b(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                kk2Var = this;
                kk2Var.$currentJson$delegate.setValue(kk2Var.$animationJson);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        s600 s600Var = this.$animatable;
        i700 value = this.$composition$delegate.getValue();
        float f = this.$actualSpeed;
        this.label = 2;
        kk2Var = this;
    }
}
