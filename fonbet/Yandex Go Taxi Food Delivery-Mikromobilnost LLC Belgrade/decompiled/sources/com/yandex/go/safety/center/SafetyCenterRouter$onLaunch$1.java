package com.yandex.go.safety.center;

import com.yandex.go.safety.center.api.AccidentsResponse;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import defpackage.esl0;
import defpackage.hrl0;
import defpackage.itl0;
import defpackage.jl40;
import defpackage.m950;
import defpackage.mvg;
import defpackage.n48;
import defpackage.ny61;
import defpackage.qtl0;
import defpackage.rtl0;
import defpackage.tse;
import defpackage.ttl0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.SafetyCenterRouter$onLaunch$1", f = "SafetyCenterRouter.kt", l = {74}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ itl0 $payload;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterRouter$onLaunch$1(l lVar, itl0 itl0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$payload = itl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                j jVar = this.this$0.D;
                this.label = 1;
                obj = jVar.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            failure = (AccidentsResponse.Accident) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        AccidentsResponse.Accident accident = (AccidentsResponse.Accident) failure;
        l lVar = this.this$0;
        if (accident != null) {
            ContentContainer$ZOrder contentContainer$ZOrder = ContentContainer$ZOrder.MAP;
            lVar.getClass();
            AccidentsResponse.Status status = accident.b;
            int i2 = status == null ? -1 : qtl0.a[status.ordinal()];
            l lVar2 = this.this$0;
            if (i2 == 1) {
                lVar2.A((m950) lVar2.G.get(), accident, new rtl0(lVar2));
            } else {
                Iterator it = lVar2.E.j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (jl40.l(((SafetyCenterExperiment.Instruction) next).a, "car_crash")) {
                        obj2 = next;
                        break;
                    }
                }
                SafetyCenterExperiment.Instruction instruction = (SafetyCenterExperiment.Instruction) obj2;
                if (instruction != null) {
                    lVar2.z(((esl0) lVar2.F).a(new hrl0(), new n48(instruction)), new ttl0(lVar2));
                } else {
                    itl0 itl0Var = (itl0) lVar2.x;
                    if (itl0Var != null) {
                        lVar2.P(itl0Var);
                    }
                }
            }
        } else {
            lVar.P(this.$payload);
        }
        return zy11.a;
    }
}
