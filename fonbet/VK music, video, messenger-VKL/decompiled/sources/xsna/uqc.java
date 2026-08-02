package xsna;

import androidx.compose.runtime.a;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.common.Source;
import com.vk.ecomm.market.good.ui.restriction.ProductCardRestrictionViewState;
import com.vk.ecomm.market.good.ui.restriction.a;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.j5h;
import xsna.pox0;
import xsna.q630;
import xsna.y410;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class uqc implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uqc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                int intValue = ((Integer) obj).intValue();
                yg5 yg5Var = (yg5) obj2;
                if (epx.f(yg5Var.A().r1(), ((UIBlockVideo) obj4).B.r1())) {
                    ref$IntRef.element = intValue;
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((j5h.j) obj4).c((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj4;
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) obj3;
                List list = (List) obj;
                if (!((Boolean) obj2).booleanValue()) {
                    aVar.X0(j5g.t0(arrayList, list), Source.NETWORK, new vv7(4));
                    break;
                } else {
                    break;
                }
            case 3:
                ((Integer) obj2).getClass();
                ((cdi) obj4).g((znj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ProductCardRestrictionViewState productCardRestrictionViewState = (ProductCardRestrictionViewState) obj4;
                com.vk.ecomm.market.good.ui.restriction.a aVar2 = (com.vk.ecomm.market.good.ui.restriction.a) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1489864818, intValue2, -1, "com.vk.ecomm.market.good.ui.restriction.GoodFragmentRestrictionsBinderImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoodFragmentRestrictionsBinderImpl.kt:43)");
                    }
                    boolean y = aVar3.y(aVar2);
                    Object x = aVar3.x();
                    if (y || x == c0012a) {
                        a.C0948a c0948a = new a.C0948a(1, aVar2, com.vk.ecomm.market.good.ui.restriction.a.class, "onClickActionButton", "onClickActionButton(Lcom/vk/ecomm/market/good/ui/restriction/ProductCardRestrictionAction;)V", 0);
                        aVar3.R(c0948a);
                        x = c0948a;
                    }
                    izs izsVar = (izs) ((fcy) x);
                    boolean y2 = aVar3.y(aVar2);
                    Object x2 = aVar3.x();
                    if (y2 || x2 == c0012a) {
                        a.b bVar = new a.b(1, aVar2, com.vk.ecomm.market.good.ui.restriction.a.class, "onClickUrl", "onClickUrl(Ljava/lang/String;)V", 0);
                        aVar3.R(bVar);
                        x2 = bVar;
                    }
                    com.vk.ecomm.market.good.ui.restriction.d.a(productCardRestrictionViewState, izsVar, (izs) ((fcy) x2), null, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((tzy) obj4).a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                y410.a aVar4 = (y410.a) obj4;
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i2 = MarketItemReviewsFragment.w0;
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-374811508, intValue3, -1, "com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment.handleCreateReviewButton.<anonymous>.<anonymous> (MarketItemReviewsFragment.kt:462)");
                    }
                    if (epx.f(aVar4.a.a(), Boolean.TRUE)) {
                        aVar5.K(905413731);
                        q630 f = txj0.f(q630.a.a, 1.0f);
                        String string = marketItemReviewsFragment.getResources().getString(R.string.market_item_reviews_action_button_text);
                        ButtonSize buttonSize = ButtonSize.Large;
                        ButtonStyle buttonStyle = ButtonStyle.Primary;
                        ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                        boolean y3 = aVar5.y(marketItemReviewsFragment);
                        Object x3 = aVar5.x();
                        if (y3 || x3 == c0012a) {
                            x3 = new s1x(marketItemReviewsFragment, 5);
                            aVar5.R(x3);
                        }
                        bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance, f, null, false, false, null, null, null, string, null, null, null, null, false, null, null, null, aVar5, 28080, 0, 0, 4190176);
                    } else {
                        aVar5.K(884608918);
                    }
                    aVar5.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            default:
                anx0 anx0Var = (anx0) obj4;
                pox0.a aVar6 = (pox0.a) obj3;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(471529702, intValue4, -1, "com.vk.community.design.compose.widget.views.WidgetDonationView.ThemedContent.<anonymous> (WidgetDonationView.kt:29)");
                    }
                    fwn.a(aVar6, anx0Var.getOnOpenUrl(), aVar7, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ uqc(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
