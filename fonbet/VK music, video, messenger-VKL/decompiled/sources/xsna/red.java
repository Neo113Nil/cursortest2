package xsna;

import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;

/* compiled from: ClipUploadTitleItem.kt */
/* loaded from: classes17.dex */
public final class red {
    public static final void a(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(540338317);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(540338317, i2, -1, "com.vk.clips.upload.ui.impl.compose.views.ClipTitleItem (ClipUploadTitleItem.kt:11)");
            }
            com.vk.core.compose.component.group.header.g.b(f.a.a(str, null, null, null, null, null, null, null, false, M, (i2 & 14) | 805306368, 510), q630Var, b.c.a, null, null, null, false, M, (i2 & 112) | 384, 120);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new qed(str, q630Var, i, 0);
        }
    }
}
