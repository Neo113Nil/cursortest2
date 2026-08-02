package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ModalErrorContent.kt */
/* loaded from: classes4.dex */
public final class qz20 {
    public static final void a(q630 q630Var, final int i, final int i2, final lg90 lg90Var, long j, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i3) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        final long j2;
        long j3;
        int i4;
        q630 q630Var3;
        int i5;
        long j4;
        q630.a aVar3;
        int i6;
        int i7;
        String str;
        int i8;
        androidx.compose.runtime.a M = aVar.M(-1442764006);
        int i9 = i3 | 6 | (M.o(i) ? 32 : 16) | (M.o(i2) ? 256 : 128) | (M.y(lg90Var) ? 2048 : 1024) | 8192 | (M.y(gzsVar) ? 131072 : 65536);
        if (M.t(i9 & 1, (74899 & i9) != 74898)) {
            M.V();
            int i10 = i3 & 1;
            q630.a aVar4 = q630.a.a;
            if (i10 == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j3 = ylu0Var.getIcon().l;
                i4 = i9 & (-57345);
                q630Var3 = aVar4;
            } else {
                M.h();
                j3 = j;
                i4 = i9 & (-57345);
                q630Var3 = q630Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1442764006, i4, -1, "com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.posting.ModalErrorState (ModalErrorContent.kt:36)");
            }
            q630 H = s200.H(txj0.f(q630Var3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 40, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, 5);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (lg90Var != null) {
                M.K(707140521);
                aVar3 = aVar4;
                i5 = i4;
                i7 = 1040687336;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                i6 = -1;
                pzu0.b(lg90Var, null, s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.w, 7), j3, M, ((i4 >> 9) & 14) | 56, 0);
                j4 = j3;
            } else {
                i5 = i4;
                j4 = j3;
                aVar3 = aVar4;
                i6 = -1;
                i7 = 1040687336;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                M.K(705255442);
            }
            M.j();
            String N = d370.N(i, (i5 >> 3) & 14, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(i7, 0, i6, str);
            }
            ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j5 = ylu0Var2.getText().m;
            if (androidx.compose.runtime.b.d()) {
                i8 = 0;
                androidx.compose.runtime.b.f(-473561179, 0, i6, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            } else {
                i8 = 0;
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 q630Var4 = q630Var3;
            yqv0.c(N, s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), j5, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var.C, M, 0, 0, 8120);
            f9t.e(txj0.h(aVar3, kqu0.y), M, i8);
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Medium, ButtonStyle.Tertiary, ButtonAppearance.Accent, null, null, false, false, null, null, null, d370.N(i2, (i5 >> 6) & 14, M), null, null, null, null, false, null, null, null, aVar2, ((i5 >> 15) & 14) | X2.b.f, 0, 0, 4190192);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var4;
            j2 = j4;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
            j2 = j;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(i, i2, lg90Var, j2, gzsVar, i3) { // from class: xsna.pz20
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ lg90 e;
                public final /* synthetic */ long f;
                public final /* synthetic */ gzs g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(4097);
                    qz20.a(q630.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
