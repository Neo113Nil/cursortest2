package xsna;

import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import xsna.q630;

/* compiled from: ClipCardView.kt */
/* loaded from: classes2.dex */
public final class mmc {
    public static final void a(nmc nmcVar, q630 q630Var, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        PreviewViewState previewViewState = nmcVar.a;
        androidx.compose.runtime.a M = aVar.M(-1753395092);
        int i4 = (M.J(nmcVar) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (M.J(q630Var) ? 32 : 16);
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                q630Var = q630.a.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1753395092, i3, -1, "com.vk.libvideo.design.compose.video.clipcard.ClipCardView (ClipCardView.kt:32)");
            }
            previewViewState.h().c(PreviewViewState.Size.Clip9x16, M, 6);
            com.vk.libvideo.design.compose.base.preview.c.D(previewViewState, q630Var, M, i3 & 112, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ad2(nmcVar, q630Var2, i, i2, 1);
        }
    }
}
