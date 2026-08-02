package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class eto implements zo31 {
    public final GoConstraintLayout a;
    public final GoImageView b;
    public final View c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public eto(GoConstraintLayout goConstraintLayout, GoImageView goImageView, View view, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goConstraintLayout;
        this.b = goImageView;
        this.c = view;
        this.d = robotoTextView;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
