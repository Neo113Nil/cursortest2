package com.yandex.go.navigator.driving;

import com.yandex.go.navigator.incidents.IncidentType;
import defpackage.i650;
import defpackage.jl40;
import defpackage.m5b1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q3j0;
import defpackage.r3j0;
import defpackage.s3j0;
import defpackage.t3j0;
import defpackage.v3j0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zov;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv3j0;", "it", "Lzy11;", "<anonymous>", "(Lv3j0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.DrivingNotificationsRepository$observeEvents$7", f = "DrivingNotificationsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrivingNotificationsRepository$observeEvents$7 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrivingNotificationsRepository$observeEvents$7(w wVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DrivingNotificationsRepository$observeEvents$7 drivingNotificationsRepository$observeEvents$7 = new DrivingNotificationsRepository$observeEvents$7(this.this$0, continuation);
        drivingNotificationsRepository$observeEvents$7.L$0 = obj;
        return drivingNotificationsRepository$observeEvents$7;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DrivingNotificationsRepository$observeEvents$7 drivingNotificationsRepository$observeEvents$7 = (DrivingNotificationsRepository$observeEvents$7) create((v3j0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        drivingNotificationsRepository$observeEvents$7.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        v3j0 v3j0Var = (v3j0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (v3j0Var instanceof q3j0) {
            this.this$0.d.a(((q3j0) v3j0Var).b);
        } else if (!jl40.l(v3j0Var, r3j0.a) && !jl40.l(v3j0Var, s3j0.a)) {
            if (!(v3j0Var instanceof t3j0)) {
                w511.b();
                return null;
            }
            zov zovVar = this.this$0.d;
            IncidentType incidentType = ((t3j0) v3j0Var).a;
            i650 i650Var = zovVar.a;
            String type = m5b1.g(incidentType).getType();
            i650Var.getClass();
            HashMap hashMap = new HashMap();
            if (type != null) {
                hashMap.put("event_type", type);
            }
            i650Var.a.a("navigation.reports.road_events.event_added", hashMap, 1, new HashMap());
        }
        return zy11.a;
    }
}
