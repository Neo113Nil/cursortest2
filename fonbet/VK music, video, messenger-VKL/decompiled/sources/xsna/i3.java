package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.video.playlist.playlistscreen.catalog.n;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dai;
import xsna.dt1;
import xsna.psn0;
import xsna.q630;
import xsna.u710;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class i3 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i3(izs izsVar, wh50 wh50Var) {
        this.b = 0;
        this.c = izsVar;
        this.d = wh50Var;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1865393635, intValue, -1, "com.vk.superapp.presentation.about.compose.AboutAppToolbar.<anonymous>.<anonymous> (AboutAppToolbar.kt:113)");
                    }
                    String N = d370.N(R.string.apps_about_app_terms_title, 0, aVar);
                    float f = 8;
                    q630.a aVar2 = q630.a.a;
                    q630 H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    izs izsVar = this.c;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new com.vk.movika.sdk.base.logic.processor.actions.e(1, izsVar, wh50Var);
                        aVar.R(x);
                    }
                    l3.a(R.drawable.vk_icon_article_box_outline_24, 384, aVar, N, (gzs) x, H);
                    String N2 = d370.N(R.string.apps_about_app_privacy_policy_title, 0, aVar);
                    q630 H2 = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 7);
                    boolean J2 = aVar.J(izsVar);
                    Object x2 = aVar.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new j3(0, izsVar, wh50Var);
                        aVar.R(x2);
                    }
                    l3.a(R.drawable.vk_icon_document_outline_24, 384, aVar, N2, (gzs) x2, H2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                u710 u710Var = (u710) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1439862849, intValue2, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.LinkedContentScreen.<anonymous> (MarketLinkedContentScreen.kt:205)");
                    }
                    q630.a aVar4 = q630.a.a;
                    q630 d = txj0.d(aVar4, 1.0f);
                    dt1.a.getClass();
                    ty6 ty6Var = dt1.a.b;
                    cp10 d2 = ja8.d(ty6Var, false);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, d);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar5);
                    } else {
                        aVar3.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar3, d2, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar3, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar3, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar3, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar3, c, dVar);
                    u710.a aVar6 = u710Var.b;
                    boolean z = aVar6 instanceof u710.a.d;
                    ra8 ra8Var = ra8.a;
                    if (z) {
                        aVar3.K(1953626772);
                        q630 d3 = txj0.d(aVar4, 1.0f);
                        cp10 d4 = ja8.d(ty6Var, false);
                        int hashCode2 = Long.hashCode(n34.n(aVar3));
                        sy90 D2 = aVar3.D();
                        q630 c2 = qri.c(aVar3, d3);
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar5);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, d4, cVar);
                        k9q0.w(aVar3, D2, eVar);
                        ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
                        k9q0.w(aVar3, c2, dVar);
                        zfr0.f(SpinnerState.Loading, ra8Var.b(aVar4, dt1.a.f), null, 0L, SpinnerSize.Size56, null, aVar3, 24582, 44);
                        aVar3.G();
                        aVar3.j();
                    } else {
                        boolean z2 = aVar6 instanceof u710.a.c;
                        izs izsVar2 = this.c;
                        a.C0011a.C0012a c0012a2 = a.C0011a.a;
                        if (z2) {
                            aVar3.K(1954110713);
                            q630 b = ra8Var.b(aVar4, dt1.a.f);
                            Throwable th = ((u710.a.c) aVar6).b;
                            boolean a = th != null ? h03.a(th) : false;
                            boolean J3 = aVar3.J(izsVar2) | aVar3.J(u710Var);
                            Object x3 = aVar3.x();
                            if (J3 || x3 == c0012a2) {
                                x3 = new j3(16, izsVar2, u710Var);
                                aVar3.R(x3);
                            }
                            j710.a(0, aVar3, (gzs) x3, b, a);
                            aVar3.j();
                        } else if (aVar6 instanceof u710.a.C3787a) {
                            aVar3.K(1954790233);
                            u710.a.C3787a c3787a = (u710.a.C3787a) aVar6;
                            boolean J4 = aVar3.J(izsVar2);
                            Object x4 = aVar3.x();
                            if (J4 || x4 == c0012a2) {
                                x4 = new g74(izsVar2, 4);
                                aVar3.R(x4);
                            }
                            j710.c(u710Var, c3787a, (izs) x4, aVar3, 0);
                            aVar3.j();
                        } else {
                            if (!epx.f(aVar6, u710.a.b.b)) {
                                throw alb0.c(-352623298, aVar3);
                            }
                            aVar3.K(1955031289);
                            aVar3.j();
                        }
                    }
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 2:
                com.vk.video.playlist.playlistscreen.catalog.n nVar = (com.vk.video.playlist.playlistscreen.catalog.n) this.d;
                k1i0 k1i0Var = (k1i0) obj;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar7.J(k1i0Var) ? 4 : 2;
                }
                int i = intValue3;
                int i2 = 0;
                if (aVar7.t(i & 1, (i & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(386566685, i, -1, "com.vk.video.playlist.playlistscreen.catalog.PlaylistHorizontalFiltersWithScrollView.BlockView.ContentImpl.<anonymous> (PlaylistHorizontalFiltersWithScrollView.kt:130)");
                    }
                    for (Object obj4 : nVar.c) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            e43.t();
                            throw null;
                        }
                        n.a aVar8 = (n.a) obj4;
                        boolean z3 = aVar8.b;
                        izs izsVar3 = this.c;
                        boolean J5 = aVar7.J(izsVar3) | aVar7.J(nVar) | aVar7.o(i2);
                        Object x5 = aVar7.x();
                        Object obj5 = a.C0011a.a;
                        if (J5 || x5 == obj5) {
                            x5 = new h21(izsVar3, nVar, i2);
                            aVar7.R(x5);
                        }
                        gzs<s3q0> gzsVar = (gzs) x5;
                        String str = aVar8.a;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1591975853, 48, -1, "com.vk.core.compose.component.tabs.TabItem.Middle.Text.Companion.invoke (VkTabItem.kt:181)");
                        }
                        Object x6 = aVar7.x();
                        if (x6 == obj5) {
                            x6 = new psn0.a(str);
                            aVar7.R(x6);
                        }
                        psn0.a aVar9 = (psn0.a) x6;
                        ((zak0) aVar9.b).setValue(str);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        k1i0Var.c(z3, gzsVar, null, aVar9, null, null, null, aVar7, (i << 21) & 29360128, 116);
                        i2 = i3;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            default:
                xrs0 xrs0Var = (xrs0) this.d;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar10 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar10.J(q630Var) ? 4 : 2;
                }
                if (aVar10.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1712940369, intValue4, -1, "com.vk.catalog.mvi.block.video.impl.video.largelist.VideoLargeListView.BlockView.ContentImpl.<anonymous> (VideoLargeListView.kt:322)");
                    }
                    dai.c a2 = xrs0Var.e.a();
                    izs izsVar4 = this.c;
                    boolean J6 = aVar10.J(izsVar4) | aVar10.J(xrs0Var);
                    Object x7 = aVar10.x();
                    if (J6 || x7 == a.C0011a.a) {
                        x7 = new d7s0(2, izsVar4, xrs0Var);
                        aVar10.R(x7);
                    }
                    a2.c((gzs) x7, aVar10, 0);
                    cg0.a(xrs0Var.e, q630Var, aVar10, (intValue4 << 3) & 112);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar10.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ i3(lm50 lm50Var, izs izsVar, int i) {
        this.b = i;
        this.d = lm50Var;
        this.c = izsVar;
    }
}
