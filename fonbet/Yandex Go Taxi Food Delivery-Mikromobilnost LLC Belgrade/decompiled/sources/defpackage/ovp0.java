package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class ovp0 implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final GoImageView c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public ovp0(GoImageView goImageView, GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = goImageView;
        this.d = robotoTextView;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
