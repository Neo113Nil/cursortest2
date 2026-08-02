package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dai;
import xsna.dt1;
import xsna.q630;

/* compiled from: ArtistSlider.kt */
/* loaded from: classes.dex */
public final class ts3 extends m2a<jt3, xs3, et3> {
    public final gt3 b;

    public ts3(gt3 gt3Var) {
        super(fpf0.a(et3.class));
        this.b = gt3Var;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m2a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(a8a a8aVar, jt3 jt3Var, izs izsVar, ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-849285700);
        if ((i & 48) == 0) {
            i2 = (M.J(jt3Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(ksrVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74897 & i2) != 74896)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-849285700, i2, -1, "com.vk.catalog.mvi.block.music.impl.artists.slider.ArtistSlider.BlockView.ContentImpl (ArtistSlider.kt:90)");
            }
            this.b.a(ksrVar, M, (i2 >> 9) & 14);
            M.K(-119760986);
            dai.c cVar = (dai.c) jt3Var.i.getValue();
            int i3 = i2 & 896;
            boolean J = (i3 == 256) | M.J(jt3Var);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new ss3(0, izsVar, jt3Var);
                M.R(x);
            }
            cVar.c((gzs) x, M, 0);
            dai.c a = jt3Var.d.a();
            boolean J2 = (i3 == 256) | M.J(jt3Var);
            Object x2 = M.x();
            if (J2 || x2 == c0012a) {
                x2 = new km1(1, izsVar, jt3Var);
                M.R(x2);
            }
            a.c((gzs) x2, M, 0);
            M.j();
            q630 g = q630Var.g(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, q630.a.a));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f(), false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            dt3.b(jt3Var, null, M, (i2 >> 3) & 14);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new zq1(this, a8aVar, jt3Var, izsVar, ksrVar, q630Var, i, 1));
        }
    }
}
