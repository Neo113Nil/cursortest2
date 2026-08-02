package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class ard implements zo31 {
    public final CompositePaymentIconsView a;

    public ard(CompositePaymentIconsView compositePaymentIconsView, ImageView imageView, ImageView imageView2, ImageView imageView3, RobotoTextView robotoTextView) {
        this.a = compositePaymentIconsView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
