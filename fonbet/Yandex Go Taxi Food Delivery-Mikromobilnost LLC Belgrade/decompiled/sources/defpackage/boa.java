package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class boa implements zo31 {
    public final View a;
    public final ButtonComponent b;
    public final AppCompatImageButton c;
    public final RobotoTextView d;
    public final View e;
    public final ButtonComponent f;
    public final Group g;
    public final RobotoTextView h;
    public final KeyboardAwareRobotoEditText i;

    public boa(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, AppCompatImageButton appCompatImageButton, RobotoTextView robotoTextView, View view, ButtonComponent buttonComponent2, Group group, RobotoTextView robotoTextView2, KeyboardAwareRobotoEditText keyboardAwareRobotoEditText) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = appCompatImageButton;
        this.d = robotoTextView;
        this.e = view;
        this.f = buttonComponent2;
        this.g = group;
        this.h = robotoTextView2;
        this.i = keyboardAwareRobotoEditText;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
