package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.SpinnerState;
import kotlin.collections.EmptyList;
import xsna.cri;
import xsna.cue;
import xsna.dt1;
import xsna.q630;
import xsna.wve;

/* compiled from: ClipsPlaylistsFoldersContentView.kt */
/* loaded from: classes16.dex */
public final class pte extends ame<cue, jte> {
    public final xqi<cue.a<aue>> f;

    public pte(xqi xqiVar, Context context, tte tteVar, int i, boolean z) {
        super(context, tteVar, z);
        this.f = xqiVar;
        vq.b(-1, i, this.d);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((cue) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(cue.a<? extends aue> aVar, izs<? super jte, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(166289525);
        if ((i & 6) == 0) {
            i2 = i | (M.J(aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(166289525, i2, -1, "com.vk.clips.playlists.folders.list.ClipsPlaylistsFoldersContentView.Content (ClipsPlaylistsFoldersContentView.kt:77)");
            }
            boolean f = epx.f(aVar, cue.a.C2684a.a);
            q630.a aVar3 = q630.a.a;
            if (f) {
                M.K(1834227539);
                q630 d = txj0.d(aVar3, 1.0f);
                dt1.a.getClass();
                cp10 d2 = ja8.d(dt1.a.f, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, d);
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
                k9q0.w(M, d2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                ase.a((i2 >> 3) & 14, M, izsVar, null);
                M.G();
                M.j();
            } else if (epx.f(aVar, cue.a.c.a)) {
                M.K(1834540949);
                q630 d3 = txj0.d(aVar3, 1.0f);
                dt1.a.getClass();
                cp10 d4 = ja8.d(dt1.a.f, false);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, d3);
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
                k9q0.w(M, d4, cri.a.f);
                k9q0.w(M, D2, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c2, cri.a.d);
                zfr0.f(SpinnerState.Loading, ahn.E(aVar3, "PlaylistsLoadindItem"), null, 0L, null, null, M, 54, 60);
                M = M;
                M.G();
                M.j();
            } else {
                if (!(aVar instanceof cue.a.b)) {
                    throw alb0.c(890452255, M);
                }
                M.K(1835014412);
                cue.a.b bVar = (cue.a.b) aVar;
                wh50 d5 = jk50.d(bVar.a, EmptyList.b, M, 48);
                yzt0<Boolean> yzt0Var = bVar.b;
                Boolean bool = Boolean.FALSE;
                wh50 d6 = jk50.d(yzt0Var, bool, M, 48);
                wh50 d7 = jk50.d(bVar.c, bool, M, 48);
                wh50 d8 = jk50.d(bVar.d, bool, M, 48);
                wh50 c3 = jk50.c(bVar.e, M);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D3 = M.D();
                q630 c4 = qri.c(M, aVar3);
                cri.h7.getClass();
                LayoutNode.a aVar6 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar6);
                } else {
                    M.f();
                }
                k9q0.w(M, a, cri.a.f);
                k9q0.w(M, D3, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode3), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c4, cri.a.d);
                if (((wve) c3.getValue()).a) {
                    M.K(-616993740);
                    f9t.e(txj0.h(aVar3, 8), M, 6);
                    wve.a aVar7 = ((wve) c3.getValue()).b;
                    boolean z = ((wve) c3.getValue()).d;
                    boolean z2 = (i2 & 112) == 32;
                    Object x = M.x();
                    if (z2 || x == a.C0011a.a) {
                        x = new h97(izsVar, 1);
                        M.R(x);
                    }
                    w9d.a(aVar7, z, (gzs) x, null, M, 0);
                    w9d.b(((wve) c3.getValue()).c, ((wve) c3.getValue()).b, ((wve) c3.getValue()).d, izsVar, null, M, (i2 << 6) & 7168);
                } else {
                    M.K(-621488585);
                }
                M.j();
                cad.a(d5, ((Boolean) d6.getValue()).booleanValue(), ((Boolean) d7.getValue()).booleanValue(), ((Boolean) d8.getValue()).booleanValue(), izsVar, M, (i2 << 9) & 57344);
                M.G();
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mte(i, 0, this, aVar, izsVar);
        }
    }

    public final void h(cue cueVar, izs<? super jte, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(484903659);
        int i2 = (M.y(izsVar) ? 32 : 16) | i | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(484903659, i2, -1, "com.vk.clips.playlists.folders.list.ClipsPlaylistsFoldersContentView.ThemedContent (ClipsPlaylistsFoldersContentView.kt:55)");
            }
            ijk.a((cue.a) ((zak0) this.f.e).getValue(), ahn.E(txj0.d(q630.a.a, 1.0f), "PlaylistsContentContainer"), null, "FoldersContent", kai.c(-1115654674, new nte(0, this, izsVar), M), M, 27696, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ote(i, 0, this, cueVar, izsVar);
        }
    }
}
