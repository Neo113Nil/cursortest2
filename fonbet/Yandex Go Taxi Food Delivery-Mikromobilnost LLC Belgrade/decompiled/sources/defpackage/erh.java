package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class erh implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final LinearLayout c;
    public final ButtonComponent d;
    public final RobotoTextView e;
    public final RobotoTextView f;

    public erh(LinearLayout linearLayout, ButtonComponent buttonComponent, LinearLayout linearLayout2, ButtonComponent buttonComponent2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = linearLayout2;
        this.d = buttonComponent2;
        this.e = robotoTextView;
        this.f = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
