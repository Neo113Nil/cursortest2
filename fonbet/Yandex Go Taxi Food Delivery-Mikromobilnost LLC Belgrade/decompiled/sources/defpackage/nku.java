package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ToolbarComponent;

/* loaded from: classes5.dex */
public final class nku implements zo31 {
    public final ConstraintLayout a;
    public final ListTextComponent b;
    public final ListItemComponent c;
    public final ListItemComponent d;
    public final ListTextComponent e;
    public final ListTextComponent f;
    public final ToolbarComponent g;

    public nku(ConstraintLayout constraintLayout, ListTextComponent listTextComponent, ListItemComponent listItemComponent, ListItemComponent listItemComponent2, ListTextComponent listTextComponent2, ListTextComponent listTextComponent3, ToolbarComponent toolbarComponent) {
        this.a = constraintLayout;
        this.b = listTextComponent;
        this.c = listItemComponent;
        this.d = listItemComponent2;
        this.e = listTextComponent2;
        this.f = listTextComponent3;
        this.g = toolbarComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
