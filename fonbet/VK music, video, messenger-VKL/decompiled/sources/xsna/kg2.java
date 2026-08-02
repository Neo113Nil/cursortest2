package xsna;

import com.airbnb.lottie.compose.LottieCancellationBehavior;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: animateLottieCompositionAsState.kt */
@b6l(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", l = {TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class kg2 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ float $actualSpeed;
    final /* synthetic */ s600 $animatable;
    final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
    final /* synthetic */ h700 $clipSpec;
    final /* synthetic */ i700 $composition;
    final /* synthetic */ boolean $isPlaying;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $restartOnPlay;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ boolean $useCompositionFrameRate;
    final /* synthetic */ wh50<Boolean> $wasPlaying$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg2(boolean z, boolean z2, s600 s600Var, i700 i700Var, int i, boolean z3, float f, h700 h700Var, LottieCancellationBehavior lottieCancellationBehavior, boolean z4, wh50<Boolean> wh50Var, spj<? super kg2> spjVar) {
        super(2, spjVar);
        this.$isPlaying = z;
        this.$restartOnPlay = z2;
        this.$animatable = s600Var;
        this.$composition = i700Var;
        this.$iterations = i;
        this.$reverseOnRepeat = z3;
        this.$actualSpeed = f;
        this.$clipSpec = h700Var;
        this.$cancellationBehavior = lottieCancellationBehavior;
        this.$useCompositionFrameRate = z4;
        this.$wasPlaying$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new kg2(this.$isPlaying, this.$restartOnPlay, this.$animatable, this.$composition, this.$iterations, this.$reverseOnRepeat, this.$actualSpeed, this.$clipSpec, this.$cancellationBehavior, this.$useCompositionFrameRate, this.$wasPlaying$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((kg2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (xsna.s600.a.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r12, 514) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (xsna.y600.b(r13, r12) == r0) goto L25;
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
            if (this.$isPlaying && !this.$wasPlaying$delegate.getValue().booleanValue() && this.$restartOnPlay) {
                s600 s600Var = this.$animatable;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        this.$wasPlaying$delegate.setValue(Boolean.valueOf(this.$isPlaying));
        if (!this.$isPlaying) {
            return s3q0.a;
        }
        s600 s600Var2 = this.$animatable;
        i700 i700Var = this.$composition;
        int i2 = this.$iterations;
        boolean z = this.$reverseOnRepeat;
        float f = this.$actualSpeed;
        h700 h700Var = this.$clipSpec;
        float progress = s600Var2.getProgress();
        LottieCancellationBehavior lottieCancellationBehavior = this.$cancellationBehavior;
        boolean z2 = this.$useCompositionFrameRate;
        this.label = 2;
    }
}
