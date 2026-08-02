package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes5.dex */
public final class bp80 implements zo31 {
    public final LinearLayout a;
    public final ListItemComponent b;
    public final LinearLayout c;

    public bp80(LinearLayout linearLayout, ListItemComponent listItemComponent, LinearLayout linearLayout2) {
        this.a = linearLayout;
        this.b = listItemComponent;
        this.c = linearLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
