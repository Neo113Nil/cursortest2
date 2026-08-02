package defpackage;

import com.yandex.go.messenger_native.experiment.NativeMessengerOverloadedFlagsExperiment;
import com.yandex.go.messenger_native.experiment.NativeMessengerOverloadedFlagsExperiment$OverloadedFlag$$serializer;
import com.yandex.go.multimodal_route.experiement.MultimodalRoutesExperiment;
import com.yandex.go.multimodal_route.experiement.a;
import com.yandex.go.multimodal_route.network.models.MultimodalRoutesOrderDto;
import com.yandex.go.navigator.driving.experiment.NavigatorControlsExperiment;
import com.yandex.go.navigator.favorites.experiment.NavigatorFavoritesConfigDto;
import com.yandex.go.navigator.favorites.experiment.NavigatorFavoritesConfigDto$PlacemarkVariantDto$$serializer;
import com.yandex.go.navigator.models.ControlButtonDto$$serializer;
import com.yandex.go.tariffcard.experiment.MulticlassTariffsHeaderRedesignExperiment;
import com.yandex.go.tariffcard.experiment.MulticlassTariffsUnavailableTextsExperiment;
import com.yandex.go.tariffcard.experiment.i;
import com.yandex.go.tariffcard.experiment.j;
import com.yandex.go.tariffcard.experiment.k;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse;
import ru.yandex.taxi.masstransit.promo.models.a0;
import ru.yandex.taxi.masstransit.promo.models.p;
import ru.yandex.taxi.masstransit.promo.models.z;
import ru.yandex.taxi.messenger.domain.MessengerChatOwner;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

/* loaded from: classes9.dex */
public final /* synthetic */ class d540 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ d540(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                z zVar = MtSummaryCommunicationsResponse.c.Companion;
                return new p53(p.a, 0);
            case 1:
                z zVar2 = MtSummaryCommunicationsResponse.c.Companion;
                return new p53(a0.a, 0);
            case 2:
                ep40 ep40Var = hp40.Companion;
                return new p53(auu0.a, 0);
            case 3:
                return new p53(auu0.a, 1);
            case 4:
                return RequirementsParam.Companion.serializer();
            case 5:
                return new p53(ef31.a, 0);
            case 6:
                kp40 kp40Var = np40.Companion;
                return new p53(auu0.a, 1);
            case 7:
                i iVar = MulticlassTariffsHeaderRedesignExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, new p53(auu0Var, 0), 1);
            case 8:
                j jVar = MulticlassTariffsHeaderRedesignExperiment.Configuration.Companion;
                return new p53(auu0.a, 0);
            case 9:
                j jVar2 = MulticlassTariffsHeaderRedesignExperiment.Configuration.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, new k8u(auu0Var2, new p53(auu0Var2, 0), 1), 1);
            case 10:
                k kVar = MulticlassTariffsUnavailableTextsExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 11:
                k kVar2 = MulticlassTariffsUnavailableTextsExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 12:
                a aVar = MultimodalRoutesExperiment.Companion;
                auu0 auu0Var5 = auu0.a;
                return new k8u(auu0Var5, auu0Var5, 1);
            case 13:
                a aVar2 = MultimodalRoutesExperiment.Companion;
                return new p53(auu0.a, 0);
            case 14:
                a aVar3 = MultimodalRoutesExperiment.Companion;
                auu0 auu0Var6 = auu0.a;
                return new k8u(auu0Var6, auu0Var6, 1);
            case 15:
                return new p53(MultimodalRoutesOrderDto.Companion.serializer(), 1);
            case 16:
                z150 z150Var = a250.Companion;
                return MessengerChatOwner.Companion.serializer();
            case 17:
                com.yandex.go.messenger_native.experiment.a aVar4 = NativeMessengerOverloadedFlagsExperiment.Companion;
                return new p53(NativeMessengerOverloadedFlagsExperiment$OverloadedFlag$$serializer.INSTANCE, 0);
            case 18:
                return t9s.Companion.serializer();
            case 19:
                return w8s0.Companion.serializer();
            case 20:
                return iyj.Companion.serializer();
            case 21:
                return y7s0.Companion.serializer();
            case 22:
                return eiu.Companion.serializer();
            case 23:
                return hj4.Companion.serializer();
            case 24:
                return w090.Companion.serializer();
            case 25:
                return new o4o("NavigatorAction", com.yandex.go.flex.common.api.actions.z.INSTANCE, new Annotation[]{new tfr()});
            case 26:
                com.yandex.go.navigator.driving.experiment.a aVar5 = NavigatorControlsExperiment.Companion;
                return new p53(ControlButtonDto$$serializer.INSTANCE, 0);
            case 27:
                com.yandex.go.navigator.driving.experiment.a aVar6 = NavigatorControlsExperiment.Companion;
                return new p53(ControlButtonDto$$serializer.INSTANCE, 0);
            case 28:
                com.yandex.go.navigator.driving.experiment.a aVar7 = NavigatorControlsExperiment.Companion;
                auu0 auu0Var7 = auu0.a;
                return new k8u(auu0Var7, auu0Var7, 1);
            default:
                com.yandex.go.navigator.favorites.experiment.a aVar8 = NavigatorFavoritesConfigDto.Companion;
                return new p53(NavigatorFavoritesConfigDto$PlacemarkVariantDto$$serializer.INSTANCE, 0);
        }
    }
}
