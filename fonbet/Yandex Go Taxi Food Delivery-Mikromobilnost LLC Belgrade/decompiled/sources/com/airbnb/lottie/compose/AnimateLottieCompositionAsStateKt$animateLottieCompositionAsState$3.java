package com.airbnb.lottie.compose;

import androidx.compose.foundation.MutatePriority;
import defpackage.msz;
import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.yrz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", l = {HProv.ALG_SID_GR3410_12_256, HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3 extends SuspendLambda implements wls {
    final /* synthetic */ float $actualSpeed;
    final /* synthetic */ yrz $animatable;
    final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
    final /* synthetic */ msz $clipSpec;
    final /* synthetic */ nsz $composition;
    final /* synthetic */ boolean $isPlaying;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $restartOnPlay;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ boolean $useCompositionFrameRate;
    final /* synthetic */ oz40 $wasPlaying$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(boolean z, boolean z2, yrz yrzVar, nsz nszVar, int i, boolean z3, float f, LottieCancellationBehavior lottieCancellationBehavior, boolean z4, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$isPlaying = z;
        this.$restartOnPlay = z2;
        this.$animatable = yrzVar;
        this.$composition = nszVar;
        this.$iterations = i;
        this.$reverseOnRepeat = z3;
        this.$actualSpeed = f;
        this.$cancellationBehavior = lottieCancellationBehavior;
        this.$useCompositionFrameRate = z4;
        this.$wasPlaying$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(this.$isPlaying, this.$restartOnPlay, this.$animatable, this.$composition, this.$iterations, this.$reverseOnRepeat, this.$actualSpeed, this.$cancellationBehavior, this.$useCompositionFrameRate, this.$wasPlaying$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        if (r2 == r1) goto L50;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.$isPlaying && !((Boolean) this.$wasPlaying$delegate.getValue()).booleanValue() && this.$restartOnPlay) {
                yrz yrzVar = this.$animatable;
                this.label = 1;
                LottieAnimatableImpl lottieAnimatableImpl = (LottieAnimatableImpl) yrzVar;
                nsz nszVar = (nsz) lottieAnimatableImpl.B.getValue();
                if (lottieAnimatableImpl.x.getValue() != null) {
                    ny61.u();
                    return null;
                }
                float floatValue = ((Number) lottieAnimatableImpl.y.getValue()).floatValue();
                float f = 0.0f;
                if ((floatValue < 0.0f && nszVar == null) || (nszVar != null && floatValue < 0.0f)) {
                    f = 1.0f;
                }
                float f2 = f;
                Object b = lottieAnimatableImpl.G.b(MutatePriority.Default, new LottieAnimatableImpl$snapTo$2(lottieAnimatableImpl, (nsz) lottieAnimatableImpl.B.getValue(), f2, 1, !(f2 == ((Number) lottieAnimatableImpl.D.getValue()).floatValue()), null), this);
                if (b != coroutineSingletons) {
                    b = zy11Var;
                }
                if (b != coroutineSingletons) {
                    b = zy11Var;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$wasPlaying$delegate.setValue(Boolean.valueOf(this.$isPlaying));
        if (this.$isPlaying) {
            yrz yrzVar2 = this.$animatable;
            nsz nszVar2 = this.$composition;
            int i2 = this.$iterations;
            boolean z = this.$reverseOnRepeat;
            float f3 = this.$actualSpeed;
            LottieAnimatableImpl lottieAnimatableImpl2 = (LottieAnimatableImpl) yrzVar2;
            float floatValue2 = ((Number) lottieAnimatableImpl2.D.getValue()).floatValue();
            LottieCancellationBehavior lottieCancellationBehavior = this.$cancellationBehavior;
            boolean z2 = this.$useCompositionFrameRate;
            this.label = 2;
            Object b2 = lottieAnimatableImpl2.G.b(MutatePriority.Default, new LottieAnimatableImpl$animate$2(lottieAnimatableImpl2, lottieAnimatableImpl2.e(), i2, z, f3, nszVar2, floatValue2, z2, false, lottieCancellationBehavior, null), this);
            if (b2 != coroutineSingletons) {
                b2 = zy11Var;
            }
            if (b2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
