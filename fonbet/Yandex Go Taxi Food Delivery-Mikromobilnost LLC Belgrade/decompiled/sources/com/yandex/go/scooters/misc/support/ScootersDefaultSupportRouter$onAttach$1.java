package com.yandex.go.scooters.misc.support;

import defpackage.fva0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p4g0;
import defpackage.qu;
import defpackage.r2p0;
import defpackage.tse;
import defpackage.ukn0;
import defpackage.wls;
import defpackage.zgz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.experiments.g0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.misc.support.ScootersDefaultSupportRouter$onAttach$1", f = "ScootersDefaultSupportRouter.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDefaultSupportRouter$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ r2p0 $payload;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDefaultSupportRouter$onAttach$1(b bVar, r2p0 r2p0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$payload = r2p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDefaultSupportRouter$onAttach$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDefaultSupportRouter$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar2 = this.this$0;
            ukn0 ukn0Var = bVar2.I;
            this.L$0 = bVar2;
            this.label = 1;
            Object b = ukn0Var.a.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar = bVar2;
            obj = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = (b) this.L$0;
            kotlin.b.b(obj);
        }
        bVar.N = ((g0) obj).d;
        String str = this.this$0.N;
        if (str == null || str.length() == 0) {
            zgz.a("Url of support is not provided in experiment", new IllegalArgumentException());
            this.this$0.r(new qu(9));
        } else {
            b bVar3 = this.this$0;
            Object obj2 = bVar3.J.get();
            b bVar4 = this.this$0;
            ru.yandex.taxi.scooters.presentation.loading.b bVar5 = (ru.yandex.taxi.scooters.presentation.loading.b) obj2;
            bVar4.z(bVar5, new p4g0(bVar4, 6));
            bVar3.P = bVar5;
            fva0.f(this.this$0.G, "ScootersSupport", PerformanceAnalytics$Type.Loading, 0L, 4);
            super/*com.yandex.go.navigation.modals.coroutines.a*/.G(this.$payload);
        }
        return zy11.a;
    }
}
