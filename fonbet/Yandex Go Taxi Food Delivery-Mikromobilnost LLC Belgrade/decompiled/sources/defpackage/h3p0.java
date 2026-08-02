package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class h3p0 implements zo31 {
    public final GoConstraintLayout a;
    public final RobotoTextView b;
    public final RobotoTextView c;
    public final GoImageView d;
    public final RobotoTextView e;

    public h3p0(GoConstraintLayout goConstraintLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, GoImageView goImageView, RobotoTextView robotoTextView3) {
        this.a = goConstraintLayout;
        this.b = robotoTextView;
        this.c = robotoTextView2;
        this.d = goImageView;
        this.e = robotoTextView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
