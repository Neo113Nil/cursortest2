package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SingleShimmeringBar;

/* loaded from: classes12.dex */
public final class b1n implements zo31 {
    public final ConstraintLayout a;
    public final azm b;
    public final czm c;
    public final czm d;
    public final e0n e;
    public final ImageView f;
    public final qzm g;
    public final RobotoTextView h;
    public final SingleShimmeringBar i;

    public b1n(ConstraintLayout constraintLayout, azm azmVar, czm czmVar, czm czmVar2, e0n e0nVar, ImageView imageView, qzm qzmVar, RobotoTextView robotoTextView, SingleShimmeringBar singleShimmeringBar) {
        this.a = constraintLayout;
        this.b = azmVar;
        this.c = czmVar;
        this.d = czmVar2;
        this.e = e0nVar;
        this.f = imageView;
        this.g = qzmVar;
        this.h = robotoTextView;
        this.i = singleShimmeringBar;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
