package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.navigator.map_interactions.go_bottom_buttons.GoBottomButtonsLinearLayout;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class goz implements zo31 {
    public final GoLinearLayout a;
    public final ListItemComponent b;
    public final RobotoTextView c;
    public final LinearLayout d;
    public final GoBottomButtonsLinearLayout e;
    public final ListItemComponent f;
    public final LinearLayout g;
    public final RobotoTextView h;

    public goz(GoLinearLayout goLinearLayout, ListItemComponent listItemComponent, RobotoTextView robotoTextView, LinearLayout linearLayout, GoBottomButtonsLinearLayout goBottomButtonsLinearLayout, ListItemComponent listItemComponent2, LinearLayout linearLayout2, RobotoTextView robotoTextView2) {
        this.a = goLinearLayout;
        this.b = listItemComponent;
        this.c = robotoTextView;
        this.d = linearLayout;
        this.e = goBottomButtonsLinearLayout;
        this.f = listItemComponent2;
        this.g = linearLayout2;
        this.h = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
