package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.skeleton.TextType;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.voa;

/* compiled from: MiddleImpl.kt */
/* loaded from: classes17.dex */
public final class ul20 implements voa {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public ul20() {
        this(null, null, 31);
    }

    @Override // xsna.voa
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1695997329);
        int i2 = (M.J(this) ? 256 : 128) | i;
        int i3 = 1;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1695997329, i2, -1, "com.vk.core.compose.component.cell.skeleton.MiddleImpl.Content (MiddleImpl.kt:33)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.e).getValue());
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 g = b.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            fvr.n();
            com.vk.core.compose.component.defaults.c cVar = com.vk.core.compose.component.defaults.c.a;
            fsk.F(M);
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.u, 1, g);
            dt1.a.getClass();
            ty6.a aVar2 = dt1.a.n;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            fvr.n();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(fsk.E(M), dt1.a.l), aVar2, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            voa.b bVar = (voa.b) ((zak0) this.a).getValue();
            if (bVar == null) {
                M.K(-401040641);
            } else {
                M.K(-401040640);
                bVar.a(TextType.Title, M, 54);
            }
            M.j();
            voa.b bVar2 = (voa.b) ((zak0) this.b).getValue();
            if (bVar2 == null) {
                M.K(-400977060);
            } else {
                M.K(-400977059);
                bVar2.a(TextType.Subtitle, M, 54);
            }
            M.j();
            voa.b bVar3 = (voa.b) ((zak0) this.c).getValue();
            if (bVar3 == null) {
                M.K(-400905481);
            } else {
                M.K(-400905480);
                bVar3.a(TextType.ExtraSubtitle, M, 54);
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
            s.d = new q0r(this, i, i3);
        }
    }

    public ul20(fio0 fio0Var, voa.b bVar, int i) {
        fio0Var = (i & 1) != 0 ? null : fio0Var;
        bVar = (i & 2) != 0 ? null : bVar;
        Cell$Middle.Size size = Cell$Middle.Size.Medium;
        this.a = androidx.compose.runtime.k.b(fio0Var);
        this.b = androidx.compose.runtime.k.b(bVar);
        this.c = androidx.compose.runtime.k.b(null);
        this.d = androidx.compose.runtime.k.b(size);
        this.e = androidx.compose.runtime.k.b(null);
    }
}
