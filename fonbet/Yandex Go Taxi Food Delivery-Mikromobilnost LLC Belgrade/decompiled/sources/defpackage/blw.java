package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class blw implements zo31 {
    public final GoLinearLayout a;
    public final RobotoTextView b;
    public final RobotoTextView c;

    public blw(GoLinearLayout goLinearLayout, FrameLayout frameLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goLinearLayout;
        this.b = robotoTextView;
        this.c = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
