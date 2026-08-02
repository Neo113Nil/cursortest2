package defpackage;

import android.view.View;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class e1x implements zo31 {
    public final AutoDividerComponentList a;
    public final ListItemComponent b;
    public final ListItemComponent c;
    public final AutoDividerComponentList d;

    public e1x(AutoDividerComponentList autoDividerComponentList, AutoDividerComponentList autoDividerComponentList2, ListItemComponent listItemComponent, ListItemComponent listItemComponent2) {
        this.a = autoDividerComponentList;
        this.b = listItemComponent;
        this.c = listItemComponent2;
        this.d = autoDividerComponentList2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
