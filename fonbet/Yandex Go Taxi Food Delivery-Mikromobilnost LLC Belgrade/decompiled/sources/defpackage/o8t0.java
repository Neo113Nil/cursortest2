package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes13.dex */
public final class o8t0 implements zo31 {
    public final ConstraintLayout a;
    public final ButtonComponent b;
    public final ListTextComponent c;
    public final ListTitleComponent d;
    public final ListItemSwitchComponent e;
    public final View f;

    public o8t0(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, ListTextComponent listTextComponent, ListTitleComponent listTitleComponent, ListItemSwitchComponent listItemSwitchComponent, View view) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = listTextComponent;
        this.d = listTitleComponent;
        this.e = listItemSwitchComponent;
        this.f = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
