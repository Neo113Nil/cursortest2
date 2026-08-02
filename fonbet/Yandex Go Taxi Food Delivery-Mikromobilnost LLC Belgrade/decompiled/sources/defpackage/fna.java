package defpackage;

import com.yandex.go.chargers.data.model.ChargersActionAttributeDto$$serializer;
import com.yandex.go.chargers.data.model.ChargersAttributeDto$$serializer;
import com.yandex.go.chargers.data.model.ChargersOfferButtonDto$$serializer;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersSelectedDiscountDto;
import com.yandex.go.chargers.discounts.api.data.model.c;
import com.yandex.go.chargers.discounts.data.models.ChargersProgressDiscountDetailsDto;
import com.yandex.go.chargers.discounts.data.models.ChargersProgressDiscountDetailsDto$ProgressDiscountPerkDto$$serializer;
import com.yandex.go.chargers.discounts.data.models.g0;
import com.yandex.go.chargers.discounts.data.models.k0;
import com.yandex.go.chargers.discounts.data.models.m0;
import com.yandex.go.chargers.discounts.data.models.n0;
import com.yandex.go.chargers.discounts.data.models.p0;
import com.yandex.go.chargers.offer.data.api.ChargersPromoPlateDto;
import com.yandex.go.chargers.offer.data.api.u;
import com.yandex.go.chargers.order.completion.pre_finish.data.model.ChargersPreFinishResponse;
import com.yandex.go.chargers.order.completion.pre_finish.data.model.f;
import com.yandex.go.chargers.payments.api.data.ChargersPaymentMethod$$serializer;
import com.yandex.go.chargers.station.data.model.ChargersStationDetailsRequestParam;
import com.yandex.go.chargers.station.data.model.ChargersStationDetailsResponse;
import com.yandex.go.chargers.station.data.model.ChargersStationDetailsResponse$AboutLocation$DetailsBrick$$serializer;
import com.yandex.go.chargers.station.data.model.ChargersStationDetailsResponse$AboutLocation$PhotoGallery$Linear;
import com.yandex.go.chargers.station.data.model.ChargersStationDetailsResponse$PopupV2$$serializer;
import com.yandex.go.chargers.station.data.model.ChargersStationDetailsResponse$UsageInstruction$InstructionItem$$serializer;
import com.yandex.go.chargers.station.data.model.ChargersStationShortInfoDto;
import com.yandex.go.chargers.station.data.model.a;
import com.yandex.go.chargers.station.data.model.b;
import com.yandex.go.chargers.station.data.model.e;
import com.yandex.go.chargers.station.data.model.i;
import com.yandex.go.chargers.station.data.model.p;
import com.yandex.go.chargers.station.data.model.r;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionListFiltersDto;
import com.yandex.go.chargers.subscription.data.model.g;
import com.yandex.go.chargers.subscription.data.model.j;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersStationButtonDto$$serializer;
import java.lang.annotation.Annotation;

