package com.yx360.design.compose.atoms.utils;

import defpackage.ay40;
import defpackage.ke2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zx40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yx360.design.compose.atoms.utils.AnimateScaleAsPressStateKt$animateScaleAsPressState$1$1", f = "AnimateScaleAsPressState.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes14.dex */
final class AnimateScaleAsPressStateKt$animateScaleAsPressState$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ zx40 $interactionSource;
    final /* synthetic */ oz40 $isPressed$delegate;
    final /* synthetic */ int $pressedDuration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateScaleAsPressStateKt$animateScaleAsPressState$1$1(zx40 zx40Var, int i, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$interactionSource = zx40Var;
        this.$pressedDuration = i;
        this.$isPressed$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnimateScaleAsPressStateKt$animateScaleAsPressState$1$1(this.$interactionSource, this.$pressedDuration, this.$isPressed$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AnimateScaleAsPressStateKt$animateScaleAsPressState$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n0 n0Var = ((ay40) this.$interactionSource).a;
            ke2 ke2Var = new ke2(this.$pressedDuration, this.$isPressed$delegate, 0);
            this.label = 1;
            n0Var.getClass();
            if (n0.m(n0Var, ke2Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
