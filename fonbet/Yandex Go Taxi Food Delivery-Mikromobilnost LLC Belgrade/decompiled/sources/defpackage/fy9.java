package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class fy9 implements zo31 {
    public final GoLinearLayout a;
    public final GoImageView b;
    public final ButtonComponent c;
    public final ButtonComponent d;
    public final RobotoTextView e;
    public final RobotoTextView f;

    public fy9(GoLinearLayout goLinearLayout, GoImageView goImageView, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goLinearLayout;
        this.b = goImageView;
        this.c = buttonComponent;
        this.d = buttonComponent2;
        this.e = robotoTextView;
        this.f = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
