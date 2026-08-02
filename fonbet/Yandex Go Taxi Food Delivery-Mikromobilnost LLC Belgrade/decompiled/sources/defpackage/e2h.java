package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingFragment;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingParams;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.nfc.api.models.NfcPaymentScreenParams;
import com.ybsdk.feature.partnerpayments.api.PartnerPaymentsFeature$BindingStatus;
import com.ybsdk.feature.partnerpayments.api.PartnerSaveScreenParams;
import com.ybsdk.feature.partnerpayments.internal.screens.save.presentation.PartnerSaveFragment;
import com.ybsdk.feature.paymentsdk.internal.screens.PaymentSdkFragment;
import com.ybsdk.feature.paymentsdk.internal.screens.PaymentSdkParams;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinFragment;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckType;
import com.ybsdk.feature.rebind.payment.api.RebindPaymentMethodScreenParams;
import com.ybsdk.feature.rebind.payment.internal.screens.RebindPaymentMethodFragment;
import com.ybsdk.feature.stories.api.StoriesScreensParams;
import com.ybsdk.feature.stories.api.VerticalStoriesScreenParams;
import com.ybsdk.feature.stories.internal.screens.stories.StoriesFragment;
import com.ybsdk.feature.stories.internal.screens.verticalstories.VerticalStoriesFragment;
import com.ybsdk.feature.transfer.version2.api.entities.FundDocsNoticeInfo;
import com.ybsdk.feature.transfer.version2.internal.screens.a;
import com.ybsdk.feature.transfer.version2.internal.screens.fund.FundDocsNoticeFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.fund.FundDocsNoticeParams;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.TransferMe2MeConfirmFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.TransferMe2MeConfirmScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.TransferMe2MeConfirmPullFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.TransferMe2MeConfirmPullScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.MobileProvidersListFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.MobileProvidersListParams;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Collections;
import java.util.UUID;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class e2h implements k3h {
    public final /* synthetic */ int a;

    public e2h(qwu0 qwu0Var, FragmentActivity fragmentActivity) {
        this.a = 5;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        EmptyList emptyList = EmptyList.a;
        x0h x0hVar = x0h.a;
        switch (i) {
            case 0:
                if (baseDeeplinkAction instanceof DeeplinkAction.MobileProvidersList) {
                    return new v0h(Collections.singletonList(new FragmentScreen("MobileProvidersListFragment", false, new MobileProvidersListParams(((DeeplinkAction.MobileProvidersList) baseDeeplinkAction).getPhone(), false, null, 4, null), TransitionPolicyType.POPUP, qoi0.a(MobileProvidersListFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null)), null, 6);
                }
                return x0hVar;
            case 1:
                if (baseDeeplinkAction instanceof DeeplinkAction.DisablePartnerBinding) {
                    return new v0h(Collections.singletonList(new FragmentScreen("PartnerSaveScreen", false, new PartnerSaveScreenParams.BindingParner(((DeeplinkAction.DisablePartnerBinding) baseDeeplinkAction).getMemberId(), PartnerPaymentsFeature$BindingStatus.DISABLED), TransitionPolicyType.DEFAULT, qoi0.a(PartnerSaveFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null)), null, 6);
                }
                return x0hVar;
            case 2:
                if (baseDeeplinkAction instanceof DeeplinkAction.SavePartnerPayment) {
                    return new v0h(Collections.singletonList(new FragmentScreen("PartnerSaveScreen", false, new PartnerSaveScreenParams.BindingParner(((DeeplinkAction.SavePartnerPayment) baseDeeplinkAction).getMemberId(), PartnerPaymentsFeature$BindingStatus.ENABLED), TransitionPolicyType.DEFAULT, qoi0.a(PartnerSaveFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null)), null, 6);
                }
                return x0hVar;
            case 3:
                if (baseDeeplinkAction instanceof DeeplinkAction.SelectPartnerPayment) {
                    return new v0h(Collections.singletonList(new FragmentScreen("PartnerSaveScreen", false, PartnerSaveScreenParams.SelectPartner.INSTANCE, TransitionPolicyType.DEFAULT, qoi0.a(PartnerSaveFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null)), null, 6);
                }
                return x0hVar;
            case 4:
                if (baseDeeplinkAction instanceof DeeplinkAction.PaymentSdk) {
                    return new v0h(Collections.singletonList(new FragmentScreen("PaymentSdkScreen", false, new PaymentSdkParams(((DeeplinkAction.PaymentSdk) baseDeeplinkAction).getDeeplink()), TransitionPolicyType.POPUP, qoi0.a(PaymentSdkFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 2, null)), null, 6);
                }
                return x0hVar;
            case 5:
                if (baseDeeplinkAction instanceof DeeplinkAction.PersonalWallet) {
                    DeeplinkAction.PersonalWallet personalWallet = (DeeplinkAction.PersonalWallet) baseDeeplinkAction;
                    personalWallet.getDeeplink();
                    x4c.g("Unable to handle Wallet SDK deeplink", null, String.valueOf(personalWallet.getDeeplink()), null, 10);
                }
                return x0hVar;
            case 6:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.PhoneTransfer)) {
                    return x0hVar;
                }
                TransferPhoneInputFragment.Arguments arguments = new TransferPhoneInputFragment.Arguments(((DeeplinkAction.PhoneTransfer) baseDeeplinkAction).getAgreementId(), null, null, null, null, null, UUID.randomUUID().toString(), null, null, null, null, false, 3840, null);
                return new v0h(Collections.singletonList(new FragmentScreen("Transfer2PhoneInputScreen", false, arguments, TransitionPolicyType.POPUP, qoi0.a(TransferPhoneInputFragment.class), a.c(arguments.getScenario()), 2, null)), null, 6);
            case 7:
                if (baseDeeplinkAction instanceof DeeplinkAction.ShowPin) {
                    return new v0h(Collections.singletonList(new FragmentScreen("CheckPinCodeEnterScreen", false, new CheckPinFragment.CheckPinScreenParams(CheckType.ENTER_PRO, null, false, 4, null), null, qoi0.a(CheckPinFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null)), null, 6);
                }
                return x0hVar;
            case 8:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.PlusCheckout)) {
                    return x0hVar;
                }
                DeeplinkAction.PlusCheckout plusCheckout = (DeeplinkAction.PlusCheckout) baseDeeplinkAction;
                plusCheckout.getOfferId();
                plusCheckout.getProductTarget();
                plusCheckout.getDeeplinkSuccess();
                plusCheckout.getDeeplinkFailure();
                return new v0h(emptyList, null, 6);
            case 9:
                if (baseDeeplinkAction instanceof DeeplinkAction.RebindPaymentMethod) {
                    return new v0h(Collections.singletonList(new FragmentScreen("RebindPaymentMethodScreen", false, new RebindPaymentMethodScreenParams(((DeeplinkAction.RebindPaymentMethod) baseDeeplinkAction).getPaymentMethodId()), TransitionPolicyType.NONE, qoi0.a(RebindPaymentMethodFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 2, null)), null, 6);
                }
                return x0hVar;
            case 10:
                return baseDeeplinkAction instanceof DeeplinkAction.Rounding ? new v0h(Collections.singletonList(new FragmentScreen("RoundingScreen", false, new RoundingParams(((DeeplinkAction.Rounding) baseDeeplinkAction).getAgreementId()), null, qoi0.a(RoundingFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6) : x0hVar;
            case 11:
                return baseDeeplinkAction instanceof DeeplinkAction.SavingTransfer ? new v0h(Collections.singletonList(a.f(((DeeplinkAction.SavingTransfer) baseDeeplinkAction).getArguments())), null, 6) : x0hVar;
            case 12:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.ShowFundDocsNotice)) {
                    return x0hVar;
                }
                FundDocsNoticeInfo noticeInfo = ((DeeplinkAction.ShowFundDocsNotice) baseDeeplinkAction).getNoticeInfo();
                return new v0h(Collections.singletonList(new FragmentScreen("FundDocsNoticeFragment", false, new FundDocsNoticeParams(noticeInfo), TransitionPolicyType.NONE, qoi0.a(FundDocsNoticeFragment.class), OpenScreenRequirement.WithBuid.INSTANCE)), null, 6);
            case 13:
                return baseDeeplinkAction instanceof DeeplinkAction.ShowHWTokenization ? new v0h(emptyList, null, 6) : x0hVar;
            case 14:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.ShowNfcPayment)) {
                    return x0hVar;
                }
                DeeplinkAction.ShowNfcPayment showNfcPayment = (DeeplinkAction.ShowNfcPayment) baseDeeplinkAction;
                new NfcPaymentScreenParams(showNfcPayment.getNfcPaymentScenario(), null, showNfcPayment.getNfcPaymentResult(), false, 10, null);
                return new v0h(emptyList, null, 6);
            case 15:
                return baseDeeplinkAction instanceof DeeplinkAction.ShowNfcAllProductsSettings ? new v0h(emptyList, null, 6) : x0hVar;
            case 16:
                return baseDeeplinkAction instanceof DeeplinkAction.ShowNfcOldUserPromo ? new v0h(emptyList, null, 6) : x0hVar;
            case 17:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.ShowNfcShortcutFlow)) {
                    return x0hVar;
                }
                ((DeeplinkAction.ShowNfcShortcutFlow) baseDeeplinkAction).getPaymentMethod();
                return new v0h(emptyList, null, 6);
            case 18:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.ShowNfcTokenization)) {
                    return x0hVar;
                }
                DeeplinkAction.ShowNfcTokenization showNfcTokenization = (DeeplinkAction.ShowNfcTokenization) baseDeeplinkAction;
                showNfcTokenization.getPaymentMethod();
                showNfcTokenization.getSource();
                return new v0h(emptyList, null, 6);
            case 19:
                return baseDeeplinkAction instanceof DeeplinkAction.ShowNfcTroubleshooting ? new v0h(emptyList, null, 6) : x0hVar;
            case 20:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Stories)) {
                    return x0hVar;
                }
                DeeplinkAction.Stories stories = (DeeplinkAction.Stories) baseDeeplinkAction;
                return new v0h(Collections.singletonList(new FragmentScreen("StoriesScreen", false, new StoriesScreensParams(stories.getTarget(), stories.getAgreementId(), stories.getProgressType(), stories.getShowBackButton(), stories.getShowCloseButton(), stories.getStartStoryId(), stories.getAdditionalParams()), null, qoi0.a(StoriesFragment.class), OpenScreenRequirement.WithYbSession.INSTANCE, 10, null)), null, 6);
            case 21:
                return baseDeeplinkAction instanceof DeeplinkAction.TransferState ? new v0h(Collections.singletonList(a.d(((DeeplinkAction.TransferState) baseDeeplinkAction).getArguments())), null, 6) : x0hVar;
            case 22:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Me2MeDebitTransfer)) {
                    return x0hVar;
                }
                String permissionRequestId = ((DeeplinkAction.Me2MeDebitTransfer) baseDeeplinkAction).getPermissionRequestId();
                return new v0h(Collections.singletonList(new FragmentScreen("TransferMe2MeScreen", false, new TransferMe2MeConfirmScreenParams(permissionRequestId), TransitionPolicyType.DEFAULT, qoi0.a(TransferMe2MeConfirmFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null)), null, 6);
            case 23:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Me2MeConfirmPull)) {
                    return x0hVar;
                }
                String ybId = ((DeeplinkAction.Me2MeConfirmPull) baseDeeplinkAction).getYbId();
                return new v0h(Collections.singletonList(new FragmentScreen("TransferMe2MeConfirmPullScreen", false, new TransferMe2MeConfirmPullScreenParams(ybId), TransitionPolicyType.DEFAULT, qoi0.a(TransferMe2MeConfirmPullFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null)), null, 6);
            case 24:
                if (baseDeeplinkAction instanceof DeeplinkAction.VerticalStories) {
                    return new v0h(Collections.singletonList(new FragmentScreen("VerticalStoriesScreen", false, new VerticalStoriesScreenParams(((DeeplinkAction.VerticalStories) baseDeeplinkAction).getStartStoryId()), TransitionPolicyType.POPUP, qoi0.a(VerticalStoriesFragment.class), OpenScreenRequirement.WithYbSession.INSTANCE, 2, null)), null, 6);
                }
                return x0hVar;
            default:
                return baseDeeplinkAction instanceof DeeplinkAction.LogoutSuggest ? new v0h(emptyList, null, 6) : x0hVar;
        }
    }

    public /* synthetic */ e2h(kcs kcsVar, int i) {
        this.a = i;
    }
}
