package com.yandex.go.navigator.incidents.report;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yandex.go.navigator.driving.DrivingModeNotification;
import com.yandex.go.navigator.driving.r;
import com.yandex.go.navigator.repository.ReportStatus$Error$ErrorType;
import com.yandex.mapkit.road_events.RoadEventSession;
import defpackage.apv;
import defpackage.avj0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q3j0;
import defpackage.r3j0;
import defpackage.s3j0;
import defpackage.t3j0;
import defpackage.tse;
import defpackage.uov;
import defpackage.v2h0;
import defpackage.v3j0;
import defpackage.vng;
import defpackage.w511;
import defpackage.wls;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/navigator/driving/DrivingModeNotification;", "<anonymous>", "(Ltse;)Lcom/yandex/go/navigator/driving/DrivingModeNotification;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.incidents.report.IncidentErrorIntercator$mapToNotification$2", f = "IncidentErrorIntercator.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class IncidentErrorIntercator$mapToNotification$2 extends SuspendLambda implements wls {
    final /* synthetic */ v3j0 $reportStatus;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncidentErrorIntercator$mapToNotification$2(v3j0 v3j0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$reportStatus = v3j0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IncidentErrorIntercator$mapToNotification$2(this.$reportStatus, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IncidentErrorIntercator$mapToNotification$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        v3j0 v3j0Var = this.$reportStatus;
        q3j0 q3j0Var = v3j0Var instanceof q3j0 ? (q3j0) v3j0Var : null;
        if ((q3j0Var != null ? q3j0Var.a : null) == ReportStatus$Error$ErrorType.LegalReason && this.this$0.d.get() == 0) {
            this.this$0.d.incrementAndGet();
            apv apvVar = this.this$0.a;
            uov uovVar = apvVar.c;
            if (uovVar != null) {
                apvVar.a(uovVar.a, uovVar.b);
            }
            apvVar.c = null;
            RoadEventSession roadEventSession = apvVar.a.f;
            if (roadEventSession != null) {
                roadEventSession.cancel();
                return null;
            }
        } else {
            apv apvVar2 = this.this$0.a;
            apvVar2.c = null;
            RoadEventSession roadEventSession2 = apvVar2.a.f;
            if (roadEventSession2 != null) {
                roadEventSession2.cancel();
            }
            r rVar = this.this$0.b;
            v3j0 v3j0Var2 = this.$reportStatus;
            zuj0 zuj0Var = rVar.b;
            if (jl40.l(v3j0Var2, s3j0.a) || (v3j0Var2 instanceof t3j0)) {
                Context context = rVar.a;
                return new DrivingModeNotification(context, "1011", vng.t(v2h0.ic_check, context), ((avj0) zuj0Var).h(kyh0.navigator_incidents_report_notification_possitive), null, null, null, 0L, false, null, 0, 2032, null);
            }
            if (v3j0Var2 instanceof q3j0) {
                Context context2 = rVar.a;
                Drawable t = vng.t(v2h0.ic_warning, context2);
                String str = ((q3j0) v3j0Var2).b;
                if (str == null) {
                    str = ((avj0) zuj0Var).h(kyh0.navigator_incidents_report_notification_negative);
                }
                return new DrivingModeNotification(context2, "1011", t, str, null, null, null, 0L, false, null, 0, 2032, null);
            }
            if (!jl40.l(v3j0Var2, r3j0.a)) {
                w511.b();
                return null;
            }
        }
        return null;
    }
}
