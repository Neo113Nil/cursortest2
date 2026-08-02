package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.kbb0;
import xsna.q630;

/* compiled from: PlaylistOwner.kt */
/* loaded from: classes3.dex */
public final class zbb0 {
    public static final void a(kbb0 kbb0Var, q630 q630Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        gzs gzsVar2;
        androidx.compose.runtime.a M = aVar.M(-620660095);
        int i2 = (M.J(kbb0Var) ? 4 : 2) | i | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-620660095, i2, -1, "com.vk.music.playlist.display.presentation.PlaylistOwner (PlaylistOwner.kt:37)");
            }
            if (kbb0Var instanceof kbb0.c) {
                M.K(-250468358);
                d(((kbb0.c) kbb0Var).c, q630Var, M, 48);
                M.j();
                q630Var2 = q630Var;
                gzsVar2 = gzsVar;
            } else if (kbb0Var instanceof kbb0.f) {
                M.K(546114409);
                kbb0.f fVar = (kbb0.f) kbb0Var;
                q630Var2 = q630Var;
                gzsVar2 = gzsVar;
                b(fVar.d, fVar.e, ojc.c(q630Var2, false, null, null, gzsVar2, 15), M, 0);
                M.j();
            } else {
                q630Var2 = q630Var;
                gzsVar2 = gzsVar;
                if (kbb0Var instanceof kbb0.a) {
                    M.K(-250118027);
                    d(((kbb0.a) kbb0Var).f.b, ojc.c(q630Var2, false, null, null, gzsVar2, 15), M, 0);
                    M.j();
                } else {
                    if (!(kbb0Var instanceof kbb0.g) && !kbb0Var.equals(kbb0.d.a)) {
                        throw alb0.c(546108254, M);
                    }
                    M.K(546127685);
                    M.j();
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            gzsVar2 = gzsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nwo(i, 5, kbb0Var, q630Var2, gzsVar2);
        }
    }

    public static final void b(ybb0 ybb0Var, boolean z, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        String str;
        androidx.compose.runtime.a M = aVar.M(1903599033);
        int i4 = i | (M.J(ybb0Var) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1903599033, i4, -1, "com.vk.music.playlist.display.presentation.PlaylistOwner (PlaylistOwner.kt:80)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, c, cri.a.d);
            if (ybb0Var.a != null) {
                M.K(1740646940);
                i2 = -1;
                i3 = 0;
                fwu0.c(null, null, ybb0Var.a, null, null, null, null, oji.a, M, 100663296, 251);
                M.j();
            } else {
                i2 = -1;
                i3 = 0;
                M.K(1741316540);
                c(0, M);
                M.j();
            }
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.v(aVar3, 6), M, 6);
            q630 E = ahn.E(aVar3, "playlistMyLabel");
            if (z) {
                str = zq.a(M, 1741519063, R.string.music_my_playlist, M, i3);
            } else {
                M.K(1741609087);
                M.j();
                str = ybb0Var.b;
            }
            String str2 = str;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, i3, i2, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str2, E, l5g.c(14, l5g.d, 0.82f), null, null, 0, 3, null, 2, false, 0, 1, null, wuv0Var.P, M, 100663728, 48, 5816);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w430(i, 1, ybb0Var, q630Var, z);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-240475057);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-240475057, i, -1, "com.vk.music.playlist.display.presentation.PlaylistOwnerEmptyImage (PlaylistOwner.kt:130)");
            }
            q630 q = txj0.q(q630.a.a, 16);
            long j = l5g.d;
            uog0 uog0Var = vog0.a;
            q630 d = rte0.d(hr80.m(q, j, uog0Var), uog0Var);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
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
            qzu0.a.getClass();
            lg90 y1 = qzu0.y1(M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(y1, null, null, ylu0Var.getIcon().n, M, 56, 4);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z2(i, 6);
        }
    }

    public static final void d(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2093837587);
        if ((i & 6) == 0) {
            i2 = i | (M.J(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2093837587, i2, -1, "com.vk.music.playlist.display.presentation.PlaylistOwnerLabel (PlaylistOwner.kt:63)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, q630Var, l5g.c(14, l5g.d, 0.82f), null, null, 0, 3, null, 2, false, 0, 1, null, wuv0Var.P, M, (i2 & 14) | 100663680 | (i2 & 112), 48, 5816);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uxn(str, q630Var, i, 2);
        }
    }
}
