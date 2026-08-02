package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class fj1 implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final RobotoTextView c;
    public final ListHeaderComponent d;

    public fj1(LinearLayout linearLayout, ButtonComponent buttonComponent, RobotoTextView robotoTextView, ListHeaderComponent listHeaderComponent) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = robotoTextView;
        this.d = listHeaderComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
