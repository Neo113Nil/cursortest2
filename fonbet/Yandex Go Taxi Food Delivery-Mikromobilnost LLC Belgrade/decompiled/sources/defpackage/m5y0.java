package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes14.dex */
public final class m5y0 implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final AppCompatImageView c;
    public final ListTextComponent d;
    public final ListTitleComponent e;

    public m5y0(LinearLayout linearLayout, ButtonComponent buttonComponent, AppCompatImageView appCompatImageView, ListTextComponent listTextComponent, ListTitleComponent listTitleComponent) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = appCompatImageView;
        this.d = listTextComponent;
        this.e = listTitleComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
