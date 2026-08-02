package defpackage;

import java.lang.ref.WeakReference;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.settings.MainMenuButton;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes10.dex */
public final class o500 implements nwy0 {
    public final ffe a;
    public final MainMenuButton b;
    public WeakReference c = new WeakReference(null);

    public o500(ffe ffeVar, MainMenuButton mainMenuButton) {
        this.a = ffeVar;
        this.b = mainMenuButton;
        tje.i(mainMenuButton, 48, new weu(5, this));
    }

    public final void a(a600 a600Var) {
        this.c = new WeakReference(a600Var);
        MainMenuButton mainMenuButton = this.b;
        mainMenuButton.clearAnimation();
        mainMenuButton.setAlpha(1.0f);
        if (a600Var == this.c.get()) {
            mainMenuButton.setEnabled(true);
        }
        boolean a = a600Var.a();
        WeakReference weakReference = this.c;
        if (a) {
            if (a600Var == weakReference.get()) {
                mainMenuButton.setVisibility(0);
            }
        } else if (a600Var == weakReference.get()) {
            mainMenuButton.setVisibility(4);
        }
        boolean h = a600Var.h();
        if (a600Var != this.c.get()) {
            return;
        }
        this.a.a(mainMenuButton, h ? ContentContainer$ZOrder.MAP : ContentContainer$ZOrder.CONTENT);
    }

    @Override // defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        this.b.applyTheme(themeType);
    }
}
