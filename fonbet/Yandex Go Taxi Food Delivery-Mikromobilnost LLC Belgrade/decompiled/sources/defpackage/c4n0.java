package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class c4n0 implements zo31 {
    public final GoConstraintLayout a;
    public final ButtonComponent b;
    public final RobotoTextView c;
    public final ButtonComponent d;

    public c4n0(GoConstraintLayout goConstraintLayout, ButtonComponent buttonComponent, RobotoTextView robotoTextView, ButtonComponent buttonComponent2) {
        this.a = goConstraintLayout;
        this.b = buttonComponent;
        this.c = robotoTextView;
        this.d = buttonComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
