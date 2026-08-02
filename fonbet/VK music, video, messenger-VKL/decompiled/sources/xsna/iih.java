package xsna;

import org.chromium.net.NetError;
import xsna.q630;

/* compiled from: CommunityProfileContentGoodsShimmer.kt */
/* loaded from: classes5.dex */
public final class iih {
    public static final void a(final int i, final long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(358313204);
        int i3 = i | 22;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.c().a;
                i2 = i3 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                q630Var = q630.a.a;
            } else {
                M.h();
                i2 = i3 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
            }
            long j2 = j;
            q630 q630Var2 = q630Var;
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(358313204, i2, -1, "com.vk.profile.community.impl.ui.profile.content.shimmers.market.CommunityProfileContentGoodsShimmer (CommunityProfileContentGoodsShimmer.kt:24)");
            }
            ugh.b(q630Var2, 142, 1.6136f, true, j2, pdi.a, M, 200118, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630Var2;
            j = j2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, i) { // from class: xsna.hih
                public final /* synthetic */ long c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    iih.a(ne7.I(1), this.c, (androidx.compose.runtime.a) obj, q630.this);
                    return s3q0.a;
                }
            };
        }
    }
}
