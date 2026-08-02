package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ToolbarComponent;

/* loaded from: classes12.dex */
public final class ei3 implements zo31 {
    public final ConstraintLayout a;
    public final ButtonComponent b;
    public final ListItemComponent c;
    public final ListItemComponent d;
    public final ToolbarComponent e;

    public ei3(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, ListItemComponent listItemComponent, ListItemComponent listItemComponent2, ToolbarComponent toolbarComponent) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = listItemComponent;
        this.d = listItemComponent2;
        this.e = toolbarComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
