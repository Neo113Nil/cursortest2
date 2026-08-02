package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: PromoGameBanner.kt */
/* loaded from: classes17.dex */
public final class e5e0 {
    public static final void a(w7t w7tVar, final rha rhaVar, final izs izsVar, final xvy xvyVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        w7t w7tVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1576473441);
        int i2 = i | (M.J(w7tVar) ? 4 : 2) | (M.J(rhaVar) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(xvyVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1576473441, i2, -1, "com.vk.games.presentation.components.items.PromoGameBanner (PromoGameBanner.kt:45)");
            }
            uog0 b = vog0.b(kqu0.e);
            float f = kqu0.v;
            q630 m = hr80.m(rte0.d(r18.a((float) 0.5d, wlb0.h(M).getImage().a, txj0.f(txj0.h(s200.E(q630Var, kqu0.w, f), Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), 1.0f), b), b), l5g.b, androidx.compose.ui.graphics.e.a);
            int i3 = i2 & 896;
            int i4 = i2 & 14;
            boolean z = (i3 == 256) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new wo1(16, izsVar, w7tVar);
                aVar2 = M;
                aVar2.R(x);
            } else {
                aVar2 = M;
            }
            q630 c = ojc.c(m, false, null, null, (gzs) x, 15);
            boolean z2 = rhaVar.b;
            float f2 = rhaVar.c;
            boolean z3 = (i4 == 4) | (i3 == 256);
            Object x2 = aVar2.x();
            if (z3 || x2 == c0012a) {
                x2 = new uh3(23, w7tVar, izsVar);
                aVar2.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            boolean z4 = (i4 == 4) | (i3 == 256);
            Object x3 = aVar2.x();
            if (z4 || x3 == c0012a) {
                x3 = new vq6(21, w7tVar, izsVar);
                aVar2.R(x3);
            }
            q630 E = ahn.E(vbh0.f(c, z2, xvyVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, null, gzsVar, (gzs) x3, 52), "promoBanner");
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(aVar2));
            sy90 D = aVar2.D();
            q630 c2 = qri.c(aVar2, E);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar3);
            } else {
                aVar2.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(aVar2, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(aVar2, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(aVar2, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(aVar2, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(aVar2, c2, dVar);
            WebImageSize d2 = w7tVar.g.d();
            androidx.compose.runtime.a aVar4 = aVar2;
            boolean z5 = false;
            lg90 l = fwu0.l(null, d2 != null ? d2.b : null, null, null, aVar4, 0, 61);
            q630.a aVar5 = q630.a.a;
            vjw.a(l, null, txj0.d(aVar5, 1.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar4, 440, 120);
            q630 D2 = s200.D(txj0.d(aVar5, 1.0f), f);
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar4, 6);
            int hashCode2 = Long.hashCode(n34.n(aVar4));
            sy90 D3 = aVar4.D();
            q630 c3 = qri.c(aVar4, D2);
            if (aVar4.N() == null) {
                n34.r();
                throw null;
            }
            aVar4.H();
            if (aVar4.L()) {
                aVar4.I(aVar3);
            } else {
                aVar4.f();
            }
            k9q0.w(aVar4, a, cVar);
            k9q0.w(aVar4, D3, eVar);
            ur.d(hashCode2, aVar4, bVar, aVar4, c2678a);
            k9q0.w(aVar4, c3, dVar);
            w7tVar2 = w7tVar;
            yqv0.c(w7tVar2.d, txj0.C(aVar5, null, 3), wlb0.h(aVar4).getText().d, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(aVar4).J, aVar4, 100663344, 48, 5880);
            String str = w7tVar2.e;
            frv0 frv0Var = wlb0.l(aVar4).d0;
            long j = wlb0.h(aVar4).getText().d;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            float f3 = kqu0.q;
            yqv0.c(str, txj0.C(s200.H(xpyVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), null, 3), j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar4, 0, 0, 8184);
            if (w7tVar2.h != null) {
                aVar4.K(-843508037);
                String str2 = w7tVar2.h;
                ButtonStyle buttonStyle = ButtonStyle.Primary;
                ButtonSize buttonSize = ButtonSize.Small;
                ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
                q630 H = s200.H(aVar5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                boolean z6 = i3 == 256;
                if (i4 == 4) {
                    z5 = true;
                }
                boolean z7 = z6 | z5;
                Object x4 = aVar4.x();
                if (z7 || x4 == c0012a) {
                    x4 = new com.vk.movika.sdk.base.flow.binding.g(21, izsVar, w7tVar2);
                    aVar4.R(x4);
                }
                bhu0.e((gzs) x4, buttonSize, buttonStyle, buttonAppearance, H, null, false, false, null, null, null, str2, null, null, null, null, false, null, null, null, aVar4, X2.b.f, 0, 0, 4190176);
                M = aVar4;
            } else {
                M = aVar4;
                M.K(-848074523);
            }
            M.j();
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            w7tVar2 = w7tVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final w7t w7tVar3 = w7tVar2;
            s.d = new wzs(rhaVar, izsVar, xvyVar, q630Var, i) { // from class: xsna.d5e0
                public final /* synthetic */ rha c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ xvy e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    e5e0.a(w7t.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
