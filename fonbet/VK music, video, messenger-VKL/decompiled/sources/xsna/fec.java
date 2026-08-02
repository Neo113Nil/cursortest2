package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.wkj;

/* compiled from: CircularStepProgressAvatar.kt */
/* loaded from: classes4.dex */
public final class fec {
    public static final void a(final float f, final q630 q630Var, final String str, final Pair pair, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar.M(1053624219);
        if ((i & 6) == 0) {
            i2 = (M.n(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(pair) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1053624219, i2, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.CircularStepProgressAvatar (CircularStepProgressAvatar.kt:22)");
            }
            q630 q = txj0.q(q630Var, f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (pair != null) {
                M.K(1408888360);
                int intValue = ((Number) pair.i()).intValue();
                int intValue2 = ((Number) pair.j()).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.m().a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3 = M;
                iec.a(intValue2, intValue, j, ylu0Var2.r().b, txj0.m(q630.a.a, f - 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar3, 0);
            } else {
                aVar3 = M;
                aVar3.K(1407912077);
            }
            aVar3.j();
            androidx.compose.runtime.a aVar5 = aVar3;
            fwu0.c(null, null, str, null, null, null, null, kai.c(1716764068, new a0t() { // from class: xsna.dec
                @Override // xsna.a0t
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    lg90 lg90Var = (lg90) obj3;
                    androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj4;
                    int intValue3 = ((Integer) obj5).intValue();
                    if ((intValue3 & 384) == 0) {
                        intValue3 |= (intValue3 & 512) == 0 ? aVar6.J(lg90Var) : aVar6.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar6.t(intValue3 & 1, (intValue3 & 1153) != 1152)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1716764068, intValue3, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.CircularStepProgressAvatar.<anonymous>.<anonymous> (CircularStepProgressAvatar.kt:36)");
                        }
                        ldu0.b(phw.a.a(lg90Var, null, wkj.a.a, null, null, aVar6, 197000 | ((intValue3 >> 6) & 14), 26), f - 8, null, null, null, false, null, null, null, aVar6, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar6.h();
                    }
                    return s3q0.a;
                }
            }, aVar3), aVar5, (i2 & 896) | 100663296, 251);
            aVar2 = aVar5;
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
            s.d = new wzs() { // from class: xsna.eec
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fec.a(f, q630Var, str, pair, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
