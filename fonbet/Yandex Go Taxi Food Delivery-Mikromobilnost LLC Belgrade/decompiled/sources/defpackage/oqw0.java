package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class oqw0 implements zo31 {
    public final ConstraintLayout a;
    public final RobotoTextView b;
    public final RobotoTextView c;
    public final AppCompatImageView d;
    public final RobotoTextView e;

    public oqw0(ConstraintLayout constraintLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView3) {
        this.a = constraintLayout;
        this.b = robotoTextView;
        this.c = robotoTextView2;
        this.d = appCompatImageView;
        this.e = robotoTextView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
