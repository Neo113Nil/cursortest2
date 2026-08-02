package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;
import ru.yandex.taxi.widget.scroll.ShadowScrollIndicator;

/* loaded from: classes5.dex */
public final class pvi implements zo31 {
    public final ConstraintLayout a;
    public final GoImageView b;
    public final RecyclerView c;
    public final GoImageView d;
    public final ListItemComponent e;
    public final FrameLayout f;
    public final NestedScrollViewAdvanced g;
    public final ShadowScrollIndicator h;

    public pvi(ConstraintLayout constraintLayout, GoImageView goImageView, RecyclerView recyclerView, GoImageView goImageView2, ListItemComponent listItemComponent, FrameLayout frameLayout, NestedScrollViewAdvanced nestedScrollViewAdvanced, ShadowScrollIndicator shadowScrollIndicator) {
        this.a = constraintLayout;
        this.b = goImageView;
        this.c = recyclerView;
        this.d = goImageView2;
        this.e = listItemComponent;
        this.f = frameLayout;
        this.g = nestedScrollViewAdvanced;
        this.h = shadowScrollIndicator;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
