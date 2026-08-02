package defpackage;

import android.view.View;
import android.widget.ImageView;
import ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.ComparisonItemView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class mvc implements zo31 {
    public final ComparisonItemView a;
    public final ImageView b;
    public final RobotoTextView c;
    public final RobotoTextView d;
    public final RobotoTextView e;
    public final RobotoTextView f;

    public mvc(ComparisonItemView comparisonItemView, ImageView imageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4) {
        this.a = comparisonItemView;
        this.b = imageView;
        this.c = robotoTextView;
        this.d = robotoTextView2;
        this.e = robotoTextView3;
        this.f = robotoTextView4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
