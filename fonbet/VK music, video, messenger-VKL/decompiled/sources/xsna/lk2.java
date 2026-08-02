package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnimatedIcon.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.AnimatedIconKt$TwoWayAnimatedIcon$1$1", f = "AnimatedIcon.kt", l = {188, PsExtractor.PRIVATE_STREAM_1, 196, 197}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class lk2 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ float $actualSpeed;
    final /* synthetic */ s600 $animatable;
    final /* synthetic */ if2<Float, sq2> $animatableAlpha;
    final /* synthetic */ wh50<Boolean> $currentState$delegate;
    final /* synthetic */ s700 $disabledIconComposition$delegate;
    final /* synthetic */ s700 $enabledIconComposition$delegate;
    final /* synthetic */ boolean $targetState;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk2(boolean z, if2<Float, sq2> if2Var, s600 s600Var, float f, wh50<Boolean> wh50Var, s700 s700Var, s700 s700Var2, spj<? super lk2> spjVar) {
        super(2, spjVar);
        this.$targetState = z;
        this.$animatableAlpha = if2Var;
        this.$animatable = s600Var;
        this.$actualSpeed = f;
        this.$currentState$delegate = wh50Var;
        this.$enabledIconComposition$delegate = s700Var;
        this.$disabledIconComposition$delegate = s700Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lk2(this.$targetState, this.$animatableAlpha, this.$animatable, this.$actualSpeed, this.$currentState$delegate, this.$enabledIconComposition$delegate, this.$disabledIconComposition$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lk2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ad, code lost:
    
        if (r0 == r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        if (xsna.s600.a.a(r0, r1, 0, false, r2, null, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, r12, 2030) == r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r2.e(r3, r12) == r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        if (r0.e(r4, r12) == r11) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i700 value;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$targetState != this.$currentState$delegate.getValue().booleanValue()) {
                this.$currentState$delegate.setValue(Boolean.valueOf(this.$targetState));
                value = this.$targetState ? this.$enabledIconComposition$delegate.getValue() : this.$disabledIconComposition$delegate.getValue();
                if2<Float, sq2> if2Var = this.$animatableAlpha;
                Float f = new Float(1.0f);
                this.L$0 = value;
                this.label = 1;
            } else {
                if2<Float, sq2> if2Var2 = this.$animatableAlpha;
                Float f2 = new Float(1.0f);
                this.label = 3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
            } else if (i == 3) {
                kotlin.a.a(obj);
                s600 s600Var = this.$animatable;
                this.label = 4;
                a = s600Var.a(s600Var.G(), 1.0f, (r9 & 4) != 0 ? s600Var.M() : 1, !(r7 == r6.getProgress()), this);
            } else if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return s3q0.a;
        }
        value = (i700) this.L$0;
        kotlin.a.a(obj);
        i700 i700Var = value;
        s600 s600Var2 = this.$animatable;
        float f3 = this.$actualSpeed;
        this.L$0 = null;
        this.label = 2;
    }
}
