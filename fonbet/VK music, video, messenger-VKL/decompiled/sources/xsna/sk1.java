package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.skeleton.SkeletonType;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AlbumShimmerItem.kt */
/* loaded from: classes18.dex */
public final class sk1 {
    public static final void a(final int i, final int i2, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-789149848);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            q630.a aVar2 = q630.a.a;
            if (i4 != 0) {
                q630Var = aVar2;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-789149848, i3, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.AlbumShimmerItem (AlbumShimmerItem.kt:23)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            SkeletonType skeletonType = SkeletonType.Block;
            float f = 8;
            akv0.a(skeletonType, rte0.d(txj0.f(sua.d(1.7777778f, aVar2, true), 1.0f), vog0.b(f)), M, 6);
            f9t.e(txj0.h(aVar2, 4), M, 6);
            float f2 = 6;
            akv0.a(skeletonType, txj0.h(txj0.v(s200.G(aVar2, f2, 5, f2, f2), f), f), M, 54);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.rk1
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sk1.a(ne7.I(i | 1), i2, (androidx.compose.runtime.a) obj, q630.this);
                    return s3q0.a;
                }
            };
        }
    }
}
