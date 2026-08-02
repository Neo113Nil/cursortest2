package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class apj implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final AnimatedListItemInputComponent c;
    public final RobotoTextView d;

    public apj(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, AnimatedListItemInputComponent animatedListItemInputComponent, RobotoTextView robotoTextView) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = animatedListItemInputComponent;
        this.d = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
