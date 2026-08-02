package defpackage;

import android.view.View;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes5.dex */
public final class f1x implements zo31 {
    public final AutoDividerComponentList a;
    public final AutoDividerComponentList b;
    public final ListItemComponent c;
    public final ListItemComponent d;

    public f1x(AutoDividerComponentList autoDividerComponentList, AutoDividerComponentList autoDividerComponentList2, ListItemComponent listItemComponent, ListItemComponent listItemComponent2) {
        this.a = autoDividerComponentList;
        this.b = autoDividerComponentList2;
        this.c = listItemComponent;
        this.d = listItemComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
