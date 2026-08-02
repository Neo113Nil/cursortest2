package xsna;

import android.animation.ValueAnimator;
import com.vk.voip.ui.menu.ui.MainMenuView;

/* compiled from: VisibilitySwitcher.kt */
/* loaded from: classes7.dex */
public final class b5u0 implements qa9 {
    public final MainMenuView b;
    public final n59 c;
    public ValueAnimator d;
    public ym1 e;

    public b5u0(MainMenuView mainMenuView, n59 n59Var) {
        this.b = mainMenuView;
        this.c = n59Var;
    }

    @Override // xsna.qa9
    public final void a(float f) {
        this.b.setTranslationY((1 - f) * r0.getControlsHeight());
    }

    public final void b(float f) {
        ym1 ym1Var = this.e;
        if (ym1Var != null) {
            ym1Var.invoke(Float.valueOf(f));
        }
    }
}
