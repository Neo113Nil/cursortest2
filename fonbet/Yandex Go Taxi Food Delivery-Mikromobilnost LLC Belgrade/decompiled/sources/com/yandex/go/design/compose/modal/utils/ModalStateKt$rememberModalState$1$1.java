package com.yandex.go.design.compose.modal.utils;

import androidx.compose.runtime.f;
import defpackage.g700;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.rol0;
import defpackage.rz20;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.ye;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.h0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.design.compose.modal.utils.ModalStateKt$rememberModalState$1$1", f = "ModalState.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ModalStateKt$rememberModalState$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $animationHideCallBack;
    final /* synthetic */ oz40 $localStateVisible;
    final /* synthetic */ sls $onDismiss;
    final /* synthetic */ sls $onShown;
    final /* synthetic */ rz20 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalStateKt$rememberModalState$1$1(oz40 oz40Var, rz20 rz20Var, sls slsVar, sls slsVar2, oz40 oz40Var2, Continuation continuation) {
        super(2, continuation);
        this.$localStateVisible = oz40Var;
        this.$state = rz20Var;
        this.$onShown = slsVar;
        this.$onDismiss = slsVar2;
        this.$animationHideCallBack = oz40Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ModalStateKt$rememberModalState$1$1(this.$localStateVisible, this.$state, this.$onShown, this.$onDismiss, this.$animationHideCallBack, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ModalStateKt$rememberModalState$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        rol0 o = f.o(new g700(26, this.$localStateVisible, this.$state));
        ye yeVar = new ye(12, this.$onShown, this.$onDismiss, this.$animationHideCallBack);
        this.label = 1;
        Object collect = o.collect(new h0(yeVar), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
