package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.BadgeAppearance;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;
import xsna.f7p0;
import xsna.phw;

/* compiled from: GamesCatalogTopBar.kt */
/* loaded from: classes17.dex */
public final class set {
    public static final void a(tet tetVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        a.C0011a.C0012a c0012a;
        TopBar$Before.a aVar2;
        TopBar$Before.e eVar;
        String str;
        com.vk.core.compose.component.topbar.a aVar3;
        f7p0.a aVar4;
        d.c.C0760d a;
        com.vk.core.compose.component.topbar.a aVar5;
        boolean z = tetVar.b;
        androidx.compose.runtime.a M = aVar.M(1386357388);
        int i3 = i | (M.J(tetVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1386357388, i3, -1, "com.vk.games.presentation.components.GamesCatalogTopBar (GamesCatalogTopBar.kt:30)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z) {
                M.K(567694701);
                i2 = i3;
                c0012a = c0012a2;
                phw a2 = phw.a.a(fwu0.l(null, tetVar.a, null, null, M, 0, 61), null, null, null, null, M, 196616, 30);
                M = M;
                int i4 = i2 & 112;
                boolean z2 = i4 == 32;
                Object x = M.x();
                if (z2 || x == c0012a) {
                    x = new zn1(izsVar, 5);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                boolean y = (i4 == 32) | M.y(view);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    x2 = new fy0(9, view, izsVar);
                    M.R(x2);
                }
                TopBar$Before.a b = TopBar$Before.a.C0750a.b(a2, gzsVar, (gzs) x2, null, M, 100663296, 158);
                M.j();
                aVar2 = b;
            } else {
                i2 = i3;
                c0012a = c0012a2;
                M.K(568201954);
                M.j();
                aVar2 = null;
            }
            if (!tetVar.c || z) {
                M.K(568600738);
                M.j();
                eVar = null;
            } else {
                M.K(568314360);
                String N = d370.N(R.string.vk_accessibility_back, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().b;
                boolean z3 = (i2 & 112) == 32;
                Object x3 = M.x();
                if (z3 || x3 == c0012a) {
                    x3 = new z8c(izsVar, 4);
                    M.R(x3);
                }
                androidx.compose.runtime.a aVar6 = M;
                TopBar$Before.e a3 = e.a.a((gzs) x3, N, null, new l5g(j), null, aVar6, 196608, 20);
                M = aVar6;
                M.j();
                eVar = a3;
            }
            int i5 = i2 & 112;
            boolean J = M.J(aVar2) | (i5 == 32);
            Object x4 = M.x();
            if (J || x4 == c0012a) {
                str = null;
                x4 = new ret(aVar2, izsVar, null);
                M.R(x4);
            } else {
                str = null;
            }
            bap.g(aVar2, (wzs) x4, M, 0);
            String N2 = d370.N(R.string.vk_games_topbar_search_hint, 0, M);
            tho0 tho0Var = new tho0(str, 0L, 7);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new ol(28);
                M.R(x5);
            }
            izs izsVar2 = (izs) x5;
            boolean z4 = i5 == 32;
            Object x6 = M.x();
            if (z4 || x6 == c0012a) {
                x6 = new tzo(izsVar, 2);
                M.R(x6);
            }
            gzs gzsVar2 = (gzs) x6;
            boolean z5 = i5 == 32;
            Object x7 = M.x();
            if (z5 || x7 == c0012a) {
                x7 = new qhf(izsVar, 2);
                M.R(x7);
            }
            androidx.compose.runtime.a aVar7 = M;
            a.C0011a.C0012a c0012a3 = c0012a;
            TopBar$Before.e eVar2 = eVar;
            TopBar$Before.a aVar8 = aVar2;
            TopBar$Middle.b a4 = TopBar$Middle.b.a.a(N2, tho0Var, izsVar2, null, null, gzsVar2, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x7, 3), false, null, false, aVar7, Tensorflow.FRAME_WIDTH, 384, 3800);
            androidx.compose.runtime.a aVar9 = aVar7;
            zbt zbtVar = tetVar.d;
            if (zbtVar == null) {
                aVar9.K(569364887);
                aVar9.j();
                aVar3 = null;
                a = null;
            } else {
                aVar9.K(569364888);
                qzu0.a.getClass();
                lg90 Y = qzu0.Y(aVar9);
                String N3 = d370.N(R.string.vk_games_gift_icon_description, 0, aVar9);
                boolean y2 = (i5 == 32) | aVar9.y(zbtVar);
                Object x8 = aVar9.x();
                if (y2 || x8 == c0012a3) {
                    x8 = new s(11, izsVar, zbtVar);
                    aVar9.R(x8);
                }
                gzs gzsVar3 = (gzs) x8;
                if (zbtVar.a) {
                    aVar9.K(-722427287);
                    BadgeAppearance.Design design = BadgeAppearance.Design.AccentRed;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-263432097, 390, -1, "com.vk.core.compose.component.topbar.TopBar.TopMarker.Badge.Companion.invoke (TopBar.kt:1970)");
                    }
                    Object x9 = aVar9.x();
                    if (x9 == c0012a3) {
                        aVar3 = null;
                        x9 = new f7p0.a(design, null);
                        aVar9.R(x9);
                    } else {
                        aVar3 = null;
                    }
                    f7p0.a aVar10 = (f7p0.a) x9;
                    ((zak0) aVar10.a).setValue(design);
                    ((zak0) aVar10.b).setValue(aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar9.j();
                    aVar4 = aVar10;
                } else {
                    aVar3 = null;
                    aVar9.K(-722286640);
                    aVar9.j();
                    aVar4 = null;
                }
                a = d.c.C0760d.a.a(Y, N3, gzsVar3, aVar4, null, null, aVar9, 1572872, 48);
                aVar9 = aVar9;
                aVar9.j();
            }
            if (a == null) {
                aVar9.K(570024598);
                aVar9.j();
                aVar5 = aVar3;
            } else {
                aVar9.K(570024599);
                com.vk.core.compose.component.topbar.a a5 = d.a.a(a, null, null, null, aVar9, 24576, 14);
                aVar9.j();
                aVar5 = a5;
            }
            androidx.compose.runtime.a aVar11 = aVar9;
            muv0.h(a4, q630Var, null, null, eVar2, aVar8, aVar5, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar11, 48, 0, 8076);
            M = aVar11;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qet(tetVar, izsVar, q630Var, i, 0);
        }
    }
}
