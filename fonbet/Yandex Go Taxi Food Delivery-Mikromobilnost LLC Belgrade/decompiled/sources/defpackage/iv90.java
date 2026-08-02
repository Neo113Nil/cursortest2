package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionChangeDateTimeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDialogDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionEditOrderDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionGuardPolicyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenFormDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenLinkToRouteDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ChangeDateTimeOptionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ExtendDeliveryExpirationDateDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ActionShowContentSectionsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.CopyPayloadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.PayloadActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.PayloadDto;

/* loaded from: classes5.dex */
public final class iv90 {
    public final ow a;

    public iv90(ow owVar) {
        this.a = owVar;
    }

    public final gv90 a(PayloadDto payloadDto) {
        nr xnVar;
        if (payloadDto instanceof PayloadDto.Payload_CopyPayloadDto) {
            CopyPayloadDto copyPayloadDto = ((PayloadDto.Payload_CopyPayloadDto) payloadDto).b;
            return new pu90(copyPayloadDto.getBuffer(), copyPayloadDto.getInAppNotificationText());
        }
        nr nrVar = null;
        if (!(payloadDto instanceof PayloadDto.Payload_ActionPayloadDto)) {
            if (payloadDto instanceof PayloadDto.Unknown_PayloadDto) {
                return ev90.a;
            }
            w511.b();
            return null;
        }
        PayloadActionDto action = ((PayloadDto.Payload_ActionPayloadDto) payloadDto).b.getAction();
        ow owVar = this.a;
        owVar.getClass();
        if (action instanceof PayloadActionDto.PayloadAction_ChangeDateTimeDto) {
            ActionChangeDateTimeDto actionChangeDateTimeDto = ((PayloadActionDto.PayloadAction_ChangeDateTimeDto) action).b;
            String title = actionChangeDateTimeDto.getTitle();
            String badgeText = actionChangeDateTimeDto.getBadgeText();
            pa9 f = ow.f(actionChangeDateTimeDto.getScreen());
            List<ChangeDateTimeOptionDto> options = actionChangeDateTimeDto.getOptions();
            ArrayList arrayList = new ArrayList(tcc.n(options, 10));
            Iterator<T> it = options.iterator();
            while (it.hasNext()) {
                arrayList.add(ow.e((ChangeDateTimeOptionDto) it.next()));
            }
            nrVar = new nn(title, badgeText, f, arrayList);
        } else if (action instanceof PayloadActionDto.PayloadAction_DialogDto) {
            ActionDialogDto actionDialogDto = ((PayloadActionDto.PayloadAction_DialogDto) action).b;
            nrVar = new pn(actionDialogDto.getTitle(), actionDialogDto.getBadgeText(), actionDialogDto.getImageTag(), ((kej) owVar.d.get()).a(actionDialogDto.getDialog()));
        } else if (action instanceof PayloadActionDto.PayloadAction_DeeplinkDto) {
            nrVar = new on(((PayloadActionDto.PayloadAction_DeeplinkDto) action).b.getDeeplink());
        } else if (action instanceof PayloadActionDto.PayloadAction_ShowContentSectionsDto) {
            r6i r6iVar = (r6i) owVar.c.get();
            ActionShowContentSectionsDto actionShowContentSectionsDto = ((PayloadActionDto.PayloadAction_ShowContentSectionsDto) action).b;
            p6i a = r6iVar.a(actionShowContentSectionsDto.getContentSections());
            Boolean maximizeScreenBrightness = actionShowContentSectionsDto.getMaximizeScreenBrightness();
            nrVar = new fo(a, maximizeScreenBrightness != null ? maximizeScreenBrightness.booleanValue() : false);
        } else if (action instanceof PayloadActionDto.PayloadAction_EditOrderDto) {
            ActionEditOrderDto actionEditOrderDto = ((PayloadActionDto.PayloadAction_EditOrderDto) action).b;
            nrVar = new rn(actionEditOrderDto.getTitle(), actionEditOrderDto.getBadgeText(), actionEditOrderDto.getImageTag());
        } else {
            if (action instanceof PayloadActionDto.PayloadAction_OpenFormDto) {
                ActionOpenFormDto actionOpenFormDto = ((PayloadActionDto.PayloadAction_OpenFormDto) action).b;
                String mode = actionOpenFormDto.getMode();
                String scenario = actionOpenFormDto.getScenario();
                zi8 d = ow.d(actionOpenFormDto.getCardMode());
                Object clientState = actionOpenFormDto.getClientState();
                Map map = clientState instanceof Map ? (Map) clientState : null;
                String asyncTaskId = actionOpenFormDto.getAsyncTaskId();
                boolean isCacheState = actionOpenFormDto.isCacheState();
                String title2 = actionOpenFormDto.getTitle();
                String badgeText2 = actionOpenFormDto.getBadgeText();
                ActionGuardPolicyDto actionGuardPolicy = actionOpenFormDto.getActionGuardPolicy();
                xnVar = new vn(mode, scenario, d, map, asyncTaskId, isCacheState, title2, badgeText2, actionGuardPolicy != null ? ow.b(actionGuardPolicy) : null, actionOpenFormDto.getImageTag(), actionOpenFormDto.getMetricaLabel());
            } else if (action instanceof PayloadActionDto.PayloadAction_ExtendDeliveryExpirationDateDto) {
                ExtendDeliveryExpirationDateDto extendDeliveryExpirationDateDto = ((PayloadActionDto.PayloadAction_ExtendDeliveryExpirationDateDto) action).b;
                nrVar = new sn(extendDeliveryExpirationDateDto.getTitle(), extendDeliveryExpirationDateDto.getBadgeText());
            } else if (action instanceof PayloadActionDto.PayloadAction_OpenUniversalLinkDto) {
                ActionOpenLinkToRouteDto actionOpenLinkToRouteDto = ((PayloadActionDto.PayloadAction_OpenUniversalLinkDto) action).b;
                xnVar = new xn(actionOpenLinkToRouteDto.getTitle(), ow.g(actionOpenLinkToRouteDto.getDialog()), actionOpenLinkToRouteDto.getUrl(), actionOpenLinkToRouteDto.getImageTag(), actionOpenLinkToRouteDto.getShouldAuthorize(), actionOpenLinkToRouteDto.getMetricaLabel());
            } else if (action instanceof PayloadActionDto.Unknown_PayloadActionDto) {
                nrVar = cr.a;
            } else {
                w511.b();
            }
            nrVar = xnVar;
        }
        return new mu90(nrVar, true);
    }
}
