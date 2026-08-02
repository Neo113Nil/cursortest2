package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class mw1 implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final ButtonComponent c;
    public final RobotoTextView d;

    public mw1(LinearLayout linearLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, RobotoTextView robotoTextView) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = buttonComponent2;
        this.d = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
