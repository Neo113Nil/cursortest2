package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFeatureCell;
import com.vk.clips.upload.vk.ui.impl.fragment.view.custom.stories.OnboardingType;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: StoryRepostSwitchCell.kt */
/* loaded from: classes17.dex */
public final class ccm0 {
    public static final void a(final q630 q630Var, final boolean z, final OnboardingType onboardingType, final boolean z2, final int i, final gzs gzsVar, final izs izsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1691573662);
        if ((i2 & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.l(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.o(onboardingType == null ? -1 : onboardingType.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.l(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.o(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.y(gzsVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        boolean z3 = false;
        if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
            M.V();
            if ((i2 & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1691573662, i3, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.stories.StoryRepostSwitchCell (StoryRepostSwitchCell.kt:38)");
            }
            int i4 = i3;
            q630 a = d1p0.a(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, vov0.a(0), 1, txj0.f(ahn.E(q630Var, ClipsUploadFeatureCell.AllowRepost.i()), 1.0f)), z, z2, new plg0(2), izsVar, 8);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new zsw(23);
                M.R(x);
            }
            q630 b = egi0.b(a, true, (izs) x);
            int i5 = i4 & 896;
            int i6 = 458752 & i4;
            boolean z4 = (i5 == 256) | (i6 == 131072);
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new e6v(onboardingType == OnboardingType.TITLE, gzsVar);
                M.R(x2);
            }
            e6v e6vVar = (e6v) x2;
            boolean z5 = (i5 == 256) | (i6 == 131072) | ((((57344 & i4) ^ 24576) > 16384 && M.o(i)) || (i4 & 24576) == 16384);
            Object x3 = M.x();
            if (z5 || x3 == c0012a) {
                x3 = new r5v(i, gzsVar, onboardingType == OnboardingType.SUBTITLE);
                M.R(x3);
            }
            r5v r5vVar = (r5v) x3;
            if (i == 0) {
                r5vVar = null;
            }
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(e6vVar, r5vVar, null, null, M, 196608, 28);
            aVar2 = M;
            if (z && z2) {
                z3 = true;
            }
            Object x4 = aVar2.x();
            if (x4 == c0012a) {
                x4 = new ept(29);
                aVar2.R(x4);
            }
            wiu0.b(b, false, null, a2, com.vk.core.compose.component.cell.content.n.a(z3, null, z2, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), aVar2, ((i4 >> 3) & 896) | 24576, 2), null, null, aVar2, 0, 102);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.bcm0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ccm0.a(q630.this, z, onboardingType, z2, i, gzsVar, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(String str, Cell$Middle.Size size, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1756878215);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(size.ordinal()) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1756878215, i3, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.stories.Subtitle (StoryRepostSwitchCell.kt:165)");
            }
            str2 = str;
            com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.c.b.b(str2, 0, null, null, null, M, (i3 & 14) | 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            int i4 = ((i3 >> 6) & 14) | (i3 & 112);
            q630.a aVar2 = q630.a.a;
            b.c(aVar2, size, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            str2 = str;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xs0(i, 5, str2, size, q630Var2);
        }
    }

    public static final void c(String str, Cell$Middle.Size size, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1288049730);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(size.ordinal()) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1288049730, i3, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.stories.Title (StoryRepostSwitchCell.kt:114)");
            }
            str2 = str;
            com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(str2, null, null, 0, null, null, M, (i3 & 14) | 12582912 | ((i3 << 9) & 3670016), 62);
            int i4 = ((i3 >> 6) & 14) | (i3 & 112);
            q630.a aVar2 = q630.a.a;
            a.c(aVar2, size, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            str2 = str;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new es5(i, 5, str2, size, q630Var2);
        }
    }
}
