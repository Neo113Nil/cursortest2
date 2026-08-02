package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.dto.common.DownloadingState;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.ggp0;
import xsna.q630;
import xsna.tfp0;
import xsna.uc50;

/* compiled from: TrackMenuContentView.kt */
/* loaded from: classes3.dex */
public final class vfp0 extends i6v0<ggp0, tfp0> {
    public final boolean f;

    public vfp0(zfp0 zfp0Var, Context context, boolean z) {
        super(context, zfp0Var);
        this.f = z;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        k((ggp0) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(ggp0.a.C2942a c2942a, izs<? super tfp0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1163390374);
        int i2 = i | (M.J(c2942a) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1163390374, i2, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.TrackMenuContentView.MusicTrackMenu (TrackMenuContentView.kt:98)");
            }
            wh50 c = jk50.c(c2942a.a, M);
            wh50 c2 = jk50.c(c2942a.b, M);
            wh50 c3 = jk50.c(c2942a.c, M);
            wh50 c4 = jk50.c(c2942a.d, M);
            q630 f = txj0.f(q630.a.a, 1.0f);
            long j = wlb0.h(M).getBackground().r;
            wlb0.i(M).getClass();
            float f2 = tqu0.e;
            wlb0.i(M).getClass();
            q630 m = hr80.m(f, j, vog0.d(f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c5 = qri.c(M, m);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c5, cri.a.d);
            int i3 = i2 << 12;
            j((sb50) c.getValue(), ((wow) c2.getValue()).b, (DownloadingState) c3.getValue(), (wzm0) c4.getValue(), izsVar, M, (458752 & i3) | 6 | (i3 & 3670016));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new oq0(this, c2942a, izsVar, i, 8);
        }
    }

    public final void i(ggp0.a aVar, izs<? super tfp0, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(1724173889);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1724173889, i2, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.TrackMenuContentView.MusicTrackMenuContent (TrackMenuContentView.kt:81)");
            }
            if (aVar instanceof ggp0.a.C2942a) {
                M.K(1350687762);
                h((ggp0.a.C2942a) aVar, izsVar, M, i2 & 1008);
                M.j();
            } else {
                if (!epx.f(aVar, ggp0.a.b.a)) {
                    throw alb0.c(-926263217, M);
                }
                M.K(-926254299);
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
            s.d = new w6h(i, 4, this, aVar, izsVar);
        }
    }

