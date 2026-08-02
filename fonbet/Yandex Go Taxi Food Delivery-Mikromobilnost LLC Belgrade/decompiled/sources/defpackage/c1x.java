package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.bubble.BubbleTextComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class c1x implements zo31 {
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final BubbleTextComponent c;
    public final RobotoTextView d;
    public final RobotoTextView e;
    public final ListItemComponent f;
    public final ConstraintLayout g;
    public final RobotoTextView h;

    public c1x(ConstraintLayout constraintLayout, FrameLayout frameLayout, BubbleTextComponent bubbleTextComponent, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ListItemComponent listItemComponent, ConstraintLayout constraintLayout2, RobotoTextView robotoTextView3) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = bubbleTextComponent;
        this.d = robotoTextView;
        this.e = robotoTextView2;
        this.f = listItemComponent;
        this.g = constraintLayout2;
        this.h = robotoTextView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
