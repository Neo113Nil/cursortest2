package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import xsna.q630;

/* compiled from: CommunityProfileLinksComponent.kt */
/* loaded from: classes3.dex */
public final class pqh {
    public static final void a(wqh wqhVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1660229393);
        int i2 = i | (M.J(wqhVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1660229393, i2, -1, "com.vk.music.screens.about.CommunityProfileLinkContent (CommunityProfileLinksComponent.kt:57)");
            }
            xvy a = zvy.a(0, 3, M);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new u6(13, wqhVar, izsVar);
                M.R(x);
            }
            q630Var2 = q630.a.a;
            lqy.a(q630Var2, a, null, null, null, null, false, null, (izs) x, M, 6, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new m2(wqhVar, izsVar, q630Var2, i, 4);
        }
    }

    public static final void b(wqh wqhVar, izs<? super iqh, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-619496276);
        if ((i & 6) == 0) {
            i2 = (M.J(wqhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-619496276, i2, -1, "com.vk.music.screens.about.CommunityProfileLinksScreen (CommunityProfileLinksComponent.kt:34)");
            }
            rrv0.d(null, null, null, null, kai.c(-1813501039, new jkd(1, izsVar, wqhVar), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jqh(wqhVar, izsVar, i, 0);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, String str, izs izsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1108450508);
        int i2 = i | (M.J(str) ? 4 : 2) | 48 | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1108450508, i2, -1, "com.vk.music.screens.about.ToolbarView (CommunityProfileLinksComponent.kt:114)");
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i2 & 14) | 196608, 30), null, null, null, M, 14);
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new dx(izsVar, 1);
                M.R(x);
            }
            TopBar$Before.e a2 = e.a.a((gzs) x, null, null, null, null, M, 196608, 30);
            q630.a aVar2 = q630.a.a;
            muv0.h(a, aVar2, null, null, a2, null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 8172);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ex(i, 2, str, q630Var2, izsVar);
        }
    }
}
