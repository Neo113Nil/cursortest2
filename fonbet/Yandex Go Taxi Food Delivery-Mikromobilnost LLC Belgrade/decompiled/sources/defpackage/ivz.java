package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.loyalty.impl.common.ui.tablet.LoyaltyTablet;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class ivz implements zo31 {
    public final LoyaltyTablet a;
    public final GoImageView b;
    public final RobotoTextView c;

    public ivz(LoyaltyTablet loyaltyTablet, GoImageView goImageView, RobotoTextView robotoTextView) {
        this.a = loyaltyTablet;
        this.b = goImageView;
        this.c = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
