package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;

/* compiled from: DzenArticleTopBar.kt */
/* loaded from: classes18.dex */
public final class eso {
    public static final void a(String str, String str2, izs<? super cro, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        String str3;
        String str4;
        izs<? super cro, s3q0> izsVar2;
        androidx.compose.runtime.a M = aVar.M(1968726301);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.J(str2) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1968726301, i2, -1, "com.vk.dzenarticle.impl.ui.view.DzenArticleTopBar (DzenArticleTopBar.kt:38)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean z = str == null;
            str3 = str;
            str4 = str2;
            izsVar2 = izsVar;
            b(str3, str4, izsVar2, z, null, M, i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            if (z) {
                M.K(-37545662);
                c(6, M);
            } else {
                M.K(-39498197);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str3 = str;
            str4 = str2;
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new oyl(str3, str4, izsVar2, i);
        }
    }

    public static final void b(final String str, final String str2, final izs izsVar, final boolean z, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        TopBar$Middle.Text.d dVar;
        boolean z2;
        com.vk.core.compose.component.topbar.a aVar2;
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(135532044);
        int i4 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | 24576;
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(135532044, i4, -1, "com.vk.dzenarticle.impl.ui.view.Toolbar (DzenArticleTopBar.kt:60)");
            }
            String N = d370.N(R.string.talkback_ic_back, 0, M);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new com.vk.movika.sdk.base.observable.s(25);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 2);
            int i5 = i4 & 896;
            boolean z3 = i5 == 256;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new oq5(izsVar, 3);
                M.R(x2);
            }
            a.C0011a.C0012a c0012a2 = c0012a;
            TopBar$Before.e a2 = e.a.a((gzs) x2, N, null, null, a, M, 196608, 12);
            String str3 = str == null ? "" : str;
            TopBar$Middle.Text.Title.Size size = TopBar$Middle.Text.Title.Size.Small;
            Object x3 = M.x();
            if (x3 == c0012a2) {
                x3 = new com.vk.movika.sdk.base.observable.u(24);
                M.R(x3);
            }
            TopBar$Before.a aVar3 = null;
            TopBar$Middle.Text.Title a3 = TopBar$Middle.Text.Title.b.a(str3, null, size, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, 196992, 10);
            if (z) {
                M.K(367157265);
                M.j();
                dVar = null;
            } else {
                M.K(366824450);
                String N2 = d370.N(R.string.dzen_article_dzen_publication, 0, M);
                Object x4 = M.x();
                if (x4 == c0012a2) {
                    x4 = new rd1(16);
                    M.R(x4);
                }
                TopBar$Middle.Text.d a4 = TopBar$Middle.Text.d.a.a(N2, 0, 0, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, 196608, 14);
                M.j();
                dVar = a4;
            }
            boolean z4 = (i4 & 14) == 4;
            Object x5 = M.x();
            if (z4 || x5 == c0012a2) {
                x5 = new cso(str, 0);
                M.R(x5);
            }
            TopBar$Middle.Text a5 = TopBar$Middle.Text.b.a(a3, dVar, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x5, 2), M, 4);
            androidx.compose.runtime.a aVar4 = M;
            if (str2 == null) {
                aVar4.K(367431305);
                aVar4.j();
                z2 = false;
                aVar2 = null;
                i3 = i5;
                i2 = 256;
            } else {
                aVar4.K(367431306);
                z2 = false;
                aVar2 = null;
                i2 = 256;
                i3 = i5;
                c0012a2 = c0012a2;
                TopBar$Before.a b = TopBar$Before.a.C0750a.b(phw.a.a(fwu0.l(null, str2, null, null, aVar4, 0, 61), null, null, null, null, aVar4, 196616, 30), null, null, null, aVar4, 102432768, 158);
                aVar4 = aVar4;
                aVar4.j();
                aVar3 = b;
            }
            qzu0.a.getClass();
            lg90 l1 = qzu0.l1(aVar4);
            boolean z5 = i3 == i2 ? true : z2;
            Object x6 = aVar4.x();
            if (z5 || x6 == c0012a2) {
                x6 = new zje(izsVar, 3);
                aVar4.R(x6);
            }
            androidx.compose.runtime.a aVar5 = aVar4;
            d.c.C0760d a6 = d.c.C0760d.a.a(l1, null, (gzs) x6, null, null, null, aVar5, 1572872, 58);
            lg90 u0 = qzu0.u0(aVar5);
            boolean z6 = i3 != i2 ? z2 : true;
            Object x7 = aVar5.x();
            if (z6 || x7 == c0012a2) {
                x7 = new q0(izsVar, 2);
                aVar5.R(x7);
            }
            com.vk.core.compose.component.topbar.a a7 = str != null ? d.a.a(a6, d.b.a.C0757a.a(u0, null, (gzs) x7, null, null, null, aVar5, 12582920, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), null, null, aVar5, 24576, 12) : aVar2;
            q630.a aVar6 = q630.a.a;
            muv0.h(a5, aVar6, null, null, a2, aVar3, a7, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar5, 48, 0, 8076);
            M = aVar5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar6;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, str2, izsVar, z, q630Var2, i) { // from class: xsna.dso
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    eso.b(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1520041507);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1520041507, i, -1, "com.vk.dzenarticle.impl.ui.view.ToolbarShimmers (DzenArticleTopBar.kt:116)");
            }
            ckv0.a(txj0.f(ra8.a.a(q630.a.a), 1.0f), ckv0.b(null, M, 1), ifi.a, M, 448, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new adf(i);
        }
    }
}
