package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkBaseSegment.kt */
/* loaded from: classes17.dex */
public final class veu0 {
    public static final void a(final boolean z, q630 q630Var, final String str, final lg90 lg90Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-374560497);
        int i2 = i | (M.l(z) ? 4 : 2) | 48 | (M.J(str) ? 256 : 128) | (M.y(lg90Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-374560497, i2, -1, "com.vk.core.compose.component.VkBaseSegment (VkBaseSegment.kt:36)");
            }
            int i3 = i2 & 14;
            bjv0.a().getClass();
            M.K(-114907849);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-114907849, i3, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSegmentedControlDefaults.contentTextColor (MilkshakeSegmentedControlDefaults.kt:48)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            mtk0 b = lwj0.b(j, null, "Base Segment text color animation", M, 384, 10);
            bjv0.a().getClass();
            M.K(-376760957);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-376760957, i3, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSegmentedControlDefaults.contentIconColor (MilkshakeSegmentedControlDefaults.kt:51)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var2.getIcon().a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            mtk0 b2 = lwj0.b(j2, null, "Base Segment icon color animation", M, 384, 10);
            bjv0.a().getClass();
            M.K(928376592);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(928376592, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSegmentedControlDefaults.contentPadding (MilkshakeSegmentedControlDefaults.kt:40)");
            }
            u890 m = s200.m(kqu0.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            q630.a aVar3 = q630.a.a;
            q630 C = s200.C(aVar3, m);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.s);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, C);
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
            if (lg90Var == null) {
                M.K(-1437729537);
            } else {
                M.K(-1437729536);
                pzu0.b(lg90Var, null, txj0.q(aVar3, 20), ((l5g) b2.getValue()).a, M, ((i2 >> 9) & 14) | 440, 0);
                M = M;
            }
            M.j();
            if (str == null) {
                M.K(-1437499641);
                M.j();
                aVar2 = aVar3;
            } else {
                M.K(-1437499640);
                bjv0.a().getClass();
                M.K(1801335879);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1801335879, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSegmentedControlDefaults.contentTextStyle (MilkshakeSegmentedControlDefaults.kt:44)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.O;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                androidx.compose.runtime.a aVar5 = M;
                aVar2 = aVar3;
                yqv0.c(str, null, ((l5g) b.getValue()).a, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar5, ((i2 >> 6) & 14) | 100663296, 48, 5882);
                M = aVar5;
                M.j();
            }
            M.G();
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
            s.d = new wzs(z, q630Var2, str, lg90Var, i) { // from class: xsna.ueu0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ q630 c;
                public final /* synthetic */ String d;
                public final /* synthetic */ lg90 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(4097);
                    veu0.a(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
