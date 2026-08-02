package defpackage;

import com.yandex.delivery.mapper.model.CancelType;
import com.yandex.delivery.mapper.model.Expansion;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.CancelTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentIconItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionCancelDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionCancelFeedbackDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionCancelV2Dto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionChangeDateTimeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDeeplinkDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDialogDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionEditOrderDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionFeedbackDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionGuardPolicyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenChatDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenFormDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenLinkToRouteDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenTrackingCardDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOrderMoreDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionPerformerCallDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionShareDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionShowContentOrderHistoryDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionShowSupportWebDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionTipsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ButtonItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.CancelMessageButtonActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.CancelMessageButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.CancelMessageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.CancelMessageV2Dto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.CardModeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ChangeDateTimeOptionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ChangeDateTimeScreenDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.CommunicationMethodDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.DialogDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ExtendDeliveryExpirationDateDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.FeedbackCancelReasonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.FeedbackReasonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.FeedbackSubtitleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.FormStateKeyActionGuardPolicyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.IconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ManualEntryTipsChoiceDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.MessengerParametersDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.PayNowActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.PaymentItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.PredefinedTipsChoiceDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.RemotePaymentItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.RoverActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.StateModalDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.TimeslotDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.TipsChoiceDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.WrapContentHeightDto;

/* loaded from: classes.dex */
public final class ow {
    public final fw7 a;
    public final rsc b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final gd3 f;
    public final qc20 g;

    public ow(fw7 fw7Var, rsc rscVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, gd3 gd3Var, qc20 qc20Var) {
        this.a = fw7Var;
        this.b = rscVar;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = h3yVar3;
        this.f = gd3Var;
        this.g = qc20Var;
    }

    public static vn a(ActionOpenFormDto actionOpenFormDto) {
        cw cwVar;
        Map map;
        String mode = actionOpenFormDto.getMode();
        String scenario = actionOpenFormDto.getScenario();
        zi8 d = d(actionOpenFormDto.getCardMode());
        Object clientState = actionOpenFormDto.getClientState();
        if (clientState instanceof Map) {
            map = (Map) clientState;
            cwVar = null;
        } else {
            cwVar = null;
            map = null;
        }
        String asyncTaskId = actionOpenFormDto.getAsyncTaskId();
        boolean isCacheState = actionOpenFormDto.isCacheState();
        ActionGuardPolicyDto actionGuardPolicy = actionOpenFormDto.getActionGuardPolicy();
        if (actionGuardPolicy != null) {
            cwVar = b(actionGuardPolicy);
        }
        return new vn(mode, scenario, d, map, asyncTaskId, isCacheState, actionOpenFormDto.getTitle(), actionOpenFormDto.getBadgeText(), cwVar, actionOpenFormDto.getImageTag(), actionOpenFormDto.getMetricaLabel());
    }

    public static cw b(ActionGuardPolicyDto actionGuardPolicyDto) {
        if (actionGuardPolicyDto instanceof ActionGuardPolicyDto.ActionGuardPolicy_FormStateKeyPolicyDto) {
            FormStateKeyActionGuardPolicyDto formStateKeyActionGuardPolicyDto = ((ActionGuardPolicyDto.ActionGuardPolicy_FormStateKeyPolicyDto) actionGuardPolicyDto).b;
            return new cw(formStateKeyActionGuardPolicyDto.getFormStateKey(), formStateKeyActionGuardPolicyDto.getFormStateValue());
        }
        if (actionGuardPolicyDto instanceof ActionGuardPolicyDto.Unknown_ActionGuardPolicyDto) {
            return null;
        }
        w511.b();
        return null;
    }

