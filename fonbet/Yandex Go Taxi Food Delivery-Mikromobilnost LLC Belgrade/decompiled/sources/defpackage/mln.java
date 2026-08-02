package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes14.dex */
public final class mln implements zo31 {
    public final FrameLayout a;
    public final AnimatedListItemInputComponent b;
    public final ButtonComponent c;

    public mln(FrameLayout frameLayout, AnimatedListItemInputComponent animatedListItemInputComponent, ButtonComponent buttonComponent) {
        this.a = frameLayout;
        this.b = animatedListItemInputComponent;
        this.c = buttonComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
