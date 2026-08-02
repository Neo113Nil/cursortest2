package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class g9p0 implements zo31 {
    public final ConstraintLayout a;
    public final ButtonComponent b;
    public final RobotoTextView c;

    public g9p0(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, RobotoTextView robotoTextView) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
