package com.yandex.go.navigator.incidents.dashboard;

import com.yandex.go.navigator.incidents.IncidentType;
import com.yandex.go.navigator.incidents.experiment.Incident;
import defpackage.akg;
import defpackage.avj0;
import defpackage.bkg;
import defpackage.bms;
import defpackage.dkg;
import defpackage.ekg;
import defpackage.hpv;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.yjg;
import defpackage.zjg;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/yandex/go/navigator/incidents/IncidentType;", "incident", "Lhpv;", "experiment", "Lekg;", IssuingDistributionPointExtension.POINT, "Ldkg;", "<anonymous>", "(Lcom/yandex/go/navigator/incidents/IncidentType;Lhpv;Lekg;)Ldkg;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.incidents.dashboard.DashboardIncidentsUiStateRepository$incidentStateFlow$1", f = "DashboardIncidentsUiStateRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DashboardIncidentsUiStateRepository$incidentStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardIncidentsUiStateRepository$incidentStateFlow$1(a aVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        DashboardIncidentsUiStateRepository$incidentStateFlow$1 dashboardIncidentsUiStateRepository$incidentStateFlow$1 = new DashboardIncidentsUiStateRepository$incidentStateFlow$1(this.this$0, (Continuation) obj4);
        dashboardIncidentsUiStateRepository$incidentStateFlow$1.L$0 = (IncidentType) obj;
        dashboardIncidentsUiStateRepository$incidentStateFlow$1.L$1 = (hpv) obj2;
        dashboardIncidentsUiStateRepository$incidentStateFlow$1.L$2 = (ekg) obj3;
        return dashboardIncidentsUiStateRepository$incidentStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String h;
        IncidentType incidentType = (IncidentType) this.L$0;
        hpv hpvVar = (hpv) this.L$1;
        ekg ekgVar = (ekg) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (ekgVar == null || (h = ekgVar.b) == null) {
            h = ((avj0) this.this$0.a).h(kyh0.navigator_incidents_current_location);
        }
        ListBuilder a = rcc.a();
        List list = hpvVar.b;
        if (list.contains(Incident.Camera)) {
            IncidentType incidentType2 = IncidentType.Camera;
            a.add(new zjg(incidentType2, incidentType == incidentType2));
        }
        if (list.contains(Incident.Police)) {
            IncidentType incidentType3 = IncidentType.Police;
            a.add(new zjg(incidentType3, incidentType == incidentType3));
        }
        if (list.contains(Incident.Reconstruction)) {
            IncidentType incidentType4 = IncidentType.RoadWorks;
            a.add(new zjg(incidentType4, incidentType == incidentType4));
        }
        if (list.contains(Incident.Accident)) {
            IncidentType incidentType5 = IncidentType.Accident;
            a.add(new zjg(incidentType5, incidentType == incidentType5));
        }
        ListBuilder j = a.j();
        yjg yjgVar = hpvVar.c != null ? new yjg(((avj0) this.this$0.a).h(kyh0.navigator_incidents_something_else_button_title)) : null;
        a aVar = this.this$0;
        return new dkg(h, j, yjgVar, incidentType != null ? new bkg(((avj0) aVar.a).h(kyh0.navigator_incidents_enabled_submit_button)) : new akg(((avj0) aVar.a).h(kyh0.navigator_incidents_disabled_submit_button)));
    }
}
