package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class bya implements zo31 {
    public final GoLinearLayout a;
    public final GoLinearLayout b;
    public final GoLinearLayout c;
    public final RobotoTextView d;
    public final RobotoTextView e;
    public final GoLinearLayout f;

    public bya(GoLinearLayout goLinearLayout, GoLinearLayout goLinearLayout2, GoLinearLayout goLinearLayout3, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, GoLinearLayout goLinearLayout4) {
        this.a = goLinearLayout;
        this.b = goLinearLayout2;
        this.c = goLinearLayout3;
        this.d = robotoTextView;
        this.e = robotoTextView2;
        this.f = goLinearLayout4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
