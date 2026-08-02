package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: KidsPodcastBigPlayerControls.kt */
/* loaded from: classes3.dex */
public final class uiy {
    public final izs<sx40, s3q0> a;
    public final wh50 b;
    public final kg50 c;
    public final wh50 d;
    public final wh50 e;

    public uiy() {
        throw null;
    }

    public uiy(boolean z, float f, boolean z2, wh50 wh50Var, izs izsVar) {
        this.a = izsVar;
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.d.a(f);
        this.d = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.e = androidx.compose.runtime.k.b(wh50Var);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1759786391);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1759786391, i2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.KidsPodcastBigPlayerControls.Content (KidsPodcastBigPlayerControls.kt:34)");
            }
            j07.a(fto0.h, kai.c(-2129089270, new bh5(this, 7), M), kai.c(-1885552407, new u70(this, 6), M), kai.c(-1642015544, new aza(this, 6), M), fto0.i, M, 224694);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z85(this, q630Var, i, 5);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1710790110);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1710790110, i2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.KidsPodcastBigPlayerControls.FastForwardButton (KidsPodcastBigPlayerControls.kt:70)");
            }
            zkq.a(this.a, null, 48, M, 3078, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new oac(this, i, 7);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1796879685);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1796879685, i2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.KidsPodcastBigPlayerControls.PlayPauseButton (KidsPodcastBigPlayerControls.kt:55)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.b).getValue()).booleanValue();
            float f = 64;
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new ur0(29);
                M.R(x);
            }
            iva0.a(booleanValue, (izs) x, this.a, null, f, M, 24624, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bt3(this, i, 8);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1523836976);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1523836976, i2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.KidsPodcastBigPlayerControls.RewindButton (KidsPodcastBigPlayerControls.kt:46)");
            }
            kjg0.a(this.a, null, 48, M, 3078, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new th3(this, i, 3);
        }
    }
}
