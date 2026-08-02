package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.generated.VkColorToken;

/* compiled from: MediaView.kt */
/* loaded from: classes2.dex */
public final class n020 {
    public static final void a(q020 q020Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(127008444);
        if ((i & 6) == 0) {
            i2 = (M.J(q020Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(127008444, i2, -1, "com.vk.libvideo.design.compose.base.media.MediaImage (MediaView.kt:77)");
            }
            q630Var2 = q630Var;
            ua8.a(q630Var2, null, true, kai.c(1037264018, new cxu(q020Var, 2), M), M, ((i2 >> 3) & 14) | 3456, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ao1(q020Var, q630Var2, i, 2);
        }
    }

    public static final void b(q020 q020Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-644815418);
        int i2 = (M.J(q020Var) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-644815418, i2, -1, "com.vk.libvideo.design.compose.base.media.MediaView (MediaView.kt:50)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            M.K(-1192314877);
            pco pcoVar = q020Var.f;
            q630 d = pcoVar != null ? rte0.d(q630Var, vog0.b(pcoVar.b)) : q630Var;
            VkColorToken vkColorToken = q020Var.g;
            if (vkColorToken != null) {
                d = hr80.m(d, vkColorToken.a(0, M), androidx.compose.ui.graphics.e.a);
            }
            M.j();
            q630 a = eai.a(d, sg50Var, q020Var.b());
            if (q020Var.i) {
                M.K(1693221309);
                ckv0.a(a, null, lhi.a, M, 384, 2);
                M.j();
            } else {
                M.K(1693381982);
                a(q020Var, a, M, i2 & 14);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new e7c(q020Var, q630Var, i, 3);
        }
    }
}
