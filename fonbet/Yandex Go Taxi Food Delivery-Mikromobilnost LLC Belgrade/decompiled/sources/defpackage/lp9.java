package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.yandex.go.design.view.GoConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class lp9 implements zo31 {
    public final GoConstraintLayout a;
    public final Group b;
    public final ListItemComponent c;
    public final ButtonComponent d;
    public final ListItemComponent e;
    public final RobotoTextView f;
    public final Group g;
    public final RobotoTextView h;

    public lp9(GoConstraintLayout goConstraintLayout, Group group, ListItemComponent listItemComponent, ButtonComponent buttonComponent, ListItemComponent listItemComponent2, RobotoTextView robotoTextView, Group group2, RobotoTextView robotoTextView2) {
        this.a = goConstraintLayout;
        this.b = group;
        this.c = listItemComponent;
        this.d = buttonComponent;
        this.e = listItemComponent2;
        this.f = robotoTextView;
        this.g = group2;
        this.h = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
