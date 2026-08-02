package defpackage;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class noo0 implements zo31 {
    public final GoConstraintLayout a;
    public final GoFrameLayout b;
    public final RobotoTextView c;
    public final RobotoTextView d;
    public final GoImageView e;
    public final LottieAnimationView f;
    public final ButtonComponent g;
    public final RobotoTextView h;

    public noo0(GoConstraintLayout goConstraintLayout, GoFrameLayout goFrameLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, GoImageView goImageView, LottieAnimationView lottieAnimationView, ButtonComponent buttonComponent, RobotoTextView robotoTextView3) {
        this.a = goConstraintLayout;
        this.b = goFrameLayout;
        this.c = robotoTextView;
        this.d = robotoTextView2;
        this.e = goImageView;
        this.f = lottieAnimationView;
        this.g = buttonComponent;
        this.h = robotoTextView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
