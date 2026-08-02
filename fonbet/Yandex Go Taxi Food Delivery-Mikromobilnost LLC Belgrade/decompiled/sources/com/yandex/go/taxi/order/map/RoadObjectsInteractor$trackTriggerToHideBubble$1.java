package com.yandex.go.taxi.order.map;

import com.yandex.mapkit.geometry.Point;
import defpackage.a901;
import defpackage.dms;
import defpackage.e901;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lzzs;", "currentPosition", "Le901;", "uiState", "", "La901;", "trafficLightsWithSignal", "", "isTrafficLightsWithSignalExperimentEnabled", "Lzy11;", "<anonymous>", "(Lzzs;Le901;Ljava/util/List;Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.RoadObjectsInteractor$trackTriggerToHideBubble$1", f = "RoadObjectsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RoadObjectsInteractor$trackTriggerToHideBubble$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadObjectsInteractor$trackTriggerToHideBubble$1(n nVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = nVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        RoadObjectsInteractor$trackTriggerToHideBubble$1 roadObjectsInteractor$trackTriggerToHideBubble$1 = new RoadObjectsInteractor$trackTriggerToHideBubble$1(this.this$0, (Continuation) obj5);
        roadObjectsInteractor$trackTriggerToHideBubble$1.L$0 = (zzs) obj;
        roadObjectsInteractor$trackTriggerToHideBubble$1.L$1 = (e901) obj2;
        roadObjectsInteractor$trackTriggerToHideBubble$1.L$2 = (List) obj3;
        roadObjectsInteractor$trackTriggerToHideBubble$1.Z$0 = booleanValue;
        zy11 zy11Var = zy11.a;
        roadObjectsInteractor$trackTriggerToHideBubble$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Point point;
        Object value;
        e901 e901Var;
        e901.a aVar;
        zzs zzsVar = (zzs) this.L$0;
        e901 e901Var2 = (e901) this.L$1;
        List list = (List) this.L$2;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (zzsVar != null) {
            if (z) {
                List list2 = e901Var2.a;
                a901 a901Var = (a901) kotlin.collections.a.R(list);
                point = (Point) kotlin.collections.a.R(kotlin.collections.a.m0(scc.h(a901Var != null ? a901Var.b : null), list2));
            } else {
                point = (Point) kotlin.collections.a.R(e901Var2.a);
            }
            if (point != null) {
                float j = ru.yandex.taxi.map.utils.a.j(zzsVar, ru.yandex.taxi.map.utils.a.E(point, null));
                r0 r0Var = this.this$0.b.a;
                do {
                    value = r0Var.getValue();
                    e901Var = (e901) value;
                    aVar = e901Var.e;
                    if (j <= aVar.b || !aVar.a) {
                        break;
                    }
                } while (!r0Var.k(value, e901.a(e901Var, null, null, 0, null, e901.a.a(aVar, false, 0.0f, null, 6), 15)));
            }
        }
        return zy11.a;
    }
}
