package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class pr0 implements zo31 {
    public final GoLinearLayout a;
    public final GoLinearLayout b;
    public final RobotoTextView c;
    public final RobotoTextView d;
    public final GoLinearLayout e;
    public final RobotoTextView f;
    public final RobotoTextView g;

    public pr0(GoLinearLayout goLinearLayout, GoLinearLayout goLinearLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, GoLinearLayout goLinearLayout3, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4) {
        this.a = goLinearLayout;
        this.b = goLinearLayout2;
        this.c = robotoTextView;
        this.d = robotoTextView2;
        this.e = goLinearLayout3;
        this.f = robotoTextView3;
        this.g = robotoTextView4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
