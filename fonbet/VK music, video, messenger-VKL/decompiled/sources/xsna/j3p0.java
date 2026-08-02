package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import xsna.q630;
import xsna.tlo0;

/* compiled from: Toolbar.kt */
/* loaded from: classes7.dex */
public final class j3p0 {
    public static final void a(c4p0 c4p0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(192086482);
        int i2 = i | (M.J(c4p0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(192086482, i2, -1, "com.vk.video.ui.upload.impl.coverchoose.presentation.compose.toolbar.Toolbar (Toolbar.kt:19)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            String obj = tlo0.b.a(c4p0Var.b, context).toString();
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new w77(izsVar, 5);
                M.R(x);
            }
            TopBar$Before.e a = e.a.a((gzs) x, obj, null, null, null, M, 196608, 28);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(tlo0.b.a(c4p0Var.a, context).toString(), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().a;
            e.a aVar3 = androidx.compose.ui.graphics.e.a;
            q630.a aVar4 = q630.a.a;
            q630 m = hr80.m(aVar4, j, aVar3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1060031380, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DoneOutline28> (VkSdkIcons.kt:712)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_done_outline_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String obj2 = tlo0.b.a(c4p0Var.c, context).toString();
            boolean z2 = i3 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new i74(izsVar, 4);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new z7w(24);
                M.R(x3);
            }
            aVar2 = M;
            muv0.h(a2, m, null, null, a, null, d.a.a(d.c.C0760d.a.a(a3, obj2, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), aVar2, 1572872, 24), null, null, null, aVar2, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 8108);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new p2(i, 2, c4p0Var, izsVar, q630Var2);
        }
    }
}
