package defpackage;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.superapp.searchbar.impl.ui.searchbar.SuperappSearchbarButtonView;

/* loaded from: classes14.dex */
public final class o2y implements zo31 {
    public final SuperappSearchbarButtonView a;
    public final GoImageView b;
    public final LottieAnimationView c;
    public final GoImageView d;

    public o2y(SuperappSearchbarButtonView superappSearchbarButtonView, GoImageView goImageView, LottieAnimationView lottieAnimationView, GoImageView goImageView2) {
        this.a = superappSearchbarButtonView;
        this.b = goImageView;
        this.c = lottieAnimationView;
        this.d = goImageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
