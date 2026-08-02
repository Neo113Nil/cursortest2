package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class aj40 implements zo31 {
    public final ConstraintLayout a;
    public final RobotoTextView b;
    public final GoImageView c;
    public final RobotoTextView d;
    public final RobotoTextView e;
    public final RobotoTextView f;

    public aj40(ConstraintLayout constraintLayout, RobotoTextView robotoTextView, GoImageView goImageView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4) {
        this.a = constraintLayout;
        this.b = robotoTextView;
        this.c = goImageView;
        this.d = robotoTextView2;
        this.e = robotoTextView3;
        this.f = robotoTextView4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
