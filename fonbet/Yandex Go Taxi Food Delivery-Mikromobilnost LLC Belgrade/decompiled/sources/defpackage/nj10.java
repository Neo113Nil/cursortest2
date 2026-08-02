package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.b;
import java.util.WeakHashMap;
import ru.yandex.taxi.settings.MainMenuButton;
import ru.yandex.taxi.settings.account.c;
import ru.yandex.taxi.settings.support.MenuBadge;
import ru.yandex.taxi.settings.support.g;

/* loaded from: classes10.dex */
public final class nj10 implements mj10 {
    public static final lj10 d = new lj10(63);
    public final Context a;
    public final l8w0 b;
    public final pj10 c;

    public nj10(Context context, l8w0 l8w0Var, pj10 pj10Var) {
        this.a = context;
        this.b = l8w0Var;
        this.c = pj10Var;
    }

    public final MenuBadge a(MainMenuButton mainMenuButton) {
        MenuBadge b = b(lj10.g);
        int dimensionPixelSize = mainMenuButton.getResources().getDimensionPixelSize(urg0.support_messages_badge_size);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 8388613;
        b.setLayoutParams(layoutParams);
        int i = neh0.setting_menu_frame;
        WeakHashMap weakHashMap = b.a;
        ((ViewGroup) ((View) rp31.d(mainMenuButton, i))).addView(b);
        return b;
    }

    public final MenuBadge b(lj10 lj10Var) {
        if (this.b.a()) {
            boolean z = lj10Var.a;
            boolean z2 = lj10Var.f;
            lj10 lj10Var2 = d;
            lj10Var = new lj10(z, lj10Var2.b, lj10Var2.c, lj10Var2.d, lj10Var2.e, z2);
        }
        zqj zqjVar = this.c.a;
        return new MenuBadge(this.a, new rj10(lj10Var, (as21) zqjVar.a.get(), (g) zqjVar.b.get(), (c) zqjVar.c.get()));
    }
}
