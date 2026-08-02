package com.yandex.mob;

import defpackage.mvg;
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
@mvg(c = "com.yandex.mob.MobMainInitializer$startBackgroundOperations$1$1$reportDeferred$1", f = "MobMainInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MobMainInitializer$startBackgroundOperations$1$1$reportDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ oo20 $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobMainInitializer$startBackgroundOperations$1$1$reportDeferred$1(oo20 oo20Var, Continuation continuation) {
        super(2, continuation);
        this.$this_with = oo20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobMainInitializer$startBackgroundOperations$1$1$reportDeferred$1(this.$this_with, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MobMainInitializer$startBackgroundOperations$1$1$reportDeferred$1 mobMainInitializer$startBackgroundOperations$1$1$reportDeferred$1 = (MobMainInitializer$startBackgroundOperations$1$1$reportDeferred$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mobMainInitializer$startBackgroundOperations$1$1$reportDeferred$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((com.yandex.mob.domain.d) ((xo20) this.$this_with).p.getValue()).b();
        return zy11.a;
    }
}
