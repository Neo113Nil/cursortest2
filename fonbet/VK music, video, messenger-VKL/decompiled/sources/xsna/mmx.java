package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InternalSlider.kt */
/* loaded from: classes17.dex */
public final class mmx implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ wh50<Float> c;
    public final /* synthetic */ mtk0<Float> d;
    public final /* synthetic */ yvj e;
    public final /* synthetic */ gho f;

    /* compiled from: InternalSlider.kt */
    @b6l(c = "com.vk.core.compose.component.internal.InternalSliderKt$sliderTapModifier$2$1$1$1", f = "InternalSlider.kt", l = {698}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements yzs<j2d0, ov70, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ wh50<Float> $pressOffset;
        final /* synthetic */ mtk0<Float> $rawOffset;
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    j2d0 j2d0Var = (j2d0) this.L$0;
                    long j = this.J$0;
                    this.$pressOffset.setValue(new Float((this.$isRtl ? this.$maxPx - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32))) - this.$rawOffset.getValue().floatValue()));
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

    /* compiled from: InternalSlider.kt */
    @b6l(c = "com.vk.core.compose.component.internal.InternalSliderKt$sliderTapModifier$2$1$1$2$1", f = "InternalSlider.kt", l = {IronSourceError.ERROR_NT_LOAD_EXCEPTION}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ gho $draggableState;
        int label;

        /* compiled from: InternalSlider.kt */
        @b6l(c = "com.vk.core.compose.component.internal.InternalSliderKt$sliderTapModifier$2$1$1$2$1$1", f = "InternalSlider.kt", l = {}, m = "invokeSuspend")
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
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                ((pgo) this.L$0).a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gho ghoVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$draggableState = ghoVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$draggableState, spjVar);
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
            return s3q0.a;
        }
    }

    public mmx(boolean z, float f, wh50<Float> wh50Var, mtk0<Float> mtk0Var, yvj yvjVar, gho ghoVar) {
        this.a = z;
        this.b = f;
        this.c = wh50Var;
        this.d = mtk0Var;
        this.e = yvjVar;
        this.f = ghoVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        Object e = z2o0.e(dmb0Var, null, new a(this.a, this.b, this.c, this.d, null), new td0(21, this.e, this.f), spjVar, 3);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
    }
}
