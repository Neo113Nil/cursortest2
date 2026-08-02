package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import java.util.List;
import xsna.q630;

/* compiled from: ImageGalleryDisplayModeCell.kt */
/* loaded from: classes18.dex */
public final class bjw {
    public static final void a(int i, androidx.compose.runtime.a aVar, List list, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(-530673622);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | (M.J(list != null ? new wow(list) : null) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-530673622, i2, -1, "com.vk.ecomm.design.compose.imagegallery.ImageGalleryDisplayModeCell (ImageGalleryDisplayModeCell.kt:31)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.j g = androidx.compose.foundation.layout.a.g(8);
            boolean z = ((((i2 & 896) ^ 384) > 256 && M.J(list)) || (i2 & 384) == 256) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new zf1(16, list, izsVar);
                M.R(x);
            }
            lqy.b(f, null, null, g, null, null, false, null, (izs) x, M, 24576, 494);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zle(i, list, izsVar, q630Var);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(877147001);
        int i2 = i | (M.J(str) ? 4 : 2) | 48 | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(877147001, i2, -1, "com.vk.ecomm.design.compose.imagegallery.ImageGalleryItemView (ImageGalleryDisplayModeCell.kt:50)");
            }
            q630.a aVar2 = q630.a.a;
            float f = 12;
            q630 d = rte0.d(txj0.s(aVar2, 59, 73), vog0.b(f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getImage().b, androidx.compose.ui.graphics.e.a);
            float f2 = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            fwu0.c(r18.a(f2, ylu0Var2.getImage().a, m, vog0.b(f)), str, null, null, null, null, null, kai.c(2064448072, new v1g(gzsVar, 1), M), M, ((i2 << 3) & 112) | 100663296, 252);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new br0(i, 8, str, q630Var2, gzsVar);
        }
    }
}
