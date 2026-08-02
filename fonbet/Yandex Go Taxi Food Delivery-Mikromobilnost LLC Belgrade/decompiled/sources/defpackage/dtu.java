package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class dtu implements zo31 {
    public final GoLinearLayout a;
    public final ButtonsView b;
    public final RobotoTextView c;
    public final RobotoTextView d;
    public final GoImageView e;

    public dtu(GoLinearLayout goLinearLayout, ButtonsView buttonsView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, GoImageView goImageView) {
        this.a = goLinearLayout;
        this.b = buttonsView;
        this.c = robotoTextView;
        this.d = robotoTextView2;
        this.e = goImageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
