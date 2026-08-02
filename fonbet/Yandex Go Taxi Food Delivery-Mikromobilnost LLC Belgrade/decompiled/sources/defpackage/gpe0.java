package defpackage;

import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

/* loaded from: classes13.dex */
public final class gpe0 implements zo31 {
    public final ConstraintLayout a;
    public final CircularProgressBar b;
    public final Space c;
    public final RobotoTextView d;
    public final ButtonComponent e;

    public gpe0(ConstraintLayout constraintLayout, CircularProgressBar circularProgressBar, Space space, RobotoTextView robotoTextView, ButtonComponent buttonComponent) {
        this.a = constraintLayout;
        this.b = circularProgressBar;
        this.c = space;
        this.d = robotoTextView;
        this.e = buttonComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
