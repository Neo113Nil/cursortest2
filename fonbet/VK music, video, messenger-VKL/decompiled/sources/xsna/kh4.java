package xsna;

import androidx.compose.runtime.a;

/* compiled from: AudioBookLoading.kt */
/* loaded from: classes3.dex */
public final class kh4 {
    public static final void a(izs<? super gdn, s3q0> izsVar, wh50<Integer> wh50Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        wh50<Integer> wh50Var2;
        androidx.compose.runtime.a M = aVar.M(888477502);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(wh50Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(888477502, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.AudioBookLoading (AudioBookLoading.kt:12)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ih4(izsVar, 0);
                M.R(x);
            }
            wh50Var2 = wh50Var;
            u150.e((izs) x, wh50Var2, null, false, false, M, (i2 & 112) | 27648);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            wh50Var2 = wh50Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jh4(izsVar, wh50Var2, i, 0);
        }
    }
}
