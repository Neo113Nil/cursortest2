package xsna;

import androidx.compose.runtime.a;
import java.util.concurrent.ConcurrentHashMap;
import xsna.q630;

/* compiled from: StickyPlayerBackground.kt */
/* loaded from: classes3.dex */
public final class rfl0 {
    public static final void a(final int i, final int i2, androidx.compose.runtime.a aVar, final jai jaiVar, q630 q630Var, boolean z) {
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-2112440957);
        int i3 = i | 6;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 54;
        } else if ((i & 48) == 0) {
            i3 |= M.l(z) ? 32 : 16;
        }
        int i5 = 1;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                z = false;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2112440957, i3, -1, "com.vk.music.stickyplayer.presentation.components.background.StickyPlayerBackground (StickyPlayerBackground.kt:45)");
            }
            ConcurrentHashMap concurrentHashMap = ofl0.k;
            int i6 = ((i3 >> 3) & 14) | 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1276643205, i6, -1, "com.vk.music.stickyplayer.presentation.components.background.StickyPlayerBackground.Companion.invoke (StickyPlayerBackground.kt:282)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                bdn bdnVar = bdn.a;
                x = bap.j(ie00.a.U(), M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new ofl0(yvjVar, z);
                M.R(x2);
            }
            ofl0 ofl0Var = (ofl0) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630.a aVar2 = q630.a.a;
            ofl0Var.f(txj0.d(aVar2, 1.0f), kai.c(93619323, new qku(i5, jaiVar, ofl0Var), M), M, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        final boolean z2 = z;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.qfl0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rfl0.a(ne7.I(i | 1), i2, (androidx.compose.runtime.a) obj, jaiVar, q630Var2, z2);
                    return s3q0.a;
                }
            };
        }
    }
}
