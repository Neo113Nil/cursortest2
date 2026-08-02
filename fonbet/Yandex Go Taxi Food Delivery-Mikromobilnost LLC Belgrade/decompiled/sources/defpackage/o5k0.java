package defpackage;

import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.rida.header.ui.RidaHeaderView;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes13.dex */
public final class o5k0 implements zo31 {
    public final RidaHeaderView a;
    public final Barrier b;
    public final GoImageView c;
    public final GoImageView d;
    public final PlaceholderView e;
    public final RobotoTextView f;
    public final ShimmeringRobotoTextView g;
    public final Space h;

    public o5k0(RidaHeaderView ridaHeaderView, Barrier barrier, GoImageView goImageView, GoImageView goImageView2, PlaceholderView placeholderView, RobotoTextView robotoTextView, ShimmeringRobotoTextView shimmeringRobotoTextView, Space space) {
        this.a = ridaHeaderView;
        this.b = barrier;
        this.c = goImageView;
        this.d = goImageView2;
        this.e = placeholderView;
        this.f = robotoTextView;
        this.g = shimmeringRobotoTextView;
        this.h = space;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
