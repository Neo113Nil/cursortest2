package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes14.dex */
public final class ffw implements zo31 {
    public final FrameLayout a;
    public final View b;
    public final NestedScrollViewAdvanced c;
    public final ListHeaderComponent d;
    public final GoImageView e;
    public final FrameLayout f;
    public final LinearLayout g;
    public final PlaceholderView h;
    public final LinearLayout i;

    public ffw(FrameLayout frameLayout, View view, NestedScrollViewAdvanced nestedScrollViewAdvanced, ListHeaderComponent listHeaderComponent, GoImageView goImageView, FrameLayout frameLayout2, LinearLayout linearLayout, PlaceholderView placeholderView, LinearLayout linearLayout2) {
        this.a = frameLayout;
        this.b = view;
        this.c = nestedScrollViewAdvanced;
        this.d = listHeaderComponent;
        this.e = goImageView;
        this.f = frameLayout2;
        this.g = linearLayout;
        this.h = placeholderView;
        this.i = linearLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
