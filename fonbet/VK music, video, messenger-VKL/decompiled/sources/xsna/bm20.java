package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.component.defaults.e;
import xsna.q630;

/* compiled from: MiddleTextImpl.kt */
/* loaded from: classes17.dex */
public final class bm20 implements kfj {
    public final wh50 a;
    public final wh50 b;

    public bm20(String str, us2 us2Var) {
        this.a = androidx.compose.runtime.k.b(us2Var);
        this.b = androidx.compose.runtime.k.b(str);
    }

    @Override // xsna.kfj
    public final void a(int i, androidx.compose.runtime.a aVar, ContentBadgeAppearance contentBadgeAppearance, ContentBadgeMode contentBadgeMode, ContentBadgeSize contentBadgeSize, boolean z) {
        int i2;
        androidx.compose.runtime.a aVar2;
        u890 m;
        androidx.compose.runtime.a M = aVar.M(1594739078);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i & 48;
        q630.a aVar3 = q630.a.a;
        if (i4 == 0) {
            i2 |= M.J(aVar3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(contentBadgeAppearance) : M.y(contentBadgeAppearance) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.o(contentBadgeMode.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.o(contentBadgeSize.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.l(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.l(false) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.J(this) ? 8388608 : 4194304;
        }
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1594739078, i2, -1, "com.vk.core.compose.component.contentbadge.MiddleTextImpl.Content (MiddleTextImpl.kt:40)");
            }
            int i5 = i2 >> 6;
            long a = com.vk.core.compose.component.defaults.e.a(contentBadgeAppearance, contentBadgeMode, M, (i5 & 112) | (i5 & 14) | 384);
            M.K(-2055365357);
            M.K(-759029826);
            int i6 = ((i2 >> 12) & 14) | 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-412096986, i6, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.textCompensationPadding (VkContentBadgeDefaults.kt:112)");
            }
            int i7 = e.a.$EnumSwitchMapping$0[contentBadgeSize.ordinal()];
            if (i7 == 1) {
                M.K(-888207659);
                M.j();
                m = s200.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
            } else if (i7 == 2) {
                M.K(-888206008);
                int i8 = (i6 >> 3) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(860375650, i8, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getMediumTextCompensationPadding (VkContentBadgeDefaults.kt:304)");
                }
                m = s200.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                if (i7 != 3) {
                    throw alb0.c(-888208983, M);
                }
                M.K(-888203781);
                M.j();
                m = s200.m(kqu0.q, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 C = s200.C(aVar3, m);
            if (!z) {
                C = C.g(tpg0Var.b(1.0f, aVar3, false));
            }
            String str = (String) ((zak0) this.b).getValue();
            if (str != null) {
                boolean J = M.J(str);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    x = new zl20(str, 0);
                    M.R(x);
                }
                q630 g = C.g(egi0.b(aVar3, false, (izs) x));
                if (g != null) {
                    C = g;
                }
            }
            M.j();
            aVar2 = M;
            yqv0.d((us2) ((zak0) this.a).getValue(), C, a, 0, null, 2, false, 1, null, null, null, aVar2, 100663296, 6, 15096);
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new am20(this, contentBadgeAppearance, contentBadgeMode, contentBadgeSize, z, i);
        }
    }
}
