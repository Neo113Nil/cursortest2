package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import xsna.q630;
import xsna.tlo0;

/* compiled from: SmartCropScreen.kt */
/* loaded from: classes7.dex */
public final class i5k0 {
    public static final void a(j5k0 j5k0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1568902198);
        int i2 = (M.J(j5k0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1568902198, i2, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.screen.BottomBar (SmartCropScreen.kt:146)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new m87(izsVar, 8);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            aVar2 = M;
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            q630.a aVar3 = q630.a.a;
            float f = 16;
            q630 E = ahn.E(s200.G(txj0.f(aVar3, 1.0f), f, f, f, 12), "SmartCropTestTags.BOTTOM_BAR_BUTTON");
            String obj = tlo0.b.a(j5k0Var.e, context).toString();
            q630Var2 = aVar3;
            bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, obj, null, null, null, null, false, null, null, null, aVar2, X2.b.f, 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new k3o(j5k0Var, izsVar, q630Var2, i);
        }
    }

    public static final void b(j5k0 j5k0Var, izs<? super d4k0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(912451380);
        int i2 = (M.J(j5k0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(912451380, i2, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.screen.Dialogs (SmartCropScreen.kt:177)");
            }
            if (j5k0Var.g != null) {
                M.K(-8801352);
                t0.a(j5k0Var.g, izsVar, null, M, i2 & 112);
            } else {
                M.K(-14805618);
            }
            M.j();
            if (j5k0Var.h) {
                M.K(-8644895);
                a5q.a((i2 >> 3) & 14, M, izsVar, null);
            } else {
                M.K(-14805618);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gx(j5k0Var, izsVar, i, 12);
        }
    }

    public static final void c(j5k0 j5k0Var, izs<? super d4k0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1509506685);
        int i2 = (M.J(j5k0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1509506685, i2, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.screen.Modals (SmartCropScreen.kt:166)");
            }
            c3e0.a(j5k0Var.f, izsVar, null, M, i2 & 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x2(j5k0Var, izsVar, i, 9);
        }
    }

    public static final void d(j5k0 j5k0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(736332179);
        if ((i & 6) == 0) {
            i2 = i | (M.J(j5k0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(736332179, i3, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.screen.SmartCropScreen (SmartCropScreen.kt:50)");
            }
            q630.a aVar3 = q630.a.a;
            q630 d = txj0.d(aVar3, 1.0f);
            jai c = kai.c(-354891156, new y2(izsVar, 5), M);
            jai c2 = kai.c(-91194131, new g06(13, j5k0Var, izsVar), M);
            jai c3 = kai.c(172502894, new xx9(10, j5k0Var, izsVar), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            phv0.b(d, c, c2, c3, null, 0, ylu0Var.getBackground().a, 0L, kai.c(652532407, new xhd(4, j5k0Var, izsVar), M), aVar2, 805309872, 368);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new rh2(i, 5, (Object) j5k0Var, izsVar, q630Var2);
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(2046287579);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2046287579, i2, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.screen.TopBar (SmartCropScreen.kt:126)");
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.smart_crop_topbar_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new u2(izsVar, 5);
                M.R(x);
            }
            TopBar$Before.e a2 = e.a.a((gzs) x, null, null, null, null, M, 196608, 30);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().a;
            q630Var2 = q630.a.a;
            muv0.h(a, q630Var2, null, null, a2, null, null, null, false, j, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 7660);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i8c(izsVar, q630Var2, i, 11);
        }
    }
}
