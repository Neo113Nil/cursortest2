package com.yandex.go.design.compose.modal.utils;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.rz20;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.wz20;
import defpackage.ye;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.design.compose.modal.utils.ModalStateKt$rememberModalState$2$1", f = "ModalState.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ModalStateKt$rememberModalState$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $animationHideCallBack;
    final /* synthetic */ oz40 $localStateVisible;
    final /* synthetic */ rz20 $state;
    final /* synthetic */ wz20 $triggers;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalStateKt$rememberModalState$2$1(wz20 wz20Var, rz20 rz20Var, oz40 oz40Var, oz40 oz40Var2, Continuation continuation) {
        super(2, continuation);
        this.$triggers = wz20Var;
        this.$state = rz20Var;
        this.$localStateVisible = oz40Var;
        this.$animationHideCallBack = oz40Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ModalStateKt$rememberModalState$2$1(this.$triggers, this.$state, this.$localStateVisible, this.$animationHideCallBack, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ModalStateKt$rememberModalState$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr tprVar = this.$triggers.a;
            ye yeVar = new ye(13, this.$state, this.$localStateVisible, this.$animationHideCallBack);
            this.label = 1;
            if (tprVar.collect(yeVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
