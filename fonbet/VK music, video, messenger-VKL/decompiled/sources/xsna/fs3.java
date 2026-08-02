package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dai;
import xsna.dt1;
import xsna.q630;

/* compiled from: ArtistMix.kt */
/* loaded from: classes.dex */
public final class fs3 extends q2a<ds3, js3> {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.q2a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c(a8a a8aVar, ds3 ds3Var, izs<? super js3, s3q0> izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1562111777);
        if ((i & 48) == 0) {
            i2 = (M.J(ds3Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1562111777, i2, -1, "com.vk.catalog.mvi.block.music.impl.artists.mix.ArtistMix.BlockView.ContentImpl (ArtistMix.kt:193)");
            }
            M.K(-2049128817);
            dai.c cVar = (dai.c) ds3Var.h.getValue();
            boolean J = ((i2 & 896) == 256) | M.J(ds3Var);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new v43(1, izsVar, ds3Var);
                M.R(x);
            }
            cVar.c((gzs) x, M, 0);
            ds3Var.d.a().c(((dai.c) ds3Var.h.getValue()).j(), M, 0);
            M.j();
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, q630.a.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f(), false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
            cri.h7.getClass();
            LayoutNode.a b = cri.a.b();
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(b);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.d());
            k9q0.w(M, D, cri.a.f());
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.c());
            k9q0.t(M, cri.a.a());
            k9q0.w(M, c, cri.a.e());
            os3.b(ds3Var, null, M, (i2 >> 3) & 14);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new es3(this, a8aVar, ds3Var, izsVar, q630Var, i, 0));
        }
    }
}
