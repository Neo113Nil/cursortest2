package defpackage;

import com.yandex.go.flex.common.descriptors.section.payments.loyalty.LoyaltyProgressViewProperties;
import com.yandex.go.flex.common.descriptors.section.payments.loyalty.LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient;
import com.yandex.go.lootbox.impl.data.entities.network.activation.LootBoxActivationRequestDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.action.d;
import com.yandex.go.lootbox.impl.data.entities.network.common.content.LootBoxContentLootBoxDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.content.LootBoxContentTypeDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.content.c;
import com.yandex.go.lootbox.impl.data.entities.network.common.gift.LootBoxGiftDto$$serializer;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyProgramStateDto;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltySelectorMenuDto;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltySelectorMenuOptionDto;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltySelectorMenuOptionDto$$serializer;
import com.yandex.go.loyalty.impl.selector.data.model.h;
import com.yandex.go.safety.center.lost_item.network.LostItemsApiResponse;
import com.yandex.go.safety.center.lost_item.network.LostItemsApiResponse$Modal$Bullet$$serializer;
import com.yandex.go.safety.center.lost_item.network.e;
import com.yandex.go.safety.center.lost_item.network.g;
import com.yandex.go.safety.center.lost_item.network.j;
import com.yandex.go.safety.center.lost_item.network.k;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.LootBoxAnimationInfo$$serializer;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.LootBoxExperiment;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.b;
import com.yandex.go.taxi.order.overlay.LogMapKitRouteExperiment;
import com.yandex.go.taxi.order.overlay.a;
import com.yandex.messaging.core.net.entities.BackendConfig;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.eatskit.dto.LocationAvailabilityStatus;

/* loaded from: classes12.dex */
public final /* synthetic */ class o3z implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ o3z(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return udq0.a(new yxr[0]);
            case 1:
                return udq0.a(new yxr[0]);
            case 2:
                qwd qwdVar = w3z.a;
                return null;
            case 3:
                qwd qwdVar2 = d4z.a;
                return null;
            case 4:
                u4z u4zVar = new u4z(new oz2());
                mrg.p(u4zVar);
                ooc.f(u4zVar, ':');
                mrg.g(u4zVar);
                ooc.b(u4zVar, new tls[]{new xpy(18)}, new xpy(19));
                return new v4z(u4zVar.build());
            case 5:
                qwd qwdVar3 = e5z.a;
                return null;
            case 6:
                return n751.b;
            case 7:
                return LocationAvailabilityStatus.Companion.serializer();
            case 8:
                return vez0.g("ru.yandex.taxi.eatskit.dto.LocationAvailabilityStatus", LocationAvailabilityStatus.values(), new String[]{"available", "notAvailable"}, new Annotation[][]{null, null});
            case 9:
                a aVar = LogMapKitRouteExperiment.Companion;
                return new p53(auu0.a, 0);
            case 10:
                return "Order srcPoint cannot be null, setting to GeoPoint.EMPTY";
            case 11:
                return "Failed to handle nearest drivers update";
            case 12:
                return "Failed to handle UI update";
            case 13:
                return new o4o("com.yandex.go.lootbox.impl.data.entities.network.common.action.LootBoxActionUnknownDto", d.INSTANCE, new Annotation[0]);
            case 14:
                com.yandex.go.lootbox.impl.data.entities.network.activation.a aVar2 = LootBoxActivationRequestDto.Companion;
                return LootBoxContentTypeDto.Companion.serializer();
            case 15:
                c cVar = LootBoxContentLootBoxDto.Companion;
                return new p53(LootBoxGiftDto$$serializer.INSTANCE, 0);
            case 16:
                return vez0.g("com.yandex.go.lootbox.impl.data.entities.network.common.content.LootBoxContentTypeDto", LootBoxContentTypeDto.values(), new String[]{null, "lootbox", "direct_offer"}, new Annotation[][]{null, null, null});
            case 17:
                return new o4o("com.yandex.go.lootbox.impl.data.entities.network.common.content.LootBoxContentUnknownDto", com.yandex.go.lootbox.impl.data.entities.network.common.content.d.INSTANCE, new Annotation[0]);
            case 18:
                b bVar = LootBoxExperiment.Companion;
                return new p53(LootBoxAnimationInfo$$serializer.INSTANCE, 0);
            case 19:
                j jVar = LostItemsApiResponse.Modal.Companion;
                return new p53(LostItemsApiResponse$Modal$Bullet$$serializer.INSTANCE, 0);
            case 20:
                return new o4o("com.yandex.go.safety.center.lost_item.network.LostItemsApiResponse.Modal.Button.ActionDto.OpenRidesListButtonActionDto", e.INSTANCE, new Annotation[0]);
            case 21:
                return new o4o("com.yandex.go.safety.center.lost_item.network.LostItemsApiResponse.Modal.Button.ActionDto.Unknown", g.INSTANCE, new Annotation[0]);
            case 22:
                k kVar = LostItemsApiResponse.Modal.Header.Companion;
                return LostItemsApiResponse.Modal.Header.Type.Companion.serializer();
            case 23:
                return vez0.g("com.yandex.go.safety.center.lost_item.network.LostItemsApiResponse.Modal.Header.Type", LostItemsApiResponse.Modal.Header.Type.values(), new String[]{null, "image", "icon"}, new Annotation[][]{null, null, null});
            case 24:
                return vez0.g("com.yandex.go.loyalty.impl.selector.data.model.LoyaltyProgramStateDto", LoyaltyProgramStateDto.values(), new String[]{BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.DISABLED, "need_activation"}, new Annotation[][]{null, null, null});
            case 25:
                com.yandex.go.flex.common.descriptors.section.payments.loyalty.a aVar3 = LoyaltyProgressViewProperties.Companion;
                return yvz.Companion.serializer();
            case 26:
                com.yandex.go.flex.common.descriptors.section.payments.loyalty.c cVar2 = LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient.Companion;
                return new p53(auu0.a, 0);
            case 27:
                com.yandex.go.flex.common.descriptors.section.payments.loyalty.c cVar3 = LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient.Companion;
                return new p53(nor.a, 0);
            case 28:
                com.yandex.go.loyalty.impl.selector.data.model.g gVar = LoyaltySelectorMenuDto.Companion;
                return new p53(LoyaltySelectorMenuOptionDto$$serializer.INSTANCE, 0);
            default:
                h hVar = LoyaltySelectorMenuOptionDto.Companion;
                return LoyaltyProgramStateDto.Companion.serializer();
        }
    }
}
