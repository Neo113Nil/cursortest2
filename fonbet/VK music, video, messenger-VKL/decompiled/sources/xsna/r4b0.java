package xsna;

import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.stats.AdsAudioPixelsContainer;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PlayerStatePlayableNavMeta.kt */
/* loaded from: classes3.dex */
public final class r4b0 {
    public static final Object e = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.model.props.a(22));
    public final MusicPlaybackLaunchContext a;
    public final String b;
    public final AdsAudioPixelsContainer c;
    public final PlaySourceMeta d;

    public r4b0(MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str, AdsAudioPixelsContainer adsAudioPixelsContainer, PlaySourceMeta playSourceMeta) {
        this.a = musicPlaybackLaunchContext;
        this.b = str;
        this.c = adsAudioPixelsContainer;
        this.d = playSourceMeta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4b0)) {
            return false;
        }
        r4b0 r4b0Var = (r4b0) obj;
        return epx.f(this.a, r4b0Var.a) && epx.f(this.b, r4b0Var.b) && epx.f(this.c, r4b0Var.c) && epx.f(this.d, r4b0Var.d);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.b.hashCode() * 31, 31, this.b);
        AdsAudioPixelsContainer adsAudioPixelsContainer = this.c;
        return this.d.hashCode() + ((a + (adsAudioPixelsContainer == null ? 0 : adsAudioPixelsContainer.hashCode())) * 31);
    }

    public final String toString() {
        return "PlayerStatePlayableNavMeta(launchContext=" + this.a + ", sectionId=" + this.b + ", audioPixels=" + this.c + ", playSourceMeta=" + this.d + ')';
    }
}
