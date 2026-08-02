package defpackage;

import com.yandex.go.due_timetable.experiment.IntercityTimetableConfigExperiment;
import com.yandex.go.due_timetable.experiment.IntercityTimetableConfigExperiment$TimeslotConfiguration$$serializer;
import com.yandex.go.due_timetable.experiment.IntercityTimetableConfigExperiment$TimeslotConfigurationRule$$serializer;
import com.yandex.go.flex.common.api.actions.IntercityMainAction;
import com.yandex.go.flex.common.api.actions.IntercityMainAction$Addresses$Clarification$$serializer;
import com.yandex.go.flex.common.api.actions.IntercityMainAction$Addresses$Coordinates$$serializer;
import com.yandex.go.flex.common.api.actions.r;
import com.yandex.go.flex.common.api.actions.t;
import com.yandex.go.flex.common.api.actions.v;
import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import com.yandex.go.inapp_calls.experiment.c;
import com.yandex.go.inapp_calls.experiment.d;
import com.yandex.go.navigator.incidents.experiment.Incident;
import com.yandex.go.navigator.incidents.experiment.IncidentsAvailabilityExperiment;
import com.yandex.go.navigator.incidents.experiment.a;
import com.yandex.go.taxi.intercity.dashboard.impl.experiment.IntercityDashboardFeedbackExperiment;
import com.yandex.go.taxi.intercity.dashboard.impl.experiment.IntercityDashboardFeedbackExperiment$Reason$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.experiment.HubVerticalOnSummaryExperiment;
import com.yandex.go.taxi.summary.mobilityhub.experiment.f;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.EditActionDto;
import ru.yandex.taxi.persuggest.api.GeoObjectType;
import ru.yandex.taxi.persuggest.api.ShouldFinalizeEvent;

/* loaded from: classes8.dex */
public final /* synthetic */ class i2v implements sls {
    public final /* synthetic */ int a;

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                f fVar = HubVerticalOnSummaryExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 1:
                sjh sjhVar = uyj.a;
                return o400.a.x;
            case 2:
                return tx21.a();
            case 3:
                return new ef2(0);
            case 4:
                return new vmr0(0);
            case 5:
                c cVar = InAppCallExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 6:
                c cVar2 = InAppCallExperiment.Companion;
                return new p53(auu0.a, 0);
            case 7:
                d dVar = InAppCallExperiment.FullScreenRequestModal.Companion;
                return new p53(auu0.a, 0);
            case 8:
                d dVar2 = InAppCallExperiment.FullScreenRequestModal.Companion;
                return InAppCallExperiment.FullScreenRequestModal.ShowMode.Companion.serializer();
            case 9:
                return vez0.g("com.yandex.go.navigator.incidents.experiment.Incident", Incident.values(), new String[]{"camera", "police", "accident", "reconstruction"}, new Annotation[][]{null, null, null, null});
            case 10:
                a aVar = IncidentsAvailabilityExperiment.Companion;
                return jsq0.Companion.serializer(Incident.Companion.serializer());
            case 11:
                qwd qwdVar = lrv.a;
                return t9h.a;
            case 12:
                a7u0 a7u0Var = u2w.a;
                return null;
            case 13:
                a3w a3wVar = b3w.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 14:
                com.yandex.go.taxi.intercity.dashboard.impl.experiment.a aVar2 = IntercityDashboardFeedbackExperiment.Companion;
                return new p53(IntercityDashboardFeedbackExperiment$Reason$$serializer.INSTANCE, 0);
            case 15:
                com.yandex.go.taxi.intercity.dashboard.impl.experiment.a aVar3 = IntercityDashboardFeedbackExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 16:
                slw slwVar = tlw.Companion;
                auu0 auu0Var5 = auu0.a;
                return new k8u(auu0Var5, new p53(auu0Var5, 0), 1);
            case 17:
                vlw vlwVar = ylw.Companion;
                auu0 auu0Var6 = auu0.a;
                return new k8u(auu0Var6, auu0Var6, 1);
            case 18:
                vlw vlwVar2 = ylw.Companion;
                return new p53(wlw.a, 0);
            case 19:
                t tVar = IntercityMainAction.Addresses.Companion;
                return r.Companion.serializer();
            case 20:
                t tVar2 = IntercityMainAction.Addresses.Companion;
                return r.Companion.serializer();
            case 21:
                return new ssp0("com.yandex.go.flex.common.api.actions.IntercityMainAction.Addresses.Address", qoi0.a(r.class), new lfx[]{qoi0.a(IntercityMainAction.Addresses.Clarification.class), qoi0.a(IntercityMainAction.Addresses.Coordinates.class), qoi0.a(v.class)}, new KSerializer[]{IntercityMainAction$Addresses$Clarification$$serializer.INSTANCE, IntercityMainAction$Addresses$Coordinates$$serializer.INSTANCE, new o4o("current_a", v.INSTANCE, new Annotation[]{new tfr()})}, new Annotation[]{new tfr()});
            case 22:
                return new o4o("current_a", v.INSTANCE, new Annotation[]{new tfr()});
            case 23:
                com.yandex.go.due_timetable.experiment.a aVar4 = IntercityTimetableConfigExperiment.Companion;
                return new p53(IntercityTimetableConfigExperiment$TimeslotConfigurationRule$$serializer.INSTANCE, 0);
            case 24:
                com.yandex.go.due_timetable.experiment.c cVar3 = IntercityTimetableConfigExperiment.TimeslotConfigurationRule.Companion;
                return new p53(IntercityTimetableConfigExperiment$TimeslotConfiguration$$serializer.INSTANCE, 0);
            case 25:
                hsw hswVar = ksw.Companion;
                return jsq0.Companion.serializer(ShouldFinalizeEvent.Companion.serializer());
            case 26:
                hsw hswVar2 = ksw.Companion;
                return GeoObjectType.Companion.serializer();
            case 27:
                hsw hswVar3 = ksw.Companion;
                return new p53(gn0.a, 0);
            case 28:
                hsw hswVar4 = ksw.Companion;
                return EditActionDto.Companion.serializer();
            default:
                return zy11.a;
        }
    }

    public /* synthetic */ i2v(int i) {
        this.a = i;
    }
}
