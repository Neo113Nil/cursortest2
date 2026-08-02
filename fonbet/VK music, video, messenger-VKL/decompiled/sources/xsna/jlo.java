package xsna;

import androidx.compose.material.DrawerValue;
import androidx.compose.runtime.a;

/* compiled from: Drawer.kt */
/* loaded from: classes11.dex */
public final class jlo {
    public static final float a = 56;
    public static final float b = 400;
    public static final dtp0<Float> c = new dtp0<>(256, (huo) null, 6);

    public static final klo a(DrawerValue drawerValue, androidx.compose.runtime.a aVar) {
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            x = new y90(27);
            aVar.R(x);
        }
        izs izsVar = (izs) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1435874229, 6, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:390)");
        }
        Object[] objArr = new Object[0];
        fh9 fh9Var = new fh9(new uhd(3), new i50(izsVar, 27));
        boolean J = aVar.J(izsVar);
        Object x2 = aVar.x();
        if (J || x2 == c0012a) {
            x2 = new com.vk.catalog2.common.ui.holders.b(11, drawerValue, izsVar);
            aVar.R(x2);
        }
        klo kloVar = (klo) crx0.D(objArr, fh9Var, (gzs) x2, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return kloVar;
    }
}
