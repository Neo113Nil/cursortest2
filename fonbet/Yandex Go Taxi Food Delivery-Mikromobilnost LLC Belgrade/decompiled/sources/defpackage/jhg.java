package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.mapper.model.Expansion;
import com.yandex.delivery.mapper.model.SelectDestinationPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.CardModeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.DashboardActionButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.InfoModalViewDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ModalViewListItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.OpenOrderFormActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.OpenTrackingCardActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.PaymentOptionsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.RemoteIconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.SelectDestinationPolicyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ShowModalViewActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ShowPolicyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.SummaryRedirectActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.WrapContentHeightDto;

/* loaded from: classes5.dex */
public final class jhg {
    public final vdc a;
    public final m4v b;
    public final gd3 c;

    public jhg(vdc vdcVar, m4v m4vVar, gd3 gd3Var) {
        this.a = vdcVar;
        this.b = m4vVar;
        this.c = gd3Var;
    }

    public static SelectDestinationPolicy b(SelectDestinationPolicyDto selectDestinationPolicyDto) {
        int i = selectDestinationPolicyDto == null ? -1 : ihg.a[selectDestinationPolicyDto.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return SelectDestinationPolicy.REQUIRED;
            }
            if (i == 2) {
                return SelectDestinationPolicy.SKIP_IF_PRESELECTED;
            }
            if (i != 3) {
                w511.b();
                return null;
            }
        }
        return SelectDestinationPolicy.SKIP;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r5 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        if (r1 == null) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hhg a(ActionDto actionDto) {
        lr20 lr20Var;
        FormattedText formattedText;
        zi8 xi8Var;
        Expansion expansion;
        if ((actionDto instanceof ActionDto.Action_EmptyActionDto) || (actionDto instanceof ActionDto.Action_CustomActionDto)) {
            return xgg.a;
        }
        if (actionDto instanceof ActionDto.Action_CloseActionDto) {
            return ugg.a;
        }
        if (actionDto instanceof ActionDto.Action_DeeplinkActionDto) {
            return new vgg(((ActionDto.Action_DeeplinkActionDto) actionDto).b.getDeeplink());
        }
        Expansion expansion2 = null;
        if (actionDto instanceof ActionDto.Action_OpenTrackingCardDto) {
            OpenTrackingCardActionDto openTrackingCardActionDto = ((ActionDto.Action_OpenTrackingCardDto) actionDto).b;
            String deliveryId = openTrackingCardActionDto.getDeliveryId();
            OpenTrackingCardActionDto.ExpansionDto expansion3 = openTrackingCardActionDto.getExpansion();
            if (expansion3 != null) {
                int i = ihg.c[expansion3.ordinal()];
                if (i == 1) {
                    expansion2 = Expansion.EXPANDED;
                } else if (i == 2) {
                    expansion2 = Expansion.ANCHORED;
                }
            }
            expansion2 = Expansion.ANCHORED;
            return new ahg(deliveryId, expansion2);
        }
        if (actionDto instanceof ActionDto.Action_StoryActionDto) {
            return new chg(((ActionDto.Action_StoryActionDto) actionDto).b.getStoryId());
        }
        if (actionDto instanceof ActionDto.Action_SummaryRedirectActionDto) {
            SummaryRedirectActionDto summaryRedirectActionDto = ((ActionDto.Action_SummaryRedirectActionDto) actionDto).b;
            String vertical = summaryRedirectActionDto.getVertical();
            Boolean verticalTrap = summaryRedirectActionDto.getVerticalTrap();
            boolean booleanValue = verticalTrap != null ? verticalTrap.booleanValue() : false;
            SummaryRedirectActionDto.SheetExpansionDto sheetExpansion = summaryRedirectActionDto.getSheetExpansion();
            if (sheetExpansion != null) {
                int i2 = ihg.b[sheetExpansion.ordinal()];
                expansion = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Expansion.ANCHORED : Expansion.EXPANDED : Expansion.COLLAPSED;
            }
            expansion = Expansion.COLLAPSED;
            Expansion expansion4 = expansion;
            String tariff = summaryRedirectActionDto.getTariff();
            Object requirements = summaryRedirectActionDto.getRequirements();
            Map map = requirements instanceof Map ? (Map) requirements : null;
            if (map == null) {
                map = b.f();
            }
            Map map2 = map;
            SummaryRedirectActionDto.DestinationDto destination = summaryRedirectActionDto.getDestination();
            wgg wggVar = destination != null ? new wgg(new mce0(new ice0(destination.getPosition().getLatitude(), destination.getPosition().getLongitude()))) : null;
            String storyId = summaryRedirectActionDto.getStoryId();
            SelectDestinationPolicy b = b(summaryRedirectActionDto.getSelectDestinationPolicy());
            PaymentOptionsDto paymentOptions = summaryRedirectActionDto.getPaymentOptions();
            return new dhg(vertical, booleanValue, expansion4, tariff, map2, wggVar, storyId, b, paymentOptions != null ? kfa0.a(paymentOptions) : null);
        }
        if (actionDto instanceof ActionDto.Action_SwitchProfileActionDto) {
            return new ehg(((ActionDto.Action_SwitchProfileActionDto) actionDto).b.getCorpClientId());
        }
        if (actionDto instanceof ActionDto.Action_WebViewActionDto) {
            return new ghg(((ActionDto.Action_WebViewActionDto) actionDto).b.getUrl());
        }
        if (actionDto instanceof ActionDto.Action_OpenOrderFormActionDto) {
            OpenOrderFormActionDto openOrderFormActionDto = ((ActionDto.Action_OpenOrderFormActionDto) actionDto).b;
            String mode = openOrderFormActionDto.getMode();
            String storyId2 = openOrderFormActionDto.getStoryId();
            SelectDestinationPolicy b2 = b(openOrderFormActionDto.getSelectDestinationPolicy());
            Object clientState = openOrderFormActionDto.getClientState();
            Map map3 = clientState instanceof Map ? (Map) clientState : null;
            ShowPolicyDto storyShowPolicy = openOrderFormActionDto.getStoryShowPolicy();
            q8s0 q8s0Var = storyShowPolicy != null ? new q8s0(storyShowPolicy.getMaxShowCount()) : null;
            CardModeDto cardMode = openOrderFormActionDto.getCardMode();
            if (cardMode instanceof CardModeDto.CardMode_FullscreenDto) {
                xi8Var = new xi8(((CardModeDto.CardMode_FullscreenDto) cardMode).b.isSlideable());
            } else if (cardMode instanceof CardModeDto.CardMode_WrapContentHeightDto) {
                WrapContentHeightDto wrapContentHeightDto = ((CardModeDto.CardMode_WrapContentHeightDto) cardMode).b;
                xi8Var = new yi8(wrapContentHeightDto.isSlideable(), wrapContentHeightDto.getSkeletonHeight());
            } else {
                if (cardMode != null && !(cardMode instanceof CardModeDto.Unknown_CardModeDto)) {
                    w511.b();
                    return null;
                }
                xi8Var = new xi8(false);
            }
            return new ygg(mode, storyId2, b2, map3, q8s0Var, xi8Var);
        }
        if (!(actionDto instanceof ActionDto.Action_ShowModalViewActionDto)) {
            if (actionDto instanceof ActionDto.Unknown_ActionDto) {
                return fhg.a;
            }
            w511.b();
            return null;
        }
        ShowModalViewActionDto.ModalViewDto modalView = ((ActionDto.Action_ShowModalViewActionDto) actionDto).b.getModalView();
        if (modalView instanceof ShowModalViewActionDto.ModalViewDto.ModalView_InfoDto) {
            InfoModalViewDto infoModalViewDto = ((ShowModalViewActionDto.ModalViewDto.ModalView_InfoDto) modalView).b;
            RemoteIconDto icon = infoModalViewDto.getHeader().getIcon();
            m4v m4vVar = this.b;
            mvi0 b3 = m4vVar.b(icon);
            AttributedTextDto iconText = infoModalViewDto.getHeader().getIconText();
            if (iconText != null) {
                this.c.getClass();
                formattedText = gd3.b(iconText);
            } else {
                formattedText = null;
            }
            ColorDto backgroundColor = infoModalViewDto.getHeader().getBackgroundColor();
            this.a.getClass();
            qfc a = vdc.a(backgroundColor);
            ModalViewListItemDto contentItem = infoModalViewDto.getHeader().getContentItem();
            String title = contentItem.getTitle();
            String subtitle = contentItem.getSubtitle();
            RemoteIconDto leadIcon = contentItem.getLeadIcon();
            mvi0 b4 = leadIcon != null ? m4vVar.b(leadIcon) : null;
            RemoteIconDto trailIcon = contentItem.getTrailIcon();
            o130 o130Var = new o130(b3, formattedText, a, new cy20(title, subtitle, b4, trailIcon != null ? m4vVar.b(trailIcon) : null));
            List<ModalViewListItemDto> contentItems = infoModalViewDto.getContentItems();
            ArrayList arrayList = new ArrayList(tcc.n(contentItems, 10));
            for (ModalViewListItemDto modalViewListItemDto : contentItems) {
                String title2 = modalViewListItemDto.getTitle();
                String subtitle2 = modalViewListItemDto.getSubtitle();
                RemoteIconDto leadIcon2 = modalViewListItemDto.getLeadIcon();
                mvi0 b5 = leadIcon2 != null ? m4vVar.b(leadIcon2) : null;
                RemoteIconDto trailIcon2 = modalViewListItemDto.getTrailIcon();
                arrayList.add(new cy20(title2, subtitle2, b5, trailIcon2 != null ? m4vVar.b(trailIcon2) : null));
            }
            List<DashboardActionButtonDto> buttons = infoModalViewDto.getButtons();
            ArrayList arrayList2 = new ArrayList(tcc.n(buttons, 10));
            for (DashboardActionButtonDto dashboardActionButtonDto : buttons) {
                String title3 = dashboardActionButtonDto.getTitle();
                String subtitle3 = dashboardActionButtonDto.getSubtitle();
                hhg a2 = a(dashboardActionButtonDto.getAction());
                Boolean highlighted = dashboardActionButtonDto.getHighlighted();
                arrayList2.add(new bs(title3, subtitle3, a2, highlighted != null ? highlighted.booleanValue() : false, dashboardActionButtonDto.getMetricaLabel()));
            }
            lr20Var = new okg(o130Var, arrayList, arrayList2, infoModalViewDto.getMeta(), infoModalViewDto.getMetricaLabel());
        } else {
            if (!(modalView instanceof ShowModalViewActionDto.ModalViewDto.Unknown_ModalViewDto)) {
                w511.b();
                return null;
            }
            lr20Var = pkg.i;
        }
        return new bhg(lr20Var);
    }
}
