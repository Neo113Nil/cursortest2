package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class aqz implements zo31 {
    public final ConstraintLayout a;
    public final RobotoTextView b;
    public final ImageView c;
    public final RobotoTextView d;

    public aqz(ConstraintLayout constraintLayout, RobotoTextView robotoTextView, ImageView imageView, RobotoTextView robotoTextView2) {
        this.a = constraintLayout;
        this.b = robotoTextView;
        this.c = imageView;
        this.d = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
