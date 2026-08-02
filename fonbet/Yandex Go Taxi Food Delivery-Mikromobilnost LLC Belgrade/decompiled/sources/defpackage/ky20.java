package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.taxi.design.DividerAwareComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.RoundedCornersImageView;

/* loaded from: classes6.dex */
public final class ky20 implements zo31 {
    public final LinearLayout a;
    public final RoundedCornersImageView b;
    public final AppCompatImageView c;
    public final RobotoTextView d;
    public final RobotoTextView e;
    public final DividerAwareComponent f;

    public ky20(LinearLayout linearLayout, RoundedCornersImageView roundedCornersImageView, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, DividerAwareComponent dividerAwareComponent) {
        this.a = linearLayout;
        this.b = roundedCornersImageView;
        this.c = appCompatImageView;
        this.d = robotoTextView;
        this.e = robotoTextView2;
        this.f = dividerAwareComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
