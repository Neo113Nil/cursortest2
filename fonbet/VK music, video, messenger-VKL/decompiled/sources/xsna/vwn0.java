package xsna;

import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import xsna.q630;

/* compiled from: TabbarSuggestContent.kt */
/* loaded from: classes6.dex */
public final class vwn0 {
    public static final float a = PsExtractor.VIDEO_STREAM_MASK;

    public static final void a(e3n0 e3n0Var, pwn0 pwn0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1335148282);
        int i2 = (M.J(e3n0Var) ? 4 : 2) | i | (M.J(pwn0Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1335148282, i2, -1, "com.vk.tabbar.settings.impl.suggests.TabbarSuggestContent (TabbarSuggestContent.kt:37)");
            }
            float f = ((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            q630 d = txj0.d(q630.a.a, 1.0f);
            boolean z = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new mwm0(pwn0Var, 2);
                M.R(x2);
            }
            q630 b = ojc.b(d, sg50Var, null, false, null, (gzs) x2, 28);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new eni0(6);
                M.R(x3);
            }
            phv0.b(egi0.b(b, false, (izs) x3), null, null, null, null, 0, l5g.j, 0L, kai.c(1094295850, new za90(f, e3n0Var, pwn0Var), M), M, 817889280, 382);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ud6(e3n0Var, pwn0Var, i, 13);
        }
    }
}
