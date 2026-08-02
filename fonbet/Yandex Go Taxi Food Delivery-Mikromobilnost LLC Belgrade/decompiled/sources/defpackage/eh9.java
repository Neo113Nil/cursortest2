package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListTextComponent;

/* loaded from: classes15.dex */
public final class eh9 implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final ButtonComponent c;
    public final ListTextComponent d;
    public final ListHeaderComponent e;

    public eh9(LinearLayout linearLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, ListTextComponent listTextComponent, ListHeaderComponent listHeaderComponent) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = buttonComponent2;
        this.d = listTextComponent;
        this.e = listHeaderComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
