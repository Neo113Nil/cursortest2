package defpackage;

import com.yandex.go.preorder.mode.SourcePointMode;
import com.yandex.go.taxi.main.ShortcutsMainScreen;
import com.yandex.go.taxi.main.a;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.preorder.mainscreen.MainScreen;

/* loaded from: classes14.dex */
public final class ma00 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ ma00(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.getClass();
                MainScreen.MainScreenMode mainScreenMode = ((SourcePointMode) obj).u() ? MainScreen.MainScreenMode.TAXI_FUNCTIONALITY_DISABLED : MainScreen.MainScreenMode.DEFAULT;
                if (aVar.s) {
                    krl0 krl0Var = aVar.m;
                    ShortcutsMainScreen shortcutsMainScreen = krl0Var != null ? (ShortcutsMainScreen) krl0Var.a : null;
                    if (shortcutsMainScreen != null) {
                        shortcutsMainScreen.setMode(mainScreenMode);
                    }
                } else {
                    aVar.p.add(pwf0.e(oxf0.class, new tid(aVar, mainScreenMode, i2)));
                }
                return zy11Var;
            case 1:
                aVar.c().Qb(aVar.f, !((Boolean) obj).booleanValue());
                return zy11Var;
            case 2:
                jpv0 jpv0Var = (jpv0) obj;
                if (jpv0Var instanceof hpv0) {
                    krl0 krl0Var2 = aVar.m;
                    if (krl0Var2 != null) {
                        ((a3v) krl0Var2.b).Lc(MainScreen.class, null);
                    }
                    aVar.c().ta(((hpv0) jpv0Var).a.a);
                    return zy11Var;
                }
                if (!(jpv0Var instanceof fpv0)) {
                    w511.b();
                    return null;
                }
                krl0 krl0Var3 = aVar.m;
                if (krl0Var3 != null) {
                    a3v a3vVar = (a3v) krl0Var3.b;
                    ShortcutsMainScreen shortcutsMainScreen2 = (ShortcutsMainScreen) krl0Var3.a;
                    a3vVar.q3(MainScreen.class, 0, shortcutsMainScreen2.getTopContentHeight(), 0, shortcutsMainScreen2.getBottomContentHeight());
                }
                aVar.c().Wa();
                return zy11Var;
            default:
                bc60 bc60Var = (bc60) obj;
                if (jl40.l(bc60Var, yb60.a)) {
                    aVar.c();
                    return zy11Var;
                }
                if (jl40.l(bc60Var, zb60.a) || (bc60Var instanceof ac60)) {
                    aVar.c().fb();
                    return zy11Var;
                }
                w511.b();
                return null;
        }
    }
}