/* loaded from: classes12.dex */
public final /* synthetic */ class fna implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ fna(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                f fVar = ChargersPreFinishResponse.Companion;
                return new p53(ChargersOfferButtonDto$$serializer.INSTANCE, 0);
            case 1:
                g0 g0Var = ChargersProgressDiscountDetailsDto.Companion;
                return new p53(ChargersProgressDiscountDetailsDto$ProgressDiscountPerkDto$$serializer.INSTANCE, 0);
            case 2:
                return new o4o("com.yandex.go.chargers.discounts.data.models.ChargersPromoDetailsDto.PromoDetailsButtonDto.PromoDetailsButtonAction.Close", k0.INSTANCE, new Annotation[0]);
            case 3:
                return new o4o("com.yandex.go.chargers.discounts.data.models.ChargersPromoDetailsDto.PromoDetailsButtonDto.PromoDetailsButtonAction.PaymentMethodsAction", m0.INSTANCE, new Annotation[0]);
            case 4:
                return new o4o("com.yandex.go.chargers.discounts.data.models.ChargersPromoDetailsDto.PromoDetailsButtonDto.PromoDetailsButtonAction.SelectDiscountAction", n0.INSTANCE, new Annotation[0]);
            case 5:
                return new o4o("com.yandex.go.chargers.discounts.data.models.ChargersPromoDetailsDto.PromoDetailsButtonDto.PromoDetailsButtonAction.Unknown", p0.INSTANCE, new Annotation[0]);
            case 6:
                u uVar = ChargersPromoPlateDto.Companion;
                return new p53(ChargersAttributeDto$$serializer.INSTANCE, 0);
            case 7:
                return new o4o("com.yandex.go.chargers.offer.data.api.ChargersPromoPlateDto.ChargersOfferPromoPlateActionDto.DvizhSubscription", sna.INSTANCE, new Annotation[0]);
            case 8:
                return new o4o("com.yandex.go.chargers.offer.data.api.ChargersPromoPlateDto.ChargersOfferPromoPlateActionDto.PaymentMethods", tna.INSTANCE, new Annotation[0]);
            case 9:
                return new o4o("com.yandex.go.chargers.offer.data.api.ChargersPromoPlateDto.ChargersOfferPromoPlateActionDto.SuperPasses", vna.INSTANCE, new Annotation[0]);
            case 10:
                return new o4o("com.yandex.go.chargers.offer.data.api.ChargersPromoPlateDto.ChargersOfferPromoPlateActionDto.Unknown", wna.INSTANCE, new Annotation[0]);
            case 11:
                c cVar = ChargersSelectedDiscountDto.Companion;
                return ChargersDiscountTypeDto.Companion.serializer();
            case 12:
                return new o4o("com.yandex.go.chargers.station.data.model.ChargersStationActionDto.OpenTariffsActionDto", mqa.INSTANCE, new Annotation[0]);
            case 13:
                return new o4o("com.yandex.go.chargers.station.data.model.ChargersStationActionDto.PartnerSubscriptionActionDto", nqa.INSTANCE, new Annotation[0]);
            case 14:
                return new o4o("com.yandex.go.chargers.station.data.model.ChargersStationActionDto.Unknown", pqa.INSTANCE, new Annotation[0]);
            case 15:
                return new o4o("com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersStationButtonDto.ReturnChargerAction", rqa.INSTANCE, new Annotation[0]);
            case 16:
                return new o4o("com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersStationButtonDto.SelectToReturnChargerAction", sqa.INSTANCE, new Annotation[0]);
            case 17:
                return new o4o("com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersStationButtonDto.TakeChargerAction", wqa.INSTANCE, new Annotation[0]);
            case 18:
                return new o4o("com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersStationButtonDto.Unknown", xqa.INSTANCE, new Annotation[0]);
            case 19:
                a aVar = ChargersStationDetailsRequestParam.Companion;
                return new p53(ChargersPaymentMethod$$serializer.INSTANCE, 0);
            case 20:
                i iVar = ChargersStationDetailsResponse.Companion;
                return new p53(ChargersStationButtonDto$$serializer.INSTANCE, 0);
            case 21:
                i iVar2 = ChargersStationDetailsResponse.Companion;
                return new p53(ChargersStationDetailsResponse$PopupV2$$serializer.INSTANCE, 0);
            case 22:
                i iVar3 = ChargersStationDetailsResponse.Companion;
                return new p53(ChargersActionAttributeDto$$serializer.INSTANCE, 0);
            case 23:
                b bVar = ChargersStationDetailsResponse.AboutLocation.Companion;
                return new p53(w7s.a, 0);
            case 24:
                b bVar2 = ChargersStationDetailsResponse.AboutLocation.Companion;
                return new p53(ChargersStationDetailsResponse$AboutLocation$DetailsBrick$$serializer.INSTANCE, 0);
            case 25:
                e eVar = ChargersStationDetailsResponse$AboutLocation$PhotoGallery$Linear.Companion;
                return new p53(auu0.a, 0);
            case 26:
                p pVar = ChargersStationDetailsResponse.UsageInstruction.Companion;
                return new p53(ChargersStationDetailsResponse$UsageInstruction$InstructionItem$$serializer.INSTANCE, 0);
            case 27:
                r rVar = ChargersStationShortInfoDto.Companion;
                return new p53(ChargersAttributeDto$$serializer.INSTANCE, 0);
            case 28:
                return new o4o("com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionActionDto.Unknown", g.INSTANCE, new Annotation[0]);
            default:
                j jVar = ChargersSubscriptionListFiltersDto.Companion;
                return new p53(auu0.a, 0);
        }
    }
}
