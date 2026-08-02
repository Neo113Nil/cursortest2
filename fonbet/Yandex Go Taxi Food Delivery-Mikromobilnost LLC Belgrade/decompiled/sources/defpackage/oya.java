package defpackage;

import android.view.View;
import com.yandex.go.chargers.station.presentation.details.components.ChargersTermsPlateView;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class oya implements zo31 {
    public final ChargersTermsPlateView a;
    public final BadgeView b;
    public final RobotoTextView c;
    public final GoImageView d;
    public final GoImageView e;

    public oya(ChargersTermsPlateView chargersTermsPlateView, BadgeView badgeView, RobotoTextView robotoTextView, GoImageView goImageView, GoImageView goImageView2) {
        this.a = chargersTermsPlateView;
        this.b = badgeView;
        this.c = robotoTextView;
        this.d = goImageView;
        this.e = goImageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
