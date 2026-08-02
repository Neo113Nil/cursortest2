package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.q630;

/* compiled from: CommunityChannelTextCell.kt */
/* loaded from: classes17.dex */
public final class yug {
    public static final void a(us2 us2Var, String str, q630 q630Var, uog0 uog0Var, List list, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        uog0 uog0Var2;
        uog0 b;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1975165494);
        int i3 = i | (M.J(us2Var) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | 1024 | (M.J(list != null ? new wow(list) : null) ? 16384 : 8192) | (M.y(gzsVar) ? 131072 : 65536);
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                b = vog0.b(kqu0.f);
                i2 = i3 & (-7169);
            } else {
                M.h();
                i2 = i3 & (-7169);
                b = uog0Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1975165494, i2, -1, "com.vk.community.design.compose.components.channel.CommunityChannelTextCell (CommunityChannelTextCell.kt:88)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            shu0.b(gzsVar, q630Var, b, ylu0Var.getBackground().B, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(-1448322616, new ez7(us2Var, list, str, 3), M), aVar2, ((i2 >> 15) & 14) | 805306368 | ((i2 >> 3) & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            uog0Var2 = b;
        } else {
            aVar2 = M;
            aVar2.h();
            uog0Var2 = uog0Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new rug(us2Var, str, q630Var, uog0Var2, list, gzsVar, i);
        }
    }

    public static final void b(final float f, final uog0 uog0Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(250554201);
        int i2 = (M.n(f) ? 4 : 2) | i | (M.J(uog0Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(250554201, i2, -1, "com.vk.community.design.compose.components.channel.TextImagePlaceholder (CommunityChannelTextCell.kt:245)");
            }
            q630 q = txj0.q(q630.a.a, f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(hr80.m(q, ylu0Var.getBackground().x, uog0Var), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f, uog0Var, i) { // from class: xsna.xug
                public final /* synthetic */ float b;
                public final /* synthetic */ uog0 c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    yug.b(this.b, this.c, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
