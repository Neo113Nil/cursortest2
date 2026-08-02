package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes14.dex */
public final class b0f0 implements zo31 {
    public final ConstraintLayout a;
    public final ButtonComponent b;
    public final ListItemComponent c;
    public final ListItemComponent d;
    public final ListHeaderComponent e;
    public final ImageView f;
    public final ShimmeringFrameLayout g;
    public final RobotoTextView h;
    public final ShimmeringFrameLayout i;

    public b0f0(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, ListItemComponent listItemComponent, ListItemComponent listItemComponent2, ListHeaderComponent listHeaderComponent, ImageView imageView, ShimmeringFrameLayout shimmeringFrameLayout, RobotoTextView robotoTextView, ShimmeringFrameLayout shimmeringFrameLayout2) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = listItemComponent;
        this.d = listItemComponent2;
        this.e = listHeaderComponent;
        this.f = imageView;
        this.g = shimmeringFrameLayout;
        this.h = robotoTextView;
        this.i = shimmeringFrameLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
