package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.ArrayList;
import java.util.List;
import xsna.lc50;

/* compiled from: MusicTrackMenuState.kt */
/* loaded from: classes3.dex */
public final class id50 implements km50 {
    public final MusicTrack b;
    public final MusicPlaybackLaunchContext c;
    public final List<lc50.b> d;
    public final List<lc50.c> e;
    public final Long f;
    public final DownloadingState g;
    public final MusicBottomSheetLaunchPoint h;

    /* JADX WARN: Multi-variable type inference failed */
    public id50(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, List<? extends lc50.b> list, List<? extends lc50.c> list2, Long l, DownloadingState downloadingState, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint) {
        this.b = musicTrack;
        this.c = musicPlaybackLaunchContext;
        this.d = list;
        this.e = list2;
        this.f = l;
        this.g = downloadingState;
        this.h = musicBottomSheetLaunchPoint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static id50 a(id50 id50Var, ArrayList arrayList, ArrayList arrayList2, Long l, DownloadingState downloadingState, int i) {
        MusicTrack musicTrack = id50Var.b;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = id50Var.c;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = id50Var.d;
        }
        List list2 = list;
        List list3 = arrayList2;
        if ((i & 8) != 0) {
            list3 = id50Var.e;
        }
        List list4 = list3;
        if ((i & 16) != 0) {
            l = id50Var.f;
        }
        Long l2 = l;
        if ((i & 32) != 0) {
            downloadingState = id50Var.g;
        }
        MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint = id50Var.h;
        id50Var.getClass();
        return new id50(musicTrack, musicPlaybackLaunchContext, list2, list4, l2, downloadingState, musicBottomSheetLaunchPoint);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id50)) {
            return false;
        }
        id50 id50Var = (id50) obj;
        return epx.f(this.b, id50Var.b) && epx.f(this.c, id50Var.c) && epx.f(this.d, id50Var.d) && epx.f(this.e, id50Var.e) && epx.f(this.f, id50Var.f) && epx.f(this.g, id50Var.g) && epx.f(this.h, id50Var.h);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.c;
        int a = fw3.a(fw3.a((hashCode + (musicPlaybackLaunchContext == null ? 0 : musicPlaybackLaunchContext.b.hashCode())) * 31, 31, this.d), 31, this.e);
        Long l = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((a + (l != null ? l.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "MusicTrackMenuState(musicTrack=" + this.b + ", refer=" + this.c + ", headerActions=" + this.d + ", listActions=" + this.e + ", remainingTimeMs=" + this.f + ", downloadingState=" + this.g + ", launchPoint=" + this.h + ')';
    }
}
