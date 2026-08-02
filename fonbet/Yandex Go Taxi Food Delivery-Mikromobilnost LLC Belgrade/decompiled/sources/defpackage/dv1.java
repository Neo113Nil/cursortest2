package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class dv1 implements zo31 {
    public final /* synthetic */ int a;
    public final ConstraintLayout b;
    public final RobotoTextView c;
    public final RobotoTextView d;

    public /* synthetic */ dv1(ConstraintLayout constraintLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, int i) {
        this.a = i;
        this.b = constraintLayout;
        this.c = robotoTextView;
        this.d = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
