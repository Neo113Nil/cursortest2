package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.yandex.go.mainscreen.superapp.orders.presentation.ui.swipeable.SwipeableTrackingCardDeferButtonView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class iyw0 implements zo31 {
    public final SwipeableTrackingCardDeferButtonView a;

    public iyw0(SwipeableTrackingCardDeferButtonView swipeableTrackingCardDeferButtonView, ImageView imageView, RobotoTextView robotoTextView) {
        this.a = swipeableTrackingCardDeferButtonView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
