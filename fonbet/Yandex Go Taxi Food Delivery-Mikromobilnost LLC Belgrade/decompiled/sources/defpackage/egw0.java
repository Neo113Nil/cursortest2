package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.suggest.impl.view.error.a;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class egw0 extends a {
    public dna j;

    public egw0(ogw0 ogw0Var, gfw0 gfw0Var, u7r u7rVar, mfw0 mfw0Var, tse tseVar, pwy0 pwy0Var, swp0 swp0Var, f8v0 f8v0Var) {
        super(ogw0Var, gfw0Var, u7rVar, mfw0Var, tseVar, pwy0Var, swp0Var, f8v0Var);
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final void b() {
        GoConstraintLayout goConstraintLayout;
        dna dnaVar = this.j;
        if (dnaVar == null || (goConstraintLayout = (GoConstraintLayout) dnaVar.d) == null) {
            return;
        }
        OneShotPreDrawListener.add(goConstraintLayout, new ci(goConstraintLayout, 7));
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final void c(ThemeType themeType) {
        ((AppCompatTextView) m().f).setTextColor(qje.t(xng0.textMain, ((GoConstraintLayout) m().d).getContext()));
        xvy0.b((GoConstraintLayout) m().d, themeType, false, new c90(20));
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final ViewGroup d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(hkh0.superapp_suggest_error_normal_placeholder, viewGroup, false);
        int i = x7h0.content_container;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
        if (frameLayout != null) {
            i = x7h0.order_taxi_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = x7h0.reload_button;
                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent2 != null) {
                    i = x7h0.title;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
                    if (appCompatTextView != null) {
                        this.j = new dna((GoConstraintLayout) inflate, frameLayout, buttonComponent, buttonComponent2, appCompatTextView, 6);
                        ((ButtonComponent) m().e).setRippleColor(new bdc(xng0.controlPressed));
                        ((ButtonComponent) m().c).setRippleColor(new bdc(xng0.controlPressed));
                        Boolean bool = tp11.a;
                        tp11.b(3, (ButtonComponent) m().c);
                        return (GoConstraintLayout) m().d;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final void e() {
        this.j = null;
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final FrameLayout f() {
        return (FrameLayout) m().b;
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final void i() {
        final int i = 0;
        ((ButtonComponent) m().e).setDebounceClickListener(new Runnable(this) { // from class: dgw0
            public final /* synthetic */ egw0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                egw0 egw0Var = this.b;
                switch (i2) {
                    case 0:
                        egw0Var.h();
                        break;
                    default:
                        egw0Var.g();
                        break;
                }
            }
        });
        final int i2 = 1;
        ((ButtonComponent) m().c).setDebounceClickListener(new Runnable(this) { // from class: dgw0
            public final /* synthetic */ egw0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                egw0 egw0Var = this.b;
                switch (i22) {
                    case 0:
                        egw0Var.h();
                        break;
                    default:
                        egw0Var.g();
                        break;
                }
            }
        });
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final void j() {
        tje.k(80, (GoConstraintLayout) m().d);
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final void k() {
        ((ButtonComponent) m().e).setVisibility(0);
        ((ButtonComponent) m().c).setVisibility(0);
        ((ButtonComponent) m().e).setButtonBackground(new bdc(xng0.controlMinor));
        ((ButtonComponent) m().e).setButtonTitleColor(new bdc(xng0.textMain));
        Boolean bool = tp11.a;
        tp11.b(0, (ButtonComponent) m().e);
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final void l() {
        ((ButtonComponent) m().e).setVisibility(0);
        ((ButtonComponent) m().c).setVisibility(8);
        ((ButtonComponent) m().e).setButtonBackground(new bdc(xng0.controlMain));
        ((ButtonComponent) m().e).setButtonTitleColor(new bdc(xng0.textOnControl));
        Boolean bool = tp11.a;
        tp11.b(3, (ButtonComponent) m().e);
    }

    public final dna m() {
        dna dnaVar = this.j;
        if (dnaVar != null) {
            return dnaVar;
        }
        ny61.g("Required value was null.");
        return null;
    }
}
