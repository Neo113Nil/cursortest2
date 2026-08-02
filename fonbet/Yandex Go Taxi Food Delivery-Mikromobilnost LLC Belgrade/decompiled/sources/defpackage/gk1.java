package defpackage;

import android.view.View;
import com.yandex.go.agreement.simple.ui.AgreementModalView;
import com.yandex.go.promocodes.base.impl.ui.share.v1.PromocodeSharingView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardModalView;
import com.yandex.go.taxi.order.rate.RateView;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;
import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;
import ru.yandex.taxi.order.state.TaxiOnTheWayStateView;
import ru.yandex.taxi.preorder.tollroad.TollRoadModalView;

/* loaded from: classes3.dex */
public final /* synthetic */ class gk1 implements View.OnScrollChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gk1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        int i5 = this.a;
        Object obj = this.b;
        switch (i5) {
            case 0:
                AgreementModalView.enableScroll$lambda$0((AgreementModalView) obj, view, i, i2, i3, i4);
                break;
            case 1:
                CardDetailsFragment.getViewBinding$lambda$27$lambda$26((g661) obj, view, i, i2, i3, i4);
                break;
            case 2:
                IntercityDashboardModalView.updateScrollIndicator$lambda$0((IntercityDashboardModalView) obj, view, i, i2, i3, i4);
                break;
            case 3:
                MerchantOffersFragment.onScrollChangeListener$lambda$6((MerchantOffersFragment) obj, view, i, i2, i3, i4);
                break;
            case 4:
                ((PromocodeSharingView) obj).updateBottomViews();
                break;
            case 5:
                pag0 pag0Var = (pag0) obj;
                if (pag0Var.d) {
                    pag0Var.a();
                    break;
                }
                break;
            case 6:
                ((RateView) obj).onScrollChanged(i2);
                break;
            case 7:
                ((avo0) obj).a();
                break;
            case 8:
                ((qgr0) obj).a();
                break;
            case 9:
                ((TaxiOnTheWayStateView) obj).onScrollChanged(i2);
                break;
            default:
                TollRoadModalView.setupRootView$lambda$0((TollRoadModalView) obj, view, i, i2, i3, i4);
                break;
        }
    }
}
