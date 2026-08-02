package defpackage;

import com.yandex.go.taxi.order.details.v1.style.OrderDetailsStyleState;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Ljxx0;", "Lk780;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface jxx0 extends k780 {
    void onButtonsInitialized();

    void renderBottomButtons(x4j x4jVar);

    void renderCancelButton(a5j a5jVar);

    void renderDetailsCardStyle(OrderDetailsStyleState orderDetailsStyleState);

    void renderDriverSection(f6j f6jVar);

    void renderPromoPlaquesBottomSection(List list, o2y0 o2y0Var);

    void renderPromoPlaquesTopSection(List list, o2y0 o2y0Var);

    void renderTopButtons(x4j x4jVar);

    void renderUpsell(d8j d8jVar);

    void setTitles(b980 b980Var);
}
