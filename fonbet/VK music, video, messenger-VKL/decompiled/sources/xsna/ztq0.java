package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.miniinfo.MiniInfoCell$Mode;
import xsna.ar20;
import xsna.zq20;

/* compiled from: UserProfilePromoButtonViewHolder.kt */
/* loaded from: classes5.dex */
public final class ztq0 {
    public static final void a(final String str, final lg90 lg90Var, final uog0 uog0Var, final gzs gzsVar, final q630 q630Var, final long j, long j2, androidx.compose.runtime.a aVar, final int i) {
        final long j3;
        long j4;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-73892036);
        int i3 = i | (M.J(str) ? 4 : 2) | (M.y(lg90Var) ? 32 : 16) | (M.J(uog0Var) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192) | (M.p(j) ? 131072 : 65536) | 524288;
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j4 = ylu0Var.getBackground().g;
                i2 = i3 & (-3670017);
            } else {
                M.h();
                i2 = i3 & (-3670017);
                j4 = j2;
            }
            int i4 = i2;
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-73892036, i4, -1, "com.vk.profile.user.impl.ui.adapter.holders.PromoButtonBlockCard (UserProfilePromoButtonViewHolder.kt:91)");
            }
            long j5 = j4;
            phu0.b(gzsVar, null, uog0Var, j5, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(-5027871, new wzs() { // from class: xsna.xtq0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-5027871, intValue, -1, "com.vk.profile.user.impl.ui.adapter.holders.PromoButtonBlockCard.<anonymous> (UserProfilePromoButtonViewHolder.kt:97)");
                        }
                        b4v0.a(ar20.a.b(zs2.a(str, new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534)), false, false, false, null, aVar2, 196608, 30), MiniInfoCell$Mode.Base, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 1, q630.this), zq20.a.a(lg90Var, new l5g(l5g.k), null, aVar2, 24632, 12), null, null, null, aVar2, 48, 112);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i4 >> 9) & 14) | 805306368 | (i4 & 896), 498);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j3 = j5;
        } else {
            M.h();
            j3 = j2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, lg90Var, uog0Var, gzsVar, q630Var, j, j3, i) { // from class: xsna.ytq0
                public final /* synthetic */ String b;
                public final /* synthetic */ lg90 c;
                public final /* synthetic */ uog0 d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(65);
                    ztq0.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
