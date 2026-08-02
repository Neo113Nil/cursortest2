package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.BadgeAppearance;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;
import xsna.f7p0;
import xsna.phw;

/* compiled from: GameCatalogTopBarLego.kt */
/* loaded from: classes17.dex */
public final class u6t {
    public static final void a(tet tetVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        a.C0011a.C0012a c0012a;
        TopBar$Before topBar$Before;
        String str;
        com.vk.core.compose.component.topbar.a aVar2;
        f7p0.a aVar3;
        d.c.C0760d a;
        com.vk.core.compose.component.topbar.a aVar4;
        androidx.compose.runtime.a M = aVar.M(-481662547);
        int i2 = i | (M.J(tetVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-481662547, i2, -1, "com.vk.games.presentation.components.topbar.GamesCatalogTopBarLego (GameCatalogTopBarLego.kt:30)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            boolean z = tetVar.b;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z) {
                M.K(277069356);
                c0012a = c0012a2;
                phw a2 = phw.a.a(fwu0.l(null, tetVar.a, null, null, M, 0, 61), null, null, null, null, M, 196616, 30);
                M = M;
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object x = M.x();
                if (z2 || x == c0012a) {
                    x = new gr7(izsVar, 4);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                boolean y = (i3 == 32) | M.y(view);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    x2 = new s6t(0, view, izsVar);
                    M.R(x2);
                }
                topBar$Before = TopBar$Before.a.C0750a.b(a2, gzsVar, (gzs) x2, null, M, 100663296, 158);
                M.j();
            } else {
                c0012a = c0012a2;
                if (tetVar.c) {
                    M.K(277621373);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1656996464, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronLeft28> (VkSdkIcons.kt:444)");
                    }
                    lg90 b = or.b(M, 1522700659, R.drawable.vk_icon_chevron_left_28, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N = d370.N(R.string.vk_accessibility_back, 0, M);
                    boolean z3 = (i2 & 112) == 32;
                    Object x3 = M.x();
                    if (z3 || x3 == c0012a) {
                        x3 = new q0(izsVar, 3);
                        M.R(x3);
                    }
                    topBar$Before = TopBar$Before.e.a.a(b, N, (gzs) x3, null, null, null, M, 1572872, 56);
                    M = M;
                    M.j();
                } else {
                    M.K(277900993);
                    M.j();
                    topBar$Before = null;
                }
            }
            int i4 = i2 & 112;
            boolean y2 = M.y(topBar$Before) | (i4 == 32);
            Object x4 = M.x();
            if (y2 || x4 == c0012a) {
                str = null;
                x4 = new t6t(topBar$Before, izsVar, null);
                M.R(x4);
            } else {
                str = null;
            }
            bap.g(topBar$Before, (wzs) x4, M, 0);
            String N2 = d370.N(R.string.vk_games_topbar_search_hint, 0, M);
            tho0 tho0Var = new tho0(str, 0L, 7);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new af2(21);
                M.R(x5);
            }
            izs izsVar2 = (izs) x5;
            boolean z4 = i4 == 32;
            Object x6 = M.x();
            if (z4 || x6 == c0012a) {
                x6 = new mif(izsVar, 2);
                M.R(x6);
            }
            gzs gzsVar2 = (gzs) x6;
            boolean z5 = i4 == 32;
            Object x7 = M.x();
            if (z5 || x7 == c0012a) {
                x7 = new uy7(izsVar, 2);
                M.R(x7);
            }
            com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x7, 3);
            TopBar$Before topBar$Before2 = topBar$Before;
            androidx.compose.runtime.a aVar5 = M;
            TopBar$Middle.b a4 = TopBar$Middle.b.a.a(N2, tho0Var, izsVar2, null, null, gzsVar2, null, null, a3, false, null, false, aVar5, Tensorflow.FRAME_WIDTH, 384, 3800);
            androidx.compose.runtime.a aVar6 = aVar5;
            zbt zbtVar = tetVar.d;
            if (zbtVar == null) {
                aVar6.K(278665142);
                aVar6.j();
                aVar2 = null;
                a = null;
            } else {
                aVar6.K(278665143);
                qzu0.a.getClass();
                lg90 Y = qzu0.Y(aVar6);
                String N3 = d370.N(R.string.vk_games_gift_icon_description, 0, aVar6);
                boolean y3 = (i4 == 32) | aVar6.y(zbtVar);
                Object x8 = aVar6.x();
                if (y3 || x8 == c0012a) {
                    x8 = new fg1(11, izsVar, zbtVar);
                    aVar6.R(x8);
                }
                gzs gzsVar3 = (gzs) x8;
                if (zbtVar.a) {
                    aVar6.K(952579880);
                    BadgeAppearance.Design design = BadgeAppearance.Design.AccentRed;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-263432097, 390, -1, "com.vk.core.compose.component.topbar.TopBar.TopMarker.Badge.Companion.invoke (TopBar.kt:1970)");
                    }
                    Object x9 = aVar6.x();
                    if (x9 == c0012a) {
                        aVar2 = null;
                        x9 = new f7p0.a(design, null);
                        aVar6.R(x9);
                    } else {
                        aVar2 = null;
                    }
                    f7p0.a aVar7 = (f7p0.a) x9;
                    ((zak0) aVar7.a).setValue(design);
                    ((zak0) aVar7.b).setValue(aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar6.j();
                    aVar3 = aVar7;
                } else {
                    aVar2 = null;
                    aVar6.K(952720527);
                    aVar6.j();
                    aVar3 = null;
                }
                a = d.c.C0760d.a.a(Y, N3, gzsVar3, aVar3, null, null, aVar6, 1572872, 48);
                aVar6 = aVar6;
                aVar6.j();
            }
            if (a == null) {
                aVar6.K(279304021);
                aVar6.j();
                aVar4 = aVar2;
            } else {
                aVar6.K(279304022);
                com.vk.core.compose.component.topbar.a a5 = d.a.a(a, null, null, null, aVar6, 24576, 14);
                aVar6.j();
                aVar4 = a5;
            }
            androidx.compose.runtime.a aVar8 = aVar6;
            muv0.h(a4, q630Var, null, null, null, topBar$Before2, aVar4, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar8, 48, 0, 8092);
            M = aVar8;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cqg(i, 2, tetVar, izsVar, q630Var);
        }
    }
}
