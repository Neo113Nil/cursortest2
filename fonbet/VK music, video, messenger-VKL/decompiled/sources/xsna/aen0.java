package xsna;

import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: SuperAppWidgetShowcaseSectionScrollHolder.kt */
/* loaded from: classes6.dex */
public final class aen0 implements znj {
    public static final aen0 b = new aen0();

    @Override // xsna.znj
    public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
        znj znjVar2;
        androidx.compose.runtime.a M = aVar.M(-1529669212);
        int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1529669212, i2, -1, "com.vk.superapp.holders.SuperAppWidgetShowcaseSectionScrollHolder.showAdInfoContextMenu.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (SuperAppWidgetShowcaseSectionScrollHolder.kt:174)");
            }
            znjVar2 = znjVar;
            aou0.b(znjVar2, d370.N(R.string.ozon_context_menu_header, 0, M), ahn.E(q630.a.a, "test_tag_context_menu_header"), null, M, (i2 & 14) | 384, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            znjVar2 = znjVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fdc(this, znjVar2, i, 9);
        }
    }
}
