package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ttg;
import xsna.ty6;

/* compiled from: CommunityCategorySuggestionInfoContentView.kt */
/* loaded from: classes5.dex */
public final class otg extends i6v0<wtg, ltg> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((wtg) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(ttg.a aVar, izs<? super ltg, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        us2 j;
        a.C0011a.C0012a c0012a;
        boolean z;
        Object x;
        androidx.compose.runtime.a M = aVar2.M(-984508180);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-984508180, i2, -1, "com.vk.profile.community.suggestions.impl.ui.categorysuggestionsinfo.CommunityCategorySuggestionInfoContentView.ContentView (CommunityCategorySuggestionInfoContentView.kt:56)");
            }
            wh50 a = jk50.a(aVar.b, M, 0, 3);
            wh50 a2 = jk50.a(aVar.a, M, 0, 3);
            s8u0 s8u0Var = (s8u0) a.getValue();
            if (s8u0Var == null) {
                M.K(848786082);
                M.j();
                j = null;
            } else {
                M.K(-1219545793);
                j = s8u0Var.j(8, M);
                M.j();
            }
            if (j == null) {
                j = new us2("");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.d, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar4 = q630.a.a;
            q630 c = qri.c(M, aVar4);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object x2 = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z2 || x2 == c0012a2) {
                x2 = new cr0(izsVar, 3);
                M.R(x2);
            }
            us2 us2Var = j;
            nzu0.e((gzs) x2, s200.D(aVar4, 10), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, p490.b, M, 100663344, 252);
            M.G();
            ty6.a aVar6 = dt1.a.o;
            q630 D2 = s200.D(aVar4, 16);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, aVar6, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            float f = 8;
            pzu0.b(pg90.a(R.drawable.vk_icon_info_outline_56, 0, M), null, s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 5), wlb0.h(M).getIcon().b, M, 440, 0);
            String str = (String) a2.getValue();
            yqv0.c(str == null ? "" : str, s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 5), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).C, M, 0, 0, 8120);
            frv0 frv0Var = wlb0.l(M).e0;
            long j2 = wlb0.h(M).getText().r;
            long l = l2l0.l(18);
            long j3 = l2l0.j(0.2d);
            obo0 obo0Var = new obo0(3);
            boolean J = M.J(us2Var) | (i3 == 32);
            Object x3 = M.x();
            if (J) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
                if (x3 != c0012a) {
                    vku0.a(us2Var, null, j2, 0L, j3, obo0Var, l, null, 0, false, 0, null, null, (izs) x3, null, frv0Var, M, 12582912, 48, 783226);
                    q630 H = s200.H(txj0.f(aVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    String N = d370.N(R.string.community_category_suggestions_modal_close, 0, M);
                    ButtonSize buttonSize = ButtonSize.Large;
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    z = i3 == 32;
                    x = M.x();
                    if (!z || x == c0012a) {
                        x = new zc4(izsVar, 2);
                        M.R(x);
                    }
                    bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, H, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
                    aVar3 = M;
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            x3 = new lh(9, us2Var, izsVar);
            M.R(x3);
            vku0.a(us2Var, null, j2, 0L, j3, obo0Var, l, null, 0, false, 0, null, null, (izs) x3, null, frv0Var, M, 12582912, 48, 783226);
            q630 H2 = s200.H(txj0.f(aVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            String N2 = d370.N(R.string.community_category_suggestions_modal_close, 0, M);
            ButtonSize buttonSize2 = ButtonSize.Large;
            ButtonStyle buttonStyle2 = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance2 = ButtonAppearance.Accent;
            if (i3 == 32) {
            }
            x = M.x();
            if (!z) {
            }
            x = new zc4(izsVar, 2);
            M.R(x);
            bhu0.e((gzs) x, buttonSize2, buttonStyle2, buttonAppearance2, H2, null, false, false, null, null, null, N2, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
            aVar3 = M;
            aVar3.G();
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new fy7(i, 3, this, aVar, izsVar);
        }
    }

    public final void i(wtg wtgVar, izs<? super ltg, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-799146602);
        int i2 = (M.J(wtgVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-799146602, i2, -1, "com.vk.profile.community.suggestions.impl.ui.categorysuggestionsinfo.CommunityCategorySuggestionInfoContentView.ThemedContent (CommunityCategorySuggestionInfoContentView.kt:45)");
            }
            int i3 = i2 & 896;
            ttg ttgVar = (ttg) d(ttg.b.a, new n0u0[]{wtgVar.a}, M, 518 | i3).getValue();
            ttg.a aVar2 = ttgVar instanceof ttg.a ? (ttg.a) ttgVar : null;
            if (aVar2 == null) {
                M.K(-372358538);
            } else {
                M.K(-372358537);
                h(aVar2, izsVar, M, i3 | (i2 & 112) | 512);
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
            s.d = new br0(i, 4, this, wtgVar, izsVar);
        }
    }
}
