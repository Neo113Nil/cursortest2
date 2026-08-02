package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class ayu implements zo31 {
    public final GoLinearLayout a;
    public final GoImageView b;
    public final RobotoTextView c;

    public ayu(GoImageView goImageView, GoLinearLayout goLinearLayout, RobotoTextView robotoTextView) {
        this.a = goLinearLayout;
        this.b = goImageView;
        this.c = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
