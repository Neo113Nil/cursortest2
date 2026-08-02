package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes6.dex */
public final class gz41 implements zo31 {
    public final ConstraintLayout a;
    public final RecyclerView b;
    public final ButtonComponent c;
    public final ListItemComponent d;
    public final ListTitleComponent e;

    public gz41(ConstraintLayout constraintLayout, RecyclerView recyclerView, ButtonComponent buttonComponent, ListItemComponent listItemComponent, ListTitleComponent listTitleComponent) {
        this.a = constraintLayout;
        this.b = recyclerView;
        this.c = buttonComponent;
        this.d = listItemComponent;
        this.e = listTitleComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
