package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class n230 implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final RobotoTextView c;
    public final ImageView d;
    public final LinearLayout e;
    public final RobotoTextView f;

    public n230(LinearLayout linearLayout, ButtonComponent buttonComponent, RobotoTextView robotoTextView, ImageView imageView, LinearLayout linearLayout2, RobotoTextView robotoTextView2) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = robotoTextView;
        this.d = imageView;
        this.e = linearLayout2;
        this.f = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
