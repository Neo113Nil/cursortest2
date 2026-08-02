package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes12.dex */
public final class per0 implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final RobotoTextView c;
    public final NestedScrollViewAdvanced d;
    public final ButtonComponent e;
    public final RecyclerView f;
    public final GoFrameLayout g;
    public final GoFrameLayout h;

    public per0(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, RobotoTextView robotoTextView, NestedScrollViewAdvanced nestedScrollViewAdvanced, ButtonComponent buttonComponent2, RecyclerView recyclerView, GoFrameLayout goFrameLayout, GoFrameLayout goFrameLayout2) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = robotoTextView;
        this.d = nestedScrollViewAdvanced;
        this.e = buttonComponent2;
        this.f = recyclerView;
        this.g = goFrameLayout;
        this.h = goFrameLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
