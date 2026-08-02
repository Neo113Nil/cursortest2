package xsna;

import com.vk.core.compose.component.defaults.TabMode;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: TabsSheet.kt */
/* loaded from: classes3.dex */
public final class otn0 extends psn0 {
    public final wh50 b;

    public otn0(String str) {
        this.b = androidx.compose.runtime.k.b(str);
    }

    @Override // xsna.psn0
    public final void a(TabMode tabMode, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-369916643);
        int i3 = i & 6;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-369916643, i2, -1, "com.vk.music.stickyplayer.presentation.components.TabTitle.Content (TabsSheet.kt:254)");
            }
            String str = (String) ((zak0) this.b).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, aVar3, ylu0Var.getText().d, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar2, ((i2 << 3) & 112) | 100663296, 48, 5880);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new me4(this, tabMode, i);
        }
    }
}
