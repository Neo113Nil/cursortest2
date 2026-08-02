package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class c28 implements zo31 {
    public final RelativeLayout a;
    public final RobotoTextView b;
    public final ScrollView c;
    public final RobotoTextView d;
    public final RobotoTextView e;
    public final ButtonComponent f;
    public final RelativeLayout g;
    public final RobotoTextView h;
    public final RobotoTextView i;
    public final RobotoTextView j;

    public c28(RelativeLayout relativeLayout, RobotoTextView robotoTextView, ScrollView scrollView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, ButtonComponent buttonComponent, RelativeLayout relativeLayout2, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5, RobotoTextView robotoTextView6) {
        this.a = relativeLayout;
        this.b = robotoTextView;
        this.c = scrollView;
        this.d = robotoTextView2;
        this.e = robotoTextView3;
        this.f = buttonComponent;
        this.g = relativeLayout2;
        this.h = robotoTextView4;
        this.i = robotoTextView5;
        this.j = robotoTextView6;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
