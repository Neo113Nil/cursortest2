package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.jdh0;
import xsna.q630;

/* compiled from: Screen.kt */
/* loaded from: classes7.dex */
public final class jch0 {
    public static final void a(c4p0 c4p0Var, izs izsVar, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-293298590);
        if ((i & 6) == 0) {
            i2 = (M.J(c4p0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i & 384;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(jaiVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-293298590, i2, -1, "com.vk.video.ui.upload.impl.coverchoose.presentation.compose.screen.Screen (Screen.kt:84)");
            }
            aVar2 = M;
            phv0.b(txj0.d(aVar3, 1.0f), kai.c(-320208151, new vue(4, c4p0Var, izsVar), M), null, null, null, 0, 0L, 0L, kai.c(-1396307266, new fch0(0, jaiVar), M), aVar2, 805306416, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new rz5(c4p0Var, izsVar, jaiVar, i);
        }
    }

    public static final void b(jdh0.a aVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(1262472692);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1262472692, i2, -1, "com.vk.video.ui.upload.impl.coverchoose.presentation.compose.screen.ScreenLoaded (Screen.kt:51)");
            }
            a(aVar.b, izsVar, kai.c(703529976, new o21(8, aVar, izsVar), M), M, (i2 & 112) | 3456);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tnc(i, 7, aVar, izsVar, q630Var2);
        }
    }

    public static final void c(jdh0.b bVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1835201516);
        int i2 = (M.J(bVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1835201516, i3, -1, "com.vk.video.ui.upload.impl.coverchoose.presentation.compose.screen.ScreenLoading (Screen.kt:28)");
            }
            a(bVar.b, izsVar, rki.a, M, (i3 & 112) | 3456);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q5v(bVar, izsVar, q630Var2, i, 4);
        }
    }
}
