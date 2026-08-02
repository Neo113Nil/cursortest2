package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vkontakte.android.R;
import xsna.b9p0;
import xsna.c9p0;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.gfp0;
import xsna.q630;

/* compiled from: RedesignHeaderBlock.kt */
/* loaded from: classes3.dex */
public final class vkf0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final gfp0.b bVar, final boolean z, final boolean z2, final boolean z3, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        b9p0 b9p0Var;
        c9p0.c cVar;
        androidx.compose.runtime.a M = aVar.M(-293377562);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.l(z2) ? 256 : 128) | (M.l(z3) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192);
        q630.a aVar2 = q630.a.a;
        int i3 = i2 | (M.J(aVar2) ? 131072 : 65536);
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-293377562, i3, -1, "com.vk.music.stickyplayer.presentation.redesignedcomponents.NewTopControls (RedesignHeaderBlock.kt:85)");
            }
            boolean z4 = bVar instanceof gfp0.b.c;
            if (z4) {
                M.K(1532015037);
                gfp0.b.c cVar2 = (gfp0.b.c) bVar;
                b9p0Var = b9p0.d.a.a(cVar2.c, cVar2.e, cVar2.d, M);
                M.j();
            } else if (bVar instanceof gfp0.b.a) {
                M.K(1532021196);
                M.j();
                b9p0Var = b9p0.a.a;
            } else {
                if (!(bVar instanceof gfp0.b.C2940b)) {
                    throw alb0.c(1532012713, M);
                }
                M.K(1532023588);
                M.j();
                b9p0Var = b9p0.c.a;
            }
            b9p0 b9p0Var2 = b9p0Var;
            if (z4) {
                M.K(1532027975);
                int i4 = i3 >> 6;
                c9p0.c a = c9p0.c.a.a(z2, z3, z, izsVar, M, (i4 & 112) | (i4 & 14) | 24576 | ((i3 << 3) & 896) | ((i3 >> 3) & 7168));
                M.j();
                cVar = a;
            } else if (bVar instanceof gfp0.b.a) {
                M.K(1532035273);
                int i5 = ((i3 >> 6) & 14) | 384 | ((i3 >> 9) & 112);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1899429442, i5, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.AdvertisementButtons.Companion.invoke (TopPlayerControls.kt:572)");
                }
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new c9p0.a(izsVar, z2);
                    M.R(x);
                }
                c9p0.a aVar3 = (c9p0.a) x;
                ((zak0) aVar3.a).setValue(Boolean.valueOf(z2));
                ((zak0) aVar3.b).setValue(izsVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                cVar = aVar3;
            } else {
                if (!(bVar instanceof gfp0.b.C2940b)) {
                    throw alb0.c(1532025910, M);
                }
                M.K(1532040443);
                c9p0.c a2 = c9p0.c.a.a(false, false, false, izsVar, M, ((i3 >> 3) & 7168) | 25014);
                M.j();
                cVar = a2;
            }
            f9p0.b(bVar.getImage(), b9p0Var2, cVar, aVar2, null, M, (i3 >> 6) & 7168, 16);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, z2, z3, izsVar, i) { // from class: xsna.ukf0
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ izs f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    vkf0.a(gfp0.b.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(dz40.h hVar, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1032629641);
        int i2 = i | (M.J(hVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        q630.a aVar3 = q630.a.a;
        int i3 = i2 | (M.J(aVar3) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1032629641, i3, -1, "com.vk.music.stickyplayer.presentation.redesignedcomponents.RedesignPlayerHeader (RedesignHeaderBlock.kt:128)");
            }
            q630 d = txj0.d(aVar3, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 E = ahn.E(aVar3, "collapseFullPlayerButton");
            lg90 n = m200.n(M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().c;
            String N = d370.N(R.string.music_talkback_player_collapse_player, 0, M);
            float f = 28;
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new m87(izsVar, 7);
                M.R(x);
            }
            nzu0.c((gzs) x, n, N, E, f, j, false, null, false, null, null, M, 27712, 1984);
            int i5 = i3 << 3;
            s1b0.b(hVar, izsVar, null, M, (i5 & 896) | (i5 & 112) | 6);
            q630 E2 = ahn.E(aVar3, "shareCurrentTrackButton");
            lg90 s = m200.s(M);
            String N2 = d370.N(R.string.music_talkback_player_share, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var2.getIcon().c;
            boolean z2 = i4 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new f3(izsVar, 8);
                M.R(x2);
            }
            aVar2 = M;
            nzu0.c(z3r0.d(6, 0, M, (gzs) x2), s, N2, E2, f, j2, false, null, false, null, null, aVar2, 27712, 1984);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new h08(hVar, izsVar, i, 9);
        }
    }

    public static final void c(hwu hwuVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(666441911);
        if ((i & 6) == 0) {
            i2 = i | (M.J(hwuVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(666441911, i3, -1, "com.vk.music.stickyplayer.presentation.redesignedcomponents.TopHeaderBlock (RedesignHeaderBlock.kt:39)");
            }
            M.K(500555598);
            iyk0 iyk0Var = uvi.h;
            float j1 = ((azl) M.r(iyk0Var)).j1(hwuVar.c.c().c((azl) M.r(iyk0Var)));
            M.j();
            h17 g = f17.g(f17.f(BigPlayerBottomSheetValue.Collapsed, M), M, 2);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = bbk0.b(new f540(g, 21));
                M.R(x);
            }
            s8p0.b(j1, ((Number) ((mtk0) x).getValue()).floatValue(), hwuVar.b, izsVar, false, kai.c(-67194898, new en7(izsVar, jk50.c(hwuVar.a.c, M)), M), kai.c(-771057873, new xhd(hwuVar, izsVar), M), M, ((i3 << 6) & 7168) | 1794048);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rh2(i, 4, (Object) hwuVar, izsVar, q630Var2);
        }
    }
}
