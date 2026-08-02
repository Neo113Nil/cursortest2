package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class b2j implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final ListItemComponent c;
    public final GoImageView d;
    public final RobotoTextView e;
    public final RobotoTextView f;

    public b2j(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, ListItemComponent listItemComponent, GoImageView goImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = listItemComponent;
        this.d = goImageView;
        this.e = robotoTextView;
        this.f = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
