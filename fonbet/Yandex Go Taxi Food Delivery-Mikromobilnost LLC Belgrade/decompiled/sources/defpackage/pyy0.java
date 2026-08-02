package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.yandex.go.due_timetable.experiment.model.SettingsForTariffClass$$serializer;
import com.yandex.go.due_timetable.experiment.model.Timetable;
import com.yandex.go.flex.main_screen.presentation.controllers.skaffold.TrackedScrollScaffold;
import com.yandex.go.taxi.order.experiments.TrackingTariffIconOverlayExperiment;
import com.yandex.go.taxi.order.experiments.TrackingTariffIconOverlayExperiment$TrackingCardIconOverlayExperimentIconModel$$serializer;
import com.yandex.go.taxi.order.experiments.t;
import com.yandex.go.taxi.order.experiments.u;
import com.yandex.go.tips.experiments.TipsSettingsModalExperiment;
import com.yandex.go.zone.dto.objects.TollRoadsAvailability;
import com.yandex.messaging.core.net.entities.BackendConfig;
import flex.section.divkit.DivkitSnippet;
import flex.theme.ThemedColor;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.api.dto.ticket.TicketMode;
import ru.yandex.taxi.communications.api.dto.ticket.a;
import ru.yandex.taxi.communications.api.dto.ticket.b;
import ru.yandex.taxi.communications.api.dto.ticket.d;
import ru.yandex.taxi.jobs.push.ToggleJobsExperiment;
import ru.yandex.taxi.jobs.push.c;

/* loaded from: classes.dex */
public final /* synthetic */ class pyy0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ pyy0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new Handler(Looper.getMainLooper());
            case 1:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 2:
                z0z0 z0z0Var = a.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 3:
                z0z0 z0z0Var2 = a.Companion;
                return new p53(auu0.a, 1);
            case 4:
                z0z0 z0z0Var3 = a.Companion;
                return TicketMode.Companion.serializer();
            case 5:
                z0z0 z0z0Var4 = a.Companion;
                return new p53(d.a, 1);
            case 6:
                z0z0 z0z0Var5 = a.Companion;
                return new p53(ru.yandex.taxi.communications.api.dto.d.a, 0);
            case 7:
                z0z0 z0z0Var6 = a.Companion;
                return new p53(b.a, 0);
            case 8:
                return new u2l(eg90.b);
            case 9:
                return uph.Companion.serializer();
            case 10:
                return dtg.Companion.serializer();
            case 11:
                return xzy0.Companion.serializer();
            case 12:
                return bgy.Companion.serializer();
            case 13:
                return new cgy();
            case 14:
                return new rez0(SystemClock.elapsedRealtime());
            case 15:
                com.yandex.go.due_timetable.experiment.model.b bVar = Timetable.Companion;
                return new k8u(auu0.a, SettingsForTariffClass$$serializer.INSTANCE, 1);
            case 16:
                com.yandex.go.tips.experiments.a aVar = TipsSettingsModalExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 17:
                giz0 giz0Var = iiz0.Companion;
                return new p53(q5w.c, 0);
            case 18:
                wiz0 wiz0Var = xiz0.Companion;
                return new p53(auu0.a, 0);
            case 19:
                c cVar = ToggleJobsExperiment.a.Companion;
                return ToggleJobsExperiment.StateDto.Companion.serializer();
            case 20:
                return vez0.g("ru.yandex.taxi.jobs.push.ToggleJobsExperiment.StateDto", ToggleJobsExperiment.StateDto.values(), new String[]{"off", "schedule", "periodic_schedule", null}, new Annotation[][]{null, null, null, null});
            case 21:
                poz0 poz0Var = soz0.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 22:
                return vez0.g("com.yandex.go.zone.dto.objects.TollRoadsAvailability", TollRoadsAvailability.values(), new String[]{BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.DISABLED, "enabled_if_only_tolls"}, new Annotation[][]{null, null, null});
            case 23:
                urz0 urz0Var = vrz0.Companion;
                return TollRoadsAvailability.Companion.serializer();
            case 24:
                com.yandex.go.flex.main_screen.presentation.controllers.skaffold.a aVar2 = TrackedScrollScaffold.Companion;
                return DivkitSnippet.Companion.serializer();
            case 25:
                com.yandex.go.flex.main_screen.presentation.controllers.skaffold.a aVar3 = TrackedScrollScaffold.Companion;
                return DivkitSnippet.Companion.serializer();
            case 26:
                com.yandex.go.flex.main_screen.presentation.controllers.skaffold.a aVar4 = TrackedScrollScaffold.Companion;
                return DivkitSnippet.Companion.serializer();
            case 27:
                com.yandex.go.flex.main_screen.presentation.controllers.skaffold.a aVar5 = TrackedScrollScaffold.Companion;
                return ThemedColor.Companion.serializer();
            case 28:
                t tVar = TrackingTariffIconOverlayExperiment.Companion;
                return new p53(TrackingTariffIconOverlayExperiment$TrackingCardIconOverlayExperimentIconModel$$serializer.INSTANCE, 0);
            default:
                u uVar = TrackingTariffIconOverlayExperiment.TrackingCardIconOverlayExperimentIconModel.Companion;
                return new p53(auu0.a, 0);
        }
    }
}
