package xsna;

import xsna.q630;

/* compiled from: RedesignCoverBlock.kt */
/* loaded from: classes3.dex */
public final class tkf0 {
    public static final void a(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1641015148);
        int i2 = (M.J(str) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1641015148, i2, -1, "com.vk.music.stickyplayer.presentation.redesignedcomponents.CoverBlock (RedesignCoverBlock.kt:17)");
            }
            q630.a aVar2 = q630.a.a;
            fwu0.c(sua.d(1.0f, txj0.f(aVar2, 0.65f), false), null, str == null ? "" : str, null, null, null, null, jki.a, M, 100663296, 250);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ljf(str, q630Var, i, 6);
        }
    }
}
