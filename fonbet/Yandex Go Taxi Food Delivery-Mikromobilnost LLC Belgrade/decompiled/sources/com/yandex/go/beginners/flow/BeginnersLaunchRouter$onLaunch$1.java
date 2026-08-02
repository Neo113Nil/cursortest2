package com.yandex.go.beginners.flow;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pk5;
import defpackage.qk1;
import defpackage.qk5;
import defpackage.qu;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.beginners.flow.BeginnersLaunchRouter$onLaunch$1", f = "BeginnersLaunchRouter.kt", l = {19}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BeginnersLaunchRouter$onLaunch$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginnersLaunchRouter$onLaunch$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BeginnersLaunchRouter$onLaunch$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BeginnersLaunchRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m0 d = this.this$0.D.d();
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.A(d, this);
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
        final qk1 qk1Var = (qk1) obj;
        e eVar = this.this$0;
        if (qk1Var == null) {
            eVar.r(new qu(9));
        } else {
            eVar.r(new tls() { // from class: com.yandex.go.beginners.flow.d
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    qk5 qk5Var = ((pk5) obj2).a;
                    qk5Var.F.a();
                    com.yandex.go.coroutines.b.g(qk5Var.o(), null, null, new BeginnersFlowRouterImpl$handleLocationAgreementPayload$1(qk5Var, qk1.this, null), 3);
                    return zy11.a;
                }
            });
        }
        return zy11.a;
    }
}
