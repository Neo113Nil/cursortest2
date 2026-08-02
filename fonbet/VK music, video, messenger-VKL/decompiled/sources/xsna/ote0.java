package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: RadioBigPlayerControls.kt */
/* loaded from: classes3.dex */
public final class ote0 {
    public final izs<sx40, s3q0> a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public ote0() {
        throw null;
    }

    public ote0(boolean z, boolean z2, boolean z3, wh50 wh50Var, izs izsVar) {
        this.a = izsVar;
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.d = androidx.compose.runtime.k.b(Boolean.valueOf(z3));
        this.e = androidx.compose.runtime.k.b(wh50Var);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1344297498);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1344297498, i2, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioBigPlayerControls.Content (RadioBigPlayerControls.kt:32)");
            }
            j07.a(o19.e, kai.c(1968306811, new yde(this, 4), M), kai.c(985313434, new p00(this, 9), M), kai.c(2320057, new uog(this, 5), M), o19.f, M, 224694);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ud6(this, q630Var, i, 10);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1409448493);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1409448493, i2, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioBigPlayerControls.PlayNextButton (RadioBigPlayerControls.kt:67)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.d).getValue()).booleanValue();
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new w910(this, 20);
                M.R(x);
            }
            eva0.a(booleanValue, R.string.music_talkback_player_radio_go_forward, (izs) x, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v95(this, i, 13);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1222544916);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1222544916, i2, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioBigPlayerControls.PlayPauseButton (RadioBigPlayerControls.kt:44)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.b).getValue()).booleanValue();
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new per(22);
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
            s.d = new s77(this, i, 11);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(879882605);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(879882605, i2, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioBigPlayerControls.PlayPrevButton (RadioBigPlayerControls.kt:55)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.c).getValue()).booleanValue();
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new pf40(this, 11);
                M.R(x);
            }
            nva0.a(booleanValue, R.string.music_talkback_player_radio_go_back, (izs) x, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z76(this, i, 5);
        }
    }
}
