package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class nk7 implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final ButtonComponent c;
    public final ListItemCheckComponent d;
    public final RobotoTextView e;
    public final RobotoTextView f;

    public nk7(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, ListItemCheckComponent listItemCheckComponent, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = buttonComponent2;
        this.d = listItemCheckComponent;
        this.e = robotoTextView;
        this.f = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
