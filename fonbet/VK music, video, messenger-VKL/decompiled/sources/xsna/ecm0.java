package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatarchange.OnboardingType;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: StoryRepostSwitchCell.kt */
/* loaded from: classes15.dex */
public final class ecm0 {
    public static final void a(q630 q630Var, boolean z, OnboardingType onboardingType, boolean z2, boolean z3, gzs gzsVar, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        boolean z4;
        boolean z5;
        androidx.compose.runtime.a M = aVar.M(-1473529626);
        int i2 = i | 6 | (M.l(z) ? 32 : 16) | (M.o(onboardingType == null ? -1 : onboardingType.ordinal()) ? 256 : 128) | 27648 | (M.y(gzsVar) ? 131072 : 65536) | (M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1473529626, i2, -1, "com.vk.avatarchange.StoryRepostSwitchCell (StoryRepostSwitchCell.kt:34)");
            }
            q630.a aVar2 = q630.a.a;
            q630 a = d1p0.a(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, vov0.a(0), 1, txj0.f(ahn.E(aVar2, "publish_to_story_tag"), 1.0f)), z, true, new plg0(2), izsVar, 8);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new oi40(23);
                M.R(x);
            }
            q630 b = egi0.b(a, true, (izs) x);
            int i3 = i2 & 896;
            int i4 = i2 & 458752;
            boolean z6 = (i4 == 131072) | (i3 == 256);
            Object x2 = M.x();
            if (z6 || x2 == c0012a) {
                x2 = new g6v(onboardingType == OnboardingType.TITLE, gzsVar);
                M.R(x2);
            }
            g6v g6vVar = (g6v) x2;
            boolean z7 = (i4 == 131072) | (i3 == 256);
            Object x3 = M.x();
            if (z7 || x3 == c0012a) {
                x3 = new t5v(onboardingType == OnboardingType.SUBTITLE, gzsVar);
                M.R(x3);
            }
            wiu0.b(b, false, null, Cell$Middle.a.a(g6vVar, (t5v) x3, null, null, M, 196608, 28), com.vk.core.compose.component.cell.content.n.a(z, null, true, null, M, 24960, 10), null, null, M, 0, 102);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z5 = true;
            q630Var2 = aVar2;
            z4 = true;
        } else {
            M.h();
            q630Var2 = q630Var;
            z4 = z2;
            z5 = z3;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zgg0(q630Var2, z, onboardingType, z4, z5, gzsVar, izsVar, i);
        }
    }

    public static final void b(String str, Cell$Middle.Size size, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(890062692);
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
                androidx.compose.runtime.b.f(890062692, i3, -1, "com.vk.avatarchange.Subtitle (StoryRepostSwitchCell.kt:156)");
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
            s.d = new bw9(str2, size, q630Var2, i, 3);
        }
    }

    public static final void c(String str, Cell$Middle.Size size, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str2;
        androidx.compose.runtime.a M = aVar.M(-843898725);
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
                androidx.compose.runtime.b.f(-843898725, i3, -1, "com.vk.avatarchange.Title (StoryRepostSwitchCell.kt:106)");
            }
            str2 = str;
            com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(str2, null, null, 0, null, null, M, (i3 & 14) | 12582912 | ((i3 << 9) & 3670016), 62);
            int i4 = ((i3 >> 6) & 14) | (i3 & 112);
            q630.a aVar2 = q630.a.a;
            a.c(aVar2, size, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            str2 = str;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rzg(str2, size, q630Var, i);
        }
    }
}
