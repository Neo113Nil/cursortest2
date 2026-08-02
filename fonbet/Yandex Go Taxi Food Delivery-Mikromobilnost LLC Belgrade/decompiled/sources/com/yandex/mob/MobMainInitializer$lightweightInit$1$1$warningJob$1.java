package com.yandex.mob;

import com.yandex.mob.MobMainInitializer;
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
@mvg(c = "com.yandex.mob.MobMainInitializer$lightweightInit$1$1$warningJob$1", f = "MobMainInitializer.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MobMainInitializer$lightweightInit$1$1$warningJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ oo20 $this_with;
    int label;
    final /* synthetic */ MobMainInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobMainInitializer$lightweightInit$1$1$warningJob$1(MobMainInitializer mobMainInitializer, oo20 oo20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mobMainInitializer;
        this.$this_with = oo20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobMainInitializer$lightweightInit$1$1$warningJob$1(this.this$0, this.$this_with, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobMainInitializer$lightweightInit$1$1$warningJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.label = 1;
            if (kotlinx.coroutines.a.i(60000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (this.this$0.b.get() != MobMainInitializer.State.BACKGROUND_STARTED) {
            ((xo20) this.$this_with).c().a("MobInitialization", new IllegalStateException("startBackgroundOperations() was not called during one minute after lightweight initialization"));
        }
        return zy11.a;
    }
}
