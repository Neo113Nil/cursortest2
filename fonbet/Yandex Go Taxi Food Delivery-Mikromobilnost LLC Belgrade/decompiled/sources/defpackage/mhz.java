package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class mhz implements zo31 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final RobotoTextView c;
    public final RobotoTextView d;

    public mhz(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = robotoTextView;
        this.d = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
