package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes6.dex */
public final class pym0 implements zo31 {
    public final GoConstraintLayout a;
    public final ListItemComponent b;
    public final ButtonComponent c;
    public final RobotoTextView d;
    public final ShimmeringBar e;
    public final RobotoTextView f;

    public pym0(GoConstraintLayout goConstraintLayout, ListItemComponent listItemComponent, ButtonComponent buttonComponent, RobotoTextView robotoTextView, ShimmeringBar shimmeringBar, RobotoTextView robotoTextView2) {
        this.a = goConstraintLayout;
        this.b = listItemComponent;
        this.c = buttonComponent;
        this.d = robotoTextView;
        this.e = shimmeringBar;
        this.f = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
