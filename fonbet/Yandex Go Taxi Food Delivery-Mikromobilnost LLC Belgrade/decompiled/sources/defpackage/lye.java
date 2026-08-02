package defpackage;

import android.view.View;
import ru.yandex.taxi.order.view.CostDetailsView;
import ru.yandex.taxi.order.view.DotsView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class lye implements zo31 {
    public final CostDetailsView a;
    public final RobotoTextView b;
    public final DotsView c;
    public final RobotoTextView d;

    public lye(CostDetailsView costDetailsView, RobotoTextView robotoTextView, DotsView dotsView, RobotoTextView robotoTextView2) {
        this.a = costDetailsView;
        this.b = robotoTextView;
        this.c = dotsView;
        this.d = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
