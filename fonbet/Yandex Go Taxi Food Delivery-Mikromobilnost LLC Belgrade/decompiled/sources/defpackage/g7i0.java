package defpackage;

import com.yandex.go.taxi.order.api.titles.OrderTitles$Alignment;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lg7i0;", "Ll050;", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface g7i0 extends l050 {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lg7i0$a;", "Lzxf0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a extends zxf0 {
        void Ic();

        void Q7(String str);

        void Y8(o2y0 o2y0Var);

        void openAfterFeedbackInfo(boolean z);

        void openCostCenter(o2y0 o2y0Var);

        void showOrderInfo();

        void w5(qim qimVar);
    }

    void hidePriceDetails();

    void renderButtonsState(x4j x4jVar);

    void renderCompleteButton(c5j c5jVar);

    void renderDriverPhoneButton(xim ximVar);

    void renderDriverSection(f6j f6jVar);

    void renderInfoState(t6j t6jVar);

    void renderPaymentState(v6j v6jVar);

    void renderPromoPlaquesBottomSection(List list, o2y0 o2y0Var);

    void renderPromoPlaquesTopSection(List list, o2y0 o2y0Var);

    void renderRideSupportState(oqk0 oqk0Var);

    void renderSectionDetail(t0q0 t0q0Var);

    void renderUpsell(d8j d8jVar);

    void reportButtonsVisibility();

    void setCostCenterState(n470 n470Var);

    void setFeedbackSectionBottomPadding(boolean z);

    void setSubtitleIsClickable(boolean z);

    void setTitles(b980 b980Var);

    void setTitlesAlignment(OrderTitles$Alignment orderTitles$Alignment);

    void showDriver(qim qimVar);

    void showPriceDetails(List list, boolean z);

    void showPriceMessage(String str);

    void showSubtitleNavigationIcon(boolean z);

    void showSupportChatButton(xkw0 xkw0Var);

    void switchTitlesContainer(boolean z);
}
