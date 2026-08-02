package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes12.dex */
public final class ndw implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final ListItemComponent c;
    public final ButtonComponent d;

    public ndw(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, ListItemComponent listItemComponent, ButtonComponent buttonComponent2) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = listItemComponent;
        this.d = buttonComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
