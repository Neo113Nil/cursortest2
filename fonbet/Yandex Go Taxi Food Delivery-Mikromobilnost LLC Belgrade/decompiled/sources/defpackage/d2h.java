package defpackage;

import com.ybsdk.api.DepositType;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.merchant.offers.internal.screens.testSearch.MerchantOffersTestSearchFragment;
import com.ybsdk.feature.transfer.version2.api.TransferDirection;
import com.ybsdk.feature.transfer.version2.api.TransferMainScreenArguments;
import com.ybsdk.feature.transfer.version2.api.TransferPrerequisites;
import com.ybsdk.feature.transfer.version2.internal.screens.a;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TransfersDashboardFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TransfersDashboardScreenParams;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.notice.domain.entities.TopupValueEntity;
import com.ybsdk.screens.notice.presentation.TopupNoticeDeprecatedFragment;
import com.ybsdk.screens.notice.presentation.TopupNoticeFragment;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class d2h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public d2h(n2h n2hVar, b bVar, com.ybsdk.screens.notice.presentation.b bVar2, ju01 ju01Var) {
        this.a = 2;
        this.b = bVar;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        TransferPrerequisites.CommonTopup commonTopup;
        List singletonList;
        TransferPrerequisites.CommonTopup.AmountType amountType;
        int i = this.a;
        b bVar = this.b;
        x0h x0hVar = x0h.a;
        switch (i) {
            case 0:
                return ((baseDeeplinkAction instanceof DeeplinkAction.MerchantOffersTestSearch) && ((CommonFeatureFlag) bVar.d(wlp.e0).getData()).isEnabled()) ? new v0h(Collections.singletonList(new FragmentScreen("MerchantOffersTestSearchScreen", false, null, null, qoi0.a(MerchantOffersTestSearchFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 14, null)), null, 6) : x0hVar;
            case 1:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.QuickPay)) {
                    return x0hVar;
                }
                DeeplinkAction.QuickPay quickPay = (DeeplinkAction.QuickPay) baseDeeplinkAction;
                if (((CommonFeatureFlag) bVar.d(wlp.M).getData()).isEnabled()) {
                    sd90.l(quickPay.getDeeplink(), "source");
                }
                return new v0h(EmptyList.a, null, 6);
            case 2:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Topup)) {
                    return x0hVar;
                }
                DeeplinkAction.Topup topup = (DeeplinkAction.Topup) baseDeeplinkAction;
                DeeplinkAction.Topup.DepositAmount amount = topup.getAmount();
                TopupValueEntity topupValueEntity = (amount != null && ((CommonFeatureFlag) bVar.d(wlp.c).getData()).isEnabled() && topup.getDepositType() == DepositType.OrderAmount && !topup.getSuppressTopupNotice()) ? new TopupValueEntity(topup.getDepositType(), amount.getAmount(), amount.getCurrency()) : null;
                if (topupValueEntity != null) {
                    singletonList = ((CommonFeatureFlag) bVar.d(wlp.d).getData()).isEnabled() ? Collections.singletonList(new FragmentScreen("TopupNoticeScreen", false, new TopupNoticeFragment.Arguments(topupValueEntity, topup.getPaymentMethodId()), TransitionPolicyType.BOTTOM_UP, qoi0.a(TopupNoticeFragment.class), OpenScreenRequirement.WithoutRequirements.INSTANCE, 2, null)) : Collections.singletonList(new FragmentScreen("TopupNoticeDeprecatedScreen", false, new TopupNoticeDeprecatedFragment.Arguments(topupValueEntity), TransitionPolicyType.BOTTOM_UP, qoi0.a(TopupNoticeDeprecatedFragment.class), OpenScreenRequirement.WithoutRequirements.INSTANCE, 2, null));
                } else {
                    TransferDirection transferDirection = TransferDirection.TOPUP;
                    String agreementId = topup.getAgreementId();
                    DeeplinkAction.Topup.DepositAmount amount2 = topup.getAmount();
                    if (amount2 != null) {
                        int i2 = k1h.a[topup.getDepositType().ordinal()];
                        if (i2 == 1) {
                            amountType = TransferPrerequisites.CommonTopup.AmountType.EXPECTED;
                        } else {
                            if (i2 != 2) {
                                w511.b();
                                return null;
                            }
                            amountType = TransferPrerequisites.CommonTopup.AmountType.EXACT;
                        }
                        commonTopup = new TransferPrerequisites.CommonTopup(amount2.getAmount(), amount2.getCurrency(), amountType, topup.getSuggestAmounts(), topup.getSuggestBehaviour());
                    } else {
                        commonTopup = null;
                    }
                    singletonList = Collections.singletonList(a.f(new TransferMainScreenArguments(transferDirection, agreementId, commonTopup, null, topup.getOpenKycEds(), topup.getSelectMainAccountOnEnter(), null, null, null, null, null, 1984, null)));
                }
                return new v0h(singletonList, null, 6);
            default:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.TransfersDashboard)) {
                    return x0hVar;
                }
                DeeplinkAction.TransfersDashboard transfersDashboard = (DeeplinkAction.TransfersDashboard) baseDeeplinkAction;
                if (!((CommonFeatureFlag) bVar.d(wlp.H).getData()).isEnabled()) {
                    return x0hVar;
                }
                String origin = transfersDashboard.getOrigin();
                String agreementId2 = transfersDashboard.getAgreementId();
                String autopaymentId = transfersDashboard.getAutopaymentId();
                String tokenizationProductId = transfersDashboard.getTokenizationProductId();
                if (origin == null) {
                    origin = "TRANSFERS_DASHBOARD_TAB";
                }
                return new v0h(Collections.singletonList(new FragmentScreen("TransfersDashboardScreen", false, new TransfersDashboardScreenParams(origin, agreementId2, autopaymentId, tokenizationProductId), TransitionPolicyType.POPUP, qoi0.a(TransfersDashboardFragment.class), OpenScreenRequirement.WithYbSession.INSTANCE, 2, null)), null, 6);
        }
    }

    public /* synthetic */ d2h(b bVar, kcs kcsVar, int i) {
        this.a = i;
        this.b = bVar;
    }
}
