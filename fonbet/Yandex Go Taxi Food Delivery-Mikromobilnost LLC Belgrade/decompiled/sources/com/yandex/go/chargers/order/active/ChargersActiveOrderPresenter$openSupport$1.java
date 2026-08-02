package com.yandex.go.chargers.order.active;

import defpackage.m950;
import defpackage.md6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rva;
import defpackage.sva;
import defpackage.sy60;
import defpackage.taa;
import defpackage.tse;
import defpackage.vk9;
import defpackage.wls;
import defpackage.z8y;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.active.ChargersActiveOrderPresenter$openSupport$1", f = "ChargersActiveOrderPresenter.kt", l = {402}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersActiveOrderPresenter$openSupport$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrderPresenter$openSupport$1(q qVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersActiveOrderPresenter$openSupport$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersActiveOrderPresenter$openSupport$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            p pVar = new p(kotlinx.coroutines.flow.e.d(this.this$0.C.d), this.this$0);
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(pVar, this);
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
        taa taaVar = (taa) obj;
        md6 md6Var = this.this$0.H;
        rva rvaVar = new rva(taaVar.a(), taaVar.b().getStringName(), taaVar instanceof z8y ? ((z8y) taaVar).f : "");
        vk9 vk9Var = (vk9) md6Var.c;
        vk9Var.A((m950) vk9Var.K.get(), new sva(rvaVar), sy60.Q2);
        return zy11.a;
    }
}
