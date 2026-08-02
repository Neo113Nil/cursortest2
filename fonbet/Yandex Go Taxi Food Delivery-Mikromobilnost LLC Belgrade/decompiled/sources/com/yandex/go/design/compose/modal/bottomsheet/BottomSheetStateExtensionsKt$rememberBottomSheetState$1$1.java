package com.yandex.go.design.compose.modal.bottomsheet;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wz20;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.design.compose.modal.bottomsheet.BottomSheetStateExtensionsKt$rememberBottomSheetState$1$1", f = "BottomSheetStateExtensions.kt", l = {81}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BottomSheetStateExtensionsKt$rememberBottomSheetState$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onDismiss;
    final /* synthetic */ sls $onShown;
    final /* synthetic */ wg6 $state;
    final /* synthetic */ wz20 $triggers;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetStateExtensionsKt$rememberBottomSheetState$1$1(wz20 wz20Var, wg6 wg6Var, sls slsVar, sls slsVar2, Continuation continuation) {
        super(2, continuation);
        this.$triggers = wz20Var;
        this.$state = wg6Var;
        this.$onShown = slsVar;
        this.$onDismiss = slsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BottomSheetStateExtensionsKt$rememberBottomSheetState$1$1(this.$triggers, this.$state, this.$onShown, this.$onDismiss, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BottomSheetStateExtensionsKt$rememberBottomSheetState$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$triggers.a;
            a aVar = new a(this.$state, this.$onShown, this.$onDismiss);
            this.label = 1;
            if (tprVar.collect(aVar, this) == coroutineSingletons) {
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
