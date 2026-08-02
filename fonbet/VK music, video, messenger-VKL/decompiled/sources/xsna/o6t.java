package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import com.vk.games.model.GamesCatalogScreenTab;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class o6t implements yzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o6t(wl20 wl20Var, e7k0 e7k0Var, g7k0 g7k0Var, rv5 rv5Var) {
        this.c = wl20Var;
        this.d = e7k0Var;
        this.e = g7k0Var;
        this.f = rv5Var;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                mc90 mc90Var = (mc90) this.c;
                View view = (View) this.e;
                yvj yvjVar = (yvj) this.f;
                mc90 mc90Var2 = (mc90) this.d;
                k1i0 k1i0Var = (k1i0) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(k1i0Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1157258989, intValue, -1, "com.vk.games.presentation.components.tab.GamesCatalogTabsRowLego.<anonymous> (GameCatalogTabsRowLego.kt:32)");
                    }
                    GamesCatalogScreenTab gamesCatalogScreenTab = GamesCatalogScreenTab.CATALOG;
                    boolean z = mc90Var.k() == gamesCatalogScreenTab.ordinal();
                    boolean y = aVar.y(view) | aVar.y(yvjVar) | aVar.J(mc90Var);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new eo2(view, yvjVar, mc90Var, 2);
                        aVar.R(x);
                    }
                    int i = (intValue & 14) | 48;
                    kha.a(k1i0Var, gamesCatalogScreenTab, z, (gzs) x, mc90Var2, aVar, i);
                    GamesCatalogScreenTab gamesCatalogScreenTab2 = GamesCatalogScreenTab.CATEGORIES;
                    boolean z2 = mc90Var.k() == gamesCatalogScreenTab2.ordinal();
                    boolean y2 = aVar.y(view) | aVar.y(yvjVar) | aVar.J(mc90Var);
                    Object x2 = aVar.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new yy0(view, yvjVar, mc90Var, 4);
                        aVar.R(x2);
                    }
                    kha.a(k1i0Var, gamesCatalogScreenTab2, z2, (gzs) x2, mc90Var2, aVar, i);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                wl20 wl20Var = (wl20) this.c;
                e7k0 e7k0Var = (e7k0) this.d;
                g7k0 g7k0Var = (g7k0) this.e;
                rv5 rv5Var = (rv5) this.f;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1384566939, intValue2, -1, "com.vk.core.compose.snackbar.VkSnackbarHost.<anonymous> (VkSnackbarHost.kt:175)");
                    }
                    okv0.b(wl20Var, null, e7k0Var, g7k0Var, rv5Var, aVar2, 0, 2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ o6t(mc90 mc90Var, View view, yvj yvjVar, mc90 mc90Var2) {
        this.c = mc90Var;
        this.e = view;
        this.f = yvjVar;
        this.d = mc90Var2;
    }
}
