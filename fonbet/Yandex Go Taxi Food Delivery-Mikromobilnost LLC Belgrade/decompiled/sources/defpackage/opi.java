package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes5.dex */
public final class opi implements zo31 {
    public final LinearLayout a;
    public final ListItemComponent b;
    public final AutoDividerComponentList c;
    public final ListHeaderComponent d;

    public opi(LinearLayout linearLayout, ListItemComponent listItemComponent, AutoDividerComponentList autoDividerComponentList, ListHeaderComponent listHeaderComponent) {
        this.a = linearLayout;
        this.b = listItemComponent;
        this.c = autoDividerComponentList;
        this.d = listHeaderComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
