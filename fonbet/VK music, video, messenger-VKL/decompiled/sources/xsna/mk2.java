package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnimatedIcon.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.AnimatedIconKt$TwoWayStaticToAnimationIcon$2$1", f = "AnimatedIcon.kt", l = {251, 257}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class mk2 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ float $actualSpeed;
    final /* synthetic */ s600 $animatable;
    final /* synthetic */ i700 $composition;
    final /* synthetic */ wh50<Boolean> $currentState$delegate;
    final /* synthetic */ wh50<Boolean> $isAnimating$delegate;
    final /* synthetic */ izs<Boolean, s3q0> $onAnimatingStateChanged;
    final /* synthetic */ boolean $skipAnimation;
    final /* synthetic */ boolean $targetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mk2(boolean z, izs<? super Boolean, s3q0> izsVar, s600 s600Var, i700 i700Var, float f, boolean z2, wh50<Boolean> wh50Var, wh50<Boolean> wh50Var2, spj<? super mk2> spjVar) {
        super(2, spjVar);
        this.$targetState = z;
        this.$onAnimatingStateChanged = izsVar;
        this.$animatable = s600Var;
        this.$composition = i700Var;
        this.$actualSpeed = f;
        this.$skipAnimation = z2;
        this.$currentState$delegate = wh50Var;
        this.$isAnimating$delegate = wh50Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mk2(this.$targetState, this.$onAnimatingStateChanged, this.$animatable, this.$composition, this.$actualSpeed, this.$skipAnimation, this.$currentState$delegate, this.$isAnimating$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mk2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (xsna.s600.a.a(r0, r1, 0, false, r4, null, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, r12, 2030) == r11) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (r0 == r11) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$targetState != this.$currentState$delegate.getValue().booleanValue()) {
                wh50<Boolean> wh50Var = this.$isAnimating$delegate;
                Boolean bool = Boolean.TRUE;
                wh50Var.setValue(bool);
                this.$onAnimatingStateChanged.invoke(bool);
                s600 s600Var = this.$animatable;
                i700 i700Var = this.$composition;
                float f = this.$actualSpeed;
                this.label = 1;
            } else if (this.$skipAnimation && this.$isAnimating$delegate.getValue().booleanValue()) {
                s600 s600Var2 = this.$animatable;
                float f2 = this.$targetState ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.label = 2;
                a = s600Var2.a(s600Var2.G(), f2, (r9 & 4) != 0 ? s600Var2.M() : 1, !(r7 == r6.getProgress()), this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.a.a(obj);
            this.$currentState$delegate.setValue(Boolean.valueOf(this.$targetState));
            wh50<Boolean> wh50Var2 = this.$isAnimating$delegate;
            Boolean bool2 = Boolean.FALSE;
            wh50Var2.setValue(bool2);
            this.$onAnimatingStateChanged.invoke(bool2);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$currentState$delegate.setValue(Boolean.valueOf(this.$targetState));
            wh50<Boolean> wh50Var3 = this.$isAnimating$delegate;
            Boolean bool3 = Boolean.FALSE;
            wh50Var3.setValue(bool3);
            this.$onAnimatingStateChanged.invoke(bool3);
        }
        return s3q0.a;
    }
}
