package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.core.transfer.utils.domain.entities.TransferType;
import com.ybsdk.feature.accountdetails.internal.screens.accountdetails.AccountDetailsFragment;
import com.ybsdk.feature.accountdetails.internal.screens.accountdetails.AccountDetailsParams;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularParams;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v1.AutoTopupSetupFragment;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v1.AutoTopupSetupParams;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.AutoTopupSetupV2Fragment;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.state.AutoTopupSetupV2ScreenParams;
import com.ybsdk.feature.change.payment.method.api.ChangePaymentMethodParameter;
import com.ybsdk.feature.change.payment.method.internal.ui.ChangePaymentMethodFragment;
import com.ybsdk.feature.credit.deposit.api.BoostDepositScreenParams;
import com.ybsdk.feature.credit.deposit.api.CreditDepositScreenParams;
import com.ybsdk.feature.credit.deposit.api.CreditLimitDepositScreenParams;
import com.ybsdk.feature.credit.deposit.api.MkkDepositScreenParams;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.futurepayments.internal.screens.FuturePaymentsFragment;
import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;
import com.ybsdk.feature.merchant.offers.internal.screens.search.MerchantOffersSearchFragment;
import com.ybsdk.feature.merchants.internal.screens.MerchantsFragment;
import com.ybsdk.feature.testpayment.internal.presentation.TestPaymentArguments;
import com.ybsdk.feature.testpayment.internal.presentation.TestPaymentFragment;
import com.ybsdk.feature.testpayment.internal.presentation.TestPaymentPayload;
import com.ybsdk.feature.transfer.api.TransferYbScreenArguments;
import com.ybsdk.feature.transfer.internal.screens.targets.presentation.TransferTargetsFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.a;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.input.BudgetChargesUinInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.requisites.BudgetChargesRequisitesFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.requisites.BudgetChargesRequisitesScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.search.BudgetChargesSearchStatusFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.search.BudgetChargesSearchStatusScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.FpsPayEnrollFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.FpsPayScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.presentation.AutoPullsFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactInputScreenParams;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Collections;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class n1h implements k3h {
    public final /* synthetic */ int a;

    public /* synthetic */ n1h(int i, Object obj) {
        this.a = i;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        FragmentScreen fragmentScreen;
        int i = this.a;
        EmptyList emptyList = EmptyList.a;
        x0h x0hVar = x0h.a;
        switch (i) {
            case 0:
                if (baseDeeplinkAction instanceof DeeplinkAction.AccountDetails) {
                    return new v0h(Collections.singletonList(new FragmentScreen("AccountDetailsScreen", false, new AccountDetailsParams(((DeeplinkAction.AccountDetails) baseDeeplinkAction).getAgreementId()), TransitionPolicyType.NONE, qoi0.a(AccountDetailsFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 2, null)), null, 6);
                }
                return x0hVar;
            case 1:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.AddAccountForTopup)) {
                    return x0hVar;
                }
                TransferYbScreenArguments.Companion.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("TransferTargetScreen", false, new TransferYbScreenArguments(TransferType.ME2ME, false), TransitionPolicyType.POPUP, qoi0.a(TransferTargetsFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null)), null, 6);
            case 2:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.AutoTopup)) {
                    return x0hVar;
                }
                DeeplinkAction.AutoTopup autoTopup = (DeeplinkAction.AutoTopup) baseDeeplinkAction;
                return new v0h(Collections.singletonList(new FragmentScreen("AutoTopupSetupScreen", false, new AutoTopupSetupParams(autoTopup.getAutoTopupId(), autoTopup.getAgreementId(), autoTopup.getAutoTopupType(), autoTopup.getAmount(), autoTopup.getThreshold(), autoTopup.getSource(), autoTopup.getAutoTopupShowOnly()), null, qoi0.a(AutoTopupSetupFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            case 3:
                return baseDeeplinkAction instanceof DeeplinkAction.AutotopupRegular ? new v0h(Collections.singletonList(new FragmentScreen("AutoTopupRegularScreen", false, new AutoTopupRegularParams(((DeeplinkAction.AutotopupRegular) baseDeeplinkAction).getAgreementId()), null, qoi0.a(AutoTopupRegularFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6) : x0hVar;
            case 4:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.AutoTopupV2)) {
                    return x0hVar;
                }
                DeeplinkAction.AutoTopupV2 autoTopupV2 = (DeeplinkAction.AutoTopupV2) baseDeeplinkAction;
                return new v0h(Collections.singletonList(new FragmentScreen("AutoTopupSetupV2Screen", false, new AutoTopupSetupV2ScreenParams(autoTopupV2.getAutoTopupId(), autoTopupV2.getAgreementId(), autoTopupV2.getAmount(), autoTopupV2.getThreshold(), autoTopupV2.getSource(), autoTopupV2.getAutoTopupShowOnly(), autoTopupV2.getSetupAction(), autoTopupV2.getSetupSetting(), autoTopupV2.getLimit(), autoTopupV2.getAdditionalParams()), null, qoi0.a(AutoTopupSetupV2Fragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            case 5:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.AutopaymentTestPayment)) {
                    return x0hVar;
                }
                DeeplinkAction.AutopaymentTestPayment autopaymentTestPayment = (DeeplinkAction.AutopaymentTestPayment) baseDeeplinkAction;
                return new v0h(Collections.singletonList(new FragmentScreen("TestPayment", false, new TestPaymentArguments(new TestPaymentPayload.AutoPayment(autopaymentTestPayment.getAgreementId(), autopaymentTestPayment.getMemberId(), autopaymentTestPayment.getPaymentFlow())), null, qoi0.a(TestPaymentFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            case 6:
                return baseDeeplinkAction instanceof DeeplinkAction.AutotopupTestPayment ? new v0h(Collections.singletonList(new FragmentScreen("TestPayment", false, new TestPaymentArguments(new TestPaymentPayload.AutoTopup(((DeeplinkAction.AutotopupTestPayment) baseDeeplinkAction).getAgreementId())), null, qoi0.a(TestPaymentFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6) : x0hVar;
            case 7:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.BoostDeposit)) {
                    return x0hVar;
                }
                DeeplinkAction.BoostDeposit boostDeposit = (DeeplinkAction.BoostDeposit) baseDeeplinkAction;
                return new v0h(Collections.singletonList(tc9.b(new BoostDepositScreenParams(boostDeposit.getAgreementId(), boostDeposit.getScenario()))), null, 6);
            case 8:
                if (baseDeeplinkAction instanceof DeeplinkAction.BudgetInvoiceRequisites) {
                    return new v0h(Collections.singletonList(new FragmentScreen("BudgetChargesRequisitesFragment", false, new BudgetChargesRequisitesScreenParams(((DeeplinkAction.BudgetInvoiceRequisites) baseDeeplinkAction).getInvoiceId()), TransitionPolicyType.DEFAULT, qoi0.a(BudgetChargesRequisitesFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null)), null, 6);
                }
                return x0hVar;
            case 9:
                if (baseDeeplinkAction instanceof DeeplinkAction.BudgetChargesUinInput) {
                    return new v0h(Collections.singletonList(new FragmentScreen("BudgetChargesUinInputFragment", false, null, TransitionPolicyType.DEFAULT, qoi0.a(BudgetChargesUinInputFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null)), null, 6);
                }
                return x0hVar;
            case 10:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.BudgetChargesResolveUin)) {
                    return x0hVar;
                }
                DeeplinkAction.BudgetChargesResolveUin budgetChargesResolveUin = (DeeplinkAction.BudgetChargesResolveUin) baseDeeplinkAction;
                if (budgetChargesResolveUin instanceof DeeplinkAction.BudgetChargesResolveUin.ByUin) {
                    fragmentScreen = new FragmentScreen("BudgetChargesSearchFragment", false, new BudgetChargesSearchStatusScreenParams(((DeeplinkAction.BudgetChargesResolveUin.ByUin) budgetChargesResolveUin).getUin(), null), TransitionPolicyType.POPUP, qoi0.a(BudgetChargesSearchStatusFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null);
                } else {
                    if (!(budgetChargesResolveUin instanceof DeeplinkAction.BudgetChargesResolveUin.ByQrString)) {
                        w511.b();
                        return null;
                    }
                    fragmentScreen = new FragmentScreen("BudgetChargesSearchFragment", false, new BudgetChargesSearchStatusScreenParams(null, ((DeeplinkAction.BudgetChargesResolveUin.ByQrString) budgetChargesResolveUin).getQrString()), TransitionPolicyType.POPUP, qoi0.a(BudgetChargesSearchStatusFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null);
                }
                return new v0h(Collections.singletonList(fragmentScreen), null, 6);
            case 11:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CbdcCertIssue)) {
                    return x0hVar;
                }
                DeeplinkAction.CbdcCertIssue cbdcCertIssue = (DeeplinkAction.CbdcCertIssue) baseDeeplinkAction;
                cbdcCertIssue.getType();
                cbdcCertIssue.getApplicationId();
                cbdcCertIssue.getFullName();
                cbdcCertIssue.getSnils();
                return new v0h(emptyList, null, 6);
            case 12:
                return baseDeeplinkAction instanceof DeeplinkAction.CbdcDashboard ? new v0h(emptyList, null, 6) : x0hVar;
            case 13:
                return baseDeeplinkAction instanceof DeeplinkAction.CbdcDebug ? new v0h(emptyList, null, 6) : x0hVar;
            case 14:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CbdcRegistration)) {
                    return x0hVar;
                }
                ((DeeplinkAction.CbdcRegistration) baseDeeplinkAction).getApplicationId();
                return new v0h(emptyList, null, 6);
            case 15:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CbdcState)) {
                    return x0hVar;
                }
                ((DeeplinkAction.CbdcState) baseDeeplinkAction).getTarget();
                return new v0h(emptyList, null, 6);
            case 16:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.PaymentMethodsSheet)) {
                    return x0hVar;
                }
                DeeplinkAction.PaymentMethodsSheet paymentMethodsSheet = (DeeplinkAction.PaymentMethodsSheet) baseDeeplinkAction;
                return new v0h(Collections.singletonList(new FragmentScreen("ChangePaymentMethodScreen", false, new ChangePaymentMethodParameter(paymentMethodsSheet.getScenario(), paymentMethodsSheet.getSelectedPaymentMethod(), paymentMethodsSheet.getSuccessActions(), paymentMethodsSheet.getFailActions(), paymentMethodsSheet.getCancelActions(), paymentMethodsSheet.getAgreementId()), TransitionPolicyType.POPUP, qoi0.a(ChangePaymentMethodFragment.class), OpenScreenRequirement.WithUid.INSTANCE)), null, 6);
            case 17:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.ChooseAppIcon)) {
                    return x0hVar;
                }
                DeeplinkAction.ChooseAppIcon chooseAppIcon = (DeeplinkAction.ChooseAppIcon) baseDeeplinkAction;
                chooseAppIcon.getDivkit().getPath();
                chooseAppIcon.getDivkit().getSkeleton();
                chooseAppIcon.getDivkit().getScreen();
                chooseAppIcon.getDivkit().getScreenConfig();
                return new v0h(emptyList, null, 6);
            case 18:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CreditDeposit)) {
                    return x0hVar;
                }
                DeeplinkAction.CreditDeposit creditDeposit = (DeeplinkAction.CreditDeposit) baseDeeplinkAction;
                return new v0h(Collections.singletonList(tc9.b(new CreditDepositScreenParams(creditDeposit.getAgreementId(), creditDeposit.getScenario(), creditDeposit.getCreditType()))), null, 6);
            case 19:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CreditLimitDeposit)) {
                    return x0hVar;
                }
                DeeplinkAction.CreditLimitDeposit creditLimitDeposit = (DeeplinkAction.CreditLimitDeposit) baseDeeplinkAction;
                return new v0h(Collections.singletonList(tc9.b(new CreditLimitDepositScreenParams(creditLimitDeposit.getAgreementId(), creditLimitDeposit.getScenario()))), null, 6);
            case 20:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.FpsPay)) {
                    return x0hVar;
                }
                String tokenIntentId = ((DeeplinkAction.FpsPay) baseDeeplinkAction).getTokenIntentId();
                return new v0h(Collections.singletonList(new FragmentScreen("FpsPayEnrollScreen", false, new FpsPayScreenParams(tokenIntentId), TransitionPolicyType.DEFAULT, qoi0.a(FpsPayEnrollFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null)), null, 6);
            case 21:
                if (baseDeeplinkAction instanceof DeeplinkAction.FuturePayments) {
                    return new v0h(Collections.singletonList(new FragmentScreen("FuturePaymentsScreen", false, null, TransitionPolicyType.POPUP, qoi0.a(FuturePaymentsFragment.class), OpenScreenRequirement.WithYbSession.INSTANCE, 2, null)), null, 6);
                }
                return x0hVar;
            case 22:
                if (baseDeeplinkAction instanceof DeeplinkAction.InternetPayment) {
                    return new v0h(Collections.singletonList(new FragmentScreen("InternetPaymentSelectProviderFragment", false, new InternetPaymentSelectProviderScreenParams(false, ((DeeplinkAction.InternetPayment) baseDeeplinkAction).getAgreementId()), TransitionPolicyType.POPUP, qoi0.a(InternetPaymentSelectProviderFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null)), null, 6);
                }
                return x0hVar;
            case 23:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.InternetPaymentForm)) {
                    return x0hVar;
                }
                DeeplinkAction.InternetPaymentForm internetPaymentForm = (DeeplinkAction.InternetPaymentForm) baseDeeplinkAction;
                return new v0h(Collections.singletonList(a.b(new InternetPaymentFormInputScreenParams(internetPaymentForm.getProviderId(), false, internetPaymentForm.getPersonalAccount(), internetPaymentForm.getAgreementId()))), null, 6);
            case 24:
                return baseDeeplinkAction instanceof DeeplinkAction.Me2MeAutoPullList ? new v0h(Collections.singletonList(new FragmentScreen("AutoPullPermissionsScreen", false, null, TransitionPolicyType.DEFAULT, qoi0.a(AutoPullsFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 6, null)), null, 6) : x0hVar;
            case 25:
                if (baseDeeplinkAction instanceof DeeplinkAction.MerchantOffers) {
                    return new v0h(Collections.singletonList(new FragmentScreen("MerchantOffersScreen", false, null, TransitionPolicyType.NONE, qoi0.a(MerchantOffersFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 6, null)), null, 6);
                }
                return x0hVar;
            case 26:
                return baseDeeplinkAction instanceof DeeplinkAction.MerchantOffersSearch ? new v0h(Collections.singletonList(new FragmentScreen("MerchantOffersSearchScreen", false, null, null, qoi0.a(MerchantOffersSearchFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 14, null)), null, 6) : x0hVar;
            case 27:
                if (baseDeeplinkAction instanceof DeeplinkAction.Merchants) {
                    return new v0h(Collections.singletonList(new FragmentScreen("MerchantOffersScreen", false, null, TransitionPolicyType.NONE, qoi0.a(MerchantsFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 6, null)), null, 6);
                }
                return x0hVar;
            case 28:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.MkkDeposit)) {
                    return x0hVar;
                }
                DeeplinkAction.MkkDeposit mkkDeposit = (DeeplinkAction.MkkDeposit) baseDeeplinkAction;
                return new v0h(Collections.singletonList(tc9.b(new MkkDepositScreenParams(mkkDeposit.getAgreementId(), mkkDeposit.getScenario()))), null, 6);
            default:
                if (baseDeeplinkAction instanceof DeeplinkAction.MobilePayment) {
                    return new v0h(Collections.singletonList(new FragmentScreen("MobilePaymentSelectContactFragment", false, new MobilePaymentSelectContactInputScreenParams(((DeeplinkAction.MobilePayment) baseDeeplinkAction).getAgreementId()), TransitionPolicyType.POPUP, qoi0.a(MobilePaymentSelectContactFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null)), null, 6);
                }
                return x0hVar;
        }
    }
}
