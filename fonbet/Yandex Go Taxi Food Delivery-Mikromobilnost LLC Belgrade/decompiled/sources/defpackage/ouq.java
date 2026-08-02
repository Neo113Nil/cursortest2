package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class ouq implements zo31 {
    public final LinearLayout a;
    public final ButtonsView b;
    public final GoImageView c;
    public final RobotoTextView d;
    public final ListTitleComponent e;

    public ouq(LinearLayout linearLayout, ButtonsView buttonsView, GoImageView goImageView, RobotoTextView robotoTextView, ListTitleComponent listTitleComponent) {
        this.a = linearLayout;
        this.b = buttonsView;
        this.c = goImageView;
        this.d = robotoTextView;
        this.e = listTitleComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
