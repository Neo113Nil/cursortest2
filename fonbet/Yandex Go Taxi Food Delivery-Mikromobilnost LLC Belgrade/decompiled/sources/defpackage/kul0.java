package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.safety.center.safetycenter_web.ui.error.SafetyCenterWebErrorView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class kul0 implements zo31 {
    public final SafetyCenterWebErrorView a;
    public final GoImageView b;
    public final GoLinearLayout c;
    public final do5 d;
    public final GoView e;
    public final do5 f;
    public final ButtonComponent g;
    public final do5 h;
    public final RobotoTextView i;
    public final RobotoTextView j;
    public final GoImageView k;

    public kul0(SafetyCenterWebErrorView safetyCenterWebErrorView, GoImageView goImageView, GoLinearLayout goLinearLayout, do5 do5Var, GoView goView, do5 do5Var2, ButtonComponent buttonComponent, do5 do5Var3, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, GoImageView goImageView2) {
        this.a = safetyCenterWebErrorView;
        this.b = goImageView;
        this.c = goLinearLayout;
        this.d = do5Var;
        this.e = goView;
        this.f = do5Var2;
        this.g = buttonComponent;
        this.h = do5Var3;
        this.i = robotoTextView;
        this.j = robotoTextView2;
        this.k = goImageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