    public final void j(final sb50 sb50Var, final List list, final Object obj, final wzm0 wzm0Var, izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        izs izsVar2;
        float f;
        Iterator it;
        int i3;
        izs izsVar3;
        q630.a aVar2;
        boolean z;
        Object obj2;
        String f2;
        vfp0 vfp0Var = this;
        izs izsVar4 = izsVar;
        androidx.compose.runtime.a M = aVar.M(-1850416535);
        int i4 = i & 6;
        r9g r9gVar = r9g.a;
        if (i4 == 0) {
            i2 = (M.J(r9gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(sb50Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(obj) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(wzm0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(izsVar4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(vfp0Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1850416535, i2, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.TrackMenuContentView.MusicTrackMenuContent (TrackMenuContentView.kt:129)");
            }
            q630.a aVar3 = q630.a.a;
            float f3 = 32;
            q630 h = txj0.h(txj0.v(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, 1, aVar3), f3), 4);
            dt1.a.getClass();
            q630 b = r9gVar.b(h, dt1.a.o);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f9t.e(hr80.m(b, ylu0Var.getIcon().n, vog0.b(100)), M, 0);
            sc50.a(sb50Var, null, M, (i2 >> 3) & 14);
            M.K(-133801745);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                uc50 uc50Var = (uc50) it2.next();
                boolean f4 = epx.f(uc50Var, uc50.d.a);
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (f4) {
                    M.K(-350069020);
                    String N = d370.N(R.string.music_mix_by_track_title, 0, M);
                    String N2 = d370.N(R.string.music_mix_by_playlist_subtitle, 0, M);
                    boolean z2 = ((i2 & 458752) == 131072) | ((i2 & 3670016) == 1048576);
                    Object x = M.x();
                    if (z2 || x == c0012a) {
                        x = new hc1(25, vfp0Var, izsVar4);
                        M.R(x);
                    }
                    ws20.a(N, N2, "trackMixMenuBtn", (gzs) x, M, 384);
                    M.j();
                    f = f3;
                    i3 = i2;
                    izsVar3 = izsVar4;
                    aVar2 = aVar3;
                    z = true;
                    obj2 = null;
                    it = it2;
                } else {
                    float f5 = f3;
                    q630.a aVar4 = aVar3;
                    if (uc50Var instanceof uc50.b) {
                        M.K(-349412843);
                        int i5 = i2;
                        uc50.b bVar = (uc50.b) uc50Var;
                        if (epx.f(bVar.a, tfp0.b.r.b)) {
                            M.K(-349345356);
                            i3 = i5;
                            vym0.a(bVar, wzm0Var, izsVar4, null, M, (i5 >> 9) & 1008);
                            M.j();
                            izsVar3 = izsVar;
                            f = f5;
                            it = it2;
                            aVar2 = aVar4;
                            z = true;
                            obj2 = null;
                        } else {
                            i3 = i5;
                            M.K(-349012385);
                            q630 f6 = txj0.f(ahn.E(aVar4, "musicMenuItem"), 1.0f);
                            lg90 a = pg90.a(bVar.b, 0, M);
                            Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
                            long a2 = bVar.e.a(0, M);
                            Integer num = bVar.d;
                            if (num == null) {
                                M.K(-348447070);
                                M.j();
                                f2 = null;
                            } else {
                                f2 = l4.f(M, -348447069, num, M, 0);
                            }
                            izsVar3 = izsVar;
                            aVar2 = aVar4;
                            z = true;
                            it = it2;
                            f = f5;
                            com.vk.core.compose.component.cell.content.x a3 = com.vk.core.compose.component.cell.content.f.a(a, size, a2, f2, null, M, 196664, 16);
                            androidx.compose.runtime.a aVar5 = M;
                            com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(bVar.c, 0, M), null, null, 1, null, null, M, 12610560, 102), null, null, null, aVar5, 196608, 30);
                            boolean J = aVar5.J(uc50Var) | ((i3 & 458752) == 131072);
                            Object x2 = aVar5.x();
                            if (J || x2 == c0012a) {
                                x2 = new fy0(23, izsVar3, (uc50.b) uc50Var);
                                aVar5.R(x2);
                            }
                            obj2 = null;
                            wiu0.b(f6, false, a3, a4, null, (gzs) x2, null, aVar5, 6, 82);
                            M = aVar5;
                            M.j();
                        }
                        M.j();
                    } else {
                        f = f5;
                        it = it2;
                        i3 = i2;
                        izsVar3 = izsVar4;
                        aVar2 = aVar4;
                        z = true;
                        obj2 = null;
                        if (uc50Var instanceof uc50.a) {
                            M.K(-347673805);
                            f9o.a(obj, izsVar3, ahn.E(aVar2, "downloadTrackItem"), M, ((i3 >> 9) & 14) | 384 | ((i3 >> 12) & 112));
                            M.j();
                        } else {
                            if (!epx.f(uc50Var, uc50.c.a)) {
                                throw alb0.c(-981123526, M);
                            }
                            M.K(-981035469);
                            oki0.a(txj0.h(txj0.f(aVar2, 1.0f), 24), M, 6);
                            M.j();
                        }
                    }
                }
                izsVar4 = izsVar3;
                aVar3 = aVar2;
                it2 = it;
                i2 = i3;
                f3 = f;
                vfp0Var = this;
            }
            izsVar2 = izsVar4;
            M.j();
            f9t.e(txj0.h(aVar3, f3), M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar4;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final izs izsVar5 = izsVar2;
            s.d = new wzs() { // from class: xsna.ufp0
                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    vfp0.this.j(sb50Var, list, obj, wzm0Var, izsVar5, (androidx.compose.runtime.a) obj3, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void k(ggp0 ggp0Var, izs<? super tfp0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(302327524);
        int i2 = (M.J(ggp0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(302327524, i2, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.TrackMenuContentView.ThemedContent (TrackMenuContentView.kt:54)");
            }
            wh50 d = d(ggp0.a.b.a, new n0u0[]{ggp0Var.a}, M, (i2 & 896) | 6);
            if (this.f) {
                M.K(93138926);
                aVar2 = M;
                rrv0.e(true, null, null, null, null, null, kai.c(877728354, new vb5(this, izsVar, d, 8), M), aVar2, 1572870, 62);
                aVar2.j();
            } else {
                M.K(93350377);
                rrv0.d(null, null, null, null, kai.c(-103383059, new a9c(this, izsVar, d), M), M, 24576, 15);
                aVar2 = M;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wi4(this, ggp0Var, (izs) izsVar, i);
        }
    }
}
