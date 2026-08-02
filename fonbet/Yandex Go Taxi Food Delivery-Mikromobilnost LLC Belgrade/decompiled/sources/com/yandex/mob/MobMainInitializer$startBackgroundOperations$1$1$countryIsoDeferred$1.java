package com.yandex.mob;

import defpackage.ha2;
import defpackage.mvg;
import defpackage.nn20;
import defpackage.ny61;
import defpackage.oo20;
import defpackage.tse;
import defpackage.wls;
import defpackage.xo20;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.MobMainInitializer$startBackgroundOperations$1$1$countryIsoDeferred$1", f = "MobMainInitializer.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MobMainInitializer$startBackgroundOperations$1$1$countryIsoDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ oo20 $this_with;
    int label;
    final /* synthetic */ MobMainInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobMainInitializer$startBackgroundOperations$1$1$countryIsoDeferred$1(MobMainInitializer mobMainInitializer, oo20 oo20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mobMainInitializer;
        this.$this_with = oo20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobMainInitializer$startBackgroundOperations$1$1$countryIsoDeferred$1(this.this$0, this.$this_with, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobMainInitializer$startBackgroundOperations$1$1$countryIsoDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        MobMainInitializer mobMainInitializer = this.this$0;
        oo20 oo20Var = this.$this_with;
        this.label = 1;
        mobMainInitializer.getClass();
        nn20 nn20Var = (nn20) ((xo20) oo20Var).u.getValue();
        Object collect = new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.t(new ha2(7, nn20Var.b.a(new com.yandex.go.proxyprovision.mob.c(com.yandex.go.coroutines.b.j(((ru.yandex.taxi.preorder.source.userposition.e) nn20Var.a.a).n(), 30000L))), nn20Var)), new MobMainInitializer$requestAndSaveCountryIso$2(oo20Var, null)).collect(new g(oo20Var), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
