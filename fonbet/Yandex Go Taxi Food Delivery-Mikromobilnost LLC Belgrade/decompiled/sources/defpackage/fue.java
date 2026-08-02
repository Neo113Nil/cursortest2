package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.payments.shared.business.accountcreation.corp.personalaccount.splash.CorpPersonalAccountSplashView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class fue implements zo31 {
    public final FrameLayout a;
    public final CorpPersonalAccountSplashView b;
    public final ConstraintLayout c;
    public final ButtonComponent d;
    public final ButtonComponent e;
    public final RobotoTextView f;
    public final RobotoTextView g;

    public fue(FrameLayout frameLayout, CorpPersonalAccountSplashView corpPersonalAccountSplashView, ConstraintLayout constraintLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = frameLayout;
        this.b = corpPersonalAccountSplashView;
        this.c = constraintLayout;
        this.d = buttonComponent;
        this.e = buttonComponent2;
        this.f = robotoTextView;
        this.g = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
