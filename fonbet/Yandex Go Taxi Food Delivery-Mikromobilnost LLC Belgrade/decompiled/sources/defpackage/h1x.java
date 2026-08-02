package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class h1x implements zo31 {
    public final LinearLayout a;
    public final RobotoTextView b;
    public final RobotoTextView c;

    public h1x(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = linearLayout;
        this.b = robotoTextView;
        this.c = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
