package com.yandex.go.taxi.summary.verticalsummary.ui;

import defpackage.fr5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qor;
import defpackage.rol0;
import defpackage.wls;
import defpackage.yx40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(I)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.verticalsummary.ui.VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$7$1", f = "VerticalSummaryBottomSheet.kt", l = {369}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$7$1 extends SuspendLambda implements wls {
    final /* synthetic */ qor $descriptionVisibilityProgressState;
    final /* synthetic */ yx40 $measuredBigTariffHeight;
    final /* synthetic */ yx40 $measuredSmallTariffHeight;
    /* synthetic */ int I$0;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "animatableValue", "Lzy11;", "<anonymous>", "(F)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.summary.verticalsummary.ui.VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$7$1$2", f = "VerticalSummaryBottomSheet.kt", l = {370}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.verticalsummary.ui.VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$7$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ int $it;
        final /* synthetic */ yx40 $measuredBigTariffHeight;
        final /* synthetic */ yx40 $measuredSmallTariffHeight;
        /* synthetic */ float F$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(yx40 yx40Var, int i, yx40 yx40Var2, Continuation continuation) {
            super(2, continuation);
            this.$measuredBigTariffHeight = yx40Var;
            this.$it = i;
            this.$measuredSmallTariffHeight = yx40Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$measuredBigTariffHeight, this.$it, this.$measuredSmallTariffHeight, continuation);
            anonymousClass2.F$0 = ((Number) obj).floatValue();
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f = this.F$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                this.F$0 = f;
                this.label = 1;
                if (kotlinx.coroutines.a.i(30L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            if (f == 1.0f) {
                this.$measuredBigTariffHeight.setIntValue(this.$it);
            } else if (f == 0.0f) {
                this.$measuredSmallTariffHeight.setIntValue(this.$it);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$7$1(qor qorVar, yx40 yx40Var, yx40 yx40Var2, Continuation continuation) {
        super(2, continuation);
        this.$descriptionVisibilityProgressState = qorVar;
        this.$measuredBigTariffHeight = yx40Var;
        this.$measuredSmallTariffHeight = yx40Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$7$1 verticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$7$1 = new VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$7$1(this.$descriptionVisibilityProgressState, this.$measuredBigTariffHeight, this.$measuredSmallTariffHeight, continuation);
        verticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$7$1.I$0 = ((Number) obj).intValue();
        return verticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$7$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$7$1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            rol0 o = androidx.compose.runtime.f.o(new fr5(this.$descriptionVisibilityProgressState, 3));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$measuredBigTariffHeight, i, this.$measuredSmallTariffHeight, null);
            this.I$0 = i;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(o, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
