package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.SegmentedComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class oh7 implements zo31 {
    public final ConstraintLayout a;
    public final ButtonComponent b;
    public final Group c;
    public final RobotoTextView d;
    public final RobotoTextView e;
    public final Group f;
    public final ButtonComponent g;
    public final Group h;
    public final RecyclerView i;
    public final SegmentedComponent j;
    public final ButtonComponent k;
    public final ButtonComponent l;

    public oh7(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, Group group, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, Group group2, ButtonComponent buttonComponent2, Group group3, RecyclerView recyclerView, SegmentedComponent segmentedComponent, ButtonComponent buttonComponent3, ButtonComponent buttonComponent4) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = group;
        this.d = robotoTextView;
        this.e = robotoTextView2;
        this.f = group2;
        this.g = buttonComponent2;
        this.h = group3;
        this.i = recyclerView;
        this.j = segmentedComponent;
        this.k = buttonComponent3;
        this.l = buttonComponent4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
