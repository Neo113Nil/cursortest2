package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class na70 implements zo31 {
    public final ConstraintLayout a;
    public final ButtonComponent b;
    public final RobotoTextView c;
    public final RobotoTextView d;
    public final ButtonComponent e;
    public final RobotoTextView f;

    public na70(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ButtonComponent buttonComponent2, RobotoTextView robotoTextView3) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = robotoTextView;
        this.d = robotoTextView2;
        this.e = buttonComponent2;
        this.f = robotoTextView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
