package com.yandex.mob;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rot;
import defpackage.tls;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.MobAndroidMainProcess$mobIdProvider$2$1", f = "MobAndroidMainProcess.kt", l = {206}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MobAndroidMainProcess$mobIdProvider$2$1 extends SuspendLambda implements tls {
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobAndroidMainProcess$mobIdProvider$2$1(d dVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MobAndroidMainProcess$mobIdProvider$2$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MobAndroidMainProcess$mobIdProvider$2$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rot rotVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rot rotVar2 = (rot) this.this$0.q.getValue();
            com.yandex.mob.reporting.a aVar = (com.yandex.mob.reporting.a) this.this$0.H.getValue();
            this.L$0 = rotVar2;
            this.label = 1;
            Serializable g = aVar.g(this);
            if (g == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = g;
            rotVar = rotVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rotVar = (rot) this.L$0;
            kotlin.b.b(obj);
        }
        rotVar.b((Pair) obj);
        return zy11.a;
    }
}
