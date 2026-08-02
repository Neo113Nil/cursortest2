package defpackage;

import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.payments.yangopay.ui.YangoPayWidgetView;
import ru.yandex.taxi.design.CheckBoxComponent;
import ru.yandex.taxi.design.SwitchComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class cp51 implements zo31 {
    public final YangoPayWidgetView a;
    public final GridLayout b;
    public final CheckBoxComponent c;
    public final ImageView d;
    public final ConstraintLayout e;
    public final RobotoTextView f;
    public final SwitchComponent g;
    public final RobotoTextView h;
    public final ImageView i;
    public final RobotoTextView j;

    public cp51(YangoPayWidgetView yangoPayWidgetView, GridLayout gridLayout, CheckBoxComponent checkBoxComponent, ImageView imageView, ConstraintLayout constraintLayout, RobotoTextView robotoTextView, SwitchComponent switchComponent, RobotoTextView robotoTextView2, ImageView imageView2, RobotoTextView robotoTextView3) {
        this.a = yangoPayWidgetView;
        this.b = gridLayout;
        this.c = checkBoxComponent;
        this.d = imageView;
        this.e = constraintLayout;
        this.f = robotoTextView;
        this.g = switchComponent;
        this.h = robotoTextView2;
        this.i = imageView2;
        this.j = robotoTextView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
