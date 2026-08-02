package defpackage;

import com.squareup.wire.internal.MathMethodsKt;
import com.yandex.go.account.phonish_upgrade.ForcePhonishUpgradeExperiment;
import com.yandex.go.account.upgrade.ForceAccountUpgradeExperiment;
import com.yandex.go.address.models.FavoriteAddress$$serializer;
import com.yandex.go.explorer.impl.experiments.ExplorerExperiment;
import com.yandex.go.explorer.impl.experiments.ExplorerExperiment$ZoomToResolution$$serializer;
import com.yandex.go.flex.main_screen.shared_data.ExpectedDestination$$serializer;
import com.yandex.go.flex.main_screen.shared_data.ExpectedDestinations;
import com.yandex.go.information.experiemnts.SuperAppConfigInformationExperiment;
import com.yandex.go.payments.paymentlist.experiments.ExtraTipsPaymentMethodsExperiment;
import com.yandex.go.payments.shared.family.experiments.FamilyGroupV2Experiment;
import com.yandex.go.permission.location_with_agreement.experiment.ExplainingLocationPermissionScreenWithAgreementExperiment;
import com.yandex.go.permission.location_with_agreement.experiment.ExplainingLocationPermissionScreenWithAgreementV2Experiment;
import com.yandex.go.permission.location_with_agreement.experiment.a;
import com.yandex.go.permission.location_with_agreement.experiment.e;
import com.yandex.go.settings.email.EmailRequireExperiment;
import com.yandex.go.settings.email.b;
import com.yandex.go.tariffcard.experiment.EtaMulticlassHighlightingExperiment;
import java.util.List;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final /* synthetic */ class fsn implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ fsn(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        List W;
        switch (this.a) {
            case 0:
                b bVar = EmailRequireExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 1:
                p3o p3oVar = q3o.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 2:
                com.yandex.go.tariffcard.experiment.b bVar2 = EtaMulticlassHighlightingExperiment.Companion;
                return new p53(auu0.a, 0);
            case 3:
                vco vcoVar = wco.Companion;
                return new p53(uk1.a, 0);
            case 4:
                return kotlin.collections.b.f();
            case 5:
                i3y i3yVar = teo.d;
                return Long.valueOf(MathMethodsKt.NANOS_PER_SECOND);
            case 6:
                uoo uooVar = too.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 7:
                uoo uooVar2 = too.Companion;
                return new k8u(auu0.a, roo.a, 1);
            case 8:
                com.yandex.go.flex.main_screen.shared_data.b bVar3 = ExpectedDestinations.Companion;
                return new p53(ExpectedDestination$$serializer.INSTANCE, 0);
            case 9:
                return new fro();
            case 10:
                return null;
            case 11:
                a aVar = ExplainingLocationPermissionScreenWithAgreementExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 12:
                e eVar = ExplainingLocationPermissionScreenWithAgreementV2Experiment.Companion;
                auu0 auu0Var5 = auu0.a;
                return new k8u(auu0Var5, auu0Var5, 1);
            case 13:
                com.yandex.go.explorer.impl.experiments.b bVar4 = ExplorerExperiment.Companion;
                auu0 auu0Var6 = auu0.a;
                return new k8u(auu0Var6, auu0Var6, 1);
            case 14:
                com.yandex.go.explorer.impl.experiments.b bVar5 = ExplorerExperiment.Companion;
                return new p53(ExplorerExperiment$ZoomToResolution$$serializer.INSTANCE, 0);
            case 15:
                W = evu0.W("2hviEdaW48jQDJG5h37WrVSyk4ob0PyGdi8WWyBzYvalUwg28izbFo/ZA6RPWa4p!!2hm1S9PD5MnRCMbthynarC3AbuFFogHBfd4epZ2m2repcon/CzmPiFR6hs7Ecxai", new String[]{"!!"}, (r2 & 4) != 0 ? 0 : 2);
                return (String[]) W.toArray(new String[0]);
            case 16:
                q1p q1pVar = t1p.Companion;
                return new k8u(auu0.a, r1p.a, 1);
            case 17:
                com.yandex.go.payments.paymentlist.experiments.a aVar2 = ExtraTipsPaymentMethodsExperiment.Companion;
                return jsq0.Companion.serializer(PaymentMethod$Type.Companion.serializer());
            case 18:
                a9p a9pVar = b9p.Companion;
                auu0 auu0Var7 = auu0.a;
                return new k8u(auu0Var7, auu0Var7, 1);
            case 19:
                com.yandex.go.payments.shared.family.experiments.a aVar3 = FamilyGroupV2Experiment.Companion;
                auu0 auu0Var8 = auu0.a;
                return new k8u(auu0Var8, auu0Var8, 1);
            case 20:
                qdp qdpVar = tdp.Companion;
                auu0 auu0Var9 = auu0.a;
                return new k8u(auu0Var9, auu0Var9, 1);
            case 21:
                dfp dfpVar = efp.Companion;
                return new p53(FavoriteAddress$$serializer.INSTANCE, 0);
            case 22:
                zfp zfpVar = agp.Companion;
                auu0 auu0Var10 = auu0.a;
                return new k8u(auu0Var10, auu0Var10, 1);
            case 23:
                whp whpVar = xhp.Companion;
                auu0 auu0Var11 = auu0.a;
                return new k8u(auu0Var11, auu0Var11, 1);
            case 24:
                return null;
            case 25:
                return SuperAppConfigInformationExperiment.Companion.serializer();
            case 26:
                return xan.Companion.serializer();
            case 27:
                return so90.Companion.serializer();
            case 28:
                return ForcePhonishUpgradeExperiment.Companion.serializer();
            default:
                return ForceAccountUpgradeExperiment.Companion.serializer();
        }
    }

    public /* synthetic */ fsn(int i, Object obj) {
        this.a = i;
    }
}