    public static zi8 d(CardModeDto cardModeDto) {
        if (cardModeDto instanceof CardModeDto.CardMode_FullscreenDto) {
            return new xi8(((CardModeDto.CardMode_FullscreenDto) cardModeDto).b.isSlideable());
        }
        if (cardModeDto instanceof CardModeDto.CardMode_WrapContentHeightDto) {
            WrapContentHeightDto wrapContentHeightDto = ((CardModeDto.CardMode_WrapContentHeightDto) cardModeDto).b;
            return new yi8(wrapContentHeightDto.isSlideable(), wrapContentHeightDto.getSkeletonHeight());
        }
        if (cardModeDto == null || (cardModeDto instanceof CardModeDto.Unknown_CardModeDto)) {
            return new yi8(true, null);
        }
        w511.b();
        return null;
    }

    public static ja9 e(ChangeDateTimeOptionDto changeDateTimeOptionDto) {
        String date = changeDateTimeOptionDto.getDate();
        List<TimeslotDto> timeslots = changeDateTimeOptionDto.getTimeslots();
        ArrayList arrayList = new ArrayList(tcc.n(timeslots, 10));
        for (TimeslotDto timeslotDto : timeslots) {
            arrayList.add(new pez0(timeslotDto.getTitle(), timeslotDto.getTimestampFrom(), timeslotDto.getTimestampTo(), timeslotDto.getPriceSubtitle(), Boolean.valueOf(timeslotDto.isPaid())));
        }
        return new ja9(date, arrayList);
    }

    public static pa9 f(ChangeDateTimeScreenDto changeDateTimeScreenDto) {
        return new pa9(changeDateTimeScreenDto.getTitle(), changeDateTimeScreenDto.getText(), new qa9(changeDateTimeScreenDto.getChangeButton().getTitle()), new qa9(changeDateTimeScreenDto.getCancelButton().getTitle()));
    }

    public static bdj g(DialogDto dialogDto) {
        if (dialogDto != null) {
            return new bdj(dialogDto.getTitle(), dialogDto.getBody(), new ry6(dialogDto.getCloseButton().getTitle()), new ry6(dialogDto.getConfirmButton().getTitle()));
        }
        return null;
    }

