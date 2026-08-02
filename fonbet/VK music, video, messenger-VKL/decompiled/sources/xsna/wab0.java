package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.jbb0;
import xsna.q630;
import xsna.zab0;

/* compiled from: PlaylistMenuContentView.kt */
/* loaded from: classes3.dex */
public final class wab0 extends i6v0<jbb0, vab0> {
    public final boolean f;

    public wab0(cbb0 cbb0Var, Context context, boolean z) {
        super(context, cbb0Var);
        this.f = z;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        k((jbb0) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(jbb0.a.C3112a c3112a, izs<? super vab0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1040923079);
        int i2 = i | (M.J(c3112a) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1040923079, i2, -1, "com.vk.music.bottomsheets.playlist.redesigned.presentation.PlaylistMenuContentView.PlaylistMenu (PlaylistMenuContentView.kt:117)");
            }
            wh50 c = jk50.c(c3112a.a, M);
            wh50 c2 = jk50.c(c3112a.b, M);
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
            q630 c3 = qri.c(M, m);
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
            k9q0.w(M, c3, cri.a.d);
            int i3 = i2 << 6;
            j((i9b0) c.getValue(), ((wow) c2.getValue()).b, izsVar, M, 6 | (i3 & 7168) | (i3 & 57344));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r67(this, c3112a, izsVar, i, 1);
        }
    }

    public final void i(jbb0.a aVar, izs<? super vab0, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-104058274);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-104058274, i2, -1, "com.vk.music.bottomsheets.playlist.redesigned.presentation.PlaylistMenuContentView.PlaylistMenuContent (PlaylistMenuContentView.kt:100)");
            }
            if (aVar instanceof jbb0.a.C3112a) {
                M.K(966603319);
                h((jbb0.a.C3112a) aVar, izsVar, M, i2 & 1008);
                M.j();
            } else {
                if (!epx.f(aVar, jbb0.a.b.a)) {
                    throw alb0.c(-1215747732, M);
                }
                M.K(-1215738814);
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
            s.d = new fy7(i, 8, this, aVar, izsVar);
        }
    }

    public final void j(i9b0 i9b0Var, List list, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        float f;
        Iterator it;
        q630.a aVar3;
        float f2;
        androidx.compose.runtime.a aVar4;
        int i3;
        char c;
        char c2;
        androidx.compose.runtime.a M = aVar.M(-1326003196);
        int i4 = i & 6;
        r9g r9gVar = r9g.a;
        if (i4 == 0) {
            i2 = (M.J(r9gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(i9b0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        char c3 = 16384;
        if ((i & 24576) == 0) {
            i2 |= M.J(this) ? 16384 : 8192;
        }
        int i5 = 1;
        int i6 = 0;
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1326003196, i2, -1, "com.vk.music.bottomsheets.playlist.redesigned.presentation.PlaylistMenuContentView.PlaylistMenuContent (PlaylistMenuContentView.kt:142)");
            }
            q630.a aVar5 = q630.a.a;
            float f3 = 4;
            q630 h = txj0.h(txj0.v(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, 1, aVar5), 32), f3);
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
            xab0.b(i9b0Var, null, M, (i2 >> 3) & 14);
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((zab0) it2.next()) instanceof zab0.a) {
                        f = 8;
                        break;
                    }
                }
            }
            f = 12;
            f9t.e(txj0.h(aVar5, f), M, 0);
            M.K(1316243129);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                zab0 zab0Var = (zab0) it3.next();
                boolean z = zab0Var instanceof zab0.b;
                q630.a aVar6 = aVar5;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z) {
                    M.K(-592349883);
                    zab0.b bVar = (zab0.b) zab0Var;
                    i3 = i5;
                    androidx.compose.runtime.a aVar7 = M;
                    it = it3;
                    aVar3 = aVar6;
                    f2 = f3;
                    com.vk.core.compose.component.cell.content.x a = com.vk.core.compose.component.cell.content.f.a(pg90.a(bVar.b, i6, M), Cell$Left.Main.Size.Medium, bVar.d.a(i6, M), null, null, aVar7, 196664, 24);
                    com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(bVar.c, 0, aVar7), null, null, 0, null, null, aVar7, 12607488, 110), null, null, null, aVar7, 196608, 30);
                    q630 E = ahn.E(aVar3, "playlist_menu_item");
                    int i7 = (aVar7.J(zab0Var) ? 1 : 0) | ((i2 & 7168) == 2048 ? i3 : 0);
                    Object x = aVar7.x();
                    if (i7 != 0 || x == c0012a) {
                        x = new ag1(13, izsVar, (zab0.b) zab0Var);
                        aVar7.R(x);
                    }
                    wiu0.b(E, false, a, a2, null, (gzs) x, null, aVar7, 6, 82);
                    aVar4 = aVar7;
                    aVar4.j();
                    i6 = 0;
                    c2 = '\f';
                    c = 16384;
                } else {
                    it = it3;
                    aVar3 = aVar6;
                    f2 = f3;
                    aVar4 = M;
                    i3 = i5;
                    if (!(zab0Var instanceof zab0.a)) {
                        throw alb0.c(1920553258, aVar4);
                    }
                    aVar4.K(-591459408);
                    String N = d370.N(((zab0.a) zab0Var).a, i6, aVar4);
                    String N2 = d370.N(R.string.music_mix_similar_track_recommendations, i6, aVar4);
                    c = 16384;
                    int i8 = ((57344 & i2) == 16384 ? i3 : i6) | ((i2 & 7168) == 2048 ? i3 : i6);
                    Object x2 = aVar4.x();
                    if (i8 != 0 || x2 == c0012a) {
                        x2 = new com.vk.movika.sdk.android.defaultplayer.container.e(19, this, izsVar);
                        aVar4.R(x2);
                    }
                    ws20.a(N, N2, "playlist_menu_mix_btn", (gzs) x2, aVar4, 384);
                    c2 = '\f';
                    ck70.b(aVar3, 12, aVar4, 6);
                }
                aVar5 = aVar3;
                M = aVar4;
                c3 = c;
                it3 = it;
                i5 = i3;
                f3 = f2;
            }
            aVar2 = M;
            aVar2.j();
            f9t.e(txj0.h(aVar5, f3), aVar2, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new zf80(this, i9b0Var, list, izsVar, i, 1);
        }
    }

    public final void k(jbb0 jbb0Var, izs<? super vab0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1687453652);
        int i2 = (M.J(jbb0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1687453652, i2, -1, "com.vk.music.bottomsheets.playlist.redesigned.presentation.PlaylistMenuContentView.ThemedContent (PlaylistMenuContentView.kt:73)");
            }
            wh50 d = d(jbb0.a.b.a, new n0u0[]{jbb0Var.a}, M, (i2 & 896) | 6);
            if (this.f) {
                M.K(1660750984);
                aVar2 = M;
                rrv0.e(true, null, null, null, null, null, kai.c(1353457322, new xc4(this, izsVar, d), M), aVar2, 1572870, 62);
                aVar2.j();
            } else {
                M.K(1660960451);
                rrv0.d(null, null, null, null, kai.c(1100649397, new jj40(this, izsVar, d), M), M, 24576, 15);
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
            s.d = new cr7(i, 9, this, jbb0Var, izsVar);
        }
    }
}
