package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class chw implements zo31 {
    public final LinearLayout a;
    public final ListItemComponent b;
    public final ButtonComponent c;

    public chw(LinearLayout linearLayout, ButtonComponent buttonComponent, ListItemComponent listItemComponent) {
        this.a = linearLayout;
        this.b = listItemComponent;
        this.c = buttonComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
