package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.banner.Banner$BackgroundMode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.d16;
import xsna.dt1;
import xsna.q630;

/* compiled from: PromoGameBannerLego.kt */
/* loaded from: classes17.dex */
public final class f5e0 {
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a9, code lost:
    
        if (r12 == r11) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w7t w7tVar, rha rhaVar, izs izsVar, xvy xvyVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        a.C0011a.C0012a c0012a;
        q630 q630Var2;
        int i2;
        a.C0011a.C0012a c0012a2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-228809929);
        int i4 = i | (M.J(w7tVar) ? 4 : 2) | (M.J(rhaVar) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(xvyVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-228809929, i4, -1, "com.vk.games.presentation.components.lego_items.PromoGameBannerLego (PromoGameBannerLego.kt:31)");
            }
            q630 E = s200.E(q630Var, kqu0.w, kqu0.v);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            zp8 zp8Var = null;
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 h = txj0.h(q630.a.a, Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
            boolean z = rhaVar.b;
            float f = rhaVar.c;
            int i5 = i4 & 14;
            int i6 = i4 & 896;
            boolean z2 = (i5 == 4) | (i6 == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (z2 || x == c0012a3) {
                x = new defpackage.f0(23, w7tVar, izsVar);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean z3 = (i5 == 4) | (i6 == 256);
            Object x2 = M.x();
            if (z3 || x2 == c0012a3) {
                x2 = new rs0(16, (Object) w7tVar, (Object) izsVar);
                M.R(x2);
            }
            q630 E2 = ahn.E(vbh0.f(h, z, xvyVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, null, gzsVar, (gzs) x2, 52), "promoBanner");
            WebImageSize d2 = w7tVar.g.d();
            lg90 l = fwu0.l(null, d2 != null ? d2.b : null, null, null, M, 0, 61);
            Banner$BackgroundMode banner$BackgroundMode = Banner$BackgroundMode.Dark;
            mzo0 a = d16.e.a.a(w7tVar.d, M);
            s0n0 a2 = d16.d.a.a(w7tVar.e, M);
            String str = w7tVar.h;
            if (str == null) {
                M.K(324011362);
                M.j();
                q630Var2 = E2;
                i3 = 256;
                i2 = i5;
                c0012a2 = c0012a3;
            } else {
                M.K(324011363);
                ButtonStyle buttonStyle = ButtonStyle.Primary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
                ButtonSize buttonSize = ButtonSize.Small;
                boolean z4 = (i6 == 256) | (i5 == 4);
                Object x3 = M.x();
                if (z4) {
                    c0012a = c0012a3;
                } else {
                    c0012a = c0012a3;
                }
                x3 = new com.vk.movika.sdk.base.flow.binding.j(23, izsVar, w7tVar);
                M.R(x3);
                q630Var2 = E2;
                i2 = i5;
                c0012a2 = c0012a;
                i3 = 256;
                zp8Var = d16.a.C2697a.a(buttonStyle, buttonAppearance, buttonSize, str, null, null, null, null, null, null, null, null, (gzs) x3, M, 438, 24576, 8176);
                M = M;
                M.j();
            }
            androidx.compose.runtime.a aVar3 = M;
            xl20 b = d16.b.b(a, a2, null, zp8Var, null, null, null, null, aVar3, 100663296, 244);
            boolean z5 = (i6 == i3) | (i2 == 4);
            Object x4 = aVar3.x();
            if (z5 || x4 == c0012a2) {
                x4 = new pw(28, izsVar, w7tVar);
                aVar3.R(x4);
            }
            beu0.a(b, q630Var2, l, null, null, banner$BackgroundMode, null, null, null, null, null, (gzs) x4, aVar3, 197120, 0, 2008);
            M = aVar3;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jta0(w7tVar, rhaVar, izsVar, xvyVar, q630Var, i);
        }
    }
}
