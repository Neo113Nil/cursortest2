package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Playlist;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.List;
import xsna.vab0;

/* compiled from: PlaylistMenuState.kt */
/* loaded from: classes3.dex */
public final class ibb0 implements km50 {
    public final Playlist b;
    public final MusicBottomSheetLaunchPoint c;
    public final List<vab0.b> d;
    public final DownloadingState e;
    public final MusicPlaybackLaunchContext f;

    /* JADX WARN: Multi-variable type inference failed */
    public ibb0(Playlist playlist, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, List<? extends vab0.b> list, DownloadingState downloadingState, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        this.b = playlist;
        this.c = musicBottomSheetLaunchPoint;
        this.d = list;
        this.e = downloadingState;
        this.f = musicPlaybackLaunchContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibb0)) {
            return false;
        }
        ibb0 ibb0Var = (ibb0) obj;
        return epx.f(this.b, ibb0Var.b) && epx.f(this.c, ibb0Var.c) && epx.f(this.d, ibb0Var.d) && epx.f(this.e, ibb0Var.e) && epx.f(this.f, ibb0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + fw3.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d)) * 31;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.f;
        return hashCode + (musicPlaybackLaunchContext == null ? 0 : musicPlaybackLaunchContext.b.hashCode());
    }

    public final String toString() {
        return "PlaylistMenuState(playlist=" + this.b + ", launchPoint=" + this.c + ", actionsList=" + this.d + ", downloadingState=" + this.e + ", refer=" + this.f + ')';
    }
}
