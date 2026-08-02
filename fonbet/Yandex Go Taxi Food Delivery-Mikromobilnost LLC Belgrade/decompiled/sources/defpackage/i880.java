package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class i880 implements zo31 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final View c;
    public final ListItemComponent d;
    public final ButtonComponent e;
    public final ButtonComponent f;
    public final RobotoTextView g;
    public final RobotoTextView h;

    public i880(ConstraintLayout constraintLayout, ImageView imageView, View view, ListItemComponent listItemComponent, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = view;
        this.d = listItemComponent;
        this.e = buttonComponent;
        this.f = buttonComponent2;
        this.g = robotoTextView;
        this.h = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
