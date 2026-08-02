package com.yandex.go.chargers.feedback.ui.components;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.feedback.ui.components.RatingBarComponentKt$RatingStar$1$1", f = "RatingBarComponent.kt", l = {105}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class RatingBarComponentKt$RatingStar$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $animateSelection;
    final /* synthetic */ long $animationDurationMs;
    final /* synthetic */ int $index;
    final /* synthetic */ int $selectedRating;
    final /* synthetic */ oz40 $shouldAnimate$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingBarComponentKt$RatingStar$1$1(boolean z, int i, int i2, long j, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$animateSelection = z;
        this.$selectedRating = i;
        this.$index = i2;
        this.$animationDurationMs = j;
        this.$shouldAnimate$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RatingBarComponentKt$RatingStar$1$1(this.$animateSelection, this.$selectedRating, this.$index, this.$animationDurationMs, this.$shouldAnimate$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RatingBarComponentKt$RatingStar$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            if (this.$animateSelection && (i = this.$selectedRating) > 0 && this.$index <= i) {
                this.$shouldAnimate$delegate.setValue(Boolean.TRUE);
                long j = this.$animationDurationMs;
                this.label = 1;
                if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        if (i2 != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.$shouldAnimate$delegate.setValue(Boolean.FALSE);
        return zy11.a;
    }
}
