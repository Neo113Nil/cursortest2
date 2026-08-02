package defpackage;

import android.view.View;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_selector.RideCardRatingSelectorView;
import ru.yandex.taxi.design.RatingBarComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class c0y implements zo31 {
    public final RideCardRatingSelectorView a;
    public final RatingBarComponent b;
    public final RobotoTextView c;

    public c0y(RideCardRatingSelectorView rideCardRatingSelectorView, RatingBarComponent ratingBarComponent, RobotoTextView robotoTextView) {
        this.a = rideCardRatingSelectorView;
        this.b = ratingBarComponent;
        this.c = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
