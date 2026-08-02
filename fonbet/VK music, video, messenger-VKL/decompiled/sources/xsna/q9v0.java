package xsna;

import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkOnboardingTooltipWrapper.kt */
@b6l(c = "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipWrapperKt$onboardingTooltip$1$2$1", f = "VkOnboardingTooltipWrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class q9v0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<tny> $anchorLayoutCoordinates$delegate;
    final /* synthetic */ wh50<z4p0> $balloonLayoutParams$delegate;
    final /* synthetic */ float $density;
    final /* synthetic */ VkTooltip$MarkerSize $markerSize;
    final /* synthetic */ VkTooltip$MarkerStyle $markerStyle;
    final /* synthetic */ wh50<VkTooltip$BalloonPosition> $overridedBalloonPosition$delegate;
    final /* synthetic */ wh50<btv0> $popupPositionProvider$delegate;
    final /* synthetic */ yvj $scope;
    int label;

    /* compiled from: VkOnboardingTooltipWrapper.kt */
    @b6l(c = "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipWrapperKt$onboardingTooltip$1$2$1$1$1", f = "VkOnboardingTooltipWrapper.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<z4p0> $balloonLayoutParams$delegate;
        final /* synthetic */ z4p0 $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z4p0 z4p0Var, wh50<z4p0> wh50Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$it = z4p0Var;
            this.$balloonLayoutParams$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$it, this.$balloonLayoutParams$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$balloonLayoutParams$delegate.setValue(this.$it);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9v0(VkTooltip$MarkerStyle vkTooltip$MarkerStyle, VkTooltip$MarkerSize vkTooltip$MarkerSize, float f, wh50<tny> wh50Var, wh50<VkTooltip$BalloonPosition> wh50Var2, yvj yvjVar, wh50<z4p0> wh50Var3, wh50<btv0> wh50Var4, spj<? super q9v0> spjVar) {
        super(2, spjVar);
        this.$markerStyle = vkTooltip$MarkerStyle;
        this.$markerSize = vkTooltip$MarkerSize;
        this.$density = f;
        this.$anchorLayoutCoordinates$delegate = wh50Var;
        this.$overridedBalloonPosition$delegate = wh50Var2;
        this.$scope = yvjVar;
        this.$balloonLayoutParams$delegate = wh50Var3;
        this.$popupPositionProvider$delegate = wh50Var4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new q9v0(this.$markerStyle, this.$markerSize, this.$density, this.$anchorLayoutCoordinates$delegate, this.$overridedBalloonPosition$delegate, this.$scope, this.$balloonLayoutParams$delegate, this.$popupPositionProvider$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((q9v0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        tny value = this.$anchorLayoutCoordinates$delegate.getValue();
        this.$popupPositionProvider$delegate.setValue(o9v0.f(value != null ? jgz.i(value) : zhf0.e, this.$overridedBalloonPosition$delegate.getValue(), this.$markerStyle, this.$markerSize, this.$density, new zas0(2, this.$scope, this.$balloonLayoutParams$delegate)));
        return s3q0.a;
    }
}
