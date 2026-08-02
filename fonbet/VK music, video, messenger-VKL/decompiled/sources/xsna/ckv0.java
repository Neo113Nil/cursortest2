package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import org.chromium.net.NetError;
import xsna.cri;
import xsna.dt1;
import xsna.ldj0;
import xsna.q630;

/* compiled from: VkSkeletonShimmer.kt */
/* loaded from: classes17.dex */
public final class ckv0 {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        if ((r13 & 2) != 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, jdj0 jdj0Var, final yzs<? super qa8, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-66582915);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && M.y(jdj0Var)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(yzsVar) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (i4 != 0) {
                    q630Var = q630.a.a;
                }
                if ((i2 & 2) != 0) {
                    jdj0Var = b(null, M, 1);
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-66582915, i3, -1, "com.vk.core.compose.component.skeleton.VkSkeletonShimmer (VkSkeletonShimmer.kt:30)");
                }
                q630 a = wdj0.a(q630Var, jdj0Var);
                int i5 = (i3 << 3) & 7168;
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, a);
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
                yzsVar.invoke(ra8.a, M, Integer.valueOf(((i5 >> 6) & 112) | 6));
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
        } else {
            M.h();
        }
        final q630 q630Var2 = q630Var;
        final jdj0 jdj0Var2 = jdj0Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.bkv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ckv0.a(q630.this, jdj0Var2, yzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final jdj0 b(ldj0 ldj0Var, androidx.compose.runtime.a aVar, int i) {
        if ((i & 1) != 0) {
            ldj0Var = ldj0.b.a;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1488616198, 0, -1, "com.vk.core.compose.component.skeleton.rememberDefaultShimmer (VkSkeletonShimmer.kt:37)");
        }
        tjv0 tjv0Var = (tjv0) aVar.r(ujv0.b);
        List l = e43.l(new l5g(wlb0.h(aVar).c().a), new l5g(wlb0.h(aVar).c().a), new l5g(wlb0.h(aVar).c().b), new l5g(wlb0.h(aVar).c().a), new l5g(wlb0.h(aVar).c().a));
        List l2 = e43.l(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Float.valueOf(0.25f), Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(1.0f));
        tjv0Var.getClass();
        jdj0 D = xx1.D(ldj0Var, new tjv0(jq2.a(6, 0L, null, new dtp0(600, 600, luo.d)), 9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, l, l2, 360), aVar, 64, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return D;
    }
}
