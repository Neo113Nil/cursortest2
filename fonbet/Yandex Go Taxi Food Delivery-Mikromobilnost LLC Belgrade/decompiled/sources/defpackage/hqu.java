package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubFilterDto$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubFooterDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemAnalytics$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemDto$DefaultOfferItem;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubOnboardingDto$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.n;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.s;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.FooterTicketDto$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubAvailableParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubButtonContainerDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubContextParamV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFilterDtoV2$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFooterDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$DetailedMultimodalRoute;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$MasstransitTickets;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$SelectOffer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemAnalyticsV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemAnalyticsV2$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$AlternativeOfferItemDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$AlternativeOfferItemDto$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$DefaultOfferItemDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubLeadingItemKind;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PinStateDto$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PresentationTypeDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.ServiceLevelMetadataParam$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.a0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.b0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.j0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.q;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.q0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.r;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.t0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.u0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.v;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.w0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.x;
import com.yandex.messaging.core.net.entities.BackendConfig;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.surge.models.dto.u;

/* loaded from: classes14.dex */
public final /* synthetic */ class hqu implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ hqu(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        switch (this.a) {
            case 0:
                return "No route";
            case 1:
                fru fruVar = u.Companion;
                return new p53(qzr0.a, 0);
            case 2:
                return new p53(auu0.a, 0);
            case 3:
                zy11Var = zy11.a;
                return zy11Var;
            case 4:
                return vez0.g("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubAvailableParam", HubAvailableParam.values(), new String[]{BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.DISABLED, "enabled_if_only_tolls"}, new Annotation[][]{null, null, null});
            case 5:
                q qVar = HubButtonContainerDto.Companion;
                return HubLeadingItemKind.Companion.serializer();
            case 6:
                r rVar = HubContextParamV2.Companion;
                return new p53(ServiceLevelMetadataParam$$serializer.INSTANCE, 0);
            case 7:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubFilterAction.SelectOneAction", sxu.INSTANCE, new Annotation[0]);
            case 8:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubFilterAction.Unsupported", txu.INSTANCE, new Annotation[0]);
            case 9:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFilterActionV2.SelectOneAction", com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.u.INSTANCE, new Annotation[0]);
            case 10:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFilterActionV2.ShowDueSelectorAction", v.INSTANCE, new Annotation[0]);
            case 11:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFilterActionV2.Unsupported", x.INSTANCE, new Annotation[0]);
            case 12:
                n nVar = HubFooterDto.Companion;
                return new p53(HubOnboardingDto$$serializer.INSTANCE, 0);
            case 13:
                n nVar2 = HubFooterDto.Companion;
                return new p53(HubFilterDto$$serializer.INSTANCE, 0);
            case 14:
                a0 a0Var = HubFooterDtoV2.Companion;
                return new p53(HubOnboardingDto$$serializer.INSTANCE, 0);
            case 15:
                a0 a0Var2 = HubFooterDtoV2.Companion;
                return new p53(HubFilterDtoV2$$serializer.INSTANCE, 0);
            case 16:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemAction.Unsupported", s.INSTANCE, new Annotation[0]);
            case 17:
                b0 b0Var = HubItemActionV2$DetailedMultimodalRoute.Companion;
                return new p53(d7l0.e, 0);
            case 18:
                f0 f0Var = HubItemActionV2$MasstransitTickets.Companion;
                return new p53(FooterTicketDto$$serializer.INSTANCE, 0);
            case 19:
                j0 j0Var = HubItemActionV2$SelectOffer.Companion;
                return HubOfferType.Companion.serializer();
            case 20:
                j0 j0Var2 = HubItemActionV2$SelectOffer.Companion;
                return new p53(PinStateDto$$serializer.INSTANCE, 0);
            case 21:
                j0 j0Var3 = HubItemActionV2$SelectOffer.Companion;
                return new p53(d7l0.e, 0);
            case 22:
                j0 j0Var4 = HubItemActionV2$SelectOffer.Companion;
                return new p53(HubItemAnalyticsV2$$serializer.INSTANCE, 0);
            case 23:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2.Unsupported", q0.INSTANCE, new Annotation[0]);
            case 24:
                t0 t0Var = HubItemAnalyticsV2.Companion;
                return PresentationTypeDto.Companion.serializer();
            case 25:
                com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.v vVar = HubItemDto$DefaultOfferItem.Companion;
                return new p53(HubItemAnalytics$$serializer.INSTANCE, 0);
            case 26:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemDto.Unsupported", com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.x.INSTANCE, new Annotation[0]);
            case 27:
                u0 u0Var = HubItemDtoV2$AlternativeOfferItemDto.Companion;
                return new p53(HubItemAnalyticsV2$$serializer.INSTANCE, 0);
            case 28:
                w0 w0Var = HubItemDtoV2$DefaultOfferItemDtoV2.Companion;
                return new p53(HubItemDtoV2$AlternativeOfferItemDto$$serializer.INSTANCE, 0);
            default:
                w0 w0Var2 = HubItemDtoV2$DefaultOfferItemDtoV2.Companion;
                return new p53(HubItemAnalyticsV2$$serializer.INSTANCE, 0);
        }
    }
}
