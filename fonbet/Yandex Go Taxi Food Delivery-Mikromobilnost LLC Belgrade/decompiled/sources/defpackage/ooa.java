package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.yandex.go.design.widget.qr.QrBackButtonComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class ooa implements zo31 {
    public final View a;
    public final ButtonComponent b;
    public final AppCompatImageButton c;
    public final Group d;
    public final QrBackButtonComponent e;
    public final RobotoTextView f;

    public ooa(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, AppCompatImageButton appCompatImageButton, Group group, QrBackButtonComponent qrBackButtonComponent, RobotoTextView robotoTextView) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = appCompatImageButton;
        this.d = group;
        this.e = qrBackButtonComponent;
        this.f = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
