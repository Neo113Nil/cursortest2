package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wd90;

/* compiled from: MarketItemsForReviewContent.kt */
/* loaded from: classes18.dex */
public final class v510 {
    public static final void a(final List list, final izs izsVar, final wzs wzsVar, mc90 mc90Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        mc90 mc90Var2;
        androidx.compose.runtime.a aVar2;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-746650072);
        if ((i & 6) == 0) {
            i2 = (M.J(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(wzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            mc90Var2 = mc90Var;
            i2 |= M.J(mc90Var2) ? 2048 : 1024;
        } else {
            mc90Var2 = mc90Var;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-746650072, i2, -1, "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.MarketItemsForReviewContent (MarketItemsForReviewContent.kt:29)");
            }
            int o = mc90Var2.o();
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f2 = 16;
            q630 m = hr80.m(f, ylu0Var.getBackground().B, vog0.b(f2));
            float f3 = (float) 0.33d;
            int i5 = i2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final q630 a = r18.a(f3, ylu0Var2.getImage().a, m, vog0.b(f2));
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            nb90.a(mc90Var2, null, s200.m(28, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, 0, 12, null, null, false, null, null, null, null, kai.c(1772549151, new zzs() { // from class: xsna.u510
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int intValue = ((Integer) obj2).intValue();
                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1772549151, intValue2, -1, "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.MarketItemsForReviewContent.<anonymous>.<anonymous> (MarketItemsForReviewContent.kt:53)");
                    }
                    t110.a((s110) list.get(intValue), izsVar, wzsVar, a, aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i5 >> 9) & 14) | 196992, 24576, 16346);
            aVar2 = M;
            if (o > 1) {
                aVar2.K(1623743536);
                f9t.e(txj0.h(aVar3, 3), aVar2, 6);
                i3 = 6;
                oav0.b(wd90.a.a, o, mc90Var.k(), null, 0L, null, null, 0, aVar2, 0, 248);
                aVar2 = aVar2;
                i4 = 8;
            } else {
                i3 = 6;
                aVar2.K(1624047491);
                i4 = 40;
            }
            ck70.b(aVar3, i4, aVar2, i3);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xg7(list, izsVar, wzsVar, mc90Var, q630Var, i);
        }
    }
}
