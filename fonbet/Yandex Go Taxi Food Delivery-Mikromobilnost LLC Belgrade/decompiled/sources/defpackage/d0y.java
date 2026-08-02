package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.taxi.order.details.v1.ui.CarPlateLayout;
import com.yandex.go.taxi.order.details.v1.ui.DriverSectionView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.ShimmeringImageView;

/* loaded from: classes14.dex */
public final class d0y implements zo31 {
    public final DriverSectionView a;
    public final View b;
    public final ShimmeringImageView c;
    public final AppCompatImageView d;
    public final ImageView e;
    public final CarPlateLayout f;
    public final ListItemComponent g;
    public final View h;

    public d0y(DriverSectionView driverSectionView, View view, ShimmeringImageView shimmeringImageView, AppCompatImageView appCompatImageView, ImageView imageView, CarPlateLayout carPlateLayout, ListItemComponent listItemComponent, View view2) {
        this.a = driverSectionView;
        this.b = view;
        this.c = shimmeringImageView;
        this.d = appCompatImageView;
        this.e = imageView;
        this.f = carPlateLayout;
        this.g = listItemComponent;
        this.h = view2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
