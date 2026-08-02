package com.yandex.go.chargers.feedback.ui;

import com.airbnb.lottie.compose.LottieAnimatableImpl;
import com.airbnb.lottie.compose.LottieCompositionResultImpl;
import defpackage.esz;
import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.usz;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.feedback.ui.ChargersFeedbackScreenKt$ChargersFeedbackPromoPlateAnimation$2$1", f = "ChargersFeedbackScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFeedbackScreenKt$ChargersFeedbackPromoPlateAnimation$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ usz $composition$delegate;
    final /* synthetic */ oz40 $lottieFinished$delegate;
    final /* synthetic */ esz $progress$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFeedbackScreenKt$ChargersFeedbackPromoPlateAnimation$2$1(usz uszVar, esz eszVar, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$composition$delegate = uszVar;
        this.$progress$delegate = eszVar;
        this.$lottieFinished$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersFeedbackScreenKt$ChargersFeedbackPromoPlateAnimation$2$1(this.$composition$delegate, this.$progress$delegate, this.$lottieFinished$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersFeedbackScreenKt$ChargersFeedbackPromoPlateAnimation$2$1 chargersFeedbackScreenKt$ChargersFeedbackPromoPlateAnimation$2$1 = (ChargersFeedbackScreenKt$ChargersFeedbackPromoPlateAnimation$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersFeedbackScreenKt$ChargersFeedbackPromoPlateAnimation$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (((nsz) ((LottieCompositionResultImpl) this.$composition$delegate).getValue()) != null && ((Number) ((LottieAnimatableImpl) this.$progress$delegate).getValue()).floatValue() >= 0.999f) {
            this.$lottieFinished$delegate.setValue(Boolean.TRUE);
        }
        return zy11.a;
    }
}
