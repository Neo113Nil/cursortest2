package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: TopPlayerControls.kt */
/* loaded from: classes3.dex */
public interface c9p0 {

    /* compiled from: TopPlayerControls.kt */
    public static final class a implements c9p0 {
        public final wh50 a;
        public final wh50 b;

        public a() {
            throw null;
        }

        public a(izs izsVar, boolean z) {
            this.a = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.b = androidx.compose.runtime.k.b(izsVar);
        }

        @Override // xsna.c9p0
        public final void a(int i, androidx.compose.runtime.a aVar) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-521408705);
            int i3 = i & 6;
            q630.a aVar2 = q630.a.a;
            if (i3 == 0) {
                i2 = i | (M.J(aVar2) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-521408705, i2, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.AdvertisementButtons.Content (TopPlayerControls.kt:525)");
                }
                a.l lVar = androidx.compose.foundation.layout.a.a;
                float f = a9p0.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f, dt1.a.p), dt1.a.k, M, 6);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, aVar2);
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
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(864001564, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical24> (VkSdkIcons.kt:2666)");
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_more_vertical_24, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N = d370.N(R.string.music_talkback_player_more, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().c;
                int i4 = i2 & 112;
                boolean z = i4 == 32;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new cck0(this, 7);
                    M.R(x);
                }
                bh2.b(j, a2, null, N, false, (gzs) x, M, 64, 20);
                wh50 wh50Var = this.a;
                q630 E = ahn.E(aVar2, ((Boolean) ((zak0) wh50Var).getValue()).booleanValue() ? "tracklistPlayerPauseButton" : "tracklistPlayerPlayButton");
                Boolean bool = (Boolean) ((zak0) wh50Var).getValue();
                bool.getClass();
                String N2 = d370.N(((Boolean) ((zak0) wh50Var).getValue()).booleanValue() ? R.string.music_talkback_player_pause : R.string.music_talkback_player_play, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var2.getIcon().c;
                wgi wgiVar = new wgi(4);
                boolean z2 = i4 == 32;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new mqe0(this, 20);
                    M.R(x2);
                }
                bh2.a(bool, j2, wgiVar, E, N2, false, false, (gzs) x2, M, 0, 96);
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
                s.d = new oku(this, i);
            }
        }
    }

    /* compiled from: TopPlayerControls.kt */
    public static final class b implements c9p0 {
        public final wh50 a;
        public final wh50 b;

        public b() {
            throw null;
        }

        public b(izs izsVar, boolean z) {
            this.a = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.b = androidx.compose.runtime.k.b(izsVar);
        }

        @Override // xsna.c9p0
        public final void a(int i, androidx.compose.runtime.a aVar) {
            int i2;
            b bVar;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(1665502885);
            int i3 = i & 6;
            q630.a aVar3 = q630.a.a;
            if (i3 == 0) {
                i2 = i | (M.J(aVar3) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1665502885, i2, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.AudioBookButtons.Content (TopPlayerControls.kt:660)");
                }
                a.l lVar = androidx.compose.foundation.layout.a.a;
                float f = a9p0.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f, dt1.a.p), dt1.a.k, M, 6);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
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
                wh50 wh50Var = this.a;
                q630 E = ahn.E(aVar3, ((Boolean) ((zak0) wh50Var).getValue()).booleanValue() ? "tracklistPlayerPauseButton" : "tracklistPlayerPlayButton");
                Boolean bool = (Boolean) ((zak0) wh50Var).getValue();
                bool.getClass();
                String N = d370.N(((Boolean) ((zak0) wh50Var).getValue()).booleanValue() ? R.string.music_talkback_player_pause : R.string.music_talkback_player_audiobook_play, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().c;
                xgi xgiVar = new xgi(4);
                int i4 = i2 & 112;
                boolean z = i4 == 32;
                Object x = M.x();
                Object obj = a.C0011a.a;
                if (z || x == obj) {
                    x = new mlf0(this, 10);
                    M.R(x);
                }
                bh2.a(bool, j, xgiVar, E, N, false, false, (gzs) x, M, 0, 96);
                q630 E2 = ahn.E(aVar3, "tracklistPlayerFastForwardButton");
                qzu0.a.getClass();
                lg90 U = qzu0.U(M);
                String N2 = d370.N(R.string.accessibility_rewind_on_15_sec_forward, 0, M);
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
                if (z2 || x2 == obj) {
                    bVar = this;
                    x2 = new rka0(bVar, 23);
                    M.R(x2);
                } else {
                    bVar = this;
                }
                bh2.b(j2, U, E2, N2, false, (gzs) x2, M, 448, 16);
                aVar2 = M;
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                bVar = this;
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.d = new ly5(bVar, i);
            }
        }
    }

    /* compiled from: TopPlayerControls.kt */
    public static final class c implements c9p0 {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;
        public final wh50 d;

        /* compiled from: TopPlayerControls.kt */
        public static final class a {
            public static c a(boolean z, boolean z2, boolean z3, izs izsVar, androidx.compose.runtime.a aVar, int i) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-648424330, i, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.MusicButtons.Companion.invoke (TopPlayerControls.kt:504)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new c(z, z2, z3, izsVar);
                    aVar.R(x);
                }
                c cVar = (c) x;
                ((zak0) cVar.a).setValue(Boolean.valueOf(z));
                ((zak0) cVar.b).setValue(Boolean.valueOf(z2));
                ((zak0) cVar.c).setValue(Boolean.valueOf(z3));
                ((zak0) cVar.d).setValue(izsVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return cVar;
            }
        }

        public c() {
            throw null;
        }

        public c(boolean z, boolean z2, boolean z3, izs izsVar) {
            this.a = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
            this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z3));
            this.d = androidx.compose.runtime.k.b(izsVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x01a0, code lost:
        
            if (r10 == r9) goto L66;
         */
        @Override // xsna.c9p0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(int i, androidx.compose.runtime.a aVar) {
            int i2;
            a.C0011a.C0012a c0012a;
            androidx.compose.runtime.a M = aVar.M(-1154008545);
            int i3 = i & 6;
            q630.a aVar2 = q630.a.a;
            if (i3 == 0) {
                i2 = i | (M.J(aVar2) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1154008545, i2, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.MusicButtons.Content (TopPlayerControls.kt:417)");
                }
                a.l lVar = androidx.compose.foundation.layout.a.a;
                float f = a9p0.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f, dt1.a.p), dt1.a.k, M, 6);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, aVar2);
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
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                wh50 wh50Var = this.b;
                q630 E = ahn.E(aVar2, ((Boolean) ((zak0) wh50Var).getValue()).booleanValue() ? "tracklistPlayerAddTrackButton" : "tracklistPlayerDeleteTrackButton");
                Boolean bool = (Boolean) ((zak0) wh50Var).getValue();
                bool.getClass();
                String N = d370.N(((Boolean) ((zak0) wh50Var).getValue()).booleanValue() ? R.string.music_talkback_player_add_track_to_favorite : R.string.music_talkback_player_remove_track_from_favorite, 0, M);
                long j = wlb0.h(M).getIcon().c;
                int i4 = i2 & 112;
                boolean z = i4 == 32;
                Object x = M.x();
                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                if (z || x == c0012a2) {
                    x = new lbc0(this, 23);
                    M.R(x);
                }
                boolean z2 = false;
                bh2.a(bool, j, new fci(4), E, N, false, false, z3r0.d(0, 1, M, (gzs) x), M, 0, 96);
                wh50 wh50Var2 = this.a;
                q630 E2 = ahn.E(aVar2, ((Boolean) ((zak0) wh50Var2).getValue()).booleanValue() ? "tracklistPlayerPauseButton" : "tracklistPlayerPlayButton");
                Boolean bool2 = (Boolean) ((zak0) wh50Var2).getValue();
                bool2.getClass();
                String N2 = d370.N(((Boolean) ((zak0) wh50Var2).getValue()).booleanValue() ? R.string.music_talkback_player_pause : R.string.music_talkback_player_play, 0, M);
                long j2 = wlb0.h(M).getIcon().c;
                lcm lcmVar = new lcm(2);
                boolean z3 = i4 == 32;
                Object x2 = M.x();
                if (z3) {
                    c0012a = c0012a2;
                } else {
                    c0012a = c0012a2;
                }
                x2 = new hbj0(this, 11);
                M.R(x2);
                gzs gzsVar = (gzs) x2;
                a.C0011a.C0012a c0012a3 = c0012a;
                bh2.a(bool2, j2, lcmVar, E2, N2, false, false, gzsVar, M, 0, 96);
                wh50 wh50Var3 = this.c;
                q630 E3 = ahn.E(o19.a(aVar2, ((Boolean) ((zak0) wh50Var3).getValue()).booleanValue() ? 1.0f : 0.64f), "tracklistPlayerNextButton");
                qzu0.a.getClass();
                lg90 o1 = qzu0.o1(M);
                String N3 = d370.N(R.string.music_talkback_player_go_forward, 0, M);
                long j3 = wlb0.h(M).getIcon().c;
                boolean booleanValue = ((Boolean) ((zak0) wh50Var3).getValue()).booleanValue();
                if (i4 == 32) {
                    z2 = true;
                }
                Object x3 = M.x();
                if (z2 || x3 == c0012a3) {
                    x3 = new pwh0(this, 14);
                    M.R(x3);
                }
                bh2.b(j3, o1, E3, N3, booleanValue, (gzs) x3, M, 64, 0);
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
                s.d = new g1b0(this, i);
            }
        }
    }

    /* compiled from: TopPlayerControls.kt */
    public static final class d implements c9p0 {
        public final wh50 a;
        public final wh50 b;

        public d() {
            throw null;
        }

        public d(izs izsVar, boolean z) {
            this.a = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.b = androidx.compose.runtime.k.b(izsVar);
        }

        @Override // xsna.c9p0
        public final void a(int i, androidx.compose.runtime.a aVar) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-241377504);
            int i3 = i & 6;
            q630.a aVar2 = q630.a.a;
            if (i3 == 0) {
                i2 = i | (M.J(aVar2) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-241377504, i2, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.PodcastButtons.Content (TopPlayerControls.kt:591)");
                }
                a.l lVar = androidx.compose.foundation.layout.a.a;
                float f = a9p0.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f, dt1.a.p), dt1.a.k, M, 6);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, aVar2);
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
                q630 E = ahn.E(aVar2, "tracklistPlayerFastForwardButton");
                qzu0.a.getClass();
                lg90 U = qzu0.U(M);
                String N = d370.N(R.string.accessibility_rewind_on_15_sec_forward, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().c;
                int i4 = i2 & 112;
                boolean z = i4 == 32;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new tsk0(this, 9);
                    M.R(x);
                }
                bh2.b(j, U, E, N, false, (gzs) x, M, 448, 16);
                wh50 wh50Var = this.a;
                q630 E2 = ahn.E(aVar2, ((Boolean) ((zak0) wh50Var).getValue()).booleanValue() ? "tracklistPlayerPauseButton" : "tracklistPlayerPlayButton");
                Boolean bool = (Boolean) ((zak0) wh50Var).getValue();
                bool.getClass();
                String N2 = d370.N(((Boolean) ((zak0) wh50Var).getValue()).booleanValue() ? R.string.music_talkback_player_pause : R.string.music_talkback_player_podcast_play, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var2.getIcon().c;
                rce rceVar = new rce(6);
                boolean z2 = i4 == 32;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new dei0(this, 17);
                    M.R(x2);
                }
                bh2.a(bool, j2, rceVar, E2, N2, false, false, (gzs) x2, M, 0, 96);
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
                s.d = new clk(this, i);
            }
        }
    }

    /* compiled from: TopPlayerControls.kt */
    public static final class e implements c9p0 {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;
        public final wh50 d;

        public e() {
            throw null;
        }

        public e(boolean z, boolean z2, boolean z3, izs izsVar) {
            this.a = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
            this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z3));
            this.d = androidx.compose.runtime.k.b(izsVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x0193, code lost:
        
            if (r10 == r9) goto L66;
         */
        @Override // xsna.c9p0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(int i, androidx.compose.runtime.a aVar) {
            int i2;
            a.C0011a.C0012a c0012a;
            androidx.compose.runtime.a M = aVar.M(2043848329);
            int i3 = i & 6;
            q630.a aVar2 = q630.a.a;
            if (i3 == 0) {
                i2 = i | (M.J(aVar2) ? 4 : 2);
            } else {
                i2 = i;
            }
            int i4 = 16;
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2043848329, i2, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.RadioButtons.Content (TopPlayerControls.kt:732)");
                }
                a.l lVar = androidx.compose.foundation.layout.a.a;
                float f = a9p0.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f, dt1.a.p), dt1.a.k, M, 6);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, aVar2);
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
                wh50 wh50Var = this.b;
                q630 E = ahn.E(aVar2, ((Boolean) ((zak0) wh50Var).getValue()).booleanValue() ? "tracklistPlayerAddTrackButton" : "tracklistPlayerDeleteTrackButton");
                Boolean bool = (Boolean) ((zak0) wh50Var).getValue();
                bool.getClass();
                String N = d370.N(((Boolean) ((zak0) wh50Var).getValue()).booleanValue() ? R.string.music_talkback_player_add_radio_to_favorite : R.string.music_talkback_player_remove_radio_from_favorite, 0, M);
                long j = wlb0.h(M).getIcon().c;
                int i5 = i2 & 112;
                boolean z = i5 == 32;
                Object x = M.x();
                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                if (z || x == c0012a2) {
                    x = new ofc0(this, i4);
                    M.R(x);
                }
                boolean z2 = false;
                bh2.a(bool, j, new kre(6), E, N, false, false, z3r0.d(0, 1, M, (gzs) x), M, 0, 96);
                wh50 wh50Var2 = this.a;
                q630 E2 = ahn.E(aVar2, ((Boolean) ((zak0) wh50Var2).getValue()).booleanValue() ? "tracklistPlayerPauseButton" : "tracklistPlayerPlayButton");
                Boolean bool2 = (Boolean) ((zak0) wh50Var2).getValue();
                bool2.getClass();
                String N2 = d370.N(((Boolean) ((zak0) wh50Var2).getValue()).booleanValue() ? R.string.music_talkback_player_radio_pause : R.string.music_talkback_player_radio_play, 0, M);
                long j2 = wlb0.h(M).getIcon().c;
                rni rniVar = new rni(3);
                boolean z3 = i5 == 32;
                Object x2 = M.x();
                if (z3) {
                    c0012a = c0012a2;
                } else {
                    c0012a = c0012a2;
                }
                x2 = new l6n0(this, 7);
                M.R(x2);
                a.C0011a.C0012a c0012a3 = c0012a;
                bh2.a(bool2, j2, rniVar, E2, N2, false, false, (gzs) x2, M, 0, 96);
                wh50 wh50Var3 = this.c;
                q630 E3 = ahn.E(o19.a(aVar2, ((Boolean) ((zak0) wh50Var3).getValue()).booleanValue() ? 1.0f : 0.64f), "tracklistPlayerNextButton");
                qzu0.a.getClass();
                lg90 o1 = qzu0.o1(M);
                String N3 = d370.N(R.string.music_talkback_player_radio_go_forward, 0, M);
                long j3 = wlb0.h(M).getIcon().c;
                boolean booleanValue = ((Boolean) ((zak0) wh50Var3).getValue()).booleanValue();
                if (i5 == 32) {
                    z2 = true;
                }
                Object x3 = M.x();
                if (z2 || x3 == c0012a3) {
                    x3 = new w2j0(this, 8);
                    M.R(x3);
                }
                bh2.b(j3, o1, E3, N3, booleanValue, (gzs) x3, M, 64, 0);
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
                s.d = new g7g(this, i);
            }
        }
    }

    void a(int i, androidx.compose.runtime.a aVar);
}
