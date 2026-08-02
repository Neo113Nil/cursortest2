package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes6.dex */
public final class j1x implements zo31 {
    public final ShimmeringFrameLayout a;
    public final View b;
    public final View c;
    public final LinearLayout d;
    public final View e;
    public final View f;
    public final View g;

    public j1x(ShimmeringFrameLayout shimmeringFrameLayout, View view, View view2, LinearLayout linearLayout, View view3, View view4, View view5) {
        this.a = shimmeringFrameLayout;
        this.b = view;
        this.c = view2;
        this.d = linearLayout;
        this.e = view3;
        this.f = view4;
        this.g = view5;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
