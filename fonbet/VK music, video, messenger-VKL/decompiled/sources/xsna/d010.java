package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MarketIntegrationInfoBlock.kt */
/* loaded from: classes18.dex */
public final class d010 extends rpo0 {
    public izs<? super MarketItemLabelActionDto, s3q0> m;
    public final wh50<e010> n;

    public d010(Context context) {
        super(context, null, 0);
        this.n = androidx.compose.runtime.k.b(new e010(null, null));
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> phgVar;
        androidx.compose.runtime.a M = aVar.M(1087848635);
        int i2 = i | (M.J(this) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1087848635, i2, -1, "com.vk.ecomm.catalog.impl.catalog.common.ui.holder.infoblock.MarketIntegrationInfoBlock.ThemedContent (MarketIntegrationInfoBlock.kt:51)");
            }
            zak0 zak0Var = (zak0) this.n;
            if (((e010) zak0Var.getValue()).a == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    phgVar = new pg(this, i, 3);
                    s.d = phgVar;
                }
                return;
            }
            q630.a aVar3 = q630.a.a;
            float f = 16;
            q630 G = s200.G(txj0.f(aVar3, 1.0f), f, 4, f, f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, G);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            jqu0.a(null, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 15);
            ContentBadgeSize contentBadgeSize = ContentBadgeSize.Large;
            ContentBadgeMode contentBadgeMode = ContentBadgeMode.Secondary;
            ContentBadgeAppearance.Design design = ContentBadgeAppearance.Design.Accent;
            q630 H = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new mxj(this, 26);
                M.R(x);
            }
            q630 c2 = ojc.c(H, false, null, null, (gzs) x, 15);
            qzu0.a.getClass();
            lg90 v = qzu0.v(M);
            long j = l5g.k;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1304645628, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronOutline16> (VkSdkIcons.kt:472)");
            }
            lg90 b = or.b(M, 1539019876, R.drawable.vk_icon_chevron_outline_16, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            rnu0.c(contentBadgeSize, contentBadgeMode, design, c2, v, new l5g(j), ((e010) zak0Var.getValue()).a, null, b, null, false, null, false, null, aVar2, 134447542, 0, 16000);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        s = aVar2.s();
        if (s != null) {
            phgVar = new phg(this, i, 6);
            s.d = phgVar;
        }
    }

    public final void setOnClickListener(izs<? super MarketItemLabelActionDto, s3q0> izsVar) {
        this.m = izsVar;
    }

    public final void setState(e010 e010Var) {
        ((zak0) this.n).setValue(e010Var);
    }
}
