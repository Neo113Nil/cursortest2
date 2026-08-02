package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class ipm0 implements zo31 {
    public final GoConstraintLayout a;
    public final RobotoTextView b;
    public final GoImageView c;
    public final RobotoTextView d;

    public ipm0(GoConstraintLayout goConstraintLayout, GoImageView goImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goConstraintLayout;
        this.b = robotoTextView;
        this.c = goImageView;
        this.d = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
