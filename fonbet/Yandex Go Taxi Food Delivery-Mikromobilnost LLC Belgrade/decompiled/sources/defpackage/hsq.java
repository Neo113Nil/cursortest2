package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;

/* loaded from: classes14.dex */
public final class hsq implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final AnimatedListItemInputComponent c;
    public final ListHeaderComponent d;
    public final ButtonComponent e;

    public hsq(LinearLayout linearLayout, ButtonComponent buttonComponent, AnimatedListItemInputComponent animatedListItemInputComponent, ListHeaderComponent listHeaderComponent, ButtonComponent buttonComponent2) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = animatedListItemInputComponent;
        this.d = listHeaderComponent;
        this.e = buttonComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
