package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class dxc implements zo31 {
    public final GoLinearLayout a;
    public final RobotoTextView b;
    public final GoImageView c;

    public dxc(GoImageView goImageView, GoLinearLayout goLinearLayout, RobotoTextView robotoTextView) {
        this.a = goLinearLayout;
        this.b = robotoTextView;
        this.c = goImageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
