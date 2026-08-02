package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.playlists.playlist_ui.model.ClipsPlaylistUiLoadingState;
import com.vk.core.compose.component.defaults.SpinnerState;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.yre;

/* compiled from: ClipsPlaylistUiContentView.kt */
/* loaded from: classes16.dex */
public final class ere extends ame<yre, zqe> {
    public final xqi<yre.a<vre>> f;

    public ere(xqi xqiVar, bre breVar, Context context, boolean z, int i) {
        super(context, breVar, z);
        this.f = xqiVar;
        vq.b(-1, i, this.d);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        g((yre) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(yre yreVar, izs<? super zqe, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-83452697);
        int i2 = i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-83452697, i2, -1, "com.vk.clips.playlists.playlist_ui.ClipsPlaylistUiContentView.ThemedContent (ClipsPlaylistUiContentView.kt:54)");
            }
            yre.a aVar2 = (yre.a) ((zak0) this.f.e).getValue();
            q630.a aVar3 = q630.a.a;
            q630 d = txj0.d(aVar3, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 E = ahn.E(s200.H(hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "PlaylistUiContainer");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            int i3 = i2 & 112;
            pxu.b(aVar2, izsVar, ahn.E(aVar3, "PlaylistUiToolbar"), M, i3 | 384);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 f = txj0.f(new xpy(1.0f, true), 1.0f);
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f);
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
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            boolean z = aVar2 instanceof yre.a.d;
            ra8 ra8Var = ra8.a;
            if (z) {
                M.K(857580210);
                zfr0.f(SpinnerState.Loading, ahn.E(ra8Var.b(aVar3, dt1.a.f), "PlaylistUiLoader"), null, 0L, null, null, M, 6, 60);
                M.j();
            } else if (aVar2 instanceof yre.a.b) {
                M.K(857934509);
                boolean z2 = i3 == 32;
                Object x = M.x();
                if (z2 || x == a.C0011a.a) {
                    x = new nq0(izsVar, 1);
                    M.R(x);
                }
                bse.a(0, M, (gzs) x, ra8Var.b(aVar3, dt1.a.f));
                M.j();
            } else if (aVar2 instanceof yre.a.C4132a) {
                M.K(858289428);
                yre.a.C4132a c4132a = (yre.a.C4132a) aVar2;
                wh50 d3 = jk50.d(c4132a.c, new wow(EmptyList.b), M, 0);
                yzt0<Boolean> yzt0Var = c4132a.f;
                Boolean bool = Boolean.FALSE;
                zhj.b(((wow) d3.getValue()).b, ((Boolean) jk50.d(yzt0Var, bool, M, 48).getValue()).booleanValue(), ((Boolean) jk50.d(c4132a.g, bool, M, 48).getValue()).booleanValue(), (Integer) jk50.a(c4132a.j, M, 0, 3).getValue(), izsVar, ((Boolean) jk50.d(c4132a.e, bool, M, 48).getValue()).booleanValue(), (ClipsPlaylistUiLoadingState) jk50.d(c4132a.k, ClipsPlaylistUiLoadingState.None, M, 48).getValue(), M, (i2 << 9) & 57344);
                M.j();
            } else {
                if (!aVar2.equals(yre.a.c.a)) {
                    throw alb0.c(-1773452567, M);
                }
                M.K(859368693);
                M.j();
            }
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new oq0(this, yreVar, izsVar, i, 2);
        }
    }
}
