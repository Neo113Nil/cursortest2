package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: AudioBookBigPlayerControls.kt */
/* loaded from: classes3.dex */
public final class kd4 {
    public final izs<sx40, s3q0> a;
    public final wh50 b;
    public final kg50 c;
    public final wh50 d;
    public final wh50 e;

    public kd4() {
        throw null;
    }

    public kd4(boolean z, float f, boolean z2, wh50 wh50Var, izs izsVar) {
        this.a = izsVar;
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.d.a(f);
        this.d = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.e = androidx.compose.runtime.k.b(wh50Var);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1624959074);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1624959074, i2, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookBigPlayerControls.Content (AudioBookBigPlayerControls.kt:35)");
            }
            j07.a(kai.c(-727273760, new hd4(this, 0), M), kai.c(-963891585, new bo3(this, 1), M), kai.c(-1200509410, new id4(this, 0), M), kai.c(-1437127235, new jd4(this, 0), M), kai.c(-1673745060, new dd4(this, 0), M), M, 224694);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ed4(this, q630Var, i, 0);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-38317673);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-38317673, i2, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookBigPlayerControls.FastForwardButton (AudioBookBigPlayerControls.kt:78)");
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
            s.d = new cd4(this, i, 0);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-105446288);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-105446288, i2, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookBigPlayerControls.PlayPauseButton (AudioBookBigPlayerControls.kt:64)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.b).getValue()).booleanValue();
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new p60(3);
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
            s.d = new xa2(this, i, 1);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-743047366);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-743047366, i2, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookBigPlayerControls.PlaybackSpeedButton (AudioBookBigPlayerControls.kt:47)");
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
            s.d = new gd4(this, i, 0);
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(268958501);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(268958501, i2, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookBigPlayerControls.RewindButton (AudioBookBigPlayerControls.kt:56)");
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
            s.d = new fd4(this, i, 0);
        }
    }

    public final void f(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(324724760);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(324724760, i2, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookBigPlayerControls.SleepTimerButton (AudioBookBigPlayerControls.kt:86)");
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
            s.d = new com.vk.movika.sdk.android.defaultplayer.control.n(this, i, 1);
        }
    }
}
