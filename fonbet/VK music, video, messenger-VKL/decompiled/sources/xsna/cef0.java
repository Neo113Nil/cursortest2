package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dai;
import xsna.dt1;
import xsna.q630;

/* compiled from: RecommendedPlaylistCard.kt */
/* loaded from: classes16.dex */
public final class cef0 {
    public static final void a(kef0 kef0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-749866605);
        int i2 = (M.J(kef0Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-749866605, i2, -1, "com.vk.catalog.mvi.block.music.impl.recommended.Header (RecommendedPlaylistCard.kt:94)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = rte0.d(txj0.f(txj0.h(aVar2, 120), 1.0f), vog0.b(18));
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            int i3 = i2 & 14;
            b(kef0Var, M, i3);
            q630 D2 = s200.D(txj0.d(aVar2, 1.0f), 12);
            cp10 d3 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
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
            k9q0.w(M, d3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            c(kef0Var, null, M, i3);
            d(kef0Var, ra8.a.b(aVar2, dt1.a.i), M, i3);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.p(kef0Var, i, 11);
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    public static final void b(kef0 kef0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1231343265);
        int i2 = (M.J(kef0Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1231343265, i2, -1, "com.vk.catalog.mvi.block.music.impl.recommended.HeaderBackground (RecommendedPlaylistCard.kt:114)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new rvq(24);
                M.R(x);
            }
            q630 a = rdu.a(q630.a.a, (izs) x);
            kbe kbeVar = ((dai.c) kef0Var.k.getValue()).c;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = ir.h(M);
            }
            fwu0.c(ahn.E(ojc.b(a, (sg50) x2, null, false, null, kbeVar, 28), "recom_playlist_header_background"), kef0Var.j, null, null, null, null, new qow(new jwx(2, 40)), hki.a, M, 100663296, 188);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.r(kef0Var, i, 9);
        }
    }

    public static final void c(kef0 kef0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1245787839);
        int i2 = i | (M.J(kef0Var) ? 4 : 2) | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1245787839, i2, -1, "com.vk.catalog.mvi.block.music.impl.recommended.MatchHeader (RecommendedPlaylistCard.kt:143)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 E = ahn.E(aVar3, "recom_playlist_match_percent");
            String str = kef0Var.c;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            iyk0 iyk0Var = rrv0.c;
            wuv0 wuv0Var = (wuv0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.p;
            long j = l5g.d;
            q630Var2 = aVar3;
            yqv0.c(str, E, j, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, M, 100663728, 48, 5880);
            q630 E2 = ahn.E(s200.D(q630Var2, 4), "recom_playlist_match_text");
            String str2 = kef0Var.d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var2 = (wuv0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str2, E2, j, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var2.s0, aVar2, 100663728, 48, 5880);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new yn7(kef0Var, q630Var2, i, 12);
        }
    }

    public static final void d(kef0 kef0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        kef0 kef0Var2;
        boolean z;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-222415448);
        int i3 = i | (M.J(kef0Var) ? 4 : 2) | (M.J(q630Var) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-222415448, i3, -1, "com.vk.catalog.mvi.block.music.impl.recommended.PlaylistInfoHeader (RecommendedPlaylistCard.kt:167)");
            }
            q630.a aVar2 = q630.a.a;
            q630 g = q630Var.g(txj0.f(aVar2, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(12), dt1.a.m, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, xpyVar);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 E = ahn.E(aVar2, "recom_playlist_title");
            String str = kef0Var.e;
            if (androidx.compose.runtime.b.d()) {
                z = false;
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            } else {
                z = false;
            }
            iyk0 iyk0Var = rrv0.c;
            wuv0 wuv0Var = (wuv0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.p;
            long j = l5g.d;
            yqv0.c(str, E, j, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, M, 100663728, 48, 5880);
            f9t.e(txj0.h(aVar2, 4), M, 6);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, aVar2);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            kef0Var2 = kef0Var;
            fwu0.c(ahn.E(txj0.q(rte0.d(aVar2, vog0.a), 16), "recom_playlist_owner_image"), kef0Var2.i, null, null, null, null, null, hki.b, M, 100663296, 252);
            f9t.e(txj0.v(aVar2, 6), M, 6);
            q630 E2 = ahn.E(aVar2, "recom_playlist_owner_name");
            String str2 = kef0Var2.h;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            if (androidx.compose.runtime.b.d()) {
                i2 = 0;
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            } else {
                i2 = 0;
            }
            wuv0 wuv0Var2 = (wuv0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str3, E2, j, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var2.s0, M, 100663728, 48, 5880);
            M = M;
            M.G();
            M.G();
            com.vk.catalog.mvi.block.music.impl.ui.a.a(kef0Var2.f, ahn.E(aVar2, "recom_playlist_play_pause_btn"), M, 48, i2);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            kef0Var2 = kef0Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wn7(kef0Var2, q630Var, i, 13);
        }
    }

    public static final void e(kef0 kef0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1918270700);
        if ((i & 6) == 0) {
            i2 = (M.J(kef0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1918270700, i2, -1, "com.vk.catalog.mvi.block.music.impl.recommended.RecommendedPlaylistCard (RecommendedPlaylistCard.kt:67)");
            }
            float f = 6;
            q630 v = txj0.v(s200.G(q630Var, f, 12, f, 14), 265);
            uog0 b = vog0.b(18);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1412929589, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
            }
            squ0 squ0Var = (squ0) M.r(rrv0.b);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            squ0Var.getClass();
            phu0.a(v, b, j, 0L, null, tqu0.c, kai.c(2040083228, new com.vk.movika.tools.controls.seekbar.u(kef0Var, 11), M), M, 1572864, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o7c(kef0Var, q630Var, i, 3);
        }
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, kotlin.Lazy] */
    public static final void f(kef0 kef0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(339358860);
        int i2 = (M.J(kef0Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(339358860, i2, -1, "com.vk.catalog.mvi.block.music.impl.recommended.TracksList (RecommendedPlaylistCard.kt:216)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            M.K(-57170667);
            ArrayList arrayList = kef0Var.g;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ee50 ee50Var = (ee50) arrayList.get(i3);
                M.W(-1161451789, ee50Var.a);
                dai.c cVar = (dai.c) ee50Var.l.getValue();
                int i4 = i2 & 14;
                boolean J = (i4 == 4) | M.J(ee50Var);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (J || x == c0012a) {
                    x = new h4(14, kef0Var, ee50Var);
                    M.R(x);
                }
                cVar.c((gzs) x, M, 0);
                dai.c cVar2 = (dai.c) ee50Var.m.getValue();
                boolean J2 = (i4 == 4) | M.J(ee50Var);
                Object x2 = M.x();
                if (J2 || x2 == c0012a) {
                    x2 = new i4(15, kef0Var, ee50Var);
                    M.R(x2);
                }
                cVar2.c((gzs) x2, M, 0);
                fc50.a(ee50Var, ahn.E(aVar2, "recom_playlist_music_track_" + i3), M, 0, 0);
                M.a0();
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o4e(kef0Var, i, 9);
        }
    }
}
