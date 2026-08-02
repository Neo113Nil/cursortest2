package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.address.clarification.impl.ui.utils.MaxHeightConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes5.dex */
public final class lr0 implements zo31 {
    public final MaxHeightConstraintLayout a;
    public final MaxHeightConstraintLayout b;
    public final RecyclerView c;
    public final ButtonComponent d;
    public final ListTitleComponent e;

    public lr0(MaxHeightConstraintLayout maxHeightConstraintLayout, MaxHeightConstraintLayout maxHeightConstraintLayout2, RecyclerView recyclerView, ButtonComponent buttonComponent, ListTitleComponent listTitleComponent) {
        this.a = maxHeightConstraintLayout;
        this.b = maxHeightConstraintLayout2;
        this.c = recyclerView;
        this.d = buttonComponent;
        this.e = listTitleComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
