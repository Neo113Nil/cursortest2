package xsna;

import androidx.compose.runtime.a;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import xsna.q630;

/* compiled from: HorizontalSlider.kt */
/* loaded from: classes3.dex */
public final class sfv {
    public static final void a(UIBlockList uIBlockList, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1316538568);
        int i2 = (M.J(uIBlockList) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1316538568, i2, -1, "com.vk.music.playlist.framework.presentation.catalog.HorizontalSlider (HorizontalSlider.kt:18)");
            }
            String str = uIBlockList.z;
            if (str == null) {
                str = "";
            }
            q630.a aVar2 = q630.a.a;
            nab0.a(str, ahn.E(aVar2, "horizontalListTitle"), null, M, 48, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 E = ahn.E(txj0.f(hr80.m(aVar2, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), 1.0f), "horizontalList");
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new iou(uIBlockList, 2);
                M.R(x);
            }
            lqy.b(E, null, null, null, null, null, false, null, (izs) x, M, 0, 510);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new phg(uIBlockList, i, 5);
        }
    }
}
