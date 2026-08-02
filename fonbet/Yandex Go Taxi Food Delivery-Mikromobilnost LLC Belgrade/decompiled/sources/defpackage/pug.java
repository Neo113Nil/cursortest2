package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ListTextComponent;

/* loaded from: classes13.dex */
public final class pug implements zo31 {
    public final FrameLayout a;
    public final LinearLayout b;
    public final LinearLayout c;
    public final ListTextComponent d;
    public final ListHeaderComponent e;
    public final ListItemComponent f;
    public final ListItemSwitchComponent g;
    public final ButtonComponent h;
    public final ListItemComponent i;
    public final ButtonComponent j;
    public final ListItemComponent k;

    public pug(FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, ListTextComponent listTextComponent, ListHeaderComponent listHeaderComponent, ListItemComponent listItemComponent, ListItemSwitchComponent listItemSwitchComponent, ButtonComponent buttonComponent, ListItemComponent listItemComponent2, ButtonComponent buttonComponent2, ListItemComponent listItemComponent3) {
        this.a = frameLayout;
        this.b = linearLayout;
        this.c = linearLayout2;
        this.d = listTextComponent;
        this.e = listHeaderComponent;
        this.f = listItemComponent;
        this.g = listItemSwitchComponent;
        this.h = buttonComponent;
        this.i = listItemComponent2;
        this.j = buttonComponent2;
        this.k = listItemComponent3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
