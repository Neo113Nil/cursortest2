package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.Guideline;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardDriverSimpleSectionView;
import ru.yandex.taxi.widget.ShimmeringImageView;

/* loaded from: classes14.dex */
public final class a0y implements zo31 {
    public final RideCardDriverSimpleSectionView a;
    public final GoView b;
    public final ShimmeringImageView c;
    public final GoImageView d;
    public final Guideline e;

    public a0y(RideCardDriverSimpleSectionView rideCardDriverSimpleSectionView, GoView goView, ShimmeringImageView shimmeringImageView, GoImageView goImageView, Guideline guideline) {
        this.a = rideCardDriverSimpleSectionView;
        this.b = goView;
        this.c = shimmeringImageView;
        this.d = goImageView;
        this.e = guideline;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
