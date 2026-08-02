package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import xsna.cri;
import xsna.dt1;
import xsna.q5b0;
import xsna.q630;

/* compiled from: PlayerWithAdControlsView.kt */
/* loaded from: classes16.dex */
public final class p5b0 {
    public static final void a(final q5b0.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-178349293);
        int i2 = (M.J(bVar) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-178349293, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.autoplay.player.PlayerView (PlayerWithAdControlsView.kt:103)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = new VideoTextureView(context, null, 6, 0);
                M.R(x);
            }
            final VideoTextureView videoTextureView = (VideoTextureView) x;
            final yg5 yg5Var = bVar.a;
            boolean J = M.J(yg5Var);
            Object x2 = M.x();
            if (J || x2 == obj) {
                x2 = new m5b0(videoTextureView, yg5Var);
                M.R(x2);
            }
            final m5b0 m5b0Var = (m5b0) x2;
            q630.a aVar2 = q630.a.a;
            q630 m = hr80.m(txj0.d(aVar2, 1.0f), l5g.b, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 b = ra8.a.b(sua.d(bVar.b, aVar2, false), dt1.a.f);
            boolean y = M.y(videoTextureView);
            Object x3 = M.x();
            if (y || x3 == obj) {
                x3 = new j5b0(videoTextureView, 0);
                M.R(x3);
            }
            q630Var2 = aVar2;
            ae2.a(0, 4, M, (izs) x3, null, b);
            M.G();
            boolean y2 = M.y(yg5Var) | M.J(m5b0Var) | ((i2 & 14) == 4) | M.y(videoTextureView);
            Object x4 = M.x();
            if (y2 || x4 == obj) {
                x4 = new izs() { // from class: xsna.k5b0
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        yg5 yg5Var2 = yg5Var;
                        m5b0 m5b0Var2 = m5b0Var;
                        yg5Var2.f0(m5b0Var2);
                        q5b0.b bVar2 = bVar;
                        izs izsVar = (izs) bVar2.a().h();
                        VideoTextureView videoTextureView2 = videoTextureView;
                        if (izsVar != null) {
                            izsVar.invoke(videoTextureView2);
                        }
                        return new l5b0(videoTextureView2, yg5Var2, m5b0Var2, bVar2);
                    }
                };
                M.R(x4);
            }
            bap.c(yg5Var, (izs) x4, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xd0(bVar, q630Var2, i, 6);
        }
    }

    public static final void b(q5b0 q5b0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q5b0.a aVar2 = q5b0Var.b;
        androidx.compose.runtime.a M = aVar.M(-1029297935);
        if ((i & 6) == 0) {
            i2 = (M.J(q5b0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1029297935, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.autoplay.player.PlayerWithAdControlsView (PlayerWithAdControlsView.kt:43)");
            }
            boolean l = M.l(aVar2 != null);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (l || x == c0012a) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(new q9x(0L));
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new jl80();
                M.R(x3);
            }
            jl80 jl80Var = (jl80) x3;
            boolean z = (i2 & 14) == 4;
            Object x4 = M.x();
            if (z || x4 == c0012a) {
                x4 = new mu1(25, wh50Var2, q5b0Var);
                M.R(x4);
            }
            q630 o = egi.o(q630Var, (izs) x4);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, o);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            a(q5b0Var.a, null, M, 0);
            if (aVar2 == null) {
                M.K(-1533790237);
            } else {
                M.K(-1533790236);
                q630 d2 = txj0.d(q630.a.a, 1.0f);
                boolean J = M.J(aVar2) | M.y(jl80Var) | M.J(wh50Var);
                Object x5 = M.x();
                if (J || x5 == c0012a) {
                    x5 = new iu9(aVar2, jl80Var, wh50Var, 7);
                    M.R(x5);
                }
                izs izsVar = (izs) x5;
                boolean J2 = M.J(wh50Var) | M.J(aVar2);
                Object x6 = M.x();
                if (J2 || x6 == c0012a) {
                    x6 = new q66(wh50Var, aVar2, wh50Var2, 5);
                    M.R(x6);
                }
                ae2.a(48, 0, M, izsVar, (izs) x6, d2);
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
            s.d = new wp8(q5b0Var, q630Var, i, 5);
        }
    }
}
