package com.yandex.go.scooters.discovery;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.discovery.ScootersDiscoveryRouter$handleScootersIntents$1", f = "ScootersDiscoveryRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDiscoveryRouter$handleScootersIntents$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDiscoveryRouter$handleScootersIntents$1(m mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersDiscoveryRouter$handleScootersIntents$1 scootersDiscoveryRouter$handleScootersIntents$1 = new ScootersDiscoveryRouter$handleScootersIntents$1(this.this$0, continuation);
        scootersDiscoveryRouter$handleScootersIntents$1.L$0 = obj;
        return scootersDiscoveryRouter$handleScootersIntents$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersDiscoveryRouter$handleScootersIntents$1 scootersDiscoveryRouter$handleScootersIntents$1 = (ScootersDiscoveryRouter$handleScootersIntents$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersDiscoveryRouter$handleScootersIntents$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        m mVar = this.this$0;
        ru.yandex.taxi.deeplinks.a.c(tseVar, mVar.R, new l(mVar));
        return zy11.a;
    }
}
