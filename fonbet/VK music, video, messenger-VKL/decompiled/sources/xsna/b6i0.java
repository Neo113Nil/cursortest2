package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SegmentedSlider.kt */
/* loaded from: classes2.dex */
public final class b6i0 implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ wh50<Float> c;
    public final /* synthetic */ mtk0<Float> d;
    public final /* synthetic */ yvj e;
    public final /* synthetic */ gho f;
    public final /* synthetic */ wh50 g;

    /* compiled from: SegmentedSlider.kt */
    @b6l(c = "com.vk.libvideo.design.compose.base.timeline.SegmentedSliderKt$sliderTapModifier$2$1$1$1", f = "SegmentedSlider.kt", l = {502}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements yzs<j2d0, ov70, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ wh50<Float> $pressOffset;
        final /* synthetic */ mtk0<Float> $rawOffset;
        float F$0;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, float f, wh50<Float> wh50Var, mtk0<Float> mtk0Var, spj<? super a> spjVar) {
            super(3, spjVar);
            this.$isRtl = z;
            this.$maxPx = f;
            this.$pressOffset = wh50Var;
            this.$rawOffset = mtk0Var;
        }

        @Override // xsna.yzs
        public final Object invoke(j2d0 j2d0Var, ov70 ov70Var, spj<? super s3q0> spjVar) {
            long j = ov70Var.a;
            a aVar = new a(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, spjVar);
            aVar.L$0 = j2d0Var;
            aVar.J$0 = j;
            return aVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            j2d0 j2d0Var = (j2d0) this.L$0;
            long j = this.J$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    float intBitsToFloat = this.$isRtl ? this.$maxPx - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32));
                    this.$pressOffset.setValue(new Float(intBitsToFloat - this.$rawOffset.getValue().floatValue()));
                    this.L$0 = null;
                    this.J$0 = j;
                    this.F$0 = intBitsToFloat;
                    this.label = 1;
                    if (j2d0Var.a1(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
            } catch (GestureCancellationException unused) {
                this.$pressOffset.setValue(new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            }
            return s3q0.a;
        }
    }

    /* compiled from: SegmentedSlider.kt */
    @b6l(c = "com.vk.libvideo.design.compose.base.timeline.SegmentedSliderKt$sliderTapModifier$2$1$1$2$1", f = "SegmentedSlider.kt", l = {IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ gho $draggableState;
        final /* synthetic */ mtk0<izs<Float, s3q0>> $gestureEndAction;
        int label;

        /* compiled from: SegmentedSlider.kt */
        @b6l(c = "com.vk.libvideo.design.compose.base.timeline.SegmentedSliderKt$sliderTapModifier$2$1$1$2$1$1", f = "SegmentedSlider.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<pgo, spj<? super s3q0>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            public a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                a aVar = new a(2, spjVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // xsna.wzs
            public final Object invoke(pgo pgoVar, spj<? super s3q0> spjVar) {
                return ((a) create(pgoVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                pgo pgoVar = (pgo) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                pgoVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(gho ghoVar, mtk0<? extends izs<? super Float, s3q0>> mtk0Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$draggableState = ghoVar;
            this.$gestureEndAction = mtk0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$draggableState, this.$gestureEndAction, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                gho ghoVar = this.$draggableState;
                MutatePriority mutatePriority = MutatePriority.UserInput;
                a aVar = new a(2, null);
                this.label = 1;
                if (ghoVar.a(mutatePriority, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.$gestureEndAction.getValue().invoke(new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            return s3q0.a;
        }
    }

    public b6i0(boolean z, float f, wh50 wh50Var, mtk0 mtk0Var, yvj yvjVar, gho ghoVar, wh50 wh50Var2) {
        this.a = z;
        this.b = f;
        this.c = wh50Var;
        this.d = mtk0Var;
        this.e = yvjVar;
        this.f = ghoVar;
        this.g = wh50Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        Object e = z2o0.e(dmb0Var, null, new a(this.a, this.b, this.c, this.d, null), new fd5(this.e, this.f, this.g, 8), spjVar, 3);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
    }
}
