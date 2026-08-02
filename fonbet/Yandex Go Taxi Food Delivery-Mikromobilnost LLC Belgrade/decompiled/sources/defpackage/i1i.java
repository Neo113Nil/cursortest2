package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class i1i implements zo31 {
    public final ConstraintLayout a;
    public final ButtonComponent b;
    public final RecyclerView c;
    public final ImageView d;
    public final ConstraintLayout e;
    public final ListItemSwitchComponent f;
    public final LinearLayout g;
    public final FrameLayout h;
    public final AnimatedListItemInputComponent i;
    public final RobotoTextView j;
    public final ListItemComponent k;

    public i1i(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, RecyclerView recyclerView, ImageView imageView, ConstraintLayout constraintLayout2, ListItemSwitchComponent listItemSwitchComponent, LinearLayout linearLayout, FrameLayout frameLayout, AnimatedListItemInputComponent animatedListItemInputComponent, RobotoTextView robotoTextView, ListItemComponent listItemComponent) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = recyclerView;
        this.d = imageView;
        this.e = constraintLayout2;
        this.f = listItemSwitchComponent;
        this.g = linearLayout;
        this.h = frameLayout;
        this.i = animatedListItemInputComponent;
        this.j = robotoTextView;
        this.k = listItemComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
