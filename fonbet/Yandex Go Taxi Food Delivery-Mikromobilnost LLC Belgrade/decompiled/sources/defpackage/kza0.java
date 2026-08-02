package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes12.dex */
public final class kza0 implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final ButtonComponent c;
    public final ListTitleComponent d;

    public kza0(LinearLayout linearLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, ListTitleComponent listTitleComponent) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = buttonComponent2;
        this.d = listTitleComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
