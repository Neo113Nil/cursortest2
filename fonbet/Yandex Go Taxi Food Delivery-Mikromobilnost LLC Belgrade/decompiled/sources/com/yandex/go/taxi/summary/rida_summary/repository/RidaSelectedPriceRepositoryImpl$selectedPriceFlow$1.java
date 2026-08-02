package com.yandex.go.taxi.summary.rida_summary.repository;

import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r6k0;
import defpackage.scc;
import defpackage.t6k0;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lt6k0;", "pricesState", "", "selectedPriceIndex", "", "currentOfferId", "Lr6k0;", "<anonymous>", "(Lt6k0;ILjava/lang/String;)Lr6k0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.rida_summary.repository.RidaSelectedPriceRepositoryImpl$selectedPriceFlow$1", f = "RidaSelectedPriceRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RidaSelectedPriceRepositoryImpl$selectedPriceFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RidaSelectedPriceRepositoryImpl$selectedPriceFlow$1(i iVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = iVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        RidaSelectedPriceRepositoryImpl$selectedPriceFlow$1 ridaSelectedPriceRepositoryImpl$selectedPriceFlow$1 = new RidaSelectedPriceRepositoryImpl$selectedPriceFlow$1(this.this$0, (Continuation) obj4);
        ridaSelectedPriceRepositoryImpl$selectedPriceFlow$1.L$0 = (t6k0) obj;
        ridaSelectedPriceRepositoryImpl$selectedPriceFlow$1.I$0 = intValue;
        ridaSelectedPriceRepositoryImpl$selectedPriceFlow$1.L$1 = (String) obj3;
        return ridaSelectedPriceRepositoryImpl$selectedPriceFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        t6k0 t6k0Var = (t6k0) this.L$0;
        int i = this.I$0;
        String str = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        if (i >= 0) {
            List list = t6k0Var.b;
            String str2 = t6k0Var.a;
            if (!list.isEmpty() && str2.length() != 0 && str2.equals(str)) {
                return (r6k0) list.get(y6i0.d(i, 0, scc.f(list)));
            }
        }
        return r6k0.c;
    }
}
