package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.List;
import xsna.tfp0;
import xsna.wzm0;

/* compiled from: TrackMenuState.kt */
/* loaded from: classes3.dex */
public final class fgp0 implements km50 {
    public final MusicTrack b;
    public final MusicBottomSheetLaunchPoint c;
    public final List<tfp0.b> d;
    public final DownloadingState e;
    public final wzm0 f;
    public final MusicPlaybackLaunchContext g;

    /* JADX WARN: Multi-variable type inference failed */
    public fgp0(MusicTrack musicTrack, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, List<? extends tfp0.b> list, DownloadingState downloadingState, wzm0 wzm0Var, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        this.b = musicTrack;
        this.c = musicBottomSheetLaunchPoint;
        this.d = list;
        this.e = downloadingState;
        this.f = wzm0Var;
        this.g = musicPlaybackLaunchContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [xsna.wzm0] */
    public static fgp0 a(fgp0 fgp0Var, MusicTrack musicTrack, List list, DownloadingState downloadingState, wzm0.a aVar, int i) {
        if ((i & 1) != 0) {
            musicTrack = fgp0Var.b;
        }
        MusicTrack musicTrack2 = musicTrack;
        MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint = fgp0Var.c;
        if ((i & 4) != 0) {
            list = fgp0Var.d;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            downloadingState = fgp0Var.e;
        }
        DownloadingState downloadingState2 = downloadingState;
        wzm0.a aVar2 = aVar;
        if ((i & 16) != 0) {
            aVar2 = fgp0Var.f;
        }
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = fgp0Var.g;
        fgp0Var.getClass();
        return new fgp0(musicTrack2, musicBottomSheetLaunchPoint, list2, downloadingState2, aVar2, musicPlaybackLaunchContext);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgp0)) {
            return false;
        }
        fgp0 fgp0Var = (fgp0) obj;
        return epx.f(this.b, fgp0Var.b) && epx.f(this.c, fgp0Var.c) && epx.f(this.d, fgp0Var.d) && epx.f(this.e, fgp0Var.e) && epx.f(this.f, fgp0Var.f) && epx.f(this.g, fgp0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + fw3.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d)) * 31)) * 31;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.g;
        return hashCode + (musicPlaybackLaunchContext == null ? 0 : musicPlaybackLaunchContext.b.hashCode());
    }

    public final String toString() {
        return "TrackMenuState(musicTrack=" + this.b + ", launchPoint=" + this.c + ", actionsList=" + this.d + ", downloadingState=" + this.e + ", subscriptionSubtitleState=" + this.f + ", refer=" + this.g + ')';
    }
}
