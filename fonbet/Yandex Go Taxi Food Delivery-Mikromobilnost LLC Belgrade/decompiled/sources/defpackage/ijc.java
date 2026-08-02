package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class ijc implements zo31 {
    public final FrameLayout a;
    public final LinearLayout b;
    public final ImageView c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public ijc(FrameLayout frameLayout, LinearLayout linearLayout, ImageView imageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = frameLayout;
        this.b = linearLayout;
        this.c = imageView;
        this.d = robotoTextView;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
