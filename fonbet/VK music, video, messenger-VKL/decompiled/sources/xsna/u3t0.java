package xsna;

import android.content.SharedPreferences;
import com.vk.core.preference.Preference;

/* compiled from: VideoPlaybackSpeedPersistentRepository.kt */
/* loaded from: classes17.dex */
public final class u3t0 implements v3t0 {
    public final SharedPreferences a = Preference.f("video_playback_speed_prefs");

    @Override // xsna.v3t0
    public final void a(Float f) {
        qaj0.c(this.a, "prefs_video_playback_speed_key", f);
    }

    @Override // xsna.v3t0
    public final Float b() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences.contains("prefs_video_playback_speed_key")) {
            return Float.valueOf(sharedPreferences.getFloat("prefs_video_playback_speed_key", 1.0f));
        }
        return null;
    }
}
