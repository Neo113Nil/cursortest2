package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ListItemCheckComponent;

/* loaded from: classes12.dex */
public final class bvw0 implements zo31 {
    public final LinearLayout a;
    public final ListItemCheckComponent b;

    public bvw0(LinearLayout linearLayout, ListItemCheckComponent listItemCheckComponent) {
        this.a = linearLayout;
        this.b = listItemCheckComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
