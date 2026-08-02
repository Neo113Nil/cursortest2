package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes6.dex */
public final class m9n0 implements zo31 {
    public final GoConstraintLayout a;
    public final Guideline b;
    public final ButtonComponent c;
    public final Group d;
    public final Group e;
    public final ButtonComponent f;
    public final GoImageView g;

    public m9n0(GoConstraintLayout goConstraintLayout, Guideline guideline, ButtonComponent buttonComponent, Group group, Group group2, ButtonComponent buttonComponent2, GoImageView goImageView) {
        this.a = goConstraintLayout;
        this.b = guideline;
        this.c = buttonComponent;
        this.d = group;
        this.e = group2;
        this.f = buttonComponent2;
        this.g = goImageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
