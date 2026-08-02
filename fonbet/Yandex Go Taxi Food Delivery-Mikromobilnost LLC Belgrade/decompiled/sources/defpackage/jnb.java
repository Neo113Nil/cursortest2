package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.ButtonsView;

/* loaded from: classes6.dex */
public final class jnb implements zo31 {
    public final GoLinearLayout a;
    public final GoLinearLayout b;
    public final ButtonsView c;

    public jnb(GoLinearLayout goLinearLayout, GoLinearLayout goLinearLayout2, ButtonsView buttonsView) {
        this.a = goLinearLayout;
        this.b = goLinearLayout2;
        this.c = buttonsView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
