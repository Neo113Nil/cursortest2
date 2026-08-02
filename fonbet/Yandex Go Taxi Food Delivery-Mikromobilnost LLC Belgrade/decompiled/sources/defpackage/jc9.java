package defpackage;

import com.yandex.go.chargers.data.model.f;
import com.yandex.go.chargers.data.model.h;
import com.yandex.go.chargers.data.model.i;
import com.yandex.go.chargers.order.data.model.e;
import com.yandex.go.chargers.order.data.model.g;
import com.yandex.go.chargers.order.data.model.k;
import com.yandex.go.morphlex.action.change_requirement.ChangeRequirementAction;
import com.yandex.go.morphlex.data.descriptors.actions.change_status_bar.ChangeStatusBarThemeAction;
import com.yandex.go.order.tariffs_suggest.api.ChangeTariffsApi;
import com.yandex.go.taxi.order.change.requirements.api.ChangeRequirementsResponse;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Failure;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Success;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Unavailable;
import com.yandex.go.taxi.order.models.api.a;
import com.yandex.go.taxi.order.models.api.b;
import com.yandex.go.taxi.order.models.api.c;
import com.yandex.go.taxi.order.models.api.d;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes12.dex */
public final /* synthetic */ class jc9 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ jc9(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = 0;
        switch (this.a) {
            case 0:
                a aVar = ChangeOrderState$Failure.Companion;
                return ChangeOrderState$Source.Companion.serializer();
            case 1:
                b bVar = ChangeOrderState$Pending.Companion;
                return ChangeOrderState$Source.Companion.serializer();
            case 2:
                return vez0.g("com.yandex.go.taxi.order.models.api.ChangeOrderState.Source", ChangeOrderState$Source.values(), new String[]{"source_point", "route_point", "destination_point", "payment", "driver", "user_ready", "save_ride", "cancel", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "due", "additional_payment", "requirement"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null});
            case 3:
                c cVar = ChangeOrderState$Success.Companion;
                return ChangeOrderState$Source.Companion.serializer();
            case 4:
                d dVar = ChangeOrderState$Unavailable.Companion;
                return ChangeOrderState$Source.Companion.serializer();
            case 5:
                return new bd9(i);
            case 6:
                return PaymentMethod$Type.Companion.serializer();
            case 7:
                return "Got error while trying to change payment method";
            case 8:
                return new oe9(null, null, null);
            case 9:
                com.yandex.go.morphlex.action.change_requirement.a aVar2 = ChangeRequirementAction.Companion;
                return ChangeRequirementAction.Operation.Companion.serializer();
            case 10:
                com.yandex.go.morphlex.action.change_requirement.a aVar3 = ChangeRequirementAction.Companion;
                return ChangeRequirementAction.ValueType.Companion.serializer();
            case 11:
                return vez0.g("com.yandex.go.morphlex.action.change_requirement.ChangeRequirementAction.Operation", ChangeRequirementAction.Operation.values(), new String[]{"set", "remove"}, new Annotation[][]{null, null});
            case 12:
                return vez0.g("com.yandex.go.morphlex.action.change_requirement.ChangeRequirementAction.ValueType", ChangeRequirementAction.ValueType.values(), new String[]{"boolean", "integer", "string"}, new Annotation[][]{null, null, null});
            case 13:
                com.yandex.go.taxi.order.change.requirements.api.c cVar2 = ChangeRequirementsResponse.Companion;
                return ChangeRequirementsResponse.ChangeStatus.Companion.serializer();
            case 14:
                return vez0.g("com.yandex.go.taxi.order.change.requirements.api.ChangeRequirementsResponse.ChangeStatus", ChangeRequirementsResponse.ChangeStatus.values(), new String[]{"pending", "failed", "unavailable"}, new Annotation[][]{null, null, null});
            case 15:
                com.yandex.go.morphlex.data.descriptors.actions.change_status_bar.a aVar4 = ChangeStatusBarThemeAction.Companion;
                return vez0.g("com.yandex.go.morphlex.data.descriptors.actions.change_status_bar.ChangeStatusBarThemeAction.StatusBarThemeDto", ChangeStatusBarThemeAction.StatusBarThemeDto.values(), new String[]{"dark", "light"}, new Annotation[][]{null, null});
            case 16:
                com.yandex.go.order.tariffs_suggest.api.a aVar5 = ChangeTariffsApi.ChangeTariffDto.Companion;
                return ChangeTariffsApi.ChangeTariffDto.StatusDto.Companion.serializer();
            case 17:
                return vez0.g("com.yandex.go.order.tariffs_suggest.api.ChangeTariffsApi.ChangeTariffDto.StatusDto", ChangeTariffsApi.ChangeTariffDto.StatusDto.values(), new String[]{"pending", "failed", "unavailable", "success"}, new Annotation[][]{null, null, null, null});
            case 18:
                com.yandex.go.order.tariffs_suggest.api.d dVar2 = ChangeTariffsApi.ChangeTariffRequest.Companion;
                return new p53(auu0.a, 0);
            case 19:
                yg9 yg9Var = ah9.Companion;
                return new p53(auu0.a, 0);
            case 20:
                return new o4o("com.yandex.go.chargers.data.model.ChargersActionAttributeDto.Action.ShowPopup", f.INSTANCE, new Annotation[0]);
            case 21:
                return new o4o("com.yandex.go.chargers.data.model.ChargersActionAttributeDto.Action.ShowSurgeModal", h.INSTANCE, new Annotation[0]);
            case 22:
                return new o4o("com.yandex.go.chargers.data.model.ChargersActionAttributeDto.Action.Unsupported", i.INSTANCE, new Annotation[0]);
            case 23:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersActiveOrderActionDto.ActiveSuperPass", com.yandex.go.chargers.order.data.model.b.INSTANCE, new Annotation[0]);
            case 24:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersActiveOrderActionDto.ChargersSubscription", com.yandex.go.chargers.order.data.model.c.INSTANCE, new Annotation[0]);
            case 25:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersActiveOrderActionDto.Details", e.INSTANCE, new Annotation[0]);
            case 26:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersActiveOrderActionDto.DvizhSubscription", com.yandex.go.chargers.order.data.model.f.INSTANCE, new Annotation[0]);
            case 27:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersActiveOrderActionDto.FinishOrder", g.INSTANCE, new Annotation[0]);
            case 28:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersActiveOrderActionDto.PartnerSubscription", com.yandex.go.chargers.order.data.model.h.INSTANCE, new Annotation[0]);
            default:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersActiveOrderActionDto.SuperPass", k.INSTANCE, new Annotation[0]);
        }
    }
}
