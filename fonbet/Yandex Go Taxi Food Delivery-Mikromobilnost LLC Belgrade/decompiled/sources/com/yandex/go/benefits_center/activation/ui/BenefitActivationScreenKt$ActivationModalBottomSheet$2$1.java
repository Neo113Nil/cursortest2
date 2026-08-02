package com.yandex.go.benefits_center.activation.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.qm5;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.benefits_center.activation.ui.BenefitActivationScreenKt$ActivationModalBottomSheet$2$1", f = "BenefitActivationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BenefitActivationScreenKt$ActivationModalBottomSheet$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $closeByAction$delegate;
    final /* synthetic */ qm5 $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitActivationScreenKt$ActivationModalBottomSheet$2$1(qm5 qm5Var, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$uiState = qm5Var;
        this.$closeByAction$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BenefitActivationScreenKt$ActivationModalBottomSheet$2$1(this.$uiState, this.$closeByAction$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BenefitActivationScreenKt$ActivationModalBottomSheet$2$1 benefitActivationScreenKt$ActivationModalBottomSheet$2$1 = (BenefitActivationScreenKt$ActivationModalBottomSheet$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        benefitActivationScreenKt$ActivationModalBottomSheet$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (this.$uiState.c) {
            this.$closeByAction$delegate.setValue(Boolean.FALSE);
        }
        return zy11.a;
    }
}
