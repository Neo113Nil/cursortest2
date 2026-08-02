package defpackage;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class bln0 implements zo31 {
    public final GoConstraintLayout a;
    public final GoImageView b;
    public final LottieAnimationView c;
    public final GoView d;
    public final GoView e;
    public final GoView f;
    public final RobotoTextView g;
    public final RobotoTextView h;

    public bln0(GoConstraintLayout goConstraintLayout, GoImageView goImageView, LottieAnimationView lottieAnimationView, GoView goView, GoView goView2, GoView goView3, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goConstraintLayout;
        this.b = goImageView;
        this.c = lottieAnimationView;
        this.d = goView;
        this.e = goView2;
        this.f = goView3;
        this.g = robotoTextView;
        this.h = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
