package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: TopPlayerControls.kt */
/* loaded from: classes3.dex */
public interface b9p0 {

    /* compiled from: TopPlayerControls.kt */
    public static final class a implements b9p0 {
        public static final a a = new a();

        @Override // xsna.b9p0
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(-373897889);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if (M.t(i2 & 1, (i2 & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-373897889, i2, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Middle.Advertisement.Content (TopPlayerControls.kt:197)");
                }
                q630 E = ahn.E(q630Var, "tracklistPlayerTrackTitle");
                String N = d370.N(R.string.music_player_ad_title, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.O;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                yqv0.c(N, E, ylu0Var.getText().d, null, null, 0, 0, null, 0, false, 0, 1, null, frv0Var, aVar2, 0, 48, 6136);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.d = new va50(this, q630Var, i, 1);
            }
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1288682049;
        }

        public final String toString() {
            return "Advertisement";
        }
    }

    /* compiled from: TopPlayerControls.kt */
    public static final class b implements b9p0 {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;

        public b(String str, boolean z, String str2) {
            this.a = androidx.compose.runtime.k.b(str);
            this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.c = androidx.compose.runtime.k.b(str2);
        }

        @Override // xsna.b9p0
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(436037957);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(436037957, i2, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Middle.AudioBook.Content (TopPlayerControls.kt:296)");
                }
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, q630Var);
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
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630.a aVar4 = q630.a.a;
                q630 c2 = qri.c(M, aVar4);
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
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                yqv0.c((String) ((zak0) this.a).getValue(), ahn.E(new xpy(1.0f, false), "tracklistPlayerTrackTitle"), wlb0.h(M).getText().d, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).O, M, 0, 48, 6136);
                if (((Boolean) ((zak0) this.b).getValue()).booleanValue()) {
                    M.K(-1541802580);
                    z3r0.a(null, M, 0);
                } else {
                    M.K(-1553290281);
                }
                M.j();
                M.G();
                aVar2 = M;
                yqv0.c((String) ((zak0) this.c).getValue(), ahn.E(aVar4, "tracklistPlayerArtistTitle"), l5g.c(14, wlb0.h(M).getText().d, 0.6f), null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).s0, aVar2, 48, 48, 6136);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.d = new ubh(this, q630Var, i, 5);
            }
        }
    }

    /* compiled from: TopPlayerControls.kt */
    public static final class c implements b9p0 {
        public static final c a = new c();

        @Override // xsna.b9p0
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(-10384873);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if (M.t(i2 & 1, (i2 & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-10384873, i2, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Middle.Empty.Content (TopPlayerControls.kt:213)");
                }
                q630 E = ahn.E(q630Var, "tracklistPlayerTrackTitle");
                String N = d370.N(R.string.music_player_empty_title, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.O;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                yqv0.c(N, E, ylu0Var.getText().d, null, null, 0, 0, null, 0, false, 0, 1, null, frv0Var, aVar2, 0, 48, 6136);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.d = new zbo(this, q630Var, i, 3);
            }
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1649305993;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: TopPlayerControls.kt */
    public static final class d implements b9p0 {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;

        /* compiled from: TopPlayerControls.kt */
        public static final class a {
            public static d a(String str, boolean z, String str2, androidx.compose.runtime.a aVar) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(813212646, 3072, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Middle.Music.Companion.invoke (TopPlayerControls.kt:183)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new d(str, z, str2);
                    aVar.R(x);
                }
                d dVar = (d) x;
                ((zak0) dVar.a).setValue(str);
                ((zak0) dVar.b).setValue(Boolean.valueOf(z));
                ((zak0) dVar.c).setValue(str2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return dVar;
            }
        }

        public d(String str, boolean z, String str2) {
            this.a = androidx.compose.runtime.k.b(str);
            this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.c = androidx.compose.runtime.k.b(str2);
        }

        @Override // xsna.b9p0
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(93042751);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(93042751, i2, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Middle.Music.Content (TopPlayerControls.kt:146)");
                }
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, q630Var);
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
                k9q0.w(M, a2, cVar);
                cri.a.e eVar = cri.a.e;
                k9q0.w(M, D, eVar);
                Integer valueOf = Integer.valueOf(hashCode);
                cri.a.b bVar = cri.a.g;
                k9q0.w(M, valueOf, bVar);
                cri.a.C2678a c2678a = cri.a.h;
                k9q0.t(M, c2678a);
                cri.a.d dVar = cri.a.d;
                k9q0.w(M, c, dVar);
                androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630.a aVar4 = q630.a.a;
                q630 c2 = qri.c(M, aVar4);
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
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar, M, c2678a);
                k9q0.w(M, c2, dVar);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                yqv0.c((String) ((zak0) this.a).getValue(), ahn.E(new xpy(1.0f, false), "tracklistPlayerTrackTitle"), wlb0.h(M).getText().d, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).O, M, 0, 48, 6136);
                if (((Boolean) ((zak0) this.b).getValue()).booleanValue()) {
                    M.K(1141868914);
                    z3r0.a(null, M, 0);
                } else {
                    M.K(1135877885);
                }
                M.j();
                M.G();
                aVar2 = M;
                yqv0.c((String) ((zak0) this.c).getValue(), ahn.E(aVar4, "tracklistPlayerArtistTitle"), l5g.c(14, wlb0.h(M).getText().d, 0.6f), null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).s0, aVar2, 48, 48, 6136);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.d = new xyc(this, q630Var, i, 7);
            }
        }
    }

    /* compiled from: TopPlayerControls.kt */
    public static final class e implements b9p0 {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;

        public e(String str, boolean z, String str2) {
            this.a = androidx.compose.runtime.k.b(str);
            this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.c = androidx.compose.runtime.k.b(str2);
        }

        @Override // xsna.b9p0
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(1313698304);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1313698304, i2, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Middle.Podcast.Content (TopPlayerControls.kt:237)");
                }
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, q630Var);
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
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630.a aVar4 = q630.a.a;
                q630 c2 = qri.c(M, aVar4);
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
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                yqv0.c((String) ((zak0) this.a).getValue(), ahn.E(new xpy(1.0f, false), "tracklistPlayerTrackTitle"), wlb0.h(M).getText().d, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).O, M, 0, 48, 6136);
                if (((Boolean) ((zak0) this.b).getValue()).booleanValue()) {
                    M.K(1713610129);
                    z3r0.a(null, M, 0);
                } else {
                    M.K(1704306812);
                }
                M.j();
                M.G();
                aVar2 = M;
                yqv0.c((String) ((zak0) this.c).getValue(), ahn.E(aVar4, "tracklistPlayerArtistTitle"), l5g.c(14, wlb0.h(M).getText().d, 0.6f), null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).s0, aVar2, 48, 48, 6136);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.d = new kka(this, q630Var, i, 4);
            }
        }
    }

    /* compiled from: TopPlayerControls.kt */
    public static final class f implements b9p0 {
        public final wh50 a;
        public final rg50 b = androidx.compose.runtime.i.a(R.string.music_player_radio_station);

        public f(String str) {
            this.a = androidx.compose.runtime.k.b(str);
        }

        @Override // xsna.b9p0
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(111361065);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(111361065, i2, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Middle.Radio.Content (TopPlayerControls.kt:354)");
                }
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, q630Var);
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
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630.a aVar4 = q630.a.a;
                q630 c2 = qri.c(M, aVar4);
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
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                aVar2 = M;
                yqv0.c((String) ((zak0) this.a).getValue(), ahn.E(new xpy(1.0f, false), "tracklistPlayerTrackTitle"), wlb0.h(M).getText().d, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).O, aVar2, 0, 48, 6136);
                aVar2.G();
                yqv0.c(d370.N(((wak0) this.b).getIntValue(), 0, aVar2), ahn.E(aVar4, "tracklistPlayerArtistTitle"), l5g.c(14, wlb0.h(aVar2).getText().d, 0.6f), null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(aVar2).s0, aVar2, 48, 48, 6136);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.d = new ohf(this, q630Var, i, 4);
            }
        }
    }

    void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
