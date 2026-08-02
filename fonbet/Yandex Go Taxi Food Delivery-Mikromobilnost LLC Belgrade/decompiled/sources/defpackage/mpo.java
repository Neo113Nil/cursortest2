package defpackage;

import android.view.View;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.requirements.ui.ExpandingView;

/* loaded from: classes6.dex */
public final class mpo implements zo31 {
    public final ExpandingView a;
    public final ListItemCheckComponent b;
    public final ListItemComponent c;
    public final ListItemSwitchComponent d;

    public mpo(ExpandingView expandingView, ListItemCheckComponent listItemCheckComponent, ListItemComponent listItemComponent, ListItemSwitchComponent listItemSwitchComponent) {
        this.a = expandingView;
        this.b = listItemCheckComponent;
        this.c = listItemComponent;
        this.d = listItemSwitchComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
