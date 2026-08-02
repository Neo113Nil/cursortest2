package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes13.dex */
public final class d4p0 implements zo31 {
    public final GoConstraintLayout a;
    public final RobotoTextView b;
    public final ListItemComponent c;
    public final ButtonComponent d;
    public final ShimmeringBar e;
    public final ShimmeringBar f;
    public final ListItemComponent g;

    public d4p0(GoConstraintLayout goConstraintLayout, RobotoTextView robotoTextView, ListItemComponent listItemComponent, ButtonComponent buttonComponent, ShimmeringBar shimmeringBar, ShimmeringBar shimmeringBar2, ListItemComponent listItemComponent2) {
        this.a = goConstraintLayout;
        this.b = robotoTextView;
        this.c = listItemComponent;
        this.d = buttonComponent;
        this.e = shimmeringBar;
        this.f = shimmeringBar2;
        this.g = listItemComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
