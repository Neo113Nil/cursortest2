package defpackage;

import android.view.View;
import com.yandex.go.superapp.plate_number.PlateNumberDividerView;
import com.yandex.go.superapp.plate_number.PlateNumberView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class l1y implements zo31 {
    public final PlateNumberView a;
    public final PlateNumberDividerView b;
    public final RobotoTextView c;
    public final RobotoTextView d;

    public l1y(PlateNumberView plateNumberView, PlateNumberDividerView plateNumberDividerView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = plateNumberView;
        this.b = plateNumberDividerView;
        this.c = robotoTextView;
        this.d = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
