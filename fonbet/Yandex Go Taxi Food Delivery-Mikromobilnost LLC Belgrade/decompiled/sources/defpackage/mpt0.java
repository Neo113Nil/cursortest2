package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class mpt0 implements zo31 {
    public final GoFrameLayout a;
    public final RobotoTextView b;
    public final View c;
    public final GoFrameLayout d;

    public mpt0(GoFrameLayout goFrameLayout, RobotoTextView robotoTextView, View view, GoFrameLayout goFrameLayout2) {
        this.a = goFrameLayout;
        this.b = robotoTextView;
        this.c = view;
        this.d = goFrameLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
