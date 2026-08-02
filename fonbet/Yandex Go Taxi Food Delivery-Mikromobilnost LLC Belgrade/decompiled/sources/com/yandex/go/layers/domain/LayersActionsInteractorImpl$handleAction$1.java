package com.yandex.go.layers.domain;

import defpackage.jyi;
import defpackage.mvg;
import defpackage.nm00;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lfxe0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.layers.domain.LayersActionsInteractorImpl$handleAction$1", f = "LayersActionsInteractorImpl.kt", l = {139}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LayersActionsInteractorImpl$handleAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ nm00 $prevEvent;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayersActionsInteractorImpl$handleAction$1(nm00 nm00Var, Continuation continuation) {
        super(2, continuation);
        this.$prevEvent = nm00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LayersActionsInteractorImpl$handleAction$1 layersActionsInteractorImpl$handleAction$1 = new LayersActionsInteractorImpl$handleAction$1(this.$prevEvent, continuation);
        layersActionsInteractorImpl$handleAction$1.L$0 = obj;
        return layersActionsInteractorImpl$handleAction$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LayersActionsInteractorImpl$handleAction$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            nm00 nm00Var = this.$prevEvent;
            if (nm00Var != null) {
                jyi jyiVar = new jyi(nm00Var.a);
                this.L$0 = null;
                this.label = 1;
                if (vprVar.emit(jyiVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
