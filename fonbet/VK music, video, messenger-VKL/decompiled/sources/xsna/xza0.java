package xsna;

import com.vk.music.player.PlaybackActionMeta;

/* compiled from: PlayerCallback.kt */
/* loaded from: classes3.dex */
public interface xza0 {
    default boolean M(boolean z, PlaybackActionMeta playbackActionMeta, String str) {
        return f(playbackActionMeta);
    }

    boolean f(PlaybackActionMeta playbackActionMeta);

    float getVolume();

    boolean j(int i, PlaybackActionMeta playbackActionMeta);

    boolean m(String str, int i, boolean z, boolean z2);

    void setVolume(float f);

    void stop(int i);
}
