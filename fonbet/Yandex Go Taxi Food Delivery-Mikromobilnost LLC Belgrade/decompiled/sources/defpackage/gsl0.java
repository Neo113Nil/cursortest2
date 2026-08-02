package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class gsl0 implements zo31 {
    public final GoLinearLayout a;
    public final LinearLayout b;
    public final ImageView c;
    public final GoLinearLayout d;
    public final LinearLayout e;
    public final RobotoTextView f;

    public gsl0(GoLinearLayout goLinearLayout, LinearLayout linearLayout, ImageView imageView, GoLinearLayout goLinearLayout2, LinearLayout linearLayout2, RobotoTextView robotoTextView) {
        this.a = goLinearLayout;
        this.b = linearLayout;
        this.c = imageView;
        this.d = goLinearLayout2;
        this.e = linearLayout2;
        this.f = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
