package defpackage;

import android.view.View;
import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferBottomComponent;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes12.dex */
public final class n7a implements zo31 {
    public final ChargersOfferBottomComponent a;
    public final ButtonComponent b;
    public final GoImageView c;
    public final RobotoTextView d;
    public final ShimmeringRobotoTextView e;
    public final ula f;
    public final ListItemComponent g;

    public n7a(ChargersOfferBottomComponent chargersOfferBottomComponent, ButtonComponent buttonComponent, GoImageView goImageView, RobotoTextView robotoTextView, ShimmeringRobotoTextView shimmeringRobotoTextView, ula ulaVar, ListItemComponent listItemComponent) {
        this.a = chargersOfferBottomComponent;
        this.b = buttonComponent;
        this.c = goImageView;
        this.d = robotoTextView;
        this.e = shimmeringRobotoTextView;
        this.f = ulaVar;
        this.g = listItemComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
