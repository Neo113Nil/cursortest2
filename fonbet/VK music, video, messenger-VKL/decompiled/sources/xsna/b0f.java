package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.upload.vk.impl.preview.ClipsPublishViewerOverlayFragment;
import java.util.Arrays;
import xsna.c0f;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ClipsPublishViewerOverlayView.kt */
/* loaded from: classes17.dex */
public final class b0f extends ame<c0f, lze> {
    public final c0f.b f;

    public b0f(Context context, ClipsPublishViewerOverlayFragment clipsPublishViewerOverlayFragment, boolean z, c0f.b bVar) {
        super(context, clipsPublishViewerOverlayFragment, z);
        this.f = bVar;
        vq.b(-1, -1, this.d);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        g((c0f) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(c0f c0fVar, izs<? super lze, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        a.C0011a.C0012a c0012a;
        int i2;
        izs<? super lze, s3q0> izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(134089204);
        int i3 = i | (M.J(c0fVar) ? 4 : 2) | (M.y(izsVar2) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(134089204, i3, -1, "com.vk.clips.upload.vk.impl.preview.compose.ClipsPublishViewerOverlayView.ThemedContent (ClipsPublishViewerOverlayView.kt:40)");
            }
            fm50 fm50Var = (fm50) d(this.f, (n0u0[]) Arrays.copyOf(new n0u0[]{c0fVar.a}, 1), M, ((((i3 << 3) & 7168) | 4096) >> 3) & 896).getValue();
            boolean z = fm50Var instanceof c0f.a;
            e.a aVar2 = androidx.compose.ui.graphics.e.a;
            q630.a aVar3 = q630.a.a;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z) {
                M.K(1203009245);
                c0f.a aVar4 = (c0f.a) fm50Var;
                gbh0.d(jk50.c(aVar4.e, M), ((Boolean) jk50.c(aVar4.b, M).getValue()).booleanValue(), ((qow) jk50.c(aVar4.c, M).getValue()).a, (e3b0) jk50.c(aVar4.f, M).getValue(), izsVar2, hr80.m(txj0.d(aVar3, 1.0f), l5g.b, aVar2), ((Boolean) jk50.c(aVar4.g, M).getValue()).booleanValue(), M, 196608 | ((i3 << 9) & 57344));
                izsVar2 = izsVar2;
                M.j();
                c0012a = c0012a2;
            } else {
                if (fm50Var instanceof c0f.b) {
                    M.K(1203712573);
                    a.h hVar = androidx.compose.foundation.layout.a.g;
                    q630 m = hr80.m(aVar3, l5g.b, aVar2);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(hVar, dt1.a.n, M, 6);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, m);
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
                    Object x = M.x();
                    c0012a = c0012a2;
                    if (x == c0012a) {
                        x = new cj4(7);
                        M.R(x);
                    }
                    gbh0.e(54, M, (gzs) x, txj0.f(aVar3, 1.0f));
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = new k60(17);
                        M.R(x2);
                    }
                    float f = 16;
                    gbh0.a(6, M, (izs) x2, s200.G(txj0.j(52, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), f, 0, f, 4), ((c0f.b) fm50Var).a);
                    M.G();
                } else {
                    c0012a = c0012a2;
                    M.K(1201259171);
                }
                M.j();
            }
            boolean z2 = (i3 & 112) == 32;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                i2 = 1;
                x3 = new zc4(izsVar2, 1);
                M.R(x3);
            } else {
                i2 = 1;
            }
            fo50.k(0, i2, M, (gzs) x3, false);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fy7(i, 2, this, c0fVar, izsVar2);
        }
    }
}
