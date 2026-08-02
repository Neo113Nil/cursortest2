package com.yandex.go.scooters.live;

import com.yandex.go.scooters.live.domain.model.ScootersLiveAction;
import defpackage.i5m;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.twn0;
import defpackage.wls;
import defpackage.wwn0;
import defpackage.zuo0;
import defpackage.zy11;
import defpackage.zzf;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.live.ScootersLiveBroadcastReceiver$onReceive$1", f = "ScootersLiveBroadcastReceiver.kt", l = {22}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersLiveBroadcastReceiver$onReceive$1 extends SuspendLambda implements wls {
    final /* synthetic */ twn0 $dependencies;
    final /* synthetic */ wwn0 $result;
    final /* synthetic */ ScootersLiveAction $scootersLiveAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersLiveBroadcastReceiver$onReceive$1(twn0 twn0Var, ScootersLiveAction scootersLiveAction, wwn0 wwn0Var, Continuation continuation) {
        super(2, continuation);
        this.$dependencies = twn0Var;
        this.$scootersLiveAction = scootersLiveAction;
        this.$result = wwn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersLiveBroadcastReceiver$onReceive$1(this.$dependencies, this.$scootersLiveAction, this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersLiveBroadcastReceiver$onReceive$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zzf zzfVar = (zzf) this.$dependencies;
            com.yandex.go.scooters.live.domain.a aVar = new com.yandex.go.scooters.live.domain.a(i5m.a(zzfVar.Cg), i5m.a(zzfVar.Hg), i5m.a(zzfVar.Ig));
            ScootersLiveAction scootersLiveAction = this.$scootersLiveAction;
            zuo0 zuo0Var = this.$result.a;
            this.label = 1;
            if (aVar.b(scootersLiveAction, zuo0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
