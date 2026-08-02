package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.banner.Banner$Notification$Appearance;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.d16;
import xsna.dt1;
import xsna.g26;
import xsna.q630;

/* compiled from: UploadBannerItem.kt */
/* loaded from: classes17.dex */
public final class z9q0 {
    public static final void a(fze fzeVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        int i2;
        androidx.compose.runtime.a aVar3;
        zp8 zp8Var;
        xzy b;
        CharSequence a;
        CharSequence a2;
        g26 g26Var = fzeVar.b;
        androidx.compose.runtime.a M = aVar.M(1458651122);
        int i3 = i | (M.J(fzeVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1458651122, i3, -1, "com.vk.clips.upload.ui.impl.compose.views.UploadBannerItem (UploadBannerItem.kt:27)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 E = ahn.E(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), "upload_banner_" + fzeVar.f);
            tlo0 tlo0Var = fzeVar.c;
            String obj = (tlo0Var == null || (a2 = tlo0Var.a(context)) == null) ? null : a2.toString();
            tlo0 tlo0Var2 = fzeVar.d;
            String obj2 = (tlo0Var2 == null || (a = tlo0Var2.a(context)) == null) ? null : a.toString();
            tlo0 tlo0Var3 = fzeVar.e;
            if (tlo0Var3 == null) {
                M.K(1983061779);
                M.j();
                aVar3 = M;
                zp8Var = null;
                i2 = 0;
            } else {
                M.K(1983061780);
                String obj3 = tlo0Var3.a(context).toString();
                ButtonStyle buttonStyle = ButtonStyle.Link;
                ButtonSize buttonSize = ButtonSize.Small;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new j3(27, izsVar, fzeVar);
                    M.R(x);
                }
                i2 = 0;
                zp8 a4 = d16.a.C2697a.a(buttonStyle, buttonAppearance, buttonSize, obj3, null, null, null, null, null, null, null, null, (gzs) x, M, 438, 24576, 8176);
                aVar3 = M;
                aVar3.j();
                zp8Var = a4;
            }
            xl20 a5 = d16.b.a(obj, obj2, null, zp8Var, null, null, null, null, aVar3, 100663296, 244);
            Banner$Notification$Appearance banner$Notification$Appearance = Banner$Notification$Appearance.Neutral;
            if (g26Var instanceof g26.a) {
                aVar3.K(-767296126);
                ((g26.a) g26Var).getClass();
                throw null;
            }
            if (g26Var instanceof g26.b) {
                aVar3.K(-767293201);
                ((g26.b) g26Var).getClass();
                b = b(pg90.a(R.drawable.vk_icon_lock_outline_28, i2, aVar3), aVar3, 8);
                aVar3.j();
            } else {
                aVar3.K(-767290798);
                b = b(ugp.g, aVar3, ugp.h);
                aVar3.j();
            }
            androidx.compose.runtime.a aVar5 = aVar3;
            s6v0.a(a5, banner$Notification$Appearance, E, b, null, null, null, aVar5, 48, 112);
            aVar2 = aVar5;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ip6(i, 6, fzeVar, izsVar, q630Var);
        }
    }

    public static final xzy b(lg90 lg90Var, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1083610177, i, -1, "com.vk.clips.upload.ui.impl.compose.views.wrapIcon (UploadBannerItem.kt:61)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        xzy a = e16.a(lg90Var, ylu0Var.getIcon().l, 0L, null, null, aVar, 28);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }
}
