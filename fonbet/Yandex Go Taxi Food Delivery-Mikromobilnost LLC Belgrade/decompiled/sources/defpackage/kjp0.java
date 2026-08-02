package defpackage;

import android.view.View;
import com.yandex.go.places.searchbar.impl.ui.scroll_up.ScrollUpButtonView;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes14.dex */
public final class kjp0 {
    public final View a;
    public final int b;
    public final int c;

    public kjp0(ScrollUpButtonView scrollUpButtonView) {
        this.a = scrollUpButtonView;
        this.b = c.d(gug0.places_searchbar_size_collapsed, scrollUpButtonView);
        this.c = tje.r(gug0.places_searchbar_margin_horizontal_collapsed, scrollUpButtonView.getContext());
    }

    public void a(float f, uec0 uec0Var) {
        float f2;
        View view = this.a;
        int i = xw31.n(view.getContext()) ? -1 : 1;
        boolean l = jl40.l(uec0Var, tec0.a);
        int i2 = this.c;
        int i3 = this.b;
        if (l) {
            f2 = i * (-(i3 + i2)) * f;
        } else {
            if (!jl40.l(uec0Var, sec0.a)) {
                w511.b();
                return;
            }
            f2 = (i3 + i2) * i * (1.0f - f);
        }
        view.setTranslationX(f2);
    }

    public void b(float f, tdw0 tdw0Var) {
        float f2;
        View view = this.a;
        int i = xw31.n(view.getContext()) ? -1 : 1;
        boolean l = jl40.l(tdw0Var, sdw0.a);
        int i2 = this.c;
        int i3 = this.b;
        if (l) {
            f2 = i * (-(i3 + i2)) * f;
        } else {
            if (!jl40.l(tdw0Var, rdw0.a)) {
                w511.b();
                return;
            }
            f2 = (i3 + i2) * i * (1.0f - f);
        }
        view.setTranslationX(f2);
    }

    public kjp0(com.yandex.go.superapp.searchbar.impl.ui.scroll_up.ScrollUpButtonView scrollUpButtonView) {
        this.a = scrollUpButtonView;
        this.b = c.d(qug0.superapp_searchbar_size_collapsed, scrollUpButtonView);
        this.c = tje.r(qug0.superapp_searchbar_margin_horizontal_collapsed, scrollUpButtonView.getContext());
    }
}
