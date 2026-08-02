package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes12.dex */
public final class cvs implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final ButtonComponent c;
    public final GoLinearLayout d;
    public final RobotoTextView e;
    public final NestedScrollViewAdvanced f;
    public final GoFrameLayout g;

    public cvs(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, GoLinearLayout goLinearLayout2, RobotoTextView robotoTextView, NestedScrollViewAdvanced nestedScrollViewAdvanced, GoFrameLayout goFrameLayout) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = buttonComponent2;
        this.d = goLinearLayout2;
        this.e = robotoTextView;
        this.f = nestedScrollViewAdvanced;
        this.g = goFrameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
