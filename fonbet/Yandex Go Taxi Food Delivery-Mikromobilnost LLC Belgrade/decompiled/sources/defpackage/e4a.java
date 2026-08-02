package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class e4a implements zo31 {
    public final GoFrameLayout a;
    public final RobotoTextView b;
    public final View c;

    public e4a(GoFrameLayout goFrameLayout, RobotoTextView robotoTextView, View view) {
        this.a = goFrameLayout;
        this.b = robotoTextView;
        this.c = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
