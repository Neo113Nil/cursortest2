package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class fbv implements zo31 {
    public final LinearLayout a;
    public final ButtonsView b;
    public final ImageView c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public fbv(LinearLayout linearLayout, ButtonsView buttonsView, ImageView imageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = linearLayout;
        this.b = buttonsView;
        this.c = imageView;
        this.d = robotoTextView;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
