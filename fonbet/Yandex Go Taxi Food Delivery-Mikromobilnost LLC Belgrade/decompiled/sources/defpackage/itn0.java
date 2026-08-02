package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class itn0 implements zo31 {
    public final GoConstraintLayout a;
    public final Group b;
    public final ButtonComponent c;
    public final ListItemComponent d;
    public final ListItemComponent e;
    public final GoImageView f;
    public final ListItemSwitchComponent g;
    public final ButtonComponent h;
    public final ButtonComponent i;
    public final ListItemComponent j;
    public final RobotoTextView k;
    public final RobotoTextView l;
    public final Group m;
    public final ToolbarComponent n;

    public itn0(GoConstraintLayout goConstraintLayout, Group group, ButtonComponent buttonComponent, ListItemComponent listItemComponent, ListItemComponent listItemComponent2, GoImageView goImageView, ListItemSwitchComponent listItemSwitchComponent, ButtonComponent buttonComponent2, ButtonComponent buttonComponent3, ListItemComponent listItemComponent3, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, Group group2, ToolbarComponent toolbarComponent) {
        this.a = goConstraintLayout;
        this.b = group;
        this.c = buttonComponent;
        this.d = listItemComponent;
        this.e = listItemComponent2;
        this.f = goImageView;
        this.g = listItemSwitchComponent;
        this.h = buttonComponent2;
        this.i = buttonComponent3;
        this.j = listItemComponent3;
        this.k = robotoTextView;
        this.l = robotoTextView2;
        this.m = group2;
        this.n = toolbarComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
