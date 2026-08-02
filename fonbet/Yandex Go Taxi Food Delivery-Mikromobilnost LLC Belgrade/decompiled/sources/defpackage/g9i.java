package defpackage;

import android.view.View;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes5.dex */
public final class g9i implements zo31 {
    public final AutoDividerComponentList a;
    public final AutoDividerComponentList b;
    public final ListItemComponent c;

    public g9i(AutoDividerComponentList autoDividerComponentList, AutoDividerComponentList autoDividerComponentList2, ListItemComponent listItemComponent) {
        this.a = autoDividerComponentList;
        this.b = autoDividerComponentList2;
        this.c = listItemComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
