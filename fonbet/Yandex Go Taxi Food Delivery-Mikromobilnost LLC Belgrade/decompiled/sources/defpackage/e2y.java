package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardAiBubbleView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class e2y implements zo31 {
    public final RideCardAiBubbleView a;
    public final GoImageView b;
    public final GoImageView c;
    public final GoImageView d;
    public final GoImageView e;
    public final GoImageView f;
    public final RecyclerView g;
    public final RobotoTextView h;
    public final RobotoTextView i;

    public e2y(RideCardAiBubbleView rideCardAiBubbleView, GoImageView goImageView, GoImageView goImageView2, GoImageView goImageView3, GoImageView goImageView4, GoImageView goImageView5, RecyclerView recyclerView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = rideCardAiBubbleView;
        this.b = goImageView;
        this.c = goImageView2;
        this.d = goImageView3;
        this.e = goImageView4;
        this.f = goImageView5;
        this.g = recyclerView;
        this.h = robotoTextView;
        this.i = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
