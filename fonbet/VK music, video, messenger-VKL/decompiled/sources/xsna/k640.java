package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.dto.hints.HintId;
import one.video.player.OneVideoPlayer;

/* compiled from: MultiTrackHighlight.kt */
/* loaded from: classes2.dex */
public final class k640 {
    public final Context a;
    public final h7v b;

    public k640(Context context, h7v h7vVar) {
        this.a = context;
        this.b = h7vVar;
    }

    public final boolean a(d3b0 d3b0Var) {
        OneVideoPlayer a = d3b0Var.a();
        return this.b.m(HintId.INFO_VIDEO_SELECT_HEADLINE_AUDIO_TRACK) && ((SharedPreferences) m640.a.getValue()).getInt("shown_count", 0) < 5 && (a != null && s3t0.a(this.a, a.F()).size() > 1);
    }

    public final void b() {
        this.b.b(HintId.INFO_VIDEO_SELECT_HEADLINE_AUDIO_TRACK.getId());
        SharedPreferences.Editor edit = ((SharedPreferences) m640.a.getValue()).edit();
        edit.putInt("shown_count", 0);
        edit.apply();
    }

    public final void c() {
        bpn0 bpn0Var = m640.a;
        SharedPreferences.Editor edit = ((SharedPreferences) bpn0Var.getValue()).edit();
        edit.putInt("shown_count", ((SharedPreferences) bpn0Var.getValue()).getInt("shown_count", 0) + 1);
        edit.apply();
        if (((SharedPreferences) bpn0Var.getValue()).getInt("shown_count", 0) < 5) {
            return;
        }
        b();
    }
}
