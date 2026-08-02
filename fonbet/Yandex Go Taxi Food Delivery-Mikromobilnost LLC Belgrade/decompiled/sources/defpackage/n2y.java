package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.superapp.print_animation_text.PrintAnimationTextView;
import com.yandex.go.superapp.searchbar.impl.ui.searchbar.SuperappSearchbarButtonView;
import com.yandex.go.superapp.searchbar.impl.ui.searchbar.SuperappSearchbarView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class n2y implements zo31 {
    public final SuperappSearchbarView a;
    public final SuperappSearchbarButtonView b;
    public final GoLinearLayout c;
    public final GoLinearLayout d;
    public final RobotoTextView e;
    public final PrintAnimationTextView f;
    public final GoLinearLayout g;

    public n2y(SuperappSearchbarView superappSearchbarView, SuperappSearchbarButtonView superappSearchbarButtonView, GoLinearLayout goLinearLayout, GoLinearLayout goLinearLayout2, RobotoTextView robotoTextView, PrintAnimationTextView printAnimationTextView, GoLinearLayout goLinearLayout3) {
        this.a = superappSearchbarView;
        this.b = superappSearchbarButtonView;
        this.c = goLinearLayout;
        this.d = goLinearLayout2;
        this.e = robotoTextView;
        this.f = printAnimationTextView;
        this.g = goLinearLayout3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
