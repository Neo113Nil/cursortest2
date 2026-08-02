package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class eob0 implements zo31 {
    public final /* synthetic */ int a;
    public final ConstraintLayout b;
    public final ButtonComponent c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public /* synthetic */ eob0(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, int i) {
        this.a = i;
        this.b = constraintLayout;
        this.c = buttonComponent;
        this.d = robotoTextView;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
