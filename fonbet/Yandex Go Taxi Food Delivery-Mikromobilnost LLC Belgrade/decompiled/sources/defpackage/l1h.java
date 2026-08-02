package defpackage;

import android.content.Intent;
import android.view.View;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferLimitsShutterType;
import com.ybsdk.core.analytics.generated.delegates.UpgradeEvents$UpgradeInitiatedContext;
import com.ybsdk.core.common.data.cache.b;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.core.utils.ext.d;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.about.internal.presentation.AboutComposeFragment;
import com.ybsdk.feature.about.internal.presentation.AboutFragment;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultParams;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.actions.SbpSubscriptionConsentAction;
import com.ybsdk.feature.kycesia.api.EsiaInfoEntity;
import com.ybsdk.feature.partnerselection.api.PartnerSelectionFeature$Companion$Entry;
import com.ybsdk.feature.qr.api.QrReaderScreenType;
import com.ybsdk.feature.qr.internal.screens.container.QrContainerFragment;
import com.ybsdk.feature.qr.internal.screens.container.QrContainerScreenParams;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderScreenParams;
import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.QrSubscriptionsListFragment;
import com.ybsdk.feature.sbp.old.internal.screens.SbpOldFragment;
import com.ybsdk.feature.settings.api.SettingsOpeningSource;
import com.ybsdk.feature.ui.stat.internal.domain.UiStatPayloadType;
import com.ybsdk.rconfig.YbCommonUrlsImpl;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.QrGenerationFeatureData;
import com.ybsdk.screens.initial.a;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.upgrade.presentation.main.UpgradeFragment;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class l1h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l1h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.util.List] */
    @Override // defpackage.k3h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        ok31 ok31Var;
        Object obj;
        UiStatPayloadType uiStatPayloadType;
        FragmentScreen fragmentScreen;
        BottomSheetDialogView.State state;
        int i = this.a;
        final int i2 = 1;
        EmptyList emptyList = EmptyList.a;
        x0h x0hVar = x0h.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (baseDeeplinkAction instanceof DeeplinkAction.About) {
                    return new v0h(Collections.singletonList(new FragmentScreen("AboutScreen", false, null, null, qoi0.a(((CommonFeatureFlag) ((d5) obj2).b.a.a.d(wlp.e).getData()).isEnabled() ? AboutComposeFragment.class : AboutFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 14, null)), null, 6);
                }
                return x0hVar;
            case 1:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.AddCardForTopup)) {
                    return x0hVar;
                }
                r90 r90Var = (r90) obj2;
                Intent c = ((bja0) r90Var.a.get()).c();
                m50 m50Var = r90Var.e;
                if (m50Var != null) {
                    jla1.i(m50Var, c);
                }
                r90Var.c.f.a.a("bind_new_card.confirm.show", null);
                return new v0h(emptyList, null, 6);
            case 2:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.AutotopupPaymentResult)) {
                    return x0hVar;
                }
                DeeplinkAction.AutotopupPaymentResult autotopupPaymentResult = (DeeplinkAction.AutotopupPaymentResult) baseDeeplinkAction;
                return new v0h(Collections.singletonList(iz3.a(new AutoTopupResultParams.ShowPaymentInfo(autotopupPaymentResult.getAgreementId(), autotopupPaymentResult.getSource(), autotopupPaymentResult.getType(), ((lv3) obj2).f.a()))), null, 6);
            case 3:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CacheDrop)) {
                    return x0hVar;
                }
                ((b) obj2).h(((DeeplinkAction.CacheDrop) baseDeeplinkAction).getKey());
                return new v0h(emptyList, null, 6);
            case 4:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CloseSdk)) {
                    return x0hVar;
                }
                ((tfl0) obj2).e();
                return new v0h(emptyList, null, 6);
            case 5:
                return baseDeeplinkAction instanceof DeeplinkAction.EsiaApp2app ? new v0h(Collections.singletonList(((kbo) obj2).b(new EsiaInfoEntity.Link(((DeeplinkAction.EsiaApp2app) baseDeeplinkAction).getUrl()))), null, 6) : x0hVar;
            case 6:
                if (baseDeeplinkAction instanceof DeeplinkAction.ExternalSchemeDeeplink) {
                    return ((Boolean) ((uop0) obj2).a.m.invoke(((DeeplinkAction.ExternalSchemeDeeplink) baseDeeplinkAction).getUri().toString())).booleanValue() ? w0h.a : x0hVar;
                }
                return x0hVar;
            case 7:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.FinalizePaymentChoice)) {
                    return x0hVar;
                }
                DeeplinkAction.FinalizePaymentChoice finalizePaymentChoice = (DeeplinkAction.FinalizePaymentChoice) baseDeeplinkAction;
                ((e7a0) obj2).a.g(new j7r(finalizePaymentChoice.getPaymentMethodId(), finalizePaymentChoice.getPaymentMethodType(), finalizePaymentChoice.getImageUrlLight(), finalizePaymentChoice.getImageUrlDark(), finalizePaymentChoice.getTitle(), finalizePaymentChoice.getAmount(), finalizePaymentChoice.getTrustId()));
                return new v0h(emptyList, null, 6);
            case 8:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.MarkEventAsRead)) {
                    return x0hVar;
                }
                DeeplinkAction.MarkEventAsRead markEventAsRead = (DeeplinkAction.MarkEventAsRead) baseDeeplinkAction;
                ((com.ybsdk.screens.initial.deeplink.b) obj2).a(markEventAsRead.getEventId(), markEventAsRead.getActionId());
                return new v0h(emptyList, null, 6);
            case 9:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.PlayHaptic)) {
                    return x0hVar;
                }
                DeeplinkAction.PlayHaptic playHaptic = (DeeplinkAction.PlayHaptic) baseDeeplinkAction;
                String hapticEvent = playHaptic.getHapticEvent();
                switch (hapticEvent.hashCode()) {
                    case -1715965556:
                        if (hapticEvent.equals("selection")) {
                            ok31Var = ok31.c;
                            break;
                        }
                        ok31Var = null;
                        break;
                    case -934710369:
                        if (hapticEvent.equals("reject")) {
                            ok31Var = ok31.d;
                            break;
                        }
                        ok31Var = null;
                        break;
                    case 503739367:
                        if (hapticEvent.equals("keyboard")) {
                            ok31Var = ok31.e;
                            break;
                        }
                        ok31Var = null;
                        break;
                    case 951117504:
                        if (hapticEvent.equals("confirm")) {
                            ok31Var = ok31.g;
                            break;
                        }
                        ok31Var = null;
                        break;
                    default:
                        ok31Var = null;
                        break;
                }
                if (ok31Var != null) {
                    ((d) obj2).a(ok31Var);
                } else {
                    x4c.g("Unable to handle haptic deeplink", null, g8e.z("haptic_event", playHaptic.getHapticEvent()), null, 10);
                }
                return new v0h(emptyList, null, 6);
            case 10:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.QrCreditLimitTerm)) {
                    return x0hVar;
                }
                DeeplinkAction.QrCreditLimitTerm qrCreditLimitTerm = (DeeplinkAction.QrCreditLimitTerm) baseDeeplinkAction;
                ((p7g0) obj2).a.g(new kgy0(qrCreditLimitTerm.getTermId(), qrCreditLimitTerm.getVariables()));
                return new v0h(emptyList, null, 6);
            case 11:
                if (!(baseDeeplinkAction instanceof SbpSubscriptionConsentAction)) {
                    return x0hVar;
                }
                ((hhm0) obj2).b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("SbpOldScreen", false, null, null, qoi0.a(SbpOldFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 14, null)), null, 6);
            case 12:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.SendUiStatEvent)) {
                    return x0hVar;
                }
                DeeplinkAction.SendUiStatEvent sendUiStatEvent = (DeeplinkAction.SendUiStatEvent) baseDeeplinkAction;
                ot11 ot11Var = (ot11) obj2;
                String eventName = sendUiStatEvent.getEventName();
                String payloadType = sendUiStatEvent.getPayloadType();
                String payload = sendUiStatEvent.getPayload();
                if (payloadType == null) {
                    uiStatPayloadType = UiStatPayloadType.COUNTER;
                } else {
                    UiStatPayloadType.Companion.getClass();
                    Iterator it = UiStatPayloadType.getEntries().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (cvu0.t(((UiStatPayloadType) obj).getValue(), payloadType, true)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    uiStatPayloadType = (UiStatPayloadType) obj;
                }
                rrp0 rrp0Var = rrp0.b;
                if (uiStatPayloadType == null) {
                    x4c.g("Unexpected ui stat payload type", null, g8e.z("payloadType", payloadType), Collections.singletonList(rrp0Var), 2);
                } else {
                    String str = payload == null ? "1" : (uiStatPayloadType == UiStatPayloadType.COUNTER && bvu0.l(10, payload) == null) ? null : payload;
                    if (str == null) {
                        x4c.g("Unexpected ui stat payload", null, kotlin.collections.b.i(new Pair("payload", payload), new Pair("payloadType", uiStatPayloadType.getValue())), Collections.singletonList(rrp0Var), 2);
                    } else {
                        ot11Var.a.a(eventName, uiStatPayloadType, str);
                    }
                }
                return new v0h(emptyList, null, 6);
            case 13:
                return baseDeeplinkAction instanceof DeeplinkAction.Settings ? new v0h(Collections.singletonList(((wig) obj2).d(SettingsOpeningSource.MENU)), null, 6) : x0hVar;
            case 14:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.ShowQrScan)) {
                    return x0hVar;
                }
                DeeplinkAction.ShowQrScan showQrScan = (DeeplinkAction.ShowQrScan) baseDeeplinkAction;
                String origin = showQrScan.getOrigin();
                String agreementId = showQrScan.getAgreementId();
                String autopaymentId = showQrScan.getAutopaymentId();
                c7g0 c7g0Var = (c7g0) ((b7g0) obj2);
                mfg0 mfg0Var = c7g0Var.b;
                com.ybsdk.rconfig.b bVar = (com.ybsdk.rconfig.b) ((y4a0) c7g0Var.c).c;
                if (((QrGenerationFeatureData) bVar.d(bVar.i.p).getData()).isEnabled()) {
                    QrContainerScreenParams qrContainerScreenParams = new QrContainerScreenParams(origin, agreementId, autopaymentId);
                    mfg0Var.getClass();
                    fragmentScreen = new FragmentScreen("QrContainerScreen", false, qrContainerScreenParams, TransitionPolicyType.POPUP, qoi0.a(QrContainerFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 2, null);
                } else {
                    c7g0Var.d.getClass();
                    QrReaderScreenParams qrReaderScreenParams = new QrReaderScreenParams(false, "QR_READER_TAB", QrReaderScreenType.Old.INSTANCE, agreementId, null, autopaymentId);
                    mfg0Var.getClass();
                    fragmentScreen = new FragmentScreen("QrReaderScreen", false, qrReaderScreenParams, TransitionPolicyType.POPUP, qoi0.a(QrReaderFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 2, null);
                }
                return new v0h(Collections.singletonList(fragmentScreen), null, 6);
            case 15:
                return baseDeeplinkAction instanceof DeeplinkAction.StartSession ? new v0h(Collections.singletonList(a.c((a) obj2)), null, 6) : x0hVar;
            case 16:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.QrSubscriptionsList)) {
                    return x0hVar;
                }
                ((a8g0) obj2).b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("QrSubscriptionsListScreen", false, null, null, qoi0.a(QrSubscriptionsListFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 14, null)), null, 6);
            case 17:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.TransferPartners)) {
                    return x0hVar;
                }
                DeeplinkAction.TransferPartners transferPartners = (DeeplinkAction.TransferPartners) baseDeeplinkAction;
                if (transferPartners.getReceiverPhone() == null) {
                    return x0hVar;
                }
                return new v0h(Collections.singletonList(o791.j(((ju01) obj2).b, transferPartners.getReceiverPhone(), transferPartners.getAgreementId(), PartnerSelectionFeature$Companion$Entry.TRANSFER, null, null, null, null, null, null, 1016)), null, 6);
            case 18:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Upgrade)) {
                    return x0hVar;
                }
                rt1 rt1Var = ((AppAnalyticsReporter) obj2).s0;
                UpgradeEvents$UpgradeInitiatedContext upgradeEvents$UpgradeInitiatedContext = UpgradeEvents$UpgradeInitiatedContext.LIMITS_PAGE;
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put("context", upgradeEvents$UpgradeInitiatedContext.getOriginalValue());
                rt1Var.a.a("upgrade.initiated", linkedHashMap);
                return new v0h(Collections.singletonList(new FragmentScreen("UpgradeScreen", false, null, null, qoi0.a(UpgradeFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 14, null)), null, 4);
            default:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.SimplifiedIdInfo)) {
                    return x0hVar;
                }
                final tfs0 tfs0Var = (tfs0) obj2;
                final int i3 = 0;
                boolean z = tfs0Var.h.a() != null;
                com.ybsdk.rconfig.b bVar2 = tfs0Var.d;
                bVar2.getClass();
                com.ybsdk.rconfig.a aVar = bVar2.i;
                YbCommonUrlsImpl ybCommonUrlsImpl = (YbCommonUrlsImpl) bVar2.d(aVar.e).getData();
                YbCommonUrlsImpl ybCommonUrlsImpl2 = (YbCommonUrlsImpl) aVar.e.c.getData();
                String simplifiedIdentificationInfo = ybCommonUrlsImpl.getSimplifiedIdentificationInfo();
                if (simplifiedIdentificationInfo != null) {
                    if (evu0.J(simplifiedIdentificationInfo)) {
                        simplifiedIdentificationInfo = null;
                        break;
                    }
                }
                simplifiedIdentificationInfo = ybCommonUrlsImpl2.getSimplifiedIdentificationInfo();
                EmptyList c2 = simplifiedIdentificationInfo != null ? ((l3h) tfs0Var.e).c(simplifiedIdentificationInfo) : null;
                if (c2 == null || z) {
                    AppAnalyticsReporter appAnalyticsReporter = tfs0Var.i;
                    if (z) {
                        em3 em3Var = appAnalyticsReporter.q0;
                        TransferEvents$TransferLimitsShutterType transferEvents$TransferLimitsShutterType = TransferEvents$TransferLimitsShutterType.UPRID_PROCESSING;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
                        linkedHashMap2.put("type", transferEvents$TransferLimitsShutterType.getOriginalValue());
                        em3Var.a.a("transfer.limits_shutter", linkedHashMap2);
                        state = new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(unr0.h(Text.Companion, dzh0.ybsdk_uprid_alert_uprid_in_progress_title), new Text.Resource(dzh0.ybsdk_uprid_alert_uprid_in_progress_description), null, null, null, null, HProv.PP_SAME_MEDIA), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_uprid_alert_uprid_in_progress_primary_action), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131064);
                    } else {
                        em3 em3Var2 = appAnalyticsReporter.q0;
                        TransferEvents$TransferLimitsShutterType transferEvents$TransferLimitsShutterType2 = TransferEvents$TransferLimitsShutterType.UPRID_START;
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(1);
                        linkedHashMap3.put("type", transferEvents$TransferLimitsShutterType2.getOriginalValue());
                        em3Var2.a.a("transfer.limits_shutter", linkedHashMap3);
                        state = new BottomSheetDialogView.State(new e(null, null, new gas0(2, tfs0Var), 3), new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_uprid_alert_uprid_not_started_primary_action), null, null, null, null, null, null, false, false, null, 4094), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_uprid_alert_uprid_not_started_secondary_action), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, 131064);
                    }
                    com.ybsdk.widgets.common.bottomsheet.a.a(BottomSheetDialogView.Companion, tfs0Var.b, tfs0Var.a, state, new View.OnClickListener() { // from class: sfs0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = i3;
                            tfs0 tfs0Var2 = tfs0Var;
                            switch (i4) {
                                case 0:
                                    tfs0Var2.a();
                                    break;
                                default:
                                    tfs0Var2.a();
                                    break;
                            }
                        }
                    }, new View.OnClickListener() { // from class: sfs0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = i2;
                            tfs0 tfs0Var2 = tfs0Var;
                            switch (i4) {
                                case 0:
                                    tfs0Var2.a();
                                    break;
                                default:
                                    tfs0Var2.a();
                                    break;
                            }
                        }
                    }, null, 68);
                } else {
                    emptyList = c2;
                }
                return new v0h(emptyList, null, 6);
        }
    }
}
