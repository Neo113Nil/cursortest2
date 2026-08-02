package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class er1 implements zo31 {
    public final ConstraintLayout a;
    public final ButtonComponent b;
    public final RobotoTextView c;
    public final ImageView d;
    public final ButtonComponent e;
    public final RobotoTextView f;

    public er1(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, RobotoTextView robotoTextView, ImageView imageView, ButtonComponent buttonComponent2, RobotoTextView robotoTextView2) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = robotoTextView;
        this.d = imageView;
        this.e = buttonComponent2;
        this.f = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
