package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.unit.LayoutDirection;
import xsna.v4s;

/* compiled from: TextMeasurerHelper.kt */
/* loaded from: classes11.dex */
public final class xjo0 {
    public static final wjo0 a(int i, int i2, androidx.compose.runtime.a aVar) {
        boolean z = true;
        int i3 = (i2 & 1) != 0 ? 8 : 1;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1538166871, i, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:41)");
        }
        v4s.a aVar2 = (v4s.a) aVar.r(uvi.k);
        azl azlVar = (azl) aVar.r(uvi.h);
        LayoutDirection layoutDirection = (LayoutDirection) aVar.r(uvi.n);
        boolean J = aVar.J(aVar2) | aVar.J(azlVar) | aVar.o(layoutDirection.ordinal());
        if ((((i & 14) ^ 6) <= 4 || !aVar.o(i3)) && (i & 6) != 4) {
            z = false;
        }
        boolean z2 = J | z;
        Object x = aVar.x();
        if (z2 || x == a.C0011a.a) {
            x = new wjo0(aVar2, azlVar, layoutDirection, i3);
            aVar.R(x);
        }
        wjo0 wjo0Var = (wjo0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return wjo0Var;
    }
}
