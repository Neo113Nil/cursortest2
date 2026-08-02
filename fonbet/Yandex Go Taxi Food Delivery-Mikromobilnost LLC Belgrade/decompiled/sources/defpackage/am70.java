package defpackage;

import android.view.View;
import com.yandex.go.superapp.orders.card.circle_buttons.CircleButtonsView;
import ru.yandex.taxi.design.DividerWithColorView;
import ru.yandex.taxi.order.view.TopCircleButtonsView;

/* loaded from: classes14.dex */
public final class am70 implements zo31 {
    public final CircleButtonsView a;

    public am70(CircleButtonsView circleButtonsView, TopCircleButtonsView topCircleButtonsView, DividerWithColorView dividerWithColorView) {
        this.a = circleButtonsView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
