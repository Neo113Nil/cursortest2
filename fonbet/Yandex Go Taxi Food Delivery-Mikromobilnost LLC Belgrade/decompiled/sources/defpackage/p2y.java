package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class p2y implements zo31 {
    public final ConstraintLayout a;
    public final Group b;
    public final RobotoTextView c;
    public final ImageView d;
    public final Group e;
    public final RobotoTextView f;
    public final LinearLayout g;

    public p2y(ConstraintLayout constraintLayout, Group group, RobotoTextView robotoTextView, ImageView imageView, Group group2, RobotoTextView robotoTextView2, LinearLayout linearLayout) {
        this.a = constraintLayout;
        this.b = group;
        this.c = robotoTextView;
        this.d = imageView;
        this.e = group2;
        this.f = robotoTextView2;
        this.g = linearLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
