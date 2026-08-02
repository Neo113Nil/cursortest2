package xsna;

import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.udt;

/* compiled from: GameForYouSection.kt */
/* loaded from: classes17.dex */
public final class f7t {
    public static final float a = 80;

    public static final void a(udt.c cVar, rha rhaVar, izs<? super o9t, s3q0> izsVar, xvy xvyVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(421077220);
        if ((i & 6) == 0) {
            i2 = (M.J(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(rhaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(xvyVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(421077220, i2, -1, "com.vk.games.presentation.components.sections.GameForYouContent (GameForYouSection.kt:101)");
            }
            int I0 = (int) ((azl) M.r(uvi.h)).I0(pex0.a);
            c7t c7tVar = cVar.c;
            WebImageSize f = c7tVar.e.b.f(I0);
            String str = f != null ? f.b : null;
            q630.a aVar3 = q630.a.a;
            q630 d = txj0.d(aVar3, 1.0f);
            int i3 = i2 & 896;
            int i4 = i2 & 14;
            boolean z = (i3 == 256) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new com.vk.movika.sdk.base.ui.k(12, izsVar, cVar);
                M.R(x);
            }
            q630 c = ojc.c(d, false, null, null, (gzs) x, 15);
            boolean z2 = rhaVar.b;
            float f2 = rhaVar.c;
            boolean z3 = (i3 == 256) | (i4 == 4);
            String str2 = str;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new com.vk.movika.sdk.base.ui.l(12, izsVar, cVar);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            boolean z4 = (i4 == 4) | (i3 == 256);
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new com.vk.movika.sdk.base.ui.m(7, izsVar, cVar);
                M.R(x3);
            }
            q630 f3 = vbh0.f(c, z2, xvyVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, null, gzsVar, (gzs) x3, 52);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f3);
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
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, d2, cVar2);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            q630 E = s200.E(txj0.d(aVar3, 1.0f), kqu0.w, kqu0.s);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.v), dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, E);
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
            k9q0.w(M, a2, cVar2);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            phw a3 = phw.a.a(fwu0.l(null, str2, null, null, M, 0, 61), null, null, null, null, M, 196616, 30);
            PictureRadius pictureRadius = PictureRadius.Large;
            float f4 = a;
            gdv0.c(a3, f4, null, pictureRadius, null, null, null, M, 3120, 116);
            q630 h = txj0.h(txj0.f(aVar3, 1.0f), f4);
            androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(kqu0.q, dt1.a.l), dt1.a.n, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, h);
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
            k9q0.w(M, a4, cVar2);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            yqv0.c(c7tVar.f, null, wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).T, M, 100663296, 48, 5882);
            String str3 = c7tVar.g;
            if (str3 == null) {
                M.K(1622311845);
                M.j();
                aVar2 = M;
            } else {
                aVar2 = M;
                yqv0.c(str3, null, gub0.a(M, 1622311846, M).p, null, null, 0, 0, null, 2, false, 0, 2, null, wlb0.l(M).i0, aVar2, 100663296, 48, 5882);
                s3q0 s3q0Var = s3q0.a;
                aVar2.j();
            }
            aVar2.G();
            aVar2.G();
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
            s.d = new hai(cVar, rhaVar, izsVar, xvyVar, i, 1);
        }
    }

    public static final void b(final udt.c cVar, final rha rhaVar, izs izsVar, final xvy xvyVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        izs izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(174396149);
        int i2 = i | (M.J(cVar) ? 4 : 2) | (M.J(rhaVar) ? 32 : 16) | (M.y(izsVar2) ? 256 : 128) | (M.J(xvyVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(174396149, i2, -1, "com.vk.games.presentation.components.sections.GameForYouSection (GameForYouSection.kt:59)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            xdt xdtVar = cVar.b;
            q630.a aVar3 = q630.a.a;
            if (xdtVar == null) {
                M.K(-1580960732);
            } else {
                M.K(-1580960731);
                cet.a(xdtVar, rhaVar, izsVar2, txj0.f(aVar3, 1.0f), M, (i2 & 896) | (i2 & 112) | 3072);
            }
            M.j();
            izsVar2 = izsVar;
            a(cVar, rhaVar, izsVar2, xvyVar, M, i2 & 8190);
            String str = cVar.c.h;
            if (str == null) {
                str = zq.a(M, -1852095694, R.string.vk_games_generate_new_game, M, 0);
            } else {
                M.K(-1852097027);
                M.j();
            }
            q630 d = txj0.d(aVar3, 1.0f);
            float f2 = kqu0.s;
            float f3 = kqu0.v;
            float f4 = kqu0.w;
            c((i2 >> 3) & 112, M, str, izsVar2, s200.G(d, f4, f2, f4, f3));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final izs izsVar3 = izsVar2;
            s.d = new wzs(rhaVar, izsVar3, xvyVar, q630Var, i) { // from class: xsna.e7t
                public final /* synthetic */ rha c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ xvy e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    f7t.b(udt.c.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(int i, androidx.compose.runtime.a aVar, String str, izs izsVar, q630 q630Var) {
        String str2;
        int i2;
        androidx.compose.runtime.a aVar2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1568103680);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (M.J(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1568103680, i2, -1, "com.vk.games.presentation.components.sections.GenerateGameButton (GameForYouSection.kt:175)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            if (((Boolean) wh50Var.getValue()).booleanValue()) {
                M.K(982849902);
                ButtonSize buttonSize = ButtonSize.Large;
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new z34(10);
                    M.R(x2);
                }
                aVar2 = M;
                bhu0.c((gzs) x2, buttonSize, buttonStyle, buttonAppearance, q630Var, null, null, false, null, null, null, false, sua.b, aVar2, ((i2 << 6) & 57344) | 3510, 384, 4064);
                M.j();
            } else {
                M.K(983168458);
                ButtonSize buttonSize2 = ButtonSize.Large;
                ButtonStyle buttonStyle2 = ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance2 = ButtonAppearance.Accent;
                if (androidx.compose.runtime.b.d()) {
                    i3 = 57344;
                    androidx.compose.runtime.b.f(-1672505124, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MagicWandOutline24> (VkSdkIcons.kt:2450)");
                } else {
                    i3 = 57344;
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_magic_wand_outline_24, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                boolean y = M.y(view) | ((i2 & 112) == 32);
                Object x3 = M.x();
                if (y || x3 == c0012a) {
                    x3 = new gs1(view, izsVar, wh50Var, 2);
                    M.R(x3);
                }
                int i4 = i2 << 6;
                bhu0.e((gzs) x3, buttonSize2, buttonStyle2, buttonAppearance2, q630Var, null, false, false, a2, null, null, str2, null, null, null, null, false, null, null, null, M, (i4 & i3) | 1073745328, i4 & 896, 0, 4189664);
                aVar2 = M;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new es5(i, 3, str, izsVar, q630Var);
        }
    }
}
