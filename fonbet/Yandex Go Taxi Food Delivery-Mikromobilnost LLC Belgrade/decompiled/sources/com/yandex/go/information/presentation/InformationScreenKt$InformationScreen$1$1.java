package com.yandex.go.information.presentation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.tuv;
import defpackage.utv;
import defpackage.vuv;
import defpackage.w2o;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.information.presentation.InformationScreenKt$InformationScreen$1$1", f = "InformationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class InformationScreenKt$InformationScreen$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $handleAction;
    final /* synthetic */ vuv $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InformationScreenKt$InformationScreen$1$1(vuv vuvVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$state = vuvVar;
        this.$handleAction = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InformationScreenKt$InformationScreen$1$1(this.$state, this.$handleAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        InformationScreenKt$InformationScreen$1$1 informationScreenKt$InformationScreen$1$1 = (InformationScreenKt$InformationScreen$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        informationScreenKt$InformationScreen$1$1.invokeSuspend(zy11Var);
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
        utv utvVar = this.$state.f;
        tls tlsVar = this.$handleAction;
        w2o w2oVar = a.a;
        if (utvVar != null) {
            tlsVar.invoke(new tuv(utvVar));
        }
        return zy11.a;
    }
}
