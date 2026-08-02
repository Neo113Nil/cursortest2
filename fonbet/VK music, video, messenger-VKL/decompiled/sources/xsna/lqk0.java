package xsna;

import android.os.SystemClock;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StartPlayRequest.kt */
/* loaded from: classes3.dex */
public final class lqk0 {
    public final StartPlaySource a;
    public final MusicTrack b;
    public final List<MusicTrack> c;
    public final MusicPlaybackLaunchContext d;
    public final boolean e;
    public final int f;
    public final ShuffleMode g;
    public final PlayRequestTrigger h;
    public final AdsAudioPixelsContainer i;
    public final long j;

    /* compiled from: StartPlayRequest.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayRequestTrigger.values().length];
            try {
                iArr[PlayRequestTrigger.FAST_PLAY_SINGLE_AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayRequestTrigger.FAST_PLAY_TRACK_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayRequestTrigger.SHUFFLE_BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayRequestTrigger.VOICE_COMMAND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public lqk0() {
        this((StartPlaySource) null, (MusicTrack) null, (List) null, (MusicPlaybackLaunchContext) null, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
    }

    public final AdsAudioPixelsContainer a() {
        return this.i;
    }

    public final List<MusicTrack> b() {
        return this.c;
    }

    public final MusicPlaybackLaunchContext c() {
        return this.d;
    }

    public final PlaybackActionMeta d() {
        int i = a.$EnumSwitchMapping$0[this.h.ordinal()];
        long j = this.j;
        if (i == 1) {
            return new PlaybackActionMeta(-2, j);
        }
        if (i == 2) {
            return new PlaybackActionMeta(-3, j);
        }
        if (i == 3) {
            return new PlaybackActionMeta(-1, j);
        }
        if (i == 4) {
            return new PlaybackActionMeta(9, j);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqk0)) {
            return false;
        }
        lqk0 lqk0Var = (lqk0) obj;
        return epx.f(this.a, lqk0Var.a) && epx.f(this.b, lqk0Var.b) && epx.f(this.c, lqk0Var.c) && epx.f(this.d, lqk0Var.d) && this.e == lqk0Var.e && this.f == lqk0Var.f && this.g == lqk0Var.g && this.h == lqk0Var.h && epx.f(this.i, lqk0Var.i) && this.j == lqk0Var.j;
    }

    public final ShuffleMode f() {
        return this.g;
    }

    public final StartPlaySource g() {
        return this.a;
    }

    public final long h() {
        return this.j;
    }

    public final int hashCode() {
        StartPlaySource startPlaySource = this.a;
        int hashCode = (startPlaySource == null ? 0 : startPlaySource.hashCode()) * 31;
        MusicTrack musicTrack = this.b;
        int hashCode2 = (hashCode + (musicTrack == null ? 0 : musicTrack.hashCode())) * 31;
        List<MusicTrack> list = this.c;
        int hashCode3 = (this.h.hashCode() + ((this.g.hashCode() + shy.a(this.f, qoy.b((this.d.b.hashCode() + ((hashCode2 + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.e), 31)) * 31)) * 31;
        AdsAudioPixelsContainer adsAudioPixelsContainer = this.i;
        return Long.hashCode(this.j) + ((hashCode3 + (adsAudioPixelsContainer != null ? adsAudioPixelsContainer.hashCode() : 0)) * 31);
    }

    public final MusicTrack i() {
        return this.b;
    }

    public final boolean j() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartPlayRequest(trigger=");
        sb.append(this.h);
        sb.append(", source=");
        sb.append(this.a);
        sb.append(", trackToStart=");
        sb.append(this.b);
        sb.append("), preloadedTracksSize=");
        List<MusicTrack> list = this.c;
        sb.append(list != null ? Integer.valueOf(list.size()) : null);
        sb.append(", refer=");
        sb.append(this.d);
        sb.append(", isForceStart=");
        sb.append(this.e);
        sb.append(", seekToMs=");
        sb.append(this.f);
        sb.append(", shuffleMode=");
        sb.append(this.g);
        return sb.toString();
    }

    public lqk0(StartPlaySource startPlaySource, MusicTrack musicTrack, List<MusicTrack> list, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z, int i, ShuffleMode shuffleMode, PlayRequestTrigger playRequestTrigger, AdsAudioPixelsContainer adsAudioPixelsContainer, long j) {
        this.a = startPlaySource;
        this.b = musicTrack;
        this.c = list;
        this.d = musicPlaybackLaunchContext;
        this.e = z;
        this.f = i;
        this.g = shuffleMode;
        this.h = playRequestTrigger;
        this.i = adsAudioPixelsContainer;
        this.j = j;
    }

    public /* synthetic */ lqk0(StartPlaySource startPlaySource, MusicTrack musicTrack, List list, MusicPlaybackLaunchContext musicPlaybackLaunchContext, int i, ShuffleMode shuffleMode, PlayRequestTrigger playRequestTrigger, AdsAudioPixelsContainer adsAudioPixelsContainer, long j, int i2) {
        this((i2 & 1) != 0 ? null : startPlaySource, (i2 & 2) != 0 ? null : musicTrack, (List<MusicTrack>) ((i2 & 4) != 0 ? null : list), (i2 & 8) != 0 ? MusicPlaybackLaunchContext.d : musicPlaybackLaunchContext, false, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? ShuffleMode.SHUFFLE_AUTO : shuffleMode, (i2 & 128) != 0 ? PlayRequestTrigger.FAST_PLAY_SINGLE_AUDIO : playRequestTrigger, (i2 & 256) != 0 ? null : adsAudioPixelsContainer, (i2 & 512) != 0 ? SystemClock.elapsedRealtime() : j);
    }
}
