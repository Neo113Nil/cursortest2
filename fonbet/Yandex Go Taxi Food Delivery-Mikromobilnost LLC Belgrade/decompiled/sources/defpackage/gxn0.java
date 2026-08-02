package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class gxn0 implements zo31 {
    public final GoConstraintLayout a;
    public final RobotoTextView b;
    public final ButtonComponent c;

    public gxn0(GoConstraintLayout goConstraintLayout, RobotoTextView robotoTextView, ButtonComponent buttonComponent) {
        this.a = goConstraintLayout;
        this.b = robotoTextView;
        this.c = buttonComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
