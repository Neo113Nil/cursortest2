package com.yandex.go.profile.domain.divkit.variables;

import defpackage.gkh;
import defpackage.h3y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tma0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uma0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.profile.domain.divkit.variables.PaymentMethodVariableHandler$init$1", f = "PaymentMethodVariableHandler.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentMethodVariableHandler$init$1 extends SuspendLambda implements wls {
    final /* synthetic */ tse $scope;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodVariableHandler$init$1(c cVar, tse tseVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$scope = tseVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodVariableHandler$init$1(this.this$0, this.$scope, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodVariableHandler$init$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            this.label = 1;
            obj = c.e(cVar, this);
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
        c cVar2 = this.this$0;
        tse tseVar = this.$scope;
        n nVar = new n(((uma0) ((tma0) cVar2.d.get())).a.b(), new PaymentMethodVariableHandler$subscribeToPaymentUpdates$1(2, null));
        h3y h3yVar = cVar2.c;
        gkh gkhVar = (gkh) h3yVar.get();
        gkhVar.a.getClass();
        gkhVar.b.getClass();
        tpr b = gkhVar.c.b();
        gkh gkhVar2 = (gkh) h3yVar.get();
        gkhVar2.a.getClass();
        gkhVar2.b.getClass();
        tje.N(tseVar, null, null, new PaymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.n(nVar, b, gkhVar2.c.a(), new PaymentMethodVariableHandler$subscribeToPaymentUpdates$2(cVar2, (String) obj, null)), null, cVar2), 3);
        return zy11.a;
    }
}
