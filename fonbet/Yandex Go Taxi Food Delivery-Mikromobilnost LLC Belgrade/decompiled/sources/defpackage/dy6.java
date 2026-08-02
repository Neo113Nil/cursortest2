package defpackage;

import com.yandex.go.chargers.data.model.ChargersSupportedHostsExperiment;
import com.yandex.go.tariffcard.experiment.DisableOldVerticalModeExperiment;
import com.yandex.go.tariffcard.experiment.MulticlassTariffsUnavailableTextsExperiment;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes.dex */
public final class dy6 implements qqo {
    public final /* synthetic */ int a;
    public final /* synthetic */ qqo b;

    public dy6(rqo rqoVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                ChargersSupportedHostsExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).c(ChargersSupportedHostsExperiment.e);
                break;
            case 2:
                DisableOldVerticalModeExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).c(DisableOldVerticalModeExperiment.c);
                break;
            case 3:
                MulticlassTariffsUnavailableTextsExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).c(MulticlassTariffsUnavailableTextsExperiment.g);
                break;
            case 4:
                wd60.Companion.getClass();
                this.b = ((jbh) rqoVar).c(wd60.e);
                break;
            case 5:
                this.b = ((jbh) rqoVar).a(SimpleBooleanExperiment.REPORT_FORMATTING_PRICE_FAILURE);
                break;
            default:
                this.b = ((jbh) rqoVar).c(cy6.g);
                break;
        }
    }

    @Override // defpackage.qqo
    public final tpr a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // defpackage.qqo
    public final Object b() {
        switch (this.a) {
            case 0:
                return (cy6) this.b.b();
            case 1:
                return (ChargersSupportedHostsExperiment) this.b.b();
            case 2:
                return (DisableOldVerticalModeExperiment) this.b.b();
            case 3:
                return (MulticlassTariffsUnavailableTextsExperiment) this.b.b();
            case 4:
                return (wd60) this.b.b();
            default:
                return (Boolean) this.b.b();
        }
    }

    public boolean d(String str) {
        qqo qqoVar = this.b;
        return ((wd60) qqoVar.b()).b && ((wd60) qqoVar.b()).c.contains(str);
    }
}
