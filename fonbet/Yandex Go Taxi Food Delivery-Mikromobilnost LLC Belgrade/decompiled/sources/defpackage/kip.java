package defpackage;

import com.yandex.go.point_selection_settings.PointSelectionScreenSettingsExperiment;
import com.yandex.go.taxi.experiments.OverrideInactiveTariffsExperiment;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes5.dex */
public final class kip {
    public final qqo a;

    public kip(rqo rqoVar, int i) {
        switch (i) {
            case 1:
                this.a = ((jbh) rqoVar).a(SimpleBooleanExperiment.FINALSUGGEST_ON_SUMMARY_CLARIFY_A_START);
                break;
            case 2:
                this.a = ((jbh) rqoVar).a(SimpleBooleanExperiment.NAVIGATOR_ON_TAXI_SUMMARY_AVAILABILITY);
                break;
            case 3:
                OverrideInactiveTariffsExperiment.Companion.getClass();
                this.a = ((jbh) rqoVar).c(OverrideInactiveTariffsExperiment.e);
                break;
            case 4:
                this.a = ((jbh) rqoVar).c(new PointSelectionScreenSettingsExperiment(0));
                break;
            case 5:
                this.a = ((jbh) rqoVar).a(SimpleBooleanExperiment.TECHNICAL_CLARIFY_BUBBLE_NAVIGATION_FIX);
                break;
            default:
                agp.Companion.getClass();
                this.a = ((jbh) rqoVar).c(agp.n);
                break;
        }
    }

    public agp a() {
        return (agp) this.a.b();
    }

    public boolean b() {
        return (a().b && a().h) ? false : true;
    }

    public boolean c() {
        return (a().b && a().g) ? false : true;
    }
}
