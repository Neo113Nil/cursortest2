package xsna;

import com.vk.core.compose.component.horizontal.HorizontalListItem$Size;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import xsna.iev;
import xsna.phw;
import xsna.q630;

/* compiled from: TabbarSettingsCommunityIcon.kt */
/* loaded from: classes6.dex */
public final class wun0 {
    public static final void a(int i, int i2, androidx.compose.runtime.a aVar, String str, q630 q630Var, boolean z) {
        q630 q630Var2;
        k18 k18Var;
        androidx.compose.runtime.a M = aVar.M(617110946);
        int i3 = i2 | (M.J(str) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.o(i) ? 256 : 128) | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(617110946, i3, -1, "com.vk.tabbar.settings.impl.compose.TabbarSettingsCommunityIcon (TabbarSettingsCommunityIcon.kt:27)");
            }
            HorizontalListItem$Size.WithPicture withPicture = HorizontalListItem$Size.WithPicture.Small;
            int i4 = i3 << 3;
            phw a = phw.a.a(fwu0.l(null, str, null, null, M, i4 & 112, 61), null, null, null, null, M, 196616, 30);
            if (z) {
                M.K(1892616272);
                float f = kqu0.q;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                k18Var = new a28(f, ylu0Var.getBackground().b);
                M.j();
            } else {
                M.K(1892823445);
                M.j();
                k18Var = wep.a;
            }
            yq5 a2 = HorizontalListItem$VisualContent.a.a(a, null, k18Var, i, M, i4 & 7168, 18);
            iev.a aVar2 = iev.a.a;
            nvn0.o.getClass();
            float f2 = 0;
            gev gevVar = new gev(new uco(byc0.b(Float.NaN, nvn0.t)), new u890(f2, f2, f2, f2), new u890(f2, f2, f2, f2), 8);
            q630.a aVar3 = q630.a.a;
            azu0.b(withPicture, a2, aVar2, aVar3, gevVar, M, 3078, 0);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vun0(i, i2, str, q630Var2, z);
        }
    }
}
