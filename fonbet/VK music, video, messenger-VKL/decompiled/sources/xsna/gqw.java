package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: ImportContactsDetailsView.kt */
/* loaded from: classes2.dex */
public final class gqw {
    public static final void a(final String str, wh50<Integer> wh50Var, final izs<? super cqw, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1879972377);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(wh50Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1879972377, i2, -1, "com.vk.importcontacts.impl.presentation.details.view.InternalContent (ImportContactsDetailsView.kt:77)");
            }
            final float j1 = ((azl) M.r(uvi.h)).j1(wh50Var.getValue().intValue());
            aVar2 = M;
            phv0.b(txj0.d(q630.a.a, 1.0f), null, null, null, null, 0, 0L, 0L, kai.c(1418433547, new yzs() { // from class: xsna.eqw
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1418433547, intValue, -1, "com.vk.importcontacts.impl.presentation.details.view.InternalContent.<anonymous> (ImportContactsDetailsView.kt:85)");
                        }
                        q630 d = txj0.d(q630.a.a, 1.0f);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getBackground().g;
                        final izs izsVar2 = izs.this;
                        final float f = j1;
                        final String str2 = str;
                        uov0.a(d, null, j, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(720003684, new wzs() { // from class: xsna.fqw
                            @Override // xsna.wzs
                            public final Object invoke(Object obj4, Object obj5) {
                                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(720003684, intValue2, -1, "com.vk.importcontacts.impl.presentation.details.view.InternalContent.<anonymous>.<anonymous> (ImportContactsDetailsView.kt:90)");
                                    }
                                    q630.a aVar5 = q630.a.a;
                                    q630 d2 = txj0.d(aVar5, 1.0f);
                                    dt1.a.getClass();
                                    cp10 d3 = ja8.d(dt1.a.b, false);
                                    int hashCode = Long.hashCode(n34.n(aVar4));
                                    sy90 D = aVar4.D();
                                    q630 c = qri.c(aVar4, d2);
                                    cri.h7.getClass();
                                    LayoutNode.a aVar6 = cri.a.b;
                                    if (aVar4.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar4.H();
                                    if (aVar4.L()) {
                                        aVar4.I(aVar6);
                                    } else {
                                        aVar4.f();
                                    }
                                    cri.a.c cVar = cri.a.f;
                                    k9q0.w(aVar4, d3, cVar);
                                    cri.a.e eVar = cri.a.e;
                                    k9q0.w(aVar4, D, eVar);
                                    Integer valueOf = Integer.valueOf(hashCode);
                                    cri.a.b bVar = cri.a.g;
                                    k9q0.w(aVar4, valueOf, bVar);
                                    cri.a.C2678a c2678a = cri.a.h;
                                    k9q0.t(aVar4, c2678a);
                                    cri.a.d dVar = cri.a.d;
                                    k9q0.w(aVar4, c, dVar);
                                    q630 D2 = p490.D(s200.H(txj0.f(aVar5, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 68, 7), p490.x(aVar4), 14);
                                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar4, 0);
                                    int hashCode2 = Long.hashCode(n34.n(aVar4));
                                    sy90 D3 = aVar4.D();
                                    q630 c2 = qri.c(aVar4, D2);
                                    if (aVar4.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar4.H();
                                    if (aVar4.L()) {
                                        aVar4.I(aVar6);
                                    } else {
                                        aVar4.f();
                                    }
                                    k9q0.w(aVar4, a, cVar);
                                    k9q0.w(aVar4, D3, eVar);
                                    ur.d(hashCode2, aVar4, bVar, aVar4, c2678a);
                                    k9q0.w(aVar4, c2, dVar);
                                    vjw.a(xus.s(str2, s7g.a(R.color.vk_azure_A100, aVar4), aVar4, 0, 0), null, sua.d(1.0f, txj0.f(aVar5, 1.0f), false), null, wkj.a.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar4, 25016, 104);
                                    float f2 = 16;
                                    yqv0.c(d370.N(R.string.import_contacts_details_title, 0, aVar4), s200.H(aVar5, f2, f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 0L, null, null, 0, 5, null, 0, false, 0, 0, null, wlb0.l(aVar4).g, aVar4, 0, 0, 8124);
                                    float f3 = 12;
                                    yqv0.c(d370.N(R.string.import_contacts_details_subtitle, 0, aVar4), s200.H(aVar5, f2, f3, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), wlb0.h(aVar4).getText().p, null, null, 0, 5, null, 0, false, 0, 0, null, wlb0.l(aVar4).p1, aVar4, 0, 0, 8120);
                                    aVar4.G();
                                    q630 b = ra8.a.b(s200.E(txj0.f(aVar5, 1.0f), f2, f3), dt1.a.i);
                                    String N = d370.N(R.string.import_contacts_import_button_text, 0, aVar4);
                                    ButtonSize buttonSize = ButtonSize.Large;
                                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                                    izs izsVar3 = izs.this;
                                    boolean J = aVar4.J(izsVar3);
                                    Object x = aVar4.x();
                                    Object obj6 = a.C0011a.a;
                                    if (J || x == obj6) {
                                        x = new j97(izsVar3, 2);
                                        aVar4.R(x);
                                    }
                                    bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, b, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar4, X2.b.f, 0, 0, 4190176);
                                    q630 q = txj0.q(s200.H(s200.D(aVar5, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 28);
                                    boolean J2 = aVar4.J(izsVar3);
                                    Object x2 = aVar4.x();
                                    if (J2 || x2 == obj6) {
                                        x2 = new u78(izsVar3, 1);
                                        aVar4.R(x2);
                                    }
                                    nzu0.e((gzs) x2, q, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, sgi.a, aVar4, 100663296, 252);
                                    aVar4.G();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar4.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar3), aVar3, 1572870, 58);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 805306374, 510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new guc(i, 2, str, wh50Var, izsVar);
        }
    }
}
