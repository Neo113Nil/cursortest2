package xsna;

import com.ironsource.X2;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;

/* compiled from: GeoRequestContent.kt */
/* loaded from: classes4.dex */
public final class zmt {
    public static final void a(izs<? super ymt, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(511462888);
        int i2 = (M.y(izsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(511462888, i2, -1, "com.vk.onboardingscreens.impl.georequest.presentation.view.GeoRequestContent (GeoRequestContent.kt:32)");
            }
            rrv0.d(null, null, null, null, kai.c(1202157197, new w61(izsVar, 6), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zu3(izsVar, i, 8);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1814290105);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1814290105, i2, -1, "com.vk.onboardingscreens.impl.georequest.presentation.view.SkipButton (GeoRequestContent.kt:96)");
            }
            int i3 = i2 << 6;
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Medium, ButtonStyle.Tertiary, ButtonAppearance.Accent, q630Var, null, false, false, null, null, null, str, null, null, null, null, true, null, null, null, aVar2, ((i2 >> 3) & 14) | X2.b.f | (57344 & i3), (i3 & 896) | 12582912, 0, 4059104);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new i87(i, 4, str, gzsVar, q630Var);
        }
    }
}
