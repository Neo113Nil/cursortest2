package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class n6j0 implements zo31 {
    public final GoLinearLayout a;
    public final RobotoTextView b;
    public final ButtonComponent c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public n6j0(GoLinearLayout goLinearLayout, RobotoTextView robotoTextView, ButtonComponent buttonComponent, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.a = goLinearLayout;
        this.b = robotoTextView;
        this.c = buttonComponent;
        this.d = robotoTextView2;
        this.e = robotoTextView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
