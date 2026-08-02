package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class bna0 implements zo31 {
    public final GoLinearLayout a;
    public final AppCompatImageView b;
    public final GoLinearLayout c;
    public final RobotoTextView d;
    public final ButtonComponent e;
    public final GoView f;
    public final RobotoTextView g;
    public final RobotoTextView h;

    public bna0(GoLinearLayout goLinearLayout, AppCompatImageView appCompatImageView, GoLinearLayout goLinearLayout2, RobotoTextView robotoTextView, ButtonComponent buttonComponent, GoView goView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.a = goLinearLayout;
        this.b = appCompatImageView;
        this.c = goLinearLayout2;
        this.d = robotoTextView;
        this.e = buttonComponent;
        this.f = goView;
        this.g = robotoTextView2;
        this.h = robotoTextView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
