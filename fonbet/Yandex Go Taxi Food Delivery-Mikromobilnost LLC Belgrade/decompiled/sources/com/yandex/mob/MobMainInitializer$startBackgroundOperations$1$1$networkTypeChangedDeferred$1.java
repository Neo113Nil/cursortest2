package com.yandex.mob;

import defpackage.ha2;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oo20;
import defpackage.tse;
import defpackage.wls;
import defpackage.xo20;
import defpackage.z160;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.MobMainInitializer$startBackgroundOperations$1$1$networkTypeChangedDeferred$1", f = "MobMainInitializer.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MobMainInitializer$startBackgroundOperations$1$1$networkTypeChangedDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ oo20 $this_with;
    int label;
    final /* synthetic */ MobMainInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobMainInitializer$startBackgroundOperations$1$1$networkTypeChangedDeferred$1(MobMainInitializer mobMainInitializer, oo20 oo20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mobMainInitializer;
        this.$this_with = oo20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobMainInitializer$startBackgroundOperations$1$1$networkTypeChangedDeferred$1(this.this$0, this.$this_with, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobMainInitializer$startBackgroundOperations$1$1$networkTypeChangedDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        z160 z160Var = (z160) ((xo20) oo20Var).N.getValue();
        Object collect = new kotlinx.coroutines.flow.o(new ha2(10, new mth(z160Var.a.b, 6), z160Var), new MobMainInitializer$subscribeOnNetworkTypeChange$2(oo20Var, null)).collect(new h(oo20Var), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
