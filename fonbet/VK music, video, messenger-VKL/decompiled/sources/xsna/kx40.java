package xsna;

import com.vk.dto.music.AudioLoudness;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.moosic.EncryptedFileInfo;
import com.vk.dto.music.moosic.MoosicAudio;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import java.util.Objects;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: MusicPlayerHelperPlaybackParams.kt */
/* loaded from: classes3.dex */
public final class kx40 {
    public final uz4 a;
    public final MusicTrack b;
    public final wva0 c;
    public final PlaybackLaunchMeta d;
    public final PlaybackActionMeta e;
    public final boolean f;
    public final AudioLoudness g;
    public final float h;
    public final x6b0 i;

    public kx40() {
        this(null, null, null, null, null, false, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
    }

    public static kx40 a(kx40 kx40Var, uz4 uz4Var, wva0 wva0Var, PlaybackActionMeta playbackActionMeta, boolean z, int i) {
        if ((i & 1) != 0) {
            uz4Var = kx40Var.a;
        }
        uz4 uz4Var2 = uz4Var;
        MusicTrack musicTrack = kx40Var.b;
        if ((i & 4) != 0) {
            wva0Var = kx40Var.c;
        }
        wva0 wva0Var2 = wva0Var;
        PlaybackLaunchMeta playbackLaunchMeta = kx40Var.d;
        if ((i & 16) != 0) {
            playbackActionMeta = kx40Var.e;
        }
        PlaybackActionMeta playbackActionMeta2 = playbackActionMeta;
        if ((i & 32) != 0) {
            z = kx40Var.f;
        }
        AudioLoudness audioLoudness = kx40Var.g;
        float f = kx40Var.h;
        x6b0 x6b0Var = kx40Var.i;
        kx40Var.getClass();
        return new kx40(uz4Var2, musicTrack, wva0Var2, playbackLaunchMeta, playbackActionMeta2, z, audioLoudness, f, x6b0Var);
    }

    public static boolean e(String str) {
        return !(str == null || drm0.N(str));
    }

    public final String b() {
        EncryptedFileInfo encryptedFileInfo;
        String c = c();
        String str = null;
        if (!e(c)) {
            c = null;
        }
        if (c != null) {
            return c;
        }
        MusicTrack musicTrack = this.b;
        String str2 = musicTrack.i;
        if (!e(str2)) {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        MoosicAudio moosicAudio = musicTrack.W;
        if (moosicAudio != null && (encryptedFileInfo = moosicAudio.d) != null) {
            str = encryptedFileInfo.b;
        }
        return str == null ? "" : str;
    }

    public final String c() {
        uz4 uz4Var = this.a;
        String str = uz4Var.d;
        if (!drm0.N(str)) {
            return str;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.w, new Object[]{"AudioUrl", "Audio URL was probably not resolved!"});
        }
        return uz4Var.a;
    }

    public final boolean d() {
        MusicTrack musicTrack = this.b;
        return e(musicTrack.i) || musicTrack.W != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx40)) {
            return false;
        }
        kx40 kx40Var = (kx40) obj;
        return epx.f(this.a, kx40Var.a) && epx.f(this.d, kx40Var.d) && epx.f(this.b, kx40Var.b);
    }

    public final boolean f() {
        return e(c()) || d();
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.d, this.b);
    }

    public final String toString() {
        return xqm0.g("<" + kx40.class.getSimpleName() + "> \n            url: " + b() + ",\n            playbackBounds: " + this.c + ",\n            launchMeta: " + this.d + ",\n            musicTrack: " + this.b + "\n        ");
    }

    public kx40(uz4 uz4Var, MusicTrack musicTrack, wva0 wva0Var, PlaybackLaunchMeta playbackLaunchMeta, PlaybackActionMeta playbackActionMeta, boolean z, AudioLoudness audioLoudness, float f, x6b0 x6b0Var) {
        this.a = uz4Var;
        this.b = musicTrack;
        this.c = wva0Var;
        this.d = playbackLaunchMeta;
        this.e = playbackActionMeta;
        this.f = z;
        this.g = audioLoudness;
        this.h = f;
        this.i = x6b0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ kx40(uz4 uz4Var, MusicTrack musicTrack, wva0 wva0Var, PlaybackLaunchMeta playbackLaunchMeta, PlaybackActionMeta playbackActionMeta, boolean z, AudioLoudness audioLoudness, int i) {
        this(r4, r5, r6, r7, (i & 16) != 0 ? new PlaybackActionMeta(6, 0L, 2, null) : playbackActionMeta, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : audioLoudness, 1.0f, x6b0.d.getSTUB());
        PlaybackLaunchMeta playbackLaunchMeta2;
        uz4 uz4Var2 = (i & 1) != 0 ? new uz4(null, 7) : uz4Var;
        MusicTrack musicTrack2 = (i & 2) != 0 ? new MusicTrack(0, null, null, null, 0, 0, null, null, null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -1, 1048575, null) : musicTrack;
        wva0 wva0Var2 = (i & 4) != 0 ? new wva0(0L, 3) : wva0Var;
        if ((i & 8) != 0) {
            Object obj = PlaybackLaunchMeta.g;
            playbackLaunchMeta2 = PlaybackLaunchMeta.a.a();
        } else {
            playbackLaunchMeta2 = playbackLaunchMeta;
        }
    }
}
