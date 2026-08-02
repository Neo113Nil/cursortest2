package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class ema0 implements zo31 {
    public final GoFrameLayout a;
    public final GoLinearLayout b;
    public final AppCompatImageView c;
    public final RobotoTextView d;
    public final GoConstraintLayout e;
    public final GoFrameLayout f;
    public final ButtonComponent g;
    public final GoFrameLayout h;

    public ema0(GoFrameLayout goFrameLayout, GoLinearLayout goLinearLayout, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView, GoConstraintLayout goConstraintLayout, GoFrameLayout goFrameLayout2, GoFrameLayout goFrameLayout3, ButtonComponent buttonComponent, GoFrameLayout goFrameLayout4, ButtonComponent buttonComponent2, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.a = goFrameLayout;
        this.b = goLinearLayout;
        this.c = appCompatImageView;
        this.d = robotoTextView;
        this.e = goConstraintLayout;
        this.f = goFrameLayout3;
        this.g = buttonComponent;
        this.h = goFrameLayout4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
