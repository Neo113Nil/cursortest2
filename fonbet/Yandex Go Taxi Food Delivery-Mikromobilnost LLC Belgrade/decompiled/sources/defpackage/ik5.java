package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class ik5 implements zo31 {
    public final LinearLayout a;
    public final RobotoTextView b;
    public final RobotoTextView c;

    public ik5(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = linearLayout;
        this.b = robotoTextView;
        this.c = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
