package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes12.dex */
public final class bma implements zo31 {
    public final View a;
    public final ButtonComponent b;
    public final ButtonComponent c;
    public final View d;
    public final Group e;

    public bma(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, View view, Group group) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = buttonComponent2;
        this.d = view;
        this.e = group;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
