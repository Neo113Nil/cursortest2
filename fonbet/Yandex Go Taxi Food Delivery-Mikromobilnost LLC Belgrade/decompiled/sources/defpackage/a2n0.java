package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes6.dex */
public final class a2n0 implements zo31 {
    public final GoConstraintLayout a;
    public final ButtonComponent b;
    public final ButtonComponent c;

    public a2n0(GoConstraintLayout goConstraintLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2) {
        this.a = goConstraintLayout;
        this.b = buttonComponent;
        this.c = buttonComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
