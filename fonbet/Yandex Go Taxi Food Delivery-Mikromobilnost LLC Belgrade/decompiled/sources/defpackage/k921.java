package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes12.dex */
public final class k921 implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final ListTextComponent c;
    public final ListTitleComponent d;

    public k921(LinearLayout linearLayout, ButtonComponent buttonComponent, ListTextComponent listTextComponent, ListTitleComponent listTitleComponent) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = listTextComponent;
        this.d = listTitleComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
