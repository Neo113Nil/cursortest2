package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: ImageCover.kt */
/* loaded from: classes5.dex */
public final class yhw {
    public static final void a(lg90 lg90Var, final float f, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final lg90 lg90Var2 = lg90Var;
        androidx.compose.runtime.a M = aVar.M(1330004580);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(lg90Var2) : M.y(lg90Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1330004580, i2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.cover.ImageCover (ImageCover.kt:17)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ty6 ty6Var = dt1.a.f;
            q630.a aVar3 = q630.a.a;
            q630 h = txj0.h(txj0.f(aVar3, 1.0f), f);
            int i3 = 27704 | (i2 & 14);
            wkj.a.C3940a c3940a = wkj.a.a;
            vjw.a(lg90Var2, null, h, ty6Var, c3940a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, i3, 96);
            lg90Var2 = lg90Var;
            vjw.a(lg90Var2, null, l2l0.o(kci.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, txj0.h(txj0.f(aVar3, 1.0f), f)), 1.0f, -1.0f), ty6Var, c3940a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, i3, 96);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.xhw
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    yhw.a(lg90.this, f, q630Var, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
