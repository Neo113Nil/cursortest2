package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.n610;
import xsna.q630;

/* compiled from: MarketItemsForReviewComposeScreen.kt */
/* loaded from: classes18.dex */
public final class q510 extends i6v0<n610, e510> {
    public final ComposeView f;
    public final Object g;

    static {
        int i = ComposeView.n;
    }

    public q510(f510 f510Var, Context context, ComposeView composeView, f4z f4zVar) {
        super(context, f510Var);
        this.f = composeView;
        this.g = f4zVar;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((n610) ao50Var, izsVar, aVar, 512);
    }

    @Override // xsna.kk50, xsna.jj50
    public final ComposeView c() {
        return this.f;
    }

    @Override // xsna.kk50
    /* renamed from: e */
    public final ComposeView c() {
        return this.f;
    }

    public final void h(n610 n610Var, izs<? super e510, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-157322560);
        int i2 = (M.J(n610Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-157322560, i2, -1, "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.MarketItemsForReviewComposeScreen.ThemedContent (MarketItemsForReviewComposeScreen.kt:42)");
            }
            n0u0[] n0u0VarArr = {n610Var.a, n610Var.d, n610Var.c, n610Var.b};
            int i3 = ComposeView.n;
            wh50 d = d(n610.d.a, n0u0VarArr, M, (i2 & 896) | 518);
            float f = 12;
            q630 d2 = rte0.d(xp2.a(txj0.f(txj0.z(q630.a.a, null, 3), 1.0f), null, 3), vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d2);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            r510.a(izsVar, M, (i2 >> 3) & 14);
            ijk.a((fm50) d.getValue(), null, null, "MarketItemsForReviewComposeView", kai.c(-1275857437, new wqz(izsVar, this), M), M, 27648, 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cr7(i, 5, this, n610Var, izsVar);
        }
    }
}
