package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes12.dex */
public final class p290 implements zo31 {
    public final ConstraintLayout a;
    public final GoImageView b;
    public final ButtonComponent c;
    public final ShimmeringRobotoTextView d;
    public final ShimmeringRobotoTextView e;
    public final ButtonComponent f;
    public final GoImageView g;

    public p290(ConstraintLayout constraintLayout, GoImageView goImageView, ButtonComponent buttonComponent, ShimmeringRobotoTextView shimmeringRobotoTextView, ShimmeringRobotoTextView shimmeringRobotoTextView2, ButtonComponent buttonComponent2, GoImageView goImageView2) {
        this.a = constraintLayout;
        this.b = goImageView;
        this.c = buttonComponent;
        this.d = shimmeringRobotoTextView;
        this.e = shimmeringRobotoTextView2;
        this.f = buttonComponent2;
        this.g = goImageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
