package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.superapp.orders.card.OrderCardShimmeringView;
import com.yandex.go.superapp.orders.card.actions.OrderCardActionButtonsView;
import com.yandex.go.superapp.orders.card.bottom_sections.BottomSectionsView;
import com.yandex.go.superapp.orders.card.circle_buttons.CircleButtonsView;
import com.yandex.go.superapp.orders.card.header.OrderCardHeaderView;
import ru.yandex.taxi.design.RatingBarComponent;
import ru.yandex.taxi.order.view.walking_info.WalkingInfoView;

/* loaded from: classes14.dex */
public final class bm70 implements zo31 {
    public final OrderCardShimmeringView a;
    public final ho4 b;

    public bm70(OrderCardShimmeringView orderCardShimmeringView, OrderCardActionButtonsView orderCardActionButtonsView, BottomSectionsView bottomSectionsView, CircleButtonsView circleButtonsView, GoLinearLayout goLinearLayout, OrderCardHeaderView orderCardHeaderView, RatingBarComponent ratingBarComponent, l7n l7nVar, ho4 ho4Var, WalkingInfoView walkingInfoView) {
        this.a = orderCardShimmeringView;
        this.b = ho4Var;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
