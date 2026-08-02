package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes13.dex */
public final class ddn0 implements zo31 {
    public final GoConstraintLayout a;
    public final ButtonComponent b;
    public final ListItemComponent c;
    public final ShimmeringBar d;
    public final RobotoTextView e;

    public ddn0(GoConstraintLayout goConstraintLayout, ButtonComponent buttonComponent, ListItemComponent listItemComponent, ShimmeringBar shimmeringBar, RobotoTextView robotoTextView) {
        this.a = goConstraintLayout;
        this.b = buttonComponent;
        this.c = listItemComponent;
        this.d = shimmeringBar;
        this.e = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
