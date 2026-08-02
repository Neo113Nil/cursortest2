package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class huo implements zo31 {
    public final GoLinearLayout a;
    public final RobotoTextView b;
    public final ButtonComponent c;
    public final RobotoTextView d;
    public final AppCompatImageView e;

    public huo(GoLinearLayout goLinearLayout, RobotoTextView robotoTextView, ButtonComponent buttonComponent, RobotoTextView robotoTextView2, AppCompatImageView appCompatImageView) {
        this.a = goLinearLayout;
        this.b = robotoTextView;
        this.c = buttonComponent;
        this.d = robotoTextView2;
        this.e = appCompatImageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
