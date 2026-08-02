package com.yandex.go.overdraft.domain;

import defpackage.m6a0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.sz80;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.overdraft.domain.OverdraftPayInteractor$pollDebtForPayment$2", f = "OverdraftPayInteractor.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OverdraftPayInteractor$pollDebtForPayment$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $debtOrderIds;
    final /* synthetic */ m6a0 $paymentMethodReference;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftPayInteractor$pollDebtForPayment$2(k kVar, m6a0 m6a0Var, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$paymentMethodReference = m6a0Var;
        this.$debtOrderIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OverdraftPayInteractor$pollDebtForPayment$2(this.this$0, this.$paymentMethodReference, this.$debtOrderIds, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OverdraftPayInteractor$pollDebtForPayment$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l lVar = (l) this.this$0.c.get();
            m6a0 m6a0Var = this.$paymentMethodReference;
            List<String> list = this.$debtOrderIds;
            this.label = 1;
            c = lVar.c(m6a0Var, list, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        k kVar = this.this$0;
        m6a0 m6a0Var2 = this.$paymentMethodReference;
        ((sz80) kVar.b.a).b = false;
        ((sz80) kVar.b.a).c = EmptyList.a;
        tse tseVar = kVar.a;
        sjh sjhVar = uyj.a;
        tje.N(tseVar, mdh.b, null, new OverdraftPayInteractor$payDebt$2(kVar, c, m6a0Var2, null), 2);
        return zy11.a;
    }
}
