package xsna;

import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: PrivateCommunityNameSlotImpl.kt */
/* loaded from: classes5.dex */
public final class yfd0 implements e95 {
    @Override // xsna.e95
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(823934889);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(823934889, i, -1, "com.vk.profile.design.compose.header.header.PrivateCommunityNameSlotImpl.Content (PrivateCommunityNameSlotImpl.kt:15)");
            }
            String N = d370.N(R.string.author_header_community_private_page_name, 0, M);
            q630 E = ahn.E(q630.a.a, "author_header_title");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(N, E, j, null, null, 0, 0, null, 0, false, 0, 1, null, wuv0Var.u, aVar2, 805306368, 48, 5624);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new z5(this, i, 7);
        }
    }
}
