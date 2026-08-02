package xsna;

import androidx.compose.runtime.a;

/* compiled from: ImageCropperOverlay.kt */
/* loaded from: classes5.dex */
public final class jiw {
    public static final void a(rek0 rek0Var, zhf0 zhf0Var, wzs wzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-456624355);
        if ((i & 6) == 0) {
            i2 = (M.J(rek0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(zhf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(wzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-456624355, i2, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.cropper.ImageCropperOverlay (ImageCropperOverlay.kt:16)");
            }
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new p21(rek0Var, wzsVar, zhf0Var, 1);
                M.R(x);
            }
            xa4.i((i2 >> 9) & 14, M, (izs) x, q630Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gu6(rek0Var, zhf0Var, wzsVar, q630Var, i);
        }
    }
}
