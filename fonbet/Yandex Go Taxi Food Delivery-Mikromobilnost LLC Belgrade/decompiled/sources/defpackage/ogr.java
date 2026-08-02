package defpackage;

import com.yandex.go.account.phonish_upgrade.ForcePhonishUpgradeExperiment;
import com.yandex.go.account.phonish_upgrade.a;
import com.yandex.go.account.upgrade.ForceAccountUpgradeExperiment;
import com.yandex.go.account.upgrade.h;
import com.yandex.go.payments.paymentlist.experiments.ForcedPaymentMethodChangeExperiment;
import com.yandex.go.payments.shared.details.experiments.ForceZaloginForFamilyExperiment;
import com.yandex.go.taxi.summary.models.ForceTariffSwitchForIntercityOrdersExperiment;
import com.yandex.go.taxi.summary.models.b;
import com.yandex.go.taxi.summary.models.c;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.d;
import ru.yandex.taxi.common_models.net.l;
import ru.yandex.taxi.common_models.net.n;

/* loaded from: classes.dex */
public final /* synthetic */ class ogr implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ ogr(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                h hVar = ForceAccountUpgradeExperiment.Companion;
                auu0 auu0Var = auu0.a;
                break;
            case 14:
                h hVar2 = ForceAccountUpgradeExperiment.Companion;
                break;
            case 15:
                break;
            case 16:
                a aVar = ForcePhonishUpgradeExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                break;
            case 17:
                b bVar = ForceTariffSwitchForIntercityOrdersExperiment.Companion;
                break;
            case 18:
                b bVar2 = ForceTariffSwitchForIntercityOrdersExperiment.Companion;
                break;
            case 19:
                c cVar = ForceTariffSwitchForIntercityOrdersExperiment.TariffRule.Companion;
                break;
            case 20:
                c cVar2 = ForceTariffSwitchForIntercityOrdersExperiment.TariffRule.Companion;
                break;
            case 21:
                com.yandex.go.payments.shared.details.experiments.a aVar2 = ForceZaloginForFamilyExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                break;
            case 22:
                com.yandex.go.payments.paymentlist.experiments.b bVar3 = ForcedPaymentMethodChangeExperiment.Companion;
                break;
            case 23:
                com.yandex.go.payments.paymentlist.experiments.b bVar4 = ForcedPaymentMethodChangeExperiment.Companion;
                break;
            case 24:
                ru.yandex.taxi.common_models.net.b bVar5 = FormattedText.Companion;
                break;
            case 25:
                d dVar = FormattedText.a.Companion;
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                l lVar = FormattedText.d.Companion;
                break;
            default:
                n nVar = FormattedText.e.Companion;
                break;
        }
        return FormattedText.VerticalAlignment.Companion.serializer();
    }
}
