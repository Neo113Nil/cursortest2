package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class npt0 implements zo31 {
    public final GoFrameLayout a;
    public final RobotoTextView b;

    public npt0(GoFrameLayout goFrameLayout, RobotoTextView robotoTextView) {
        this.a = goFrameLayout;
        this.b = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
