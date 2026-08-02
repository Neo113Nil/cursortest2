package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: PodcastBigPlayerControls.kt */
/* loaded from: classes3.dex */
public final class fgb0 {
    public final izs<sx40, s3q0> a;
    public final wh50 b;
    public final kg50 c;
    public final wh50 d;
    public final wh50 e;

    public fgb0() {
        throw null;
    }

    public fgb0(boolean z, float f, boolean z2, wh50 wh50Var, izs izsVar) {
        this.a = izsVar;
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.d.a(f);
        this.d = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.e = androidx.compose.runtime.k.b(wh50Var);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(58668483);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(58668483, i2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastBigPlayerControls.Content (PodcastBigPlayerControls.kt:35)");
            }
            j07.a(kai.c(-2100566395, new dr0(this, 9), M), kai.c(-1338685084, new nq1(this, 10), M), kai.c(-576803773, new cd4(this, 11), M), kai.c(185077538, new dd4(this, 7), M), kai.c(946958849, new com.vk.movika.tools.controls.seekbar.s(this, 14), M), M, 224694);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yn7(this, q630Var, i, 9);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-488726916);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-488726916, i2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastBigPlayerControls.FastForwardButton (PodcastBigPlayerControls.kt:78)");
            }
            zkq.a(this.a, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hq5(this, i, 14);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(2045749269);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2045749269, i2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastBigPlayerControls.PlayPauseButton (PodcastBigPlayerControls.kt:64)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.b).getValue()).booleanValue();
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new u620(12);
                M.R(x);
            }
            iva0.a(booleanValue, (izs) x, this.a, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xk6(this, i, 8);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1840446881);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1840446881, i2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastBigPlayerControls.PlaybackSpeedButton (PodcastBigPlayerControls.kt:47)");
            }
            rya0.a(((vak0) this.c).getFloatValue(), 48, M, this.a, null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.r(this, i, 8);
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-2095510902);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2095510902, i2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastBigPlayerControls.RewindButton (PodcastBigPlayerControls.kt:56)");
            }
            kjg0.a(this.a, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.u(this, i, 10);
        }
    }

    public final void f(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(110193085);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(110193085, i2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastBigPlayerControls.SleepTimerButton (PodcastBigPlayerControls.kt:86)");
            }
            zzj0.a(48, M, this.a, null, ((Boolean) ((zak0) this.d).getValue()).booleanValue());
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.v(this, i, 11);
        }
    }
}
