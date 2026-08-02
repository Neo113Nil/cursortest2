package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class h86 implements zo31 {
    public final GoLinearLayout a;
    public final RobotoTextView b;
    public final RobotoTextView c;

    public h86(GoLinearLayout goLinearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goLinearLayout;
        this.b = robotoTextView;
        this.c = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
