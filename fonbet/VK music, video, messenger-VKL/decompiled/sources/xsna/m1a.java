package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.video.impl.catalog.banner.CatalogBannerView;
import com.vungle.ads.internal.protos.Sdk;
import xsna.d16;
import xsna.z06;

/* compiled from: CatalogBannerView.kt */
/* loaded from: classes16.dex */
public final class m1a {
    public static final void a(CatalogBannerView.BannerViewState bannerViewState, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-554663872);
        if ((i & 6) == 0) {
            i2 = (M.J(bannerViewState) ? 4 : 2) | i;
        } else {
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
                androidx.compose.runtime.b.f(-554663872, i2, -1, "com.vk.catalog.mvi.block.video.impl.catalog.banner.ui.CatalogBannerView (CatalogBannerView.kt:26)");
            }
            String str = bannerViewState.e;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new rf(10);
                M.R(x);
            }
            lg90 l = fwu0.l(null, str, (izs) x, null, M, 24576, 45);
            q630 f = txj0.f(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var), 1.0f);
            String str2 = bannerViewState.d;
            vsa0 a = d16.c.b.a.a(bannerViewState.c, null, M, 384, 2);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new gv3(6);
                M.R(x2);
            }
            xl20 a2 = d16.b.a(str2, null, a, null, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 100663296, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new qk(4, izsVar, bannerViewState);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new com.vk.movika.sdk.base.utils.b(4);
                M.R(x4);
            }
            x61 a3 = z06.b.a.a(gzsVar, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), null, null, null, M, 1572864, 58);
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object x5 = M.x();
            if (z2 || x5 == c0012a) {
                x5 = new sk(6, izsVar, bannerViewState);
                M.R(x5);
            }
            beu0.a(a2, f, null, l, null, null, null, null, a3, null, null, (gzs) x5, M, 4096, 0, 1780);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new l1a(i, 0, bannerViewState, izsVar, q630Var);
        }
    }
}
