package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;

/* loaded from: classes6.dex */
public final class nmn0 implements zo31 {
    public final GoLinearLayout a;
    public final ListItemInputComponent b;
    public final ButtonComponent c;

    public nmn0(GoLinearLayout goLinearLayout, ListItemInputComponent listItemInputComponent, ButtonComponent buttonComponent) {
        this.a = goLinearLayout;
        this.b = listItemInputComponent;
        this.c = buttonComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
