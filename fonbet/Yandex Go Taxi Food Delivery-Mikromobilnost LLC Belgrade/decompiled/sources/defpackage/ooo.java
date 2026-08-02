package defpackage;

import android.net.Uri;
import androidx.media3.common.PlaybackException;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class ooo implements j42 {
    public final AppAnalyticsReporter a;
    public boolean b;
    public boolean c;
    public fe10 d;

    public ooo(AppAnalyticsReporter appAnalyticsReporter) {
        this.a = appAnalyticsReporter;
    }

    @Override // defpackage.j42
    public final void onIsPlayingChanged(h42 h42Var, boolean z) {
        if (!this.b && !z && this.c) {
            this.a.t0.a.a("video_player.exo_stopped_for_loading", null);
        }
        this.c = z;
    }

    @Override // defpackage.j42
    public final void onMediaItemTransition(h42 h42Var, fe10 fe10Var, int i) {
        this.d = fe10Var;
        this.a.t0.a.a("video_player.item_transition", g8e.w(1, "media_item_id", String.valueOf(fe10Var != null ? fe10Var.a : null)));
        this.c = false;
    }

    @Override // defpackage.j42
    public final void onPlayerError(h42 h42Var, PlaybackException playbackException) {
        zd10 zd10Var;
        Uri uri;
        fe10 fe10Var = this.d;
        x4c.g("ExoVideoPlayer playback error", playbackException, b.i(new Pair("media_uri", (fe10Var == null || (zd10Var = fe10Var.b) == null || (uri = zd10Var.a) == null) ? null : uri.toString()), new Pair("current_playback_position_ms", Long.valueOf(h42Var.i)), new Pair("total_buffered_duration_ms", Long.valueOf(h42Var.j))), null, 8);
    }
}
