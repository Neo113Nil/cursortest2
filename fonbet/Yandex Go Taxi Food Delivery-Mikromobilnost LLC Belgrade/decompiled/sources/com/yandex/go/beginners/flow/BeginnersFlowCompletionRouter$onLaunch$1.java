package com.yandex.go.beginners.flow;

import defpackage.ape0;
import defpackage.bl5;
import defpackage.dl1;
import defpackage.m950;
import defpackage.mk5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.beginners.flow.BeginnersFlowCompletionRouter$onLaunch$1", f = "BeginnersFlowCompletionRouter.kt", l = {25}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BeginnersFlowCompletionRouter$onLaunch$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginnersFlowCompletionRouter$onLaunch$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BeginnersFlowCompletionRouter$onLaunch$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BeginnersFlowCompletionRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.beginners.domain.interactor.a aVar = this.this$0.G;
            this.label = 1;
            obj = aVar.a(this);
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
        bl5 bl5Var = (bl5) obj;
        r0 r0Var = this.this$0.D.c.b;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, ape0.a((ape0) value, 6)));
        c cVar = this.this$0;
        zy11 zy11Var = zy11.a;
        if (bl5Var == null) {
            cVar.H.a.g(zy11Var);
            cVar.z((m950) cVar.E.get(), new mk5(cVar));
        } else {
            cVar.A((m950) cVar.F.get(), bl5Var, new dl1(3, cVar));
        }
        return zy11Var;
    }
}
