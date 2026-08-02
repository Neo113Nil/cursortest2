package com.yandex.go.chargers.misc.support;

import com.yandex.go.chargers.data.g;
import com.yandex.go.chargers.data.model.ChargersExperiment;
import defpackage.dl1;
import defpackage.fva0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.rva;
import defpackage.sva;
import defpackage.tse;
import defpackage.whb1;
import defpackage.wls;
import defpackage.x2a;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.misc.support.ChargersDefaultSupportRouter$onAttach$1", f = "ChargersDefaultSupportRouter.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersDefaultSupportRouter$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ rva $payload;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDefaultSupportRouter$onAttach$1(b bVar, rva rvaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$payload = rvaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersDefaultSupportRouter$onAttach$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersDefaultSupportRouter$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar2 = this.this$0;
            g gVar = bVar2.I;
            this.L$0 = bVar2;
            this.label = 1;
            Object b = gVar.a.b(this);
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
        bVar.M = ((ChargersExperiment) obj).d;
        String str = this.this$0.M;
        if (str == null || str.length() == 0) {
            whb1.c("Url of support is not provided in experiment", new IllegalArgumentException());
            this.this$0.r(new qu(9));
        } else {
            b bVar3 = this.this$0;
            bVar3.z((x2a) bVar3.O.getValue(), new dl1(8, this.this$0));
            fva0.f(this.this$0.F, "Chargers.Support", PerformanceAnalytics$Type.Loading, 0L, 4);
            super/*com.yandex.go.navigation.modals.coroutines.a*/.G(new sva(this.$payload));
        }
        return zy11.a;
    }
}
