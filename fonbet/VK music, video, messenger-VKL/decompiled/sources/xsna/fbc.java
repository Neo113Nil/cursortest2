package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.kac;
import xsna.q630;

/* compiled from: Chip.kt */
/* loaded from: classes3.dex */
public final class fbc {
    public static final void a(dz40.d dVar, izs izsVar, boolean z, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-2111524008);
        int i2 = (M.J(dVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2111524008, i2, -1, "com.vk.music.stickyplayer.presentation.components.chips.Chip (Chip.kt:64)");
            }
            if (dVar.equals(dz40.d.i.a)) {
                M.K(-1949999906);
                k(((i2 >> 3) & 14) | ((i2 >> 6) & 112), M, izsVar, q630Var);
                M.j();
            } else if (dVar.equals(dz40.d.h.a)) {
                M.K(-1949996862);
                j(((i2 >> 3) & 14) | ((i2 >> 6) & 112), M, izsVar, q630Var);
                M.j();
            } else if (dVar.equals(dz40.d.j.a)) {
                M.K(-1949993832);
                m(((i2 >> 3) & 14) | ((i2 >> 6) & 112), M, izsVar, q630Var);
                M.j();
            } else if (dVar.equals(dz40.d.f.a)) {
                M.K(-1949991139);
                h(((i2 >> 3) & 14) | ((i2 >> 6) & 112), M, izsVar, q630Var);
                M.j();
            } else if (dVar.equals(dz40.d.g.a)) {
                M.K(-1949988027);
                i(((i2 >> 3) & 14) | ((i2 >> 6) & 112), M, izsVar, q630Var);
                M.j();
            } else if (dVar.equals(dz40.d.c.a)) {
                M.K(-1949984898);
                e(((i2 >> 3) & 14) | ((i2 >> 6) & 112), M, izsVar, q630Var);
                M.j();
            } else if (dVar instanceof dz40.d.e) {
                M.K(-1949982067);
                g((dz40.d.e) dVar, izsVar, z, q630Var, M, i2 & 8176);
                M.j();
            } else if (dVar instanceof dz40.d.C2771d) {
                M.K(-1949978804);
                f((dz40.d.C2771d) dVar, izsVar, z, q630Var, M, i2 & 8176);
                M.j();
            } else if (dVar.equals(dz40.d.a.a)) {
                M.K(-1949975491);
                c(((i2 >> 3) & 14) | ((i2 >> 6) & 112), M, izsVar, q630Var);
                M.j();
            } else if (dVar instanceof dz40.d.k) {
                M.K(-1949972706);
                n((dz40.d.k) dVar, izsVar, q630Var, M, ((i2 >> 3) & 896) | (i2 & 112));
                M.j();
            } else {
                if (!(dVar instanceof dz40.d.b)) {
                    throw alb0.c(-1950001008, M);
                }
                M.K(-1949969890);
                d((dz40.d.b) dVar, izsVar, q630Var, M, ((i2 >> 3) & 896) | (i2 & 112));
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
            s.d = new wac(i, 0, (Object) dVar, (Object) izsVar, (Object) q630Var, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final kac.b bVar, final gzs<s3q0> gzsVar, final q630 q630Var, String str, float f, androidx.compose.runtime.a aVar, final int i, final int i2) {
        String str2;
        int i3;
        float f2;
        androidx.compose.runtime.a aVar2;
        final String str3;
        final float f3;
        androidx.compose.runtime.f s;
        String str4;
        androidx.compose.runtime.a M = aVar.M(-1584149789);
        int i4 = (M.J(bVar) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            str2 = str;
        } else {
            str2 = str;
            i3 = i4 | (M.J(str2) ? 2048 : 1024);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            f2 = f;
            i3 |= M.n(f2) ? 16384 : 8192;
            if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                aVar2 = M;
                aVar2.h();
                str3 = str2;
                f3 = f2;
            } else {
                if (i5 != 0) {
                    str2 = null;
                }
                float f4 = i6 != 0 ? 12 : f2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1584149789, i3, -1, "com.vk.music.stickyplayer.presentation.components.chips.Chip (Chip.kt:482)");
                }
                q630 F = s200.F(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ojc.c(hr80.m(rte0.d(txj0.h(q630Var, 36), vog0.b(10)), l5g.c(14, wlb0.h(M).getBackground().m, 0.2f), androidx.compose.ui.graphics.e.a), false, null, null, z3r0.d(i3 & 112, 1, M, gzsVar), 15));
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
                kac.a.a(null, bVar, M, (i3 << 3) & 112, 1);
                if (str2 != null) {
                    M.K(155910194);
                    f9t.e(txj0.v(q630.a.a, 4), M, 6);
                    int i7 = (i3 >> 9) & 14;
                    str4 = str2;
                    f3 = f4;
                    yqv0.c(str4, null, wlb0.h(M).getText().d, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).m0, M, i7, 48, 6138);
                    aVar2 = M;
                } else {
                    aVar2 = M;
                    f3 = f4;
                    str4 = str2;
                    aVar2.K(138760963);
                }
                aVar2.j();
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                str3 = str4;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.vac
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        fbc.b(kac.b.this, gzsVar, q630Var, str3, f3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        f2 = f;
        if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1543114550);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1543114550, i2, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipAddToPlaylist (Chip.kt:289)");
            }
            String N = d370.N(R.string.music_player_button_add_to_playlist_title, 0, M);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-35170602, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ListPlusOutline20> (VkIcons.kt:6652)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_list_plus_outline_20, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            kac.b.d dVar = new kac.b.d(a);
            q630 g = q(ahn.E(q630.a.a, "addToPlaylistButton"), N).g(q630Var);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ne1(izsVar, 2);
                M.R(x);
            }
            b(dVar, (gzs) x, g, N, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pv1(izsVar, q630Var, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(dz40.d.b bVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(1072838528);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1072838528, i3, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipConcerts (Chip.kt:335)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                M.R(x);
            }
            kg50 kg50Var = (kg50) x;
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = androidx.compose.runtime.i.a(0);
                M.R(x2);
            }
            rg50 rg50Var = (rg50) x2;
            Object x3 = M.x();
            if (x3 == c0012a2) {
                x3 = androidx.compose.runtime.k.b(new pco(0));
                M.R(x3);
            }
            wh50 wh50Var = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a2) {
                x4 = androidx.compose.runtime.k.b(bVar.c);
                M.R(x4);
            }
            wh50 wh50Var2 = (wh50) x4;
            String str = bVar.c;
            boolean z = bVar.a;
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object x5 = M.x();
            if (z2 || x5 == c0012a2) {
                x5 = new zac(bVar, wh50Var2, rg50Var, null);
                M.R(x5);
            }
            bap.g(str, (wzs) x5, M, 0);
            Boolean valueOf = Boolean.valueOf(z);
            boolean z3 = i4 == 4;
            Object x6 = M.x();
            if (z3 || x6 == c0012a2) {
                x6 = new abc(bVar, kg50Var, rg50Var, null);
                M.R(x6);
            }
            bap.g(valueOf, (wzs) x6, M, 0);
            float f = 0;
            float f2 = pco.a(((pco) wh50Var.getValue()).b, f) > 0 ? ((pco) wh50Var.getValue()).b : f;
            if (!z) {
                f2 = f;
            }
            mtk0 a = hg2.a(f2, jq2.d(250, 0, luo.d, 2), null, M, 0, 12);
            mtk0 b = hg2.b(kg50Var.getFloatValue(), jq2.d(200, 0, kg50Var.getFloatValue() == 1.0f ? luo.c : luo.b, 2), null, null, M, 0, 28);
            M = M;
            if (pco.a(((pco) wh50Var.getValue()).b, f) <= 0) {
                M.K(2082440529);
                Object x7 = M.x();
                c0012a = c0012a2;
                if (x7 == c0012a) {
                    x7 = new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(wh50Var, 15);
                    M.R(x7);
                }
                p((izs) x7, kai.c(807302182, new oac(bVar, 0), M), M, 54);
            } else {
                c0012a = c0012a2;
                M.K(2068757346);
            }
            M.j();
            q630 m = hr80.m(rte0.d(ahn.E(txj0.v(txj0.h(q630Var, 36), ((pco) a.getValue()).b), "concerts"), vog0.b(10)), l5g.c(14, wlb0.h(M).getBackground().m, 0.2f), androidx.compose.ui.graphics.e.a);
            boolean z4 = z && pco.a(((pco) a.getValue()).b, f) > 0;
            boolean z5 = (i4 == 4) | ((i3 & 112) == 32);
            Object x8 = M.x();
            if (z5 || x8 == c0012a) {
                x8 = new uh3(6, bVar, izsVar);
                M.R(x8);
            }
            q630 F = s200.F(12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ojc.c(m, z4, null, null, (gzs) x8, 14));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (pco.a(((pco) a.getValue()).b, f) > 0) {
                M.K(-1030872217);
                q630.a aVar3 = q630.a.a;
                kac.a.a(rdu.c(txj0.q(aVar3, 20), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Number) b.getValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 524283), new kac.b.C3173b(R.raw.ticket_outline_20_v3, false, Integer.valueOf(rg50Var.getIntValue())), M, 0, 0);
                f9t.e(txj0.v(aVar3, 4), M, 6);
                yqv0.c(bVar.b, rdu.c(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Number) b.getValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 524283), wlb0.h(M).getText().d, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).m0, M, 0, 48, 6136);
                M = M;
            } else {
                M.K(-1045424826);
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
            s.d = new x85(bVar, izsVar, q630Var, i, 1);
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1702702191);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1702702191, i2, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipConfigureVkMix (Chip.kt:188)");
            }
            String N = d370.N(R.string.music_player_button_configure_mix_title, 0, M);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1430497182, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-SlidersOutline20> (VkIcons.kt:9984)");
            }
            lg90 b = or.b(M, -1275863487, R.drawable.vk_icon_sliders_outline_20, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            kac.b.d dVar = new kac.b.d(b);
            q630 g = q(ahn.E(q630.a.a, "configureVkMix"), N).g(q630Var);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new sv7(izsVar, 1);
                M.R(x);
            }
            b(dVar, (gzs) x, g, N, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rac(izsVar, q630Var, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(final dz40.d.C2771d c2771d, final izs izsVar, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1049968458);
        if ((i & 6) == 0) {
            i2 = (M.J(c2771d) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1049968458, i2, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipDislike (Chip.kt:244)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            boolean z2 = c2771d.b;
            boolean z3 = c2771d.a;
            String N = d370.N((z3 && z2) ? R.string.music_kids_track_dislike_on_talkback : z3 ? R.string.music_track_dislike_on_talkback : (z3 || !z2) ? R.string.music_track_dislike_off_talkback : R.string.music_kids_track_dislike_off_talkback, 0, M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = io.reactivex.rxjava3.internal.operators.mixed.j.d(z3, M);
            }
            wh50 wh50Var2 = (wh50) x3;
            Boolean bool = (Boolean) wh50Var.getValue();
            bool.getClass();
            Boolean valueOf = Boolean.valueOf(z3);
            int i3 = i2;
            int i4 = i3 & 14;
            boolean z4 = i4 == 4;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new bbc(c2771d, wh50Var, wh50Var2, null);
                M.R(x4);
            }
            bap.f(bool, valueOf, (wzs) x4, M, 0);
            Boolean valueOf2 = Boolean.valueOf(z3);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new sd4(7);
                M.R(x5);
            }
            kac.b.c cVar = new kac.b.c(valueOf2, z, (izs) x5);
            boolean y = M.y(yvjVar) | ((i3 & 112) == 32) | (i4 == 4);
            Object x6 = M.x();
            if (y || x6 == c0012a) {
                pac pacVar = new pac(yvjVar, izsVar, c2771d, wh50Var, 0);
                M.R(pacVar);
                x6 = pacVar;
            }
            b(cVar, (gzs) x6, q(ahn.E(q630.a.a, "dislike"), N).g(q630Var), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.qac
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fbc.f(dz40.d.C2771d.this, izsVar, z, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void g(final dz40.d.e eVar, final izs izsVar, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        String f;
        androidx.compose.runtime.a M = aVar.M(1854980676);
        if ((i & 6) == 0) {
            i2 = (M.J(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1854980676, i2, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipDownload (Chip.kt:209)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            final rg50 rg50Var = (rg50) x;
            String N = d370.N(eVar.b(), 0, M);
            int i3 = i2;
            kac.b.a aVar2 = new kac.b.a(kai.c(155543099, new yzs() { // from class: xsna.xac
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    q630 q630Var2 = (q630) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(q630Var2) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(155543099, intValue, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipDownload.<anonymous> (Chip.kt:214)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getIcon().c;
                        Object c = dz40.d.e.this.c();
                        int intValue2 = rg50Var.getIntValue();
                        Object x2 = aVar3.x();
                        if (x2 == a.C0011a.a) {
                            x2 = new y40(13);
                            aVar3.R(x2);
                        }
                        g8o.a(j, c, (izs) x2, q630Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Integer.valueOf(intValue2), z, aVar3, ((intValue << 12) & 57344) | 3072);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M));
            Integer a = eVar.a();
            if (a == null) {
                M.K(-1614034909);
                M.j();
                f = null;
            } else {
                f = l4.f(M, -1614034908, a, M, 0);
            }
            q630 g = q(ahn.E(q630.a.a, "downloadTrackButton"), N).g(q630Var);
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new kk(eVar, izsVar, rg50Var, 1);
                M.R(x2);
            }
            b(aVar2, (gzs) x2, g, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.yac
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fbc.g(dz40.d.e.this, izsVar, z, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void h(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(218415176);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(218415176, i2, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipGoToAudioBook (Chip.kt:154)");
            }
            String N = d370.N(R.string.music_go_to_audio_book, 0, M);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(192812046, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-BookSpreadOutline20> (VkIcons.kt:722)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_book_spread_outline_20, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            kac.b.d dVar = new kac.b.d(a);
            q630 g = q(ahn.E(q630.a.a, "chipGoToAudioBook"), N).g(q630Var);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new se1(izsVar, 3);
                M.R(x);
            }
            b(dVar, (gzs) x, g, N, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t41(izsVar, q630Var, i, 2);
        }
    }

    public static final void i(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1405889);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1405889, i2, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipGoToAudioBookNarrator (Chip.kt:171)");
            }
            String N = d370.N(R.string.music_go_to_audio_book_narrator, 0, M);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(119572962, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-UserMicrophoneBadgeOutline28> (VkIcons.kt:11220)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_user_microphone_badge_outline_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            kac.b.d dVar = new kac.b.d(a);
            q630 g = q(ahn.E(q630.a.a, "chipGoToAudioBookNarrator"), N).g(q630Var);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new us0(izsVar, 1);
                M.R(x);
            }
            b(dVar, (gzs) x, g, N, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tq8(izsVar, q630Var, i, 1);
        }
    }

    public static final void j(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1353338358);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1353338358, i2, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipGoToPodcastEpisode (Chip.kt:121)");
            }
            String N = d370.N(R.string.music_go_to_podcast_episode, 0, M);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2123467810, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ListArrowLeftDownOutline24> (VkIcons.kt:6564)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_list_arrow_left_down_outline_24, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            kac.b.d dVar = new kac.b.d(a);
            q630 g = q(ahn.E(q630.a.a, "chipGoToPodcastEpisode"), N).g(q630Var);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new f74(izsVar, 1);
                M.R(x);
            }
            b(dVar, (gzs) x, g, N, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tac(i, 0, izsVar, q630Var);
        }
    }

    public static final void k(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(988403563);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(988403563, i2, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipMarkAsListened (Chip.kt:104)");
            }
            String N = d370.N(R.string.music_podcast_listened, 0, M);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1110258364, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-HeadphonesOutline20> (VkIcons.kt:3286)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_headphones_outline_20, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            kac.b.d dVar = new kac.b.d(a);
            q630 g = q(ahn.E(q630.a.a, "chipMarkAsListened"), N).g(q630Var);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ws0(izsVar, 2);
                M.R(x);
            }
            b(dVar, (gzs) x, g, N, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sac(izsVar, q630Var, i, 0);
        }
    }

    public static final void l(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-208614332);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-208614332, i3, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipOpenTrackMenu (Chip.kt:84)");
            }
            String N = d370.N(R.string.music_talkback_player_more, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(245428636, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreHorizontal24> (VkSdkIcons.kt:2634)");
            }
            lg90 b = or.b(M, 1530334916, R.drawable.vk_icon_more_horizontal_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            kac.b.d dVar = new kac.b.d(b);
            boolean z = (i3 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new nac(izsVar, 0);
                M.R(x);
            }
            q630.a aVar2 = q630.a.a;
            b(dVar, (gzs) x, q(ahn.E(txj0.v(aVar2, 36), "moreButtonInPlayer"), N).g(aVar2), null, 6, M, 24576, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nv1(izsVar, q630Var, i, 2);
        }
    }

    public static final void m(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1880568109);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1880568109, i2, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipSettings (Chip.kt:138)");
            }
            String N = d370.N(R.string.open_player_settings_menu, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(436746370, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-GearOutline20> (VkSdkIcons.kt:964)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_gear_outline_20, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            kac.b.d dVar = new kac.b.d(a);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new os7(izsVar, 1);
                M.R(x);
            }
            b(dVar, (gzs) x, q(ahn.E(q630.a.a, "chipPlayerSettings"), N).g(q630Var), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ig8(izsVar, q630Var, i, 1);
        }
    }

    public static final void n(dz40.d.k kVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(631714560);
        if ((i & 6) == 0) {
            i2 = (M.J(kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(631714560, i2, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipTrackMix (Chip.kt:309)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            String N = d370.N(R.string.music_player_button_track_mix_title, 0, M);
            kac.b.C3173b c3173b = new kac.b.C3173b(R.raw.music_note_wave_outline_20, kVar.a, Integer.valueOf(rg50Var.getIntValue()));
            q630 g = q(ahn.E(q630.a.a, "startTrackMix"), N).g(q630Var);
            boolean z = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new com.vk.movika.sdk.base.ui.p(3, izsVar, rg50Var);
                M.R(x2);
            }
            b(c3173b, (gzs) x2, g, N, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nx9(kVar, izsVar, q630Var, i, 1);
        }
    }

    public static final void o(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-418957336);
        int i2 = i | (M.J(str) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-418957336, i2, -1, "com.vk.music.stickyplayer.presentation.components.chips.MeasureContent (Chip.kt:457)");
            }
            q630.a aVar2 = q630.a.a;
            q630 F = s200.F(12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(aVar2, 36));
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
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
            ja8.a(txj0.q(aVar2, 20), M, 6);
            f9t.e(txj0.v(aVar2, 4), M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.m0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, null, ylu0Var.getText().d, null, null, 0, 0, null, 0, false, 0, 1, null, frv0Var, M, i2 & 14, 48, 6138);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uac(str, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(izs izsVar, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(850057221);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(850057221, i, -1, "com.vk.music.stickyplayer.presentation.components.chips.MeasureContentWidth (Chip.kt:430)");
            }
            azl azlVar = (azl) M.r(uvi.h);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(new pco(0));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            boolean J = M.J(azlVar);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new dbc(azlVar, wh50Var);
                M.R(x2);
            }
            cp10 cp10Var = (cp10) x2;
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
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
            k9q0.w(M, cp10Var, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            jaiVar.invoke(M, 6);
            M.G();
            pco pcoVar = new pco(((pco) wh50Var.getValue()).b);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new ebc(izsVar, wh50Var, null);
                M.R(x3);
            }
            bap.g(pcoVar, (wzs) x3, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cx(izsVar, jaiVar, i, 3);
        }
    }

    public static final q630 q(q630 q630Var, String str) {
        return egi0.a(q630Var, new zw(str, 3));
    }
}
