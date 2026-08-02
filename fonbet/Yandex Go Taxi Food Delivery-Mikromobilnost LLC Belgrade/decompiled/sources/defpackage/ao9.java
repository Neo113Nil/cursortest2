package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class ao9 implements zo31 {
    public final ConstraintLayout a;
    public final View b;
    public final ConstraintLayout c;
    public final GoConstraintLayout d;
    public final GoImageView e;
    public final RobotoTextView f;
    public final GoImageButton g;
    public final FrameLayout h;
    public final View i;

    public ao9(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, GoConstraintLayout goConstraintLayout, GoImageView goImageView, RobotoTextView robotoTextView, GoImageButton goImageButton, FrameLayout frameLayout, View view2) {
        this.a = constraintLayout;
        this.b = view;
        this.c = constraintLayout2;
        this.d = goConstraintLayout;
        this.e = goImageView;
        this.f = robotoTextView;
        this.g = goImageButton;
        this.h = frameLayout;
        this.i = view2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
