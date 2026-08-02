package defpackage;

import com.yandex.go.due.experiment.PreorderTitleByTariffExperiment;
import com.yandex.go.telemetry.experiment.TelemetryReportConfigExperiment;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes12.dex */
public final class d6i {
    public final qqo a;

    public d6i(rqo rqoVar, int i) {
        switch (i) {
            case 1:
                rvy.Companion.getClass();
                this.a = ((jbh) rqoVar).c(rvy.g);
                break;
            case 2:
                PreorderTitleByTariffExperiment.Companion.getClass();
                this.a = ((jbh) rqoVar).c(PreorderTitleByTariffExperiment.f);
                break;
            case 3:
                usr0.Companion.getClass();
                this.a = ((jbh) rqoVar).c(usr0.i);
                break;
            case 4:
                TelemetryReportConfigExperiment.Companion.getClass();
                this.a = ((jbh) rqoVar).c(TelemetryReportConfigExperiment.e);
                break;
            default:
                this.a = ((jbh) rqoVar).a(SimpleBooleanExperiment.DELIVERY_DISABLE_CONTACTS_CHOOSER);
                break;
        }
    }

    public String a(String str) {
        if (str == null) {
            return null;
        }
        Object b = this.a.b();
        if (!((PreorderTitleByTariffExperiment) b).getB()) {
            b = null;
        }
        PreorderTitleByTariffExperiment preorderTitleByTariffExperiment = (PreorderTitleByTariffExperiment) b;
        if (preorderTitleByTariffExperiment == null) {
            return null;
        }
        String str2 = (String) preorderTitleByTariffExperiment.d.get(str);
        if (str2 == null) {
            str2 = "";
        }
        String Y = d6z.Y(preorderTitleByTariffExperiment, str2);
        if (Y.length() > 0) {
            return Y;
        }
        return null;
    }
}
