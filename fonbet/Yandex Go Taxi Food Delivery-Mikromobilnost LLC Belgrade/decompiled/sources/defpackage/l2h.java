package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.transactions.api.TransactionsFeature$TransactionArgument;
import com.ybsdk.feature.transactions.api.entities.TransactionsFeedFilterEntity;
import com.ybsdk.feature.transactions.impl.ui.screens.feed.TransactionsFeedFragment;
import com.ybsdk.feature.transactions.impl.ui.screens.feed.TransactionsFeedScreenParams;
import com.ybsdk.feature.transactions.impl.ui.screens.list.TransactionsFragment;
import com.ybsdk.feature.transactions.impl.ui.screens.list.TransactionsParams;
import com.ybsdk.feature.transactions.impl.ui.screens.transaction.divkit.DivTransactionInfoFragment;
import com.ybsdk.feature.transactions.impl.ui.screens.transaction.divkit.DivTransactionScreenParams;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class l2h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ vf01 b;

    public /* synthetic */ l2h(vf01 vf01Var, int i) {
        this.a = i;
        this.b = vf01Var;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        vf01 vf01Var = this.b;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Transaction)) {
                    return x0hVar;
                }
                TransactionsFeature$TransactionArgument transactionsFeature$TransactionArgument = new TransactionsFeature$TransactionArgument(((DeeplinkAction.Transaction) baseDeeplinkAction).getId());
                vf01Var.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("DivTransactionInfoScreen", false, new DivTransactionScreenParams(transactionsFeature$TransactionArgument.getId()), null, qoi0.a(DivTransactionInfoFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null)), null, 6);
            case 1:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Transactions)) {
                    return x0hVar;
                }
                String agreementId = ((DeeplinkAction.Transactions) baseDeeplinkAction).getAgreementId();
                vf01Var.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("TransactionsScreen", false, new TransactionsParams(agreementId), null, qoi0.a(TransactionsFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null)), null, 6);
            default:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.TransactionsFeed)) {
                    return x0hVar;
                }
                DeeplinkAction.TransactionsFeed transactionsFeed = (DeeplinkAction.TransactionsFeed) baseDeeplinkAction;
                DeeplinkAction.TransactionsFeed.Filter filter = transactionsFeed.getFilter();
                TransactionsFeedFilterEntity transactionsFeedFilterEntity = filter != null ? new TransactionsFeedFilterEntity(filter.getProduct(), filter.getAgreementId(), filter.getHeaderStyle(), filter.getFiltersStyle()) : null;
                boolean showTabbar = transactionsFeed.getShowTabbar();
                boolean hideFilters = transactionsFeed.getHideFilters();
                bdp0 bdp0Var = vf01Var.b;
                TransactionsFeedScreenParams transactionsFeedScreenParams = new TransactionsFeedScreenParams(transactionsFeedFilterEntity, showTabbar, hideFilters);
                bdp0Var.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("TransactionsFeedScreen", false, transactionsFeedScreenParams, transactionsFeedScreenParams.getShowTabbar() ? TransitionPolicyType.NONE : TransitionPolicyType.DEFAULT, qoi0.a(TransactionsFeedFragment.class), OpenScreenRequirement.WithBuidOrBankSessionNotRegisteredUser.INSTANCE, 2, null)), null, 6);
        }
    }
}
