package defpackage;

import android.view.View;
import com.yandex.go.taxi.order.details.v1.ui.CarPlateDividerView;
import com.yandex.go.taxi.order.details.v1.ui.CarPlateLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class ozx implements zo31 {
    public final CarPlateLayout a;
    public final View b;
    public final CarPlateDividerView c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public ozx(CarPlateLayout carPlateLayout, View view, CarPlateDividerView carPlateDividerView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = carPlateLayout;
        this.b = view;
        this.c = carPlateDividerView;
        this.d = robotoTextView;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
