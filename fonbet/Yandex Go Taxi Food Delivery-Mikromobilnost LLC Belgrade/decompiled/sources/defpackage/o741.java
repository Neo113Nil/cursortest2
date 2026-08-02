package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes5.dex */
public final class o741 implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final ListItemComponent c;

    public o741(LinearLayout linearLayout, ButtonComponent buttonComponent, ListItemComponent listItemComponent) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = listItemComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
