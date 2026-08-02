package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.go.taxi.order.driver.profile.view.aspectratio.AspectRatioImageView;
import com.yandex.go.taxi.order.driver.profile.view.fact.DriverFactsComponent;
import com.yandex.go.taxi.order.driver.profile.view.profile.DriverProfileModalView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RoundedCornersFrameLayout;

/* loaded from: classes14.dex */
public final class ejm implements zo31 {
    public final DriverProfileModalView a;
    public final RoundedCornersFrameLayout b;
    public final FrameLayout c;
    public final ListItemComponent d;
    public final ViewStub e;
    public final ImageView f;
    public final ButtonComponent g;
    public final ListItemComponent h;
    public final DriverFactsComponent i;
    public final ListItemComponent j;
    public final LinearLayout k;
    public final ListGroupHeaderComponent l;
    public final ListItemComponent m;
    public final FrameLayout n;
    public final AspectRatioImageView o;
    public final AspectRatioImageView p;
    public final ListItemComponent q;

    public ejm(DriverProfileModalView driverProfileModalView, RoundedCornersFrameLayout roundedCornersFrameLayout, FrameLayout frameLayout, ListItemComponent listItemComponent, ViewStub viewStub, ImageView imageView, ButtonComponent buttonComponent, ListItemComponent listItemComponent2, DriverFactsComponent driverFactsComponent, ListItemComponent listItemComponent3, LinearLayout linearLayout, ListGroupHeaderComponent listGroupHeaderComponent, ListItemComponent listItemComponent4, FrameLayout frameLayout2, AspectRatioImageView aspectRatioImageView, AspectRatioImageView aspectRatioImageView2, ListItemComponent listItemComponent5) {
        this.a = driverProfileModalView;
        this.b = roundedCornersFrameLayout;
        this.c = frameLayout;
        this.d = listItemComponent;
        this.e = viewStub;
        this.f = imageView;
        this.g = buttonComponent;
        this.h = listItemComponent2;
        this.i = driverFactsComponent;
        this.j = listItemComponent3;
        this.k = linearLayout;
        this.l = listGroupHeaderComponent;
        this.m = listItemComponent4;
        this.n = frameLayout2;
        this.o = aspectRatioImageView;
        this.p = aspectRatioImageView2;
        this.q = listItemComponent5;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
