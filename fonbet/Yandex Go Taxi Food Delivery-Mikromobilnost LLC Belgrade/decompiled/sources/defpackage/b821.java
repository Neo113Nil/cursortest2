package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class b821 implements zo31 {
    public final ConstraintLayout a;
    public final ButtonComponent b;
    public final AppCompatImageView c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public b821(AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, ButtonComponent buttonComponent, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = appCompatImageView;
        this.d = robotoTextView;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
