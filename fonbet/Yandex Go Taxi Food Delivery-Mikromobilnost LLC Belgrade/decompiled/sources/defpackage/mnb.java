package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final class mnb implements zo31 {
    public final GoLinearLayout a;
    public final GoConstraintLayout b;
    public final ListItemComponent c;

    public mnb(GoLinearLayout goLinearLayout, RecyclerView recyclerView, GoConstraintLayout goConstraintLayout, ListItemComponent listItemComponent) {
        this.a = goLinearLayout;
        this.b = goConstraintLayout;
        this.c = listItemComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
