package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class p9w implements zo31 {
    public final GoLinearLayout a;
    public final ListItemComponent b;
    public final ListItemComponent c;

    public p9w(GoLinearLayout goLinearLayout, FrameLayout frameLayout, ListItemComponent listItemComponent, ListItemComponent listItemComponent2) {
        this.a = goLinearLayout;
        this.b = listItemComponent;
        this.c = listItemComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
