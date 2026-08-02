package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class mqz implements zo31 {
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final View c;
    public final FrameLayout d;
    public final ImageButton e;
    public final LottieAnimationView f;
    public final ProgressBar g;
    public final RecyclerView h;
    public final RobotoTextView i;
    public final ButtonComponent j;
    public final RobotoTextView k;

    public mqz(ConstraintLayout constraintLayout, FrameLayout frameLayout, View view, FrameLayout frameLayout2, ImageButton imageButton, LottieAnimationView lottieAnimationView, ProgressBar progressBar, RecyclerView recyclerView, RobotoTextView robotoTextView, ButtonComponent buttonComponent, RobotoTextView robotoTextView2) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = view;
        this.d = frameLayout2;
        this.e = imageButton;
        this.f = lottieAnimationView;
        this.g = progressBar;
        this.h = recyclerView;
        this.i = robotoTextView;
        this.j = buttonComponent;
        this.k = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
