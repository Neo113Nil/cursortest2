package xsna;

import com.vk.core.compose.component.banner.Banner$BackgroundMode;
import xsna.d16;
import xsna.q630;
import xsna.tdu0;

/* compiled from: SubtitleImpl.kt */
/* loaded from: classes17.dex */
public final class s0n0 extends d16.d {
    public final wh50 b;
    public final wh50 c;
    public final wh50 d = androidx.compose.runtime.k.b(new bko0(1));
    public final wh50 e = androidx.compose.runtime.k.b(null);

    public s0n0(us2 us2Var, int i) {
        this.b = androidx.compose.runtime.k.b(us2Var);
        this.c = androidx.compose.runtime.k.b(Integer.valueOf(i));
    }

    @Override // xsna.d16.d
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        long j;
        androidx.compose.runtime.a M = aVar.M(-210994188);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-210994188, i2, -1, "com.vk.core.compose.component.banner.SubtitleImpl.Content (SubtitleImpl.kt:28)");
            }
            us2 us2Var = (us2) ((zak0) this.b).getValue();
            int intValue = ((Number) ((zak0) this.c).getValue()).intValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1787515588, 6, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.subtitleStyle (VkBannerDefaults.kt:209)");
            }
            M.K(-1422489833);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.T;
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Banner$BackgroundMode banner$BackgroundMode = (Banner$BackgroundMode) ((zak0) this.a).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-17202255, 48, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.subtitleColor (VkBannerDefaults.kt:240)");
            }
            M.K(-1370868719);
            if ((banner$BackgroundMode == null ? -1 : tdu0.a.$EnumSwitchMapping$0[banner$BackgroundMode.ordinal()]) == 1) {
                M.K(648517853);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getText().d;
                M.j();
            } else {
                M.K(648519548);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getText().m;
                M.j();
            }
            long c = l5g.c(14, j, 0.72f);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            ntu0.c(us2Var, q630.a.a, frv0Var, c, intValue, false, false, false, null, 0, null, 0, null, aVar2, 48, 0, 8096);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new u05(this, i, 10);
        }
    }
}
