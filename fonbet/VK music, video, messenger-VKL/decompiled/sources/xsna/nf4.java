package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ComposeAudioBookSliderVh.kt */
/* loaded from: classes16.dex */
public final class nf4 implements efj {
    public final Image a;
    public final boolean b;
    public final boolean c;
    public final gzs<s3q0> d;

    public nf4(Image image, boolean z, boolean z2, gzs<s3q0> gzsVar) {
        this.a = image;
        this.b = z;
        this.c = z2;
        this.d = gzsVar;
    }

    @Override // xsna.efj
    public final void a(int i, long j, androidx.compose.runtime.a aVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1112791713);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1112791713, i2, -1, "com.vk.catalog2.feature.music.holders.audiobook.AudioBookCoverContent.invoke (ComposeAudioBookSliderVh.kt:157)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d2 = ja8.d(ty6Var, false);
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
            q630.a aVar3 = q630.a.a;
            q630 d3 = txj0.d(aVar3, 1.0f);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            q630 b = ojc.b(d3, (sg50) x, null, false, null, this.d, 28);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new tm0(this, 9);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            boolean z2 = i3 == 256;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new g60(this, 7);
                M.R(x3);
            }
            ae2.a(0, 0, M, izsVar, (izs) x3, b);
            if (this.c) {
                M.K(1180435924);
                bpi.a(s200.H(ra8.a.b(aVar3, ty6Var), 2, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), M, 0);
            } else {
                M.K(1172951687);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mf4(this, j, q630Var, i, 0);
        }
    }
}
