package com.yandex.go.superapp.discovery.map.impl.ui.main.v2;

import defpackage.axj0;
import defpackage.c9c0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8c0;
import defpackage.tse;
import defpackage.wls;
import defpackage.wyv0;
import defpackage.x7c0;
import defpackage.ywl;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.main.v2.SuperAppDiscoveryMapV2Presenter$openFlexMain$1", f = "SuperAppDiscoveryMapV2Presenter.kt", l = {420}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapV2Presenter$openFlexMain$1 extends SuspendLambda implements wls {
    final /* synthetic */ c9c0 $flexRouter;
    int label;
    final /* synthetic */ wyv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapV2Presenter$openFlexMain$1(wyv0 wyv0Var, c9c0 c9c0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wyv0Var;
        this.$flexRouter = c9c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppDiscoveryMapV2Presenter$openFlexMain$1(this.this$0, this.$flexRouter, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppDiscoveryMapV2Presenter$openFlexMain$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        ywl ywlVar = null;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.superapp.discovery.map.impl.domain.interactors.flex.c cVar = this.this$0.F;
            this.label = 1;
            obj = cVar.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        String obj2 = obj.toString();
        axj0 axj0Var = this.this$0.I.b;
        if (axj0Var != null) {
            if (!jl40.l(axj0Var.b, obj2)) {
                axj0Var = null;
            }
            if (axj0Var != null) {
                ywlVar = axj0Var.a;
            }
        }
        wyv0 wyv0Var = this.this$0;
        wyv0Var.I.a = obj2;
        c9c0 c9c0Var = this.$flexRouter;
        if (ywlVar != null) {
            c9c0Var.c0(ywlVar);
        } else {
            c9c0Var.V(new o8c0(((x7c0) wyv0Var.u0.getValue()).a, ((x7c0) this.this$0.u0.getValue()).b), this.this$0.F);
        }
        return zy11.a;
    }
}
