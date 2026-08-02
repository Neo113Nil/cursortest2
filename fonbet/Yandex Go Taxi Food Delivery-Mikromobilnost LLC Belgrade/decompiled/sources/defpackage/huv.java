package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes5.dex */
public final class huv implements zo31 {
    public final LinearLayout a;
    public final ImageView b;
    public final ListTextComponent c;
    public final ButtonComponent d;
    public final ListTitleComponent e;

    public huv(LinearLayout linearLayout, ImageView imageView, ListTextComponent listTextComponent, ButtonComponent buttonComponent, ListTitleComponent listTitleComponent) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = listTextComponent;
        this.d = buttonComponent;
        this.e = listTitleComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
