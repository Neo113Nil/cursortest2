package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.searchbar.impl.ui.searchbar.PlacesSearchbarView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class k1y implements zo31 {
    public final PlacesSearchbarView a;
    public final GoImageView b;
    public final GoLinearLayout c;
    public final GoImageView d;
    public final RobotoTextView e;

    public k1y(PlacesSearchbarView placesSearchbarView, GoImageView goImageView, GoLinearLayout goLinearLayout, GoImageView goImageView2, RobotoTextView robotoTextView) {
        this.a = placesSearchbarView;
        this.b = goImageView;
        this.c = goLinearLayout;
        this.d = goImageView2;
        this.e = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
