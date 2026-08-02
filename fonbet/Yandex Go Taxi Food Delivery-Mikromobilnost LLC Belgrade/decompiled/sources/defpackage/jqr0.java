package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class jqr0 implements zo31 {
    public final View a;
    public final ConstraintLayout b;
    public final RecyclerView c;
    public final ListGroupHeaderComponent d;
    public final ListGroupHeaderComponent e;
    public final ListItemComponent f;
    public final ListItemComponent g;
    public final RobotoTextView h;

    public jqr0(ViewGroup viewGroup, ConstraintLayout constraintLayout, RecyclerView recyclerView, ListGroupHeaderComponent listGroupHeaderComponent, ListGroupHeaderComponent listGroupHeaderComponent2, ListItemComponent listItemComponent, ListItemComponent listItemComponent2, RobotoTextView robotoTextView) {
        this.a = viewGroup;
        this.b = constraintLayout;
        this.c = recyclerView;
        this.d = listGroupHeaderComponent;
        this.e = listGroupHeaderComponent2;
        this.f = listItemComponent;
        this.g = listItemComponent2;
        this.h = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
