package xsna;

import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.donut.DonutLevel;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ddd0;
import xsna.q630;

/* compiled from: PrivacyEditDonutLevelsBottomSheetView.kt */
/* loaded from: classes18.dex */
public final class kdd0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final ddd0.a aVar, final izs izsVar, q630 q630Var, final boolean z, androidx.compose.runtime.a aVar2, final int i) {
        final q630 q630Var2;
        pco pcoVar;
        boolean z2;
        q630 q630Var3;
        androidx.compose.runtime.a M = aVar2.M(213443338);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384 | (M.l(z) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(213443338, i2, -1, "com.vk.donut.privacy.levels.levelsbottomsheet.Content (PrivacyEditDonutLevelsBottomSheetView.kt:84)");
            }
            wh50 c = jk50.c(aVar.a, M);
            wh50 c2 = jk50.c(aVar.b, M);
            float f = ((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
            azl azlVar = (azl) M.r(uvi.h);
            a.C0011a.C0012a c0012a = a.C0011a.a;
            q630.a aVar3 = q630.a.a;
            if (z) {
                M.K(2140339792);
                boolean o = M.o(((List) c.getValue()).size());
                Object x = M.x();
                if (o || x == c0012a) {
                    x = qq.h(0, M);
                }
                wh50 wh50Var = (wh50) x;
                boolean J = ((i2 & 112) == 32) | M.J(c) | M.J(c2) | M.J(wh50Var);
                Object x2 = M.x();
                if (J || x2 == c0012a) {
                    x2 = new d3(c, izsVar, c2, wh50Var);
                    M.R(x2);
                }
                xtm0.a(aVar3, (wzs) x2, M, 6, 0);
                boolean o2 = M.o(((Number) wh50Var.getValue()).intValue());
                Object x3 = M.x();
                if (o2 || x3 == c0012a) {
                    x3 = new pco(azlVar.j1(((Number) wh50Var.getValue()).intValue()));
                    M.R(x3);
                }
                float f2 = ((pco) x3).b;
                M.j();
                pcoVar = new pco(f2);
            } else {
                M.K(2141460627);
                M.j();
                pcoVar = null;
            }
            if (z) {
                M.K(-1039292162);
                if (pcoVar != null) {
                    f = pcoVar.b;
                }
                z2 = true;
                q630Var3 = n34.t(txj0.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, aVar3), dz5.I(0, 1, M, false), null);
                M.j();
            } else {
                z2 = true;
                M.K(-1039289838);
                M.j();
                q630Var3 = aVar3;
            }
            boolean J2 = M.J(c) | M.J(c2);
            if ((i2 & 112) != 32) {
                z2 = false;
            }
            boolean z3 = J2 | z2;
            Object x4 = M.x();
            if (z3 || x4 == c0012a) {
                x4 = new ysd(c, izsVar, c2, 10);
                M.R(x4);
            }
            lqy.a(q630Var3, null, null, null, null, null, false, null, (izs) x4, M, 0, 510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(izsVar, q630Var2, z, i) { // from class: xsna.gdd0
                public final /* synthetic */ izs c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ boolean e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    kdd0.a(ddd0.a.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(izs izsVar, mtk0 mtk0Var, DonutLevel donutLevel, androidx.compose.runtime.a aVar) {
        com.vk.core.compose.component.cell.content.h1 h1Var;
        androidx.compose.runtime.a aVar2 = aVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1607953720, 0, -1, "com.vk.donut.privacy.levels.levelsbottomsheet.Content.DonutLevelRow (PrivacyEditDonutLevelsBottomSheetView.kt:89)");
        }
        aVar2.K(944704417);
        String str = donutLevel.c;
        int i = donutLevel.b;
        if (drm0.N(str)) {
            str = d370.N(R.string.donut_all_dons_level, 0, aVar2);
        }
        String str2 = str;
        aVar2.j();
        com.vk.core.compose.component.cell.content.b0 b0Var = null;
        if (i == DonutLevel.f.b) {
            aVar2.K(-778809058);
            aVar2.j();
            h1Var = null;
        } else {
            aVar2.K(-778767704);
            com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.c.b.b(d370.O(donutLevel.e ? R.string.donut_level_price_format : R.string.donut_level_price_and_higher_format, new Object[]{Integer.valueOf(donutLevel.d)}, aVar2), 0, null, null, null, aVar, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            aVar2 = aVar;
            aVar2.j();
            h1Var = b;
        }
        if (i == ((DonutLevel) mtk0Var.getValue()).b) {
            aVar2.K(944720627);
            b0Var = o.e.a.C0736a.a(true, null, false, null, aVar2, 24582, 14);
        } else {
            aVar2.K(-778414987);
        }
        aVar2.j();
        com.vk.core.compose.component.cell.content.k0 a = Cell$Middle.a.a(Cell$Middle.d.b.a(str2, null, null, 0, null, null, aVar, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), h1Var, null, null, aVar, 196608, 28);
        boolean J = aVar.J(izsVar) | aVar.y(donutLevel);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            x = new lb6(23, izsVar, donutLevel);
            aVar.R(x);
        }
        wiu0.b(null, false, null, a, b0Var, (gzs) x, null, aVar, 0, 71);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final int c(ztm0 ztm0Var, o6j o6jVar, String str, jai jaiVar) {
        int i;
        List<zo10> t1 = ztm0Var.t1(str, jaiVar);
        ArrayList arrayList = new ArrayList(c5g.u(t1, 10));
        Iterator<T> it = t1.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            zo10 zo10Var = (zo10) it.next();
            int i2 = o6j.i(o6jVar.a);
            if (i2 < 0) {
                wzw.a("width must be >= 0");
            }
            arrayList.add(zo10Var.N(s6j.h(i2, i2, 0, Integer.MAX_VALUE)));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            i += ((tra0) it2.next()).c;
        }
        return i;
    }

    public static final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(863886963);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(863886963, i, -1, "com.vk.donut.privacy.levels.levelsbottomsheet.Header (PrivacyEditDonutLevelsBottomSheetView.kt:171)");
            }
            float f = kqu0.s;
            q630.a aVar2 = q630.a.a;
            f9t.e(txj0.q(aVar2, f), M, 0);
            q630 F = s200.F(kqu0.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2);
            String N = d370.N(R.string.donut_levels_video_privacy_bottom_sheet_subhead, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(N, F, ylu0Var.getText().r, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8184);
            M = M;
            f9t.e(txj0.q(aVar2, 5), M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rv4(i);
        }
    }

    public static final void e(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-189703373);
        int i2 = i | (M.y(gzsVar) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-189703373, i2, -1, "com.vk.donut.privacy.levels.levelsbottomsheet.SaveButton (PrivacyEditDonutLevelsBottomSheetView.kt:183)");
            }
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, s200.D(txj0.f(q630.a.a, 1.0f), kqu0.v), null, false, false, null, null, null, d370.N(R.string.donut_levels_bottom_sheet_select_button, 0, M), null, null, null, null, false, null, null, null, aVar2, (i2 & 14) | X2.b.f, 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ht7(gzsVar, i, 10);
        }
    }
}
