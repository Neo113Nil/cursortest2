package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;

/* compiled from: MusicPlayerStateSnapshot.kt */
/* loaded from: classes3.dex */
public final class uy40 {
    public final MusicTrack a;
    public final String b;
    public final PlaybackLaunchMeta c;
    public final boolean d;

    public uy40() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy40)) {
            return false;
        }
        uy40 uy40Var = (uy40) obj;
        return epx.f(this.a, uy40Var.a) && epx.f(this.b, uy40Var.b) && epx.f(this.c, uy40Var.c) && this.d == uy40Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicPlayerStateSnapshot(playable=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", launchMeta=");
        sb.append(this.c);
        sb.append(", isUrlInCache=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public uy40(MusicTrack musicTrack, String str, PlaybackLaunchMeta playbackLaunchMeta, boolean z) {
        this.a = musicTrack;
        this.b = str;
        this.c = playbackLaunchMeta;
        this.d = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ uy40(int i) {
        this(r0, "", PlaybackLaunchMeta.a.a(), false);
        MusicTrack musicTrack = new MusicTrack(0, null, null, null, 0, 0, null, null, null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -1, 1048575, null);
        Object obj = PlaybackLaunchMeta.g;
    }
}
