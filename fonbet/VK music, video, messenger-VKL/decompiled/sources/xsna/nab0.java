package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.d;
import com.vk.core.compose.component.group.header.f;

/* compiled from: PlaylistItemsHeader.kt */
/* loaded from: classes3.dex */
public final class nab0 {
    public static final void a(String str, q630 q630Var, Integer num, androidx.compose.runtime.a aVar, int i, int i2) {
        Integer num2;
        int i3;
        q630 q630Var2;
        Integer num3;
        androidx.compose.runtime.a M = aVar.M(25209068);
        int i4 = i | (M.J(str) ? 4 : 2);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            num2 = num;
        } else {
            num2 = num;
            i3 = i4 | (M.J(num2) ? 256 : 128);
        }
        int i6 = i3;
        if (M.t(i6 & 1, (i6 & 147) != 146)) {
            com.vk.core.compose.component.group.header.d dVar = null;
            Integer num4 = i5 != 0 ? null : num2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(25209068, i6, -1, "com.vk.music.playlist.framework.presentation.PlaylistItemsHeader (PlaylistItemsHeader.kt:28)");
            }
            q630Var2 = q630Var;
            float f = 20;
            q630 d = rte0.d(txj0.f(q630Var2, 1.0f), vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            b.C0749b c0749b = b.C0749b.a;
            if (num4 == null) {
                M.K(-615434678);
            } else {
                M.K(-615434677);
                int intValue = num4.intValue();
                CounterAppearance.Design design = CounterAppearance.Design.Neutral;
                CounterMode counterMode = CounterMode.Tertiary;
                boolean o = M.o(intValue);
                Object x = M.x();
                if (o || x == a.C0011a.a) {
                    x = new ojb(intValue, 2);
                    M.R(x);
                }
                dVar = d.a.a(intValue, design, counterMode, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 197040, 8);
            }
            M.j();
            com.vk.core.compose.component.group.header.g.b(f.a.a(str, null, dVar, null, null, null, null, null, false, M, (i6 & 14) | 805306368, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE), m, c0749b, null, null, null, false, M, 384, 120);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            num3 = num4;
        } else {
            q630Var2 = q630Var;
            M.h();
            num3 = num2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ni70(str, q630Var2, num3, i, i2);
        }
    }
}