    public final m07 c(ButtonItemDto buttonItemDto) {
        ContentTextItemDto title = buttonItemDto.getTitle();
        qc20 qc20Var = this.g;
        zp1 z = qc20.z(qc20Var, title);
        ContentTextItemDto subtitle = buttonItemDto.getSubtitle();
        zp1 z2 = subtitle != null ? qc20.z(qc20Var, subtitle) : null;
        ContentIconItemDto leadIcon = buttonItemDto.getLeadIcon();
        return new m07(z, z2, leadIcon != null ? qc20Var.x(leadIcon) : null, buttonItemDto.getEnabled());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2, types: [nr] */
    public final nr h(ActionDto actionDto) {
        f030 f030Var;
        ea91 i2a0Var;
        Expansion expansion;
        Expansion expansion2;
        CancelType cancelType;
        fw7 fw7Var;
        cw7 cw7Var;
        ifz0 ifz0Var;
        ArrayList arrayList;
        if (actionDto instanceof ActionDto.Action_FeedbackDto) {
            ActionFeedbackDto actionFeedbackDto = ((ActionDto.Action_FeedbackDto) actionDto).b;
            String title = actionFeedbackDto.getTitle();
            List<FeedbackSubtitleDto> subtitles = actionFeedbackDto.getSubtitles();
            ArrayList arrayList2 = new ArrayList(tcc.n(subtitles, 10));
            for (FeedbackSubtitleDto feedbackSubtitleDto : subtitles) {
                arrayList2.add(new ivq(feedbackSubtitleDto.getTitle(), feedbackSubtitleDto.getScores()));
            }
            List<FeedbackReasonDto> reasons = actionFeedbackDto.getReasons();
            if (reasons != null) {
                List<FeedbackReasonDto> list = reasons;
                arrayList = new ArrayList(tcc.n(list, 10));
                for (FeedbackReasonDto feedbackReasonDto : list) {
                    String reasonId = feedbackReasonDto.getReasonId();
                    String title2 = feedbackReasonDto.getTitle();
                    List<Integer> scores = feedbackReasonDto.getScores();
                    IconDto icon = feedbackReasonDto.getIcon();
                    arrayList.add(new buq(reasonId, title2, scores, icon != null ? new ga0(icon.getActive(), icon.getInactive(), false) : null));
                }
            } else {
                arrayList = null;
            }
            ActionFeedbackDto.LastFeedbackDto lastFeedback = actionFeedbackDto.getLastFeedback();
            return new tn(title, arrayList2, arrayList, lastFeedback != null ? new fsx(lastFeedback.getScore(), lastFeedback.getComment(), lastFeedback.getReasonIds()) : null);
        }
        if (actionDto instanceof ActionDto.Action_CancelFeedbackDto) {
            ActionCancelFeedbackDto actionCancelFeedbackDto = ((ActionDto.Action_CancelFeedbackDto) actionDto).b;
            String title3 = actionCancelFeedbackDto.getTitle();
            List<FeedbackCancelReasonDto> reasons2 = actionCancelFeedbackDto.getReasons();
            ArrayList arrayList3 = new ArrayList(tcc.n(reasons2, 10));
            for (FeedbackCancelReasonDto feedbackCancelReasonDto : reasons2) {
                arrayList3.add(new xrq(feedbackCancelReasonDto.getReasonId(), feedbackCancelReasonDto.getTitle()));
            }
            return new ln(title3, arrayList3);
        }
        if (actionDto instanceof ActionDto.Action_TipsDto) {
            ActionTipsDto actionTipsDto = ((ActionDto.Action_TipsDto) actionDto).b;
            List<TipsChoiceDto> choices = actionTipsDto.getChoices();
            ArrayList arrayList4 = new ArrayList(tcc.n(choices, 10));
            for (TipsChoiceDto tipsChoiceDto : choices) {
                if (tipsChoiceDto instanceof TipsChoiceDto.TipsChoice_PredefinedDto) {
                    PredefinedTipsChoiceDto predefinedTipsChoiceDto = ((TipsChoiceDto.TipsChoice_PredefinedDto) tipsChoiceDto).b;
                    ifz0Var = new gfz0(predefinedTipsChoiceDto.getChoiceId(), predefinedTipsChoiceDto.getTitle(), predefinedTipsChoiceDto.getDecimalValue());
                } else if (tipsChoiceDto instanceof TipsChoiceDto.TipsChoice_ManualDto) {
                    ManualEntryTipsChoiceDto manualEntryTipsChoiceDto = ((TipsChoiceDto.TipsChoice_ManualDto) tipsChoiceDto).b;
                    ifz0Var = new ffz0(manualEntryTipsChoiceDto.getChoiceId(), manualEntryTipsChoiceDto.getTitle(), manualEntryTipsChoiceDto.getExtraSubtitle(), manualEntryTipsChoiceDto.getDecimalValue(), new BigDecimal(String.valueOf(manualEntryTipsChoiceDto.getMinTipsValue())), new BigDecimal(String.valueOf(manualEntryTipsChoiceDto.getMaxTipsValue())), manualEntryTipsChoiceDto.getTipsValuePattern());
                } else {
                    if (!(tipsChoiceDto instanceof TipsChoiceDto.Unknown_TipsChoiceDto)) {
                        w511.b();
                        return null;
                    }
                    ifz0Var = hfz0.a;
                }
                arrayList4.add(ifz0Var);
            }
            return new ho(actionTipsDto.getLastChoiceId(), arrayList4, actionTipsDto.getAvailablePaymentTypes());
        }
        if (actionDto instanceof ActionDto.Action_PerformerCallDto) {
            ActionPerformerCallDto actionPerformerCallDto = ((ActionDto.Action_PerformerCallDto) actionDto).b;
            String title4 = actionPerformerCallDto.getTitle();
            CommunicationMethodDto communicationMethod = actionPerformerCallDto.getCommunicationMethod();
            this.b.getClass();
            return new zn(title4, rsc.a(communicationMethod), actionPerformerCallDto.getMetricaLabel());
        }
        boolean z = actionDto instanceof ActionDto.Action_CancelDto;
        fw7 fw7Var2 = this.a;
        if (z) {
            ActionCancelDto actionCancelDto = ((ActionDto.Action_CancelDto) actionDto).b;
            String title5 = actionCancelDto.getTitle();
            CancelMessageDto message = actionCancelDto.getMessage();
            fw7Var2.getClass();
            return new kn(title5, fw7.a(message));
        }
        if (actionDto instanceof ActionDto.Action_CancelV2Dto) {
            ActionCancelV2Dto actionCancelV2Dto = ((ActionDto.Action_CancelV2Dto) actionDto).b;
            String title6 = actionCancelV2Dto.getTitle();
            CancelMessageV2Dto message2 = actionCancelV2Dto.getMessage();
            CancelTypeDto cancelType2 = actionCancelV2Dto.getCancelType();
            fw7Var2.getClass();
            String title7 = message2.getTitle();
            String body = message2.getBody();
            List<CancelMessageButtonDto> buttons = message2.getButtons();
            int i = ew7.a[cancelType2.ordinal()];
            if (i == 1) {
                cancelType = CancelType.FREE;
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                cancelType = CancelType.PAID;
            }
            List<CancelMessageButtonDto> list2 = buttons;
            ArrayList arrayList5 = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                CancelMessageButtonDto cancelMessageButtonDto = (CancelMessageButtonDto) it.next();
                String title8 = cancelMessageButtonDto.getTitle();
                Boolean valueOf = Boolean.valueOf(cancelMessageButtonDto.getHighlighted());
                ?? r16 = r3;
                dw7 dw7Var = fw7Var2.a;
                ActionCancelV2Dto actionCancelV2Dto2 = actionCancelV2Dto;
                CancelMessageButtonActionDto action = cancelMessageButtonDto.getAction();
                dw7Var.getClass();
                Iterator it2 = it;
                if (action instanceof CancelMessageButtonActionDto.CancelMessageButtonAction_DismissCancelMessageDto) {
                    cw7Var = yv7.a;
                } else if (action instanceof CancelMessageButtonActionDto.CancelMessageButtonAction_ContinueOrderCancellationDto) {
                    cw7Var = new xv7(cancelType);
                } else if (action instanceof CancelMessageButtonActionDto.CancelMessageButtonAction_PerformerCallDto) {
                    ActionPerformerCallDto actionPerformerCallDto2 = ((CancelMessageButtonActionDto.CancelMessageButtonAction_PerformerCallDto) action).b;
                    String title9 = actionPerformerCallDto2.getTitle();
                    rsc rscVar = dw7Var.b;
                    CommunicationMethodDto communicationMethod2 = actionPerformerCallDto2.getCommunicationMethod();
                    rscVar.getClass();
                    cw7Var = new aw7(title9, rsc.a(communicationMethod2));
                } else {
                    if (action instanceof CancelMessageButtonActionDto.CancelMessageButtonAction_OpenChatDto) {
                        ActionOpenChatDto actionOpenChatDto = ((CancelMessageButtonActionDto.CancelMessageButtonAction_OpenChatDto) action).b;
                        String title10 = actionOpenChatDto.getTitle();
                        String imageTag = actionOpenChatDto.getImageTag();
                        a320 a320Var = dw7Var.a;
                        MessengerParametersDto messengerParams = actionOpenChatDto.getMessengerParams();
                        a320Var.getClass();
                        z220 a = a320.a(messengerParams);
                        fw7Var = fw7Var2;
                        cw7Var = new zv7(title10, a, imageTag);
                    } else {
                        fw7Var = fw7Var2;
                        if (!(action instanceof CancelMessageButtonActionDto.Unknown_CancelMessageButtonActionDto)) {
                            w511.b();
                            return r16;
                        }
                        cw7Var = bw7.a;
                    }
                    arrayList5.add(new wv7(title8, valueOf, cw7Var, cancelMessageButtonDto.getMetricaLabel()));
                    actionCancelV2Dto = actionCancelV2Dto2;
                    it = it2;
                    r3 = r16;
                    fw7Var2 = fw7Var;
                }
                fw7Var = fw7Var2;
                arrayList5.add(new wv7(title8, valueOf, cw7Var, cancelMessageButtonDto.getMetricaLabel()));
                actionCancelV2Dto = actionCancelV2Dto2;
                it = it2;
                r3 = r16;
                fw7Var2 = fw7Var;
            }
            return new mn(title6, new kw7(title7, body, message2.getMetricaLabel(), arrayList5), actionCancelV2Dto.getMetricaLabel());
        }
        if (actionDto instanceof ActionDto.Action_DynamicCancelDto) {
            return new qn(((ActionDto.Action_DynamicCancelDto) actionDto).b.getTitle());
        }
        if (actionDto instanceof ActionDto.Action_ShowContentOrderHistoryDto) {
            ActionShowContentOrderHistoryDto actionShowContentOrderHistoryDto = ((ActionDto.Action_ShowContentOrderHistoryDto) actionDto).b;
            return new eo(actionShowContentOrderHistoryDto.getTitle(), actionShowContentOrderHistoryDto.getUrl(), actionShowContentOrderHistoryDto.getOpenPdf());
        }
        if (actionDto instanceof ActionDto.Action_ChangeDateTimeDto) {
            ActionChangeDateTimeDto actionChangeDateTimeDto = ((ActionDto.Action_ChangeDateTimeDto) actionDto).b;
            String title11 = actionChangeDateTimeDto.getTitle();
            String badgeText = actionChangeDateTimeDto.getBadgeText();
            pa9 f = f(actionChangeDateTimeDto.getScreen());
            List<ChangeDateTimeOptionDto> options = actionChangeDateTimeDto.getOptions();
            ArrayList arrayList6 = new ArrayList(tcc.n(options, 10));
            Iterator it3 = options.iterator();
            while (it3.hasNext()) {
                arrayList6.add(e((ChangeDateTimeOptionDto) it3.next()));
            }
            return new nn(title11, badgeText, f, arrayList6);
        }
        if (actionDto instanceof ActionDto.Action_DialogDto) {
            ActionDialogDto actionDialogDto = ((ActionDto.Action_DialogDto) actionDto).b;
            return new pn(actionDialogDto.getTitle(), actionDialogDto.getBadgeText(), actionDialogDto.getImageTag(), ((kej) this.d.get()).a(actionDialogDto.getDialog()));
        }
        if (actionDto instanceof ActionDto.Action_ShowSupportWebDto) {
            ActionShowSupportWebDto actionShowSupportWebDto = ((ActionDto.Action_ShowSupportWebDto) actionDto).b;
            String url = actionShowSupportWebDto.getUrl();
            if (url != null) {
                return new go(actionShowSupportWebDto.getTitle(), url, actionShowSupportWebDto.getIconTag(), actionShowSupportWebDto.getMetricaLabel());
            }
        } else {
            if (actionDto instanceof ActionDto.Action_ShareDto) {
                ActionShareDto actionShareDto = ((ActionDto.Action_ShareDto) actionDto).b;
                return new bo(actionShareDto.getTitle(), actionShareDto.getSharingUrl(), actionShareDto.getMetricaLabel());
            }
            if (actionDto instanceof ActionDto.Action_OpenTrackingCardDto) {
                ActionOpenTrackingCardDto actionOpenTrackingCardDto = ((ActionDto.Action_OpenTrackingCardDto) actionDto).b;
                String title12 = actionOpenTrackingCardDto.getTitle();
                ActionOpenTrackingCardDto.ExpansionDto expansion3 = actionOpenTrackingCardDto.getExpansion();
                int i2 = expansion3 == null ? -1 : nw.a[expansion3.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        expansion2 = Expansion.EXPANDED;
                    } else if (i2 == 2) {
                        expansion2 = Expansion.COLLAPSED;
                    } else if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    return new wn(title12, expansion2);
                }
                expansion2 = Expansion.ANCHORED;
                return new wn(title12, expansion2);
            }
            if (actionDto instanceof ActionDto.Action_OrderMoreDto) {
                ActionOrderMoreDto actionOrderMoreDto = ((ActionDto.Action_OrderMoreDto) actionDto).b;
                String title13 = actionOrderMoreDto.getTitle();
                String vertical = actionOrderMoreDto.getVertical();
                Boolean verticalTrap = actionOrderMoreDto.getVerticalTrap();
                ActionOrderMoreDto.SheetExpansionDto sheetExpansion = actionOrderMoreDto.getSheetExpansion();
                int i3 = sheetExpansion == null ? -1 : nw.b[sheetExpansion.ordinal()];
                if (i3 != -1) {
                    if (i3 == 1) {
                        expansion = Expansion.EXPANDED;
                    } else if (i3 == 2) {
                        expansion = Expansion.COLLAPSED;
                    } else if (i3 != 3) {
                        w511.b();
                        return null;
                    }
                    return new yn(title13, vertical, verticalTrap, expansion);
                }
                expansion = Expansion.ANCHORED;
                return new yn(title13, vertical, verticalTrap, expansion);
            }
            if (actionDto instanceof ActionDto.Action_OpenUniversalLinkDto) {
                ActionOpenLinkToRouteDto actionOpenLinkToRouteDto = ((ActionDto.Action_OpenUniversalLinkDto) actionDto).b;
                return new xn(actionOpenLinkToRouteDto.getTitle(), g(actionOpenLinkToRouteDto.getDialog()), actionOpenLinkToRouteDto.getUrl(), actionOpenLinkToRouteDto.getImageTag(), actionOpenLinkToRouteDto.getShouldAuthorize(), actionOpenLinkToRouteDto.getMetricaLabel());
            }
            if (actionDto instanceof ActionDto.Action_OpenChatDto) {
                ActionOpenChatDto actionOpenChatDto2 = ((ActionDto.Action_OpenChatDto) actionDto).b;
                String title14 = actionOpenChatDto2.getTitle();
                String imageTag2 = actionOpenChatDto2.getImageTag();
                a320 a320Var2 = (a320) this.e.get();
                MessengerParametersDto messengerParams2 = actionOpenChatDto2.getMessengerParams();
                a320Var2.getClass();
                return new un(title14, a320.a(messengerParams2), imageTag2, actionOpenChatDto2.getMetricaLabel());
            }
            if (actionDto instanceof ActionDto.Action_DeeplinkDto) {
                ActionDeeplinkDto actionDeeplinkDto = ((ActionDto.Action_DeeplinkDto) actionDto).b;
                return new on(actionDeeplinkDto.getDeeplink(), actionDeeplinkDto.getTitle(), actionDeeplinkDto.getBadgeText(), actionDeeplinkDto.getImageTag(), actionDeeplinkDto.getAnalyticsName());
            }
            if (actionDto instanceof ActionDto.Action_PayNowDto) {
                PayNowActionDto payNowActionDto = ((ActionDto.Action_PayNowDto) actionDto).b;
                List<String> availablePaymentTypes = payNowActionDto.getAvailablePaymentTypes();
                PaymentItemDto paymentItem = payNowActionDto.getPaymentItem();
                if (paymentItem instanceof PaymentItemDto.PaymentItem_RemotePaymentItemDto) {
                    RemotePaymentItemDto remotePaymentItemDto = ((PaymentItemDto.PaymentItem_RemotePaymentItemDto) paymentItem).b;
                    ContentTextItemDto title15 = remotePaymentItemDto.getTitle();
                    qc20 qc20Var = this.g;
                    zp1 z2 = qc20.z(qc20Var, title15);
                    ContentTextItemDto subtitle = remotePaymentItemDto.getSubtitle();
                    zp1 z3 = subtitle != null ? qc20.z(qc20Var, subtitle) : null;
                    ContentTextItemDto trailTitle = remotePaymentItemDto.getTrailTitle();
                    zp1 z4 = trailTitle != null ? qc20.z(qc20Var, trailTitle) : null;
                    ContentTextItemDto trailSubtitle = remotePaymentItemDto.getTrailSubtitle();
                    zp1 z5 = trailSubtitle != null ? qc20.z(qc20Var, trailSubtitle) : null;
                    ContentIconItemDto leadIcon = remotePaymentItemDto.getLeadIcon();
                    i2a0Var = new j2a0(z2, z3, z4, z5, leadIcon != null ? qc20Var.x(leadIcon) : null);
                } else {
                    i2a0Var = paymentItem instanceof PaymentItemDto.PaymentItem_LocalPaymentItemDto ? new i2a0(((PaymentItemDto.PaymentItem_LocalPaymentItemDto) paymentItem).b.getPrice()) : new i2a0(null);
                }
                return new cx(availablePaymentTypes, i2a0Var, c(payNowActionDto.getPaymentChosenButton()), c(payNowActionDto.getAboutToChooseButton()));
            }
            if (actionDto instanceof ActionDto.Action_EditOrderDto) {
                ActionEditOrderDto actionEditOrderDto = ((ActionDto.Action_EditOrderDto) actionDto).b;
                return new rn(actionEditOrderDto.getTitle(), actionEditOrderDto.getBadgeText(), actionEditOrderDto.getImageTag());
            }
            if (actionDto instanceof ActionDto.Action_ExtendDeliveryExpirationDateDto) {
                ExtendDeliveryExpirationDateDto extendDeliveryExpirationDateDto = ((ActionDto.Action_ExtendDeliveryExpirationDateDto) actionDto).b;
                return new sn(extendDeliveryExpirationDateDto.getTitle(), extendDeliveryExpirationDateDto.getBadgeText());
            }
            if (actionDto instanceof ActionDto.Action_RoverDto) {
                RoverActionDto roverActionDto = ((ActionDto.Action_RoverDto) actionDto).b;
                String title16 = roverActionDto.getTitle();
                String action2 = roverActionDto.getAction();
                Object payload = roverActionDto.getPayload();
                StateModalDto confirmationModal = roverActionDto.getConfirmationModal();
                if (confirmationModal != null) {
                    String headerImageTag = confirmationModal.getHeaderImageTag();
                    AttributedTextDto title17 = confirmationModal.getTitle();
                    this.f.getClass();
                    m330 m330Var = new m330(gd3.b(title17));
                    AttributedTextDto body2 = confirmationModal.getBody();
                    f030Var = new f030(headerImageTag, m330Var, body2 != null ? new m330(gd3.b(body2)) : null, new d030(new m330(gd3.b(confirmationModal.getCloseButton().getTitle()))), new d030(new m330(gd3.b(confirmationModal.getConfirmButton().getTitle()))));
                } else {
                    f030Var = null;
                }
                return new ao(title16, action2, payload, f030Var);
            }
            if (actionDto instanceof ActionDto.Action_OpenFormDto) {
                return a(((ActionDto.Action_OpenFormDto) actionDto).b);
            }
            if (actionDto instanceof ActionDto.Action_ShareLocationDto) {
                return new co(((ActionDto.Action_ShareLocationDto) actionDto).b.getTitle());
            }
            if (!(actionDto instanceof ActionDto.Action_OpenYandexMessengerSupportChatDto) && !(actionDto instanceof ActionDto.Action_PayNowInWebDto) && !(actionDto instanceof ActionDto.Action_WebTipsDto) && !(actionDto instanceof ActionDto.Unknown_ActionDto)) {
                w511.b();
                return null;
            }
        }
        return cr.a;
    }
}
